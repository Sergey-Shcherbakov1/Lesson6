package Lesson6;
//2. Написать метод, который проверяет состав массива из чисел 1 и 4.
// Если в нем нет хоть одной четверки или единицы, то метод вернет false;
// Написать набор тестов для этого метода (по 3-4 варианта входных данных).

import java.util.Arrays;

public class Lesson6_2 {
    private static final int[] array = {1, 4, 1, 4, 1, 4, 1, 4, 1};
    private static int firstNumberToSearch = 1;
    private static int secondNumberToSearch = 4;

    public static boolean detectNumber(int[] a) throws NullPointerException {
        if (a == null) throw new NullPointerException();
        return Arrays.stream(a).anyMatch(i -> i == firstNumberToSearch
                || secondNumberToSearch == 4);
    }
//          по старинке :)
//        for (int i = 0; i < a.length; i++) {
//            if ( a[i] == 4 || a[i] == 1 ) {
//                return true;
//            }
//        }
//        return false;
//    }

    public static void main(String[] args) {
        System.out.println(detectNumber(array));
    }
}
