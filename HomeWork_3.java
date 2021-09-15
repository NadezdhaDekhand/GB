/** Home work 3
 * author Nadezdha Dekhand
 * version: 15.09.2021
 */

import java.util.Arrays;

public class HomeWork_3 {
    public static void main(String[] args) {
        task_1();
        task_2();
        task_3();
        task_4();
        task_5(8, 7);
        task_6();
    }

    static void task_6() {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; ++i) {
            if (min > array[i]){
                min = array[i];
            }
            if (max < array[i]){
                max = array[i];
            }
        }
        System.out.println(" MAX : " + max + "   MIN : " + min);
    }

    static void task_5(int len, int initialValue) {
        int[] arr = new  int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.println("[" + i + "]" + "-" + arr[i] + " ");
        }
    }

    static void task_4() {
        int arr[][] = new int[6][6];
        for (int i = 0; i < 6; i++) {
            arr[i][i] = 1;
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++)
            System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }

    static void task_3() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int j;
        for (int i = 0; i < arr.length; i++) {
            j = arr[i];
            arr[i] = j < 6 ? j * 2 : j;
        }
        System.out.println(Arrays.toString(arr));
    }

    static void task_2() {
        int[] arr = new int[100];
        arr[0] = 1;
        for (int i = 0; i < arr.length; i ++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    static void task_1() {
        int[] arr = {0, 0, 1, 1, 0, 0, 1, 1};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] > 0) ? 0 : 1;
        }
        System.out.println(Arrays.toString(arr));
    }
}


