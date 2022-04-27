package ru.skypro;

public class Main {

    public static void main(String[] args) {
        //Задача 1
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        double[] arR = {1.57, 7.654, 9.986};
        int[] dayWork = {4, 5, 6, 9, 10, 11, 12};
        System.out.println("ЗАдача 2 ");
        System.out.println(arr[0] + "," + arr[1] + "," + arr[2]);
        for (int i = 0; i <= 3; i++) {
            if (i == 0) {
                System.out.print(arR[i]);
            } else if (i <= 2) {
                System.out.print("," + arR[i]);
            }
        }
        System.out.println(" ");
        for (int i = 0; i <= dayWork.length; i++) {
            if (i == 0) {
                System.out.print(dayWork[i]);
            } else if (i < dayWork.length) {
                System.out.print("," + dayWork[i]);
            }
        }
        System.out.println(" ");
        System.out.println("Задача 3 ");
        //Задача 3
        System.out.println(arr[2] + "," + arr[1] + "," + arr[0]);
        for (int i = arR.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(arR[i] + ",");
            } else if (i == 0) {
                System.out.println(arR[i]);
            }
        }
        for (int i = dayWork.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(dayWork[i] + ",");
            } else if (i == 0) {
                System.out.println(dayWork[i]);
            }
        }
        System.out.println("Задача 4 ");
        //int[] arr = new int[3];
        //arr[0] = 1;
        //arr[1] = 2;
        //arr[2] = 3;
        for (int i = 0; i < 3; i++) {
            if (i % 2 == 0) {
                System.out.print(arr[i] + 1 + " ");
                continue;
            }
            System.out.print(arr[i] + " ");
        }


    }
}

