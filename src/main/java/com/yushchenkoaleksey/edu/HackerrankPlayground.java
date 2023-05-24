package com.yushchenkoaleksey.edu;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class HackerrankPlayground {

//    4 thoughts that may help:
//1. Counting sort
//2. A Queue
//3. Pay attention to the even case.
//4. Integer division is a blessing and a curse, be careful.


//    public static String dayOfProgrammer(int year) {
//        // Write your code here
//        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
//        if (year >= 1919) {
//            Calendar calendar = Calendar.getInstance(new Locale("ru", "RU"));
//            calendar.set(Calendar.YEAR, year);
//            calendar.set(Calendar.DAY_OF_YEAR, 256);
//            var date = calendar.getTime();
//            return format.format(date);
//        }else if(year < 1917){
//            boolean isLeapYear = isLeap(year);
//            int days = isLeapYear? 256 : 255;
//            GregorianCalendar calendar = new GregorianCalendar(new Locale("ru", "RU"));
//            calendar.set(year, Calendar.JANUARY, days);
//            return format.format(calendar.getTime());
//        }else {
//            Calendar calendar = Calendar.getInstance(new Locale("ru", "RU"));
//            calendar.set(Calendar.YEAR, year);
//            calendar.set(Calendar.DAY_OF_YEAR, 256);
//            var date = calendar.getTime();
//            return format.format(date);
//        }
//    }


    public static String superReducedString(String s) {
        while (s != (s = s.replaceAll("([a-z])\\1{1,1}", ""))) {
        }
        return s.isEmpty() ? "Empty String" : s;
    }


//    public static char ashtonString(String s, int k) {
//        // Write your code here
//        StringBuilder stringBuilder = new StringBuilder();
//        var chars = s.toCharArray();
//        for (int i = 0; i < ; i++) {
//
//        }
//
//    }

    public static int[] rotate(int[] arr, int k) {
        System.out.println(Arrays.toString(arr));
        int[] res = new int[arr.length];
        if (k >= 0) {
            for (int i = 0; i < arr.length; i++) {
                res[(i + k) % res.length] = arr[i];
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                res[i] = arr[(i + arr.length - k) % res.length];
            }
        }
        return res;
    }



    public static void main(String[] args) throws FileNotFoundException {

        System.setIn(new FileInputStream("C:\\Users\\13YAE\\IdeaProjects\\EDUCA 2\\src\\main\\resources\\sourcefile"));
//        System.out.println(migratoryBirds(new ArrayList<>(Arrays.asList(1, 4, 3, 4, 4, 4, 5, 3, 3, 3))));
//        var strings = Files.readAllLines(Path.of("C:\\Users\\13YAE\\IdeaProjects\\EDUCA 2\\src\\main\\resources\\sourcefile"));
//        var collect = Arrays.stream(strings.stream().collect(Collectors.joining()).split(" ")).map(Integer::parseInt).collect(Collectors.toList());
//        System.out.println(migratoryBirds(collect));
//
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(reader.readLine());
            var collect = Arrays.stream(reader.readLine().split(" ")).map(Integer::parseInt).collect(toList());
//            var res = minimumAbsoluteDifference(collect);
//            System.out.println(res);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        EXPENDITURES
//        System.out.println(activityNotifications(new ArrayList<>(Arrays.asList(2, 3, 4, 2, 3, 6, 8, 4, 5)), 5));
//        System.out.println(activityNotifications(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 4)), 4));
//        System.out.println(activityNotifications(new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50)), 3));

    }

    public static String gameOfStones(int n) {
//        if (n <= 1 || n % 7 == 0 || (n - 1) % 7 == 0) return "Second";
//        return "First";

        return n % 7 <= 1 ? "First" : "Second";
    }
}






















