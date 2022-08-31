import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();

    }

    private static void task1() {
        System.out.println("Задание 1");
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

    }
    private static void task2() {
        System.out.println("Задание 2");
        int OS = 1;
        int clientDeviceYear = 2015;
        if (OS == 0)
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else{
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
                if (clientDeviceYear >= 2015) {
                    System.out.println("Установите версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }


        }


    }
    private static void task3(){
        System.out.println("Задание 3");
        int year = 2100;
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0) ) {
        System.out.println(year + " год является високосным");

        }else{
            System.out.println(year + " год не является високосным");
        }


    }
    private static void task4(){
        System.out.println("Задание 4");
        int deliveryDistance = 95;
        if (deliveryDistance < 20){
            System.out.println("Потребуется дней: " + 1);

        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + 2);

        }else {
            System.out.println("Потребуется дней: " + 3);
        }


    }
    private static void task5(){
        System.out.println("Задание 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Такого месяца нет");

        }
    }
}


