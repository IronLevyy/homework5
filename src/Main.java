public class Main {
    public static void main(String[] args) {
        //Задача 1
        byte clientOS = 1;
        if (clientOS < 1) {
            System.out.println("Установите версию приложения для IOS по ссылке.");
        } else {System.out.println("Установите версию приложения для Android по ссылке.");}

//Задача 2
        int clientDeviceYear = 2015;
        System.out.print("Установите ");
        if (clientDeviceYear < 2015){
            System.out.print("облегчённую ");
        }
        if (clientOS < 1) {
            System.out.print("версию приложения для IOS по ссылке.\n");
        } else {System.out.print("версию приложения для Android по ссылке.\n");}

//Задача 3
        int year = 2021;
        if ((year % 400) == 0){
            System.out.printf("%d год является високосным.\n", year);
        } else if (((year % 4) == 0) && ((year % 100) != 0)){
            System.out.printf("%d год является високосным.\n", year);
        } else {System.out.printf("%d год не является високосным.\n", year);}

//Задача 4
        int deliverDistanse = 95;
        if (deliverDistanse <= 20){
            System.out.println("Потребуется 1 день.");
        } else if (deliverDistanse <=60){
            System.out.println("Потребуется 2 дня.");
        } else if (deliverDistanse <= 100){
            System.out.println("Потребуется 3 дня.");
        } else {System.out.println("Доставки нет.");}

//Задача 5
        int monthNumber = 12;
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("Зима.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень.");
                break;
            default:
                System.out.println("Некорректный месяц.");
        }
    }
}