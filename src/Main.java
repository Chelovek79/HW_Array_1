public class Main {
    public static void main(String[] args) {

// Задача 1.
        int [] intArr = new int [] {1, 2, 3};
        double [] doubleArr = {1.57, 7.654, 9.986};
        String [] stringsArr = {"яйца", "молоко", "мука", "соль", "сахар", "вода", "растительное масло"};
        int n = 0; // Длина массива;

// Задача 2.
        for (int i = 0; i < 3; i++) {
            int j = 0;
            do {
                switch (i) {
                    case 0:
                        n = intArr.length;
                        System.out.print(intArr[j]);
                        break;
                    case 1:
                        n = doubleArr.length;
                        System.out.print(doubleArr[j]);
                        break;
                    case 2:
                        n = stringsArr.length;
                        System.out.print(stringsArr[j]);
                        break;
                }
                if (j < n - 1) {
                    System.out.print(", ");
                }
                j++;
            }
            while (j < n);
            System.out.println("");
        }
        System.out.println("--------------------------------------------");

// Задача 3.
        for (int i = 0; i < 3; i++) {
            int j = 1;
            do {
                switch (i) {
                    case 0:
                        n = intArr.length;
                        System.out.print(intArr[n-j]);
                        break;
                    case 1:
                        n = doubleArr.length;
                        System.out.print(doubleArr[n-j]);
                        break;
                    case 2:
                        n = stringsArr.length;
                        System.out.print(stringsArr[n-j]);
                        break;
                }
                if (j < n) {
                    System.out.print(", ");
                }
                j++;
            }
            while (j <= n);
            System.out.println("");
        }
        System.out.println("--------------------------------------------");

// Задание 4.
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] % 2 != 0) {
                intArr [i] = intArr[i] + 1;
            }
            System.out.print(intArr[i]);
            if (i < intArr.length - 1) {
                System.out.print(", ");
            }
        }
    }
}