public class Homework {
    static int a;
    static int b;
    static String str;
    static int num;

    public static void main(String[] args) {


    }

    public static void printThreeWords() {
        System.out.println("Задание 1:\nOrange\nBanana\nApple\n");

    }


    public static void checkSumSign() {
        int a = -1;
        int b = 0;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Задание 2: Сумма положительная");
        } else {
            System.out.println("Задание 2: Сумма отрицательная\n");
        }
    }

    public static void printColor() {
        System.out.print("Задание 3: ");
        int value = 1434;
        if (value <= 0) {
            System.out.println("Красный\n");
        } else if (value <= 100) {
            System.out.println("Жёлтый\n");
        } else {
            System.out.println("Зелёный\n");
        }
    }

    public static void compareNumbers() {
        System.out.print("Задание 4: ");
        int a = 48;
        int b = 12;
        if (a >= b) {
            System.out.println("a >= b\n");
        } else {
            System.out.println("a < b\n");
        }
    }

    public static void resultat() {
        System.out.print("Задание 5: ");


        boolean result = sumMethod(0, -1);
        System.out.println(result + "\n");
    }

    public static boolean sumMethod(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }


    public static void nature() {
        System.out.print("Задание 6: ");
        numMethod(-4);
    }

    public static void numMethod(int a) {
        if (a >= 0) {
            System.out.println("Число " + a + " положительное\n");
        } else System.out.println("Число " + a + " отрицательное\n");
    }

    public static void beneficial() {
        System.out.print("Задание 7: ");
        boolean res1 = checkNum(-3);
        System.out.println(res1 + "\n");

    }

    public static boolean checkNum(int a) {
        return a <= 0;
    }


    public static void line() {

        str = "Good afternoon";
        num = 2;
        bass(str, num);
    }

    public static void bass(String str, int num) {
        System.out.print("Задание 8: ");

        for (int i = 0; i < num; i++) {
            System.out.println(str);
        }
    }


    public static void leapYear() {
        boolean res1 = isLeap(2024);
        boolean res2 = isLeap(2023);
        System.out.println("\nЗадание 9: ");
        System.out.println(res1);
        System.out.println(res2);

    }

    public static boolean isLeap(int year) {

        if (year % 4 != 0 || year % 100 == 0) {
            return false;
        }
        else {
            return true;
        }
    }

    public static void metMassed() {
        massMethod();
    }


    public static void massMethod() {
        System.out.println("\nЗадание 10: ");
        int[] arr = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else if (arr[i] == 0) {
                arr[i] = 1;

            }
            System.out.print(arr[i] + "\n");
        }

    }


    public static void massiveMethod() {
        System.out.println("Задание 11: ");
        int[] array = new int[101];
        for (int i = 1; i < array.length; i++) {
            System.out.print((array[i] = i) + " \n");
        }
    }

    public static void bigMethod() {
        System.out.println("Задание 12: ");
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.println(arr[i]);
        }


    }

    public static void cubeMass() {
        System.out.println("Задание 13: ");
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, x = arr[i].length - 1; j < arr[i].length; j++, x--) {
                if (i == j || i == x) arr[i][j] = 1;
                else arr[i][j] = 0;
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");

        }
        System.out.println("От такие пироги :) ");
    }


    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }

    public static void argumets() {
        System.out.println("Задание 14: ");
        int len = 12;
        int initialValue = 7;
        int[] newArray = createArray(len, initialValue);


        for (int num : newArray) {
            System.out.print(num + " ");
        }
    }
}

