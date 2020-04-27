package Lesson6;
//1.Написать метод, которому в качестве аргумента передается не пустой одномерный целочисленный массив.
//Метод должен вернуть новый массив, который получен путем вытаскивания из исходного массива элементов, идущих после последней четверки.
//Входной массив должен содержать хотя бы одну четверку, иначе в методе необходимо выбросить RuntimeException.
//Написать набор тестов для этого метода (по 3-4 варианта входных данных).
// Вх: [ 1 2 4 4 2 3 4 1 7 ] -> вых: [ 1 7 ].

import java.util.Arrays;

public class Lesson6_1 {
    private static final int[] array = {1, 2, 4, 4, 2, 3, 4, 1, 7};
    private static final int numberToSearch = 4;

    public static int[] getAllNumbersAfter4(int[] a) throws RuntimeException {
        int index = 0;
        int[] newArray;
        for (int i = 0; i < a.length; i++) {
            if ( a[i] == 4 ) {
                index = i;
            }
        }
        if ( !Arrays.toString(a).contains("4") )
            throw new RuntimeException("В массиве нет искомого числа (по умолчанию это 4)");
//        if ( !Arrays.stream(a).anyMatch(i -> i == numberToSearch) )
//            throw new RuntimeException("В массиве нет искомого числа (по умолчанию это 4)");
        return newArray = Arrays.copyOfRange(a, ++index, a.length);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getAllNumbersAfter4(array)));
    }
}