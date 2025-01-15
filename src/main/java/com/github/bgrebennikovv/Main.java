package com.github.bgrebennikovv;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {

        // Task 1

        int year = 2024;
        if (isLeapYear(year)) {
            System.out.printf("%s год - високосный год\n", year);
        } else {
            System.out.printf("%s год - невисокосный год\n", year);
        }

        // Task 2

        int clientOS = 1; // 0 — iOS, 1 — Android
        int clientDeviceYear = 2014;

        suggestAppVersion(clientOS, clientDeviceYear);

        // Task 3
        int deliveryDistance = 95;
        int deliveryDays = calculateDeliveryDays(deliveryDistance);

        if (deliveryDays > 0) {
            System.out.printf("Потребуется дней: %d%n", deliveryDays);
        } else {
            System.out.println("Доставка на указанное расстояние не осуществляется.");
        }


    }

    public static int calculateDeliveryDays(int distance) {
        return (distance > 0 && distance <= 100)
                ? 1 + (distance > 20 ? 1 : 0) + (distance > 60 ? 1 : 0)
                : -1;
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }


    public static void suggestAppVersion(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();

        if (clientDeviceYear >= currentYear) {
            System.out.println("Ваше устройство актуально, установите обычное приложение.");
            return;
        }

        String appVersion = clientDeviceYear < 2015 ? "облегченную версию" : "обычную версию";
        String osType = clientOS == 0 ? "для iOS" : "для Android";

        System.out.printf("Установите %s приложения %s по ссылке%n", appVersion, osType);
    }

}