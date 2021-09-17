import java.util.Random;
import java.util.Scanner;

class TikTakToe {
    final char SIGN_X = 'x';
    final char SIGN_O = 'o';
    final char SIGN_E = '.';
    char[][] table;
    Random random;
    Scanner scanner;

    TikTakToe() {
        random = new Random();
        scanner = new Scanner(System.in);
        table = new char[3][3];
        System.out.println("Game init ...");
    }

    public static void main(String[] args) {
        new TikTakToe().game();
    }

    void game() {
        initTable();
        while (true) {
            printTable();
            turnHuman();
            if (checkWin(SIGN_X)) {
                System.out.println("YOU WIN!");
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry, DRAW!");
                break;
            }
            turnAI();
            if (checkWin(SIGN_O)) {
                System.out.println("YOU LOST!");
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry, DRAW!");
                break;
            }
        }
        printTable();
    }

    void initTable() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                table[i][j] = SIGN_E;
            }
        }
    }

    void printTable() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(table[i][j] + " " );
            }
            System.out.println();
        }
    }

    boolean isTableFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (table[i][j] == SIGN_E) {
                    return false;
                }
            }
        }
        return true;
    }

    void turnHuman() {
        int x, y;
        do {
            System.out.print("Enter X Y (1...3): ");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        table[y][x] = SIGN_X;
    }

    void turnAI() {
        int x, y;
        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while (!isCellValid(x, y));
        table[y][x] = SIGN_O;
    }

    boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x >= 3 || y >= 3) {
            return false;
        }
        return table[y][x] == SIGN_E;
    }

    boolean checkWin(char ch){
        boolean toright, toleft ,cols, rows;
        toright = true;
        toleft = true;
        cols = true;
        rows = true;
        for (int i=0; i<3; i++) {
            toright &= (table[i][i] == ch);
            toleft &= (table[3-i-1][i] == ch);
        }
        if (toright || toleft) return true;
        for (int col=0; col<3; col++) {
            for (int row=0; row<3; row++) {
                cols &= (table[col][row] == ch);
                rows &= (table[row][col] == ch);
            }
            if (cols || rows) return true;
        }
        return false;
    }
}   






