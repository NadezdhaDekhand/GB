/** Home work 1
  * author Nadezdha Dekhand
 */
public class HomeWork_2 {
    public static void main(String[] args) {
        System.out.println(within10and20(4, 8));
        isPositiveOrNegative(11);
        System.out.println(isNegative(-8));
        printWordNTimes("Вот и лето прошло!", 3);
        System.out.println(leapYear(2005));
    }

    static boolean leapYear(int y) {
        if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    static void printWordNTimes(String s, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(s);
        }
    }

    static boolean isNegative(int x) {
        if (x < 0) {
            return true;
        } else {
            return false;
        }
    }

    static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    static boolean within10and20(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        }
        return false;
    }
}


