import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        int[] array;
        array = new int[30];

        /**
         * array[0] = 100;
        array[1] = 101;
        array[2] = 102;
        for (int i=3; i<30; i++) {
           array[i]=0;
        };
         */

        array[0] = 100;
        for (int i = 0; i < 29; i++) {
            array[i + 1] = array[i] + 2;
        }
        array[29] = array[28] + 2;
        //System.out.println(Arrays.toString(array));

        //  первая задача урока массивы, часть 2

        int sumMonthly = 0;
        for (int i = 0; i < 30; i++) {
            sumMonthly = sumMonthly + array[i];
        }
        System.out.println("Сумма трат за месяц составила " + sumMonthly + " рублей");
        System.out.println("_______________________");

        //  вторая задача урока массивы, часть 2

        int minSum = array[0];
        int maxSum = array[0];

        for (int i = 0; i < 30; i++) {
            if (minSum > array[i]) {
                minSum = array[i];
            }
            if (maxSum < array[i]) {
                maxSum = array[i];
            }
            //System.out.println(i+" "+array[i]+" "+minSum+" "+maxSum);
        }

        System.out.println("Минимальная сумма трат за день составила " + minSum + " рублей. Максимальная сумма трат за день составила " + maxSum + " рублей");

        System.out.println("_______________________");
    }
}