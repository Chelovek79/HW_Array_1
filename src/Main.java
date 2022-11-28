public class Main {
    public static void main(String[] args) {

// Задача 1.
        int [] intArr = new int [] {1, 2, 3};
        double [] doubleArr = {1.57, 7.654, 9.986};
        String [] stringsArr = {"яйца", "молоко", "мука", "соль", "сахар", "вода", "растительное масло"};

// Задача 2.
        for (int i = 0; i < 3; i++) {
             switch (i) {
                case 0 :
                    for (int j=0; j < intArr.length; j++) {
                        if (j < intArr.length - 1) {
                            System.out.print(intArr[j] + ", ");
                        } else System.out.print(intArr[j] + ".");
                    }
                    System.out.println("");
                break;
                case 1 :
                    for (int j=0; j < doubleArr.length; j++) {
                        if (j < doubleArr.length - 1) {
                            System.out.print(doubleArr[j] + ", ");
                        } else System.out.print(doubleArr[j] + ".");
                    }
                    System.out.println("");
                break;
                case 2 :
                    for (int j=0; j < stringsArr.length; j++) {
                        if (j < stringsArr.length - 1) {
                            System.out.print(stringsArr[j] + ", ");
                        } else System.out.print(stringsArr[j] + ".");
                    }
                    System.out.println("");
                break;
            }
        }
        System.out.println("--------------------------------------------");

// Задача 3.
        for (int i = 0; i < 3; i++) {
            switch (i) {
                case 0 :
                    for (int j = intArr.length - 1; j >= 0; j--) {
                        if (j > 0) {
                            System.out.print(intArr[j] + ", ");
                        } else System.out.print(intArr[j] + ".");
                    }
                    System.out.println("");
                    break;
                case 1 :
                    for (int j = doubleArr.length - 1; j >=0; j--) {
                        if (j > 0) {
                            System.out.print(doubleArr[j] + ", ");
                        } else System.out.print(doubleArr[j] + ".");
                    }
                    System.out.println("");
                    break;
                case 2 :
                    for (int j = stringsArr.length - 1; j >= 0; j--) {
                        if (j > 0) {
                            System.out.print(stringsArr[j] + ", ");
                        } else System.out.print(stringsArr[j] + ".");
                    }
                    System.out.println("");
                    break;
            }
        }
        System.out.println("--------------------------------------------");

// Задание 4.
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] % 2 != 0) {
                intArr [i] = intArr[i] + 1;
            }
            if (i < intArr.length - 1) {
                System.out.print(intArr[i] + ", ");
            } else System.out.print(intArr[i] + ".");
        }
    }
}