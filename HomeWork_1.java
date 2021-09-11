/** Home work 1
  * author Nadezdha Dekhand
 */

public class HomeWork_1 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    static void compareNumbers() {
        int a = 5;
        int b = 8;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
    static void printColor() {
        int value = 101;
        if (value <= 0)
        {
            System.out.println("Красный");
        } else if (value > 0 & value <= 100){

            System.out.println("Желтый");
        } else {

            System.out.println("Зеленый");
        }
    }

    static void checkSumSign() {
        int a = 8;
        int b = 1;
        int z = (a +b);
        if (z >=0) {
            System.out.println("Сумма положительная");}
        else {
            System.out.println("Сумма отрицательная");
        }
    }

    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
}
