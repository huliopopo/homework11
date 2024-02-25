public class Main {
    /*
    public static void printSeparate() {
        System.out.println("=============");
        System.out.println("+++++++++++++");
    }

    public static void printIssues(int issueCount) {
        System.out.println(issueCount);
    }

    public static int sum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
                    }
        return sum;
    }
    */
    public static void determinationOfLeapYearAndPrint(int numberOfYear) {
        if (numberOfYear % 4 == 0 && numberOfYear % 100 != 0 || numberOfYear % 400 == 0) {
            System.out.println(numberOfYear + " - год является високосным");
        } else {
            System.out.println(numberOfYear + " - год не является високосным");
        }
    }

    public static void determinationOfAppVersionAndPrint(int oS, int clientDeviceYear) {
//        0 - iOS; 1 - Android
        if (oS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите ОБЛЕГЧЕННУЮ версию приложения для iOS по ссылке");
        } else if (oS == 0) {
            System.out.println("Установите приложение для iOS по ссылке");
        }
        if (oS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите ОБЛЕГЧЕННУЮ версию приложения для Android по ссылке");
        } else if (oS == 1) {
            System.out.println("Установите приложение для Android по ссылке");
        }
    }

    public static int calculationOfDaysForDelivery(int distance) {
        int days = 0;
        if (distance > 100) {
            System.out.println("Доставки нет");
        } else if (distance < 20) {
            days = 1;
        } else if (distance < 60) {
            days = 2;
        } else {
            days = 3;
        }
        return days;
    }

    public static void main(String[] args) {
//        task1
        int year = 2021;
        determinationOfLeapYearAndPrint(year);
//        task2
        int clientDeviceYear = 2012;
        int oS = 1;
        determinationOfAppVersionAndPrint(oS, clientDeviceYear);
//        task3
        int deliveryDistance = 101;
        int days = calculationOfDaysForDelivery(deliveryDistance);
        System.out.println("Потребуется дней: " + days);

        /*
        int[] issuesByMonths = {4, 6, 4, 3, 2, 6, 3, 0, 3, 5, 7, 0, 11, 14};
        printSeparate();
        for (int i = 0; i < issuesByMonths.length; i++) {
            printIssues(issuesByMonths[i]);
            if ((i + 1) % 3 == 0) {
                printSeparate();
            }
        }
        printSeparate();
        int total = sum(issuesByMonths);
        printIssues(total);
        */


    }


}
