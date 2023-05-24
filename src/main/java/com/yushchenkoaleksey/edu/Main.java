package com.yushchenkoaleksey.edu;

import java.io.IOException;
import java.util.*;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toMap;

class BIT {
    int[] tree;
    int size;

    BIT(int size) {
        this.size = size;
        tree = new int[size + 1];
    }

    void update(int index, int value) {
        while (index <= size) {
            tree[index] += value;
            index += (index & -index);
        }
    }

    int query(int index) {
        int sum = 0;
        while (index > 0) {
            sum += tree[index];
            index -= (index & -index);
        }
        return sum;
    }

    int queryRange(int left, int right) {
        return query(right) - query(left - 1);
    }

    @Override
    public String toString() {
        return "BIT{" +
                "tree=" + Arrays.toString(tree) +
                ", size=" + size +
                '}';
    }
}

public class Main {

    public static long insertionSort3(List<Integer> arr) {
        return countInversions(arr);
    }

    public static long countInversions(List<Integer> arr) {
        List<Integer> sorted = new ArrayList<>(arr);
        sorted = sorted.stream().sorted().collect(toList());

        Map<Integer, Integer> map = new HashMap<>();
        int n = arr.size();
        for (int i = 0; i < n; i++) {
            map.put(sorted.get(i), i + 1);
        }
        BIT bit = new BIT(n);
        long count = 0;
        for (int i = n - 1; i >= 0; i--) {
            count += bit.query(map.get(arr.get(i)) - 1);
            bit.update(map.get(arr.get(i)), 1);
        }
        return count;
    }

    public static long insertionSort(List<Integer> arr) {
        // Write your code here
        int n = arr.size() - 1;
        String order = checkSortOrder(arr);
        if ("ascending".equals(order)) return 0;
        if ("descending".equals(order)) return (long) n * (n + 1) / 2;
        int counter = 0;
        for (int i = 1; i <= n; i++) {
            int temp = arr.get(i);
            int j = i;
            while (j > 0 && temp < arr.get(j - 1)) {
                arr.set(j, arr.get(j - 1));
                j--;
                counter++;
            }
            arr.set(j, temp);
        }
        return counter;
    }

    public static long insertionSort2(List<Integer> arr) {
        return mergeSort(arr);
    }

    public static long mergeSort(List<Integer> arr) {
        long counter = 0;
        if (arr.size() < 2) return counter;
        List<Integer> arr1 = new ArrayList<>(arr.subList(0, arr.size() / 2));
        List<Integer> arr2 = new ArrayList<>(arr.subList(arr.size() / 2, arr.size()));
        counter += mergeSort(arr1);
        counter += mergeSort(arr2);
        counter += merge(arr, arr1, arr2);
        return counter;
    }

