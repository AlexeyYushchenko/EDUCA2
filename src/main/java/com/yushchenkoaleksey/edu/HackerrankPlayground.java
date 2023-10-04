package com.yushchenkoaleksey.edu;

import java.io.*;
import java.util.*;

public class HackerrankPlayground {

    public List<Integer> getPrimaryNumbers(int n){
        List<Integer> primaryNumbers = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (isPrimary(i)) primaryNumbers.add(i);
        }
        return primaryNumbers;
    }

    private boolean isPrimary(int n){
        if (n == 1) return false;
        if (n <= 3) return true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public int getBiggestPerfectSquare(int[] nums){
        int max = -1;
        for (int n : nums) {
            int temp = (int) Math.sqrt(n);
            if (temp * temp == n && max < temp) max = n;
        }
        return max;
    }

    public static void main(String[] args) throws FileNotFoundException {
        HackerrankPlayground playground = new HackerrankPlayground();
        int[] arr = new int[]{2, 4, 16, 9, 1, 17};
//        System.out.println(playground.getBiggestSquare(arr));

//        for (int i = 1; i < 30; i++) {
//            System.out.println("list of primary number for %s : %s".formatted(i, playground.getPrimaryNumbers(i)));
//        }


//        System.setIn(new FileInputStream("C:\\Users\\13YAE\\IdeaProjects\\EDUCA 2\\src\\main\\resources\\sourcefile"));
////        System.out.println(migratoryBirds(new ArrayList<>(Arrays.asList(1, 4, 3, 4, 4, 4, 5, 3, 3, 3))));
////        var strings = Files.readAllLines(Path.of("C:\\Users\\13YAE\\IdeaProjects\\EDUCA 2\\src\\main\\resources\\sourcefile"));
////        var collect = Arrays.stream(strings.stream().collect(Collectors.joining()).split(" ")).map(Integer::parseInt).collect(Collectors.toList());
////        System.out.println(migratoryBirds(collect));
////
//        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
//            int n = Integer.parseInt(reader.readLine());
//            var collect = Arrays.stream(reader.readLine().split(" ")).map(Integer::parseInt).collect(toList());
////            var res = minimumAbsoluteDifference(collect);
////            System.out.println(res);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

//        EXPENDITURES
//        System.out.println(activityNotifications(new ArrayList<>(Arrays.asList(2, 3, 4, 2, 3, 6, 8, 4, 5)), 5));
//        System.out.println(activityNotifications(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 4)), 4));
//        System.out.println(activityNotifications(new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50)), 3));

    }
}






