    private static long merge(List<Integer> arr, List<Integer> arr1, List<Integer> arr2) {
        long counter = 0;
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) <= arr2.get(j)) {
                arr.set(k++, arr1.get(i++));
            } else {
                arr.set(k++, arr2.get(j++));
                counter += arr1.size() - i;
            }
        }
        while (i < arr1.size()) {
            arr.set(k++, arr1.get(i++));
        }
        while (j < arr2.size()) {
            arr.set(k++, arr2.get(j++));
        }
        return counter;
    }

    public static String checkSortOrder(List<Integer> arr) {
        boolean isAscending = true;
        boolean isDescending = true;
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) < arr.get(i - 1)) {
                isAscending = false;
            }
            if (arr.get(i) > arr.get(i - 1)) {
                isDescending = false;
            }
        }
        if (isAscending) {
            return "ascending";
        } else if (isDescending) {
            return "descending";
        } else {
            return "not sorted";
        }
    }

    static int getPermutations(List<Integer> arr) {
        int[] temp = new int[arr.size()];
        return mergeSort(arr, temp, 0, arr.size() - 1);
    }

    private static int mergeSort(List<Integer> arr, int[] temp, int left, int right) {
        int count = 0;
        if (left < right) {
            int mid = (left + right) / 2;
            count += mergeSort(arr, temp, left, mid);
            count += mergeSort(arr, temp, mid + 1, right);
            count += merge(arr, temp, left, mid, right);
        }
        return count;
    }

    private static int merge(List<Integer> arr, int[] temp, int left, int mid, int right) {
        int count = 0;
        int i = left;
        int j = mid + 1;
        int k = left;
        while (i <= mid && j <= right) {
            if (arr.get(i) <= arr.get(j)) {
                temp[k++] = arr.get(i++);
            } else {
                temp[k++] = arr.get(j++);
                count += (mid - i + 1);
            }
        }
        while (i <= mid) {
            temp[k++] = arr.get(i++);
        }
        while (j <= right) {
            temp[k++] = arr.get(j++);
        }
        for (i = left; i <= right; i++) {
            arr.set(i, temp[i]);
        }
        return count;
    }

    public static String balancedSums(List<Integer> arr) {
        int sum1 = 0;
        int sum2 = arr.stream().reduce(Integer::sum).orElse(0);
        for (int i = 0; i < arr.size(); i++) {
            sum2 -= arr.get(i);
            if (sum1 == sum2) return "YES";
            sum1 += arr.get(i);
        }
        return "NO";
    }

    static String balancedSums2(List<Integer> arr) {
        int sum = 0;
        int left = 0;
        for (int su : arr) {
            sum += su;
        }
        for (int fu : arr) {
            if (2 * left == sum - fu) {
                return "YES";
            } else {
                left += fu;
            }
        }
        return "NO";
    }

    public static long sumXor(long n) {
        // Write your code here
        int count = 0;
        for (int i = 0; i <= n; i++) {
            if (n + i == (n ^ i)) count++;
        }
        return count;
    }

    public static long marcsCakewalk(List<Integer> calorie) {
        // Write your code here
        Collections.sort(calorie, Collections.reverseOrder());
        return getSum(calorie, 0);
    }

    private static long getSum(List<Integer> calorie, int i) {
        if (i == calorie.size() - 1) {
            return (long) (Math.pow(2, i) * calorie.get(i));
        }
        return (long) (Math.pow(2, i) * calorie.get(i) + getSum(calorie, i + 1));
    }

    //3, 3
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return new int[]{map.get(nums[i]), i};
            } else {
                map.put(target - nums[i], i);
            }
        }
        return new int[0];
    }

    //Follow up: Could you solve it without converting the integer to a string?
    public static boolean isPalindrome5(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) return false;
        int rev = 0;
        while (x > rev) {
            rev = rev * 10 + x % 10;
            x = x / 10;
        }
        return (x == rev || x == rev / 10);
    }

    //     Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return "val=" + val;
        }
    }

    public static ListNode mergeTwoLists4(ListNode list1, ListNode list2) {
        ListNode res = new ListNode();
        ListNode current = res;
        while (list1 != null && list2 != null){
            if (list1.val < list2.val){
                current.next = new ListNode(list1.val);
                list1 = list1.next;
            }else {
                current.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            current = current.next;
        }
        current.next = list1 == null? list2 : list1;
        return res.next;
    }

    public static void main(String[] args) throws IOException {


//        System.out.println(Arrays.toString(twoSum(new int[]{3, 3}, 6)));

//        System.out.println(marcsCakewalk(new ArrayList<>(Arrays.asList(10, 5, 7))));
//        System.setIn(new FileInputStream("C:\\Users\\13YAE\\IdeaProjects\\EDUCA 2\\src\\main\\resources\\sourcefile"));

//        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
//            int n = Integer.parseInt(reader.readLine());
//            for (int i = 0; i < n; i++) {
//                int k = Integer.parseInt(reader.readLine());
//                List<Integer> list = Arrays.stream(reader.readLine().split(" ")).map(Integer::parseInt).collect(toList());
//                long start = System.nanoTime();
//                System.out.println(balancedSums(list));
//                long end = System.nanoTime();
//                System.out.println("ET: " + (end - start));
//            }
//
////                reader.readLine();
////                List<Integer> collect = Arrays.stream(reader.readLine().split(" "))
////                        .map(Integer::parseInt)
////                        .collect(toList());
////                System.out.println("ChatGPT");
////                System.out.println(getPermutations(collect));
////                System.out.println("Mine");
////                System.out.println(insertionSort2(collect));
////                System.out.println(collect);
////                System.out.println(collect);
////
//////            List<Integer> collect = new ArrayList<>();
//////            for (int i = 100; i > 0; i--) {
//////                collect.add(i);
//////            }
//////            System.out.println(collect);
//////            System.out.println(insertionSort(collect));
////
//////            System.out.println(closestNumbers(collect));
//////            List<List<String>> arr = new ArrayList<>();
//////            for (int i = 0; i < n; i++) {
//////                String[] split = reader.readLine().split(" ");
//////                arr.add(new ArrayList<>());
//////                arr.get(i).add(split[0]);
//////                arr.get(i).add(split[1]);
////            }
//        }
    }
}