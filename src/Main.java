public class Main {
    public static void main(String[] args) {
       task1();
       task2();
       task3();
       task4();
       task5();
       task6();
       task7();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int age = 14;
        if (age >= 18) {
            System.out.println("Он совершеннолетний");
        } else {
            System.out.println("Он несовершеннолетний");
        }
    }
    public static void task2 () {
        System.out.println("Задача 2");
        int temperature = -20;
        if (temperature <= 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
    }
    public static void task3 () {
            System.out.println("Задача 3");
            int speed = 61;
            if (speed >= 60) {
                System.out.println("придется заплатить штраф");
            } else {
                System.out.println("можно ездить спокойно");
            }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int age = 22;
        if (age >=2 && age <=6) {
            System.out.println("Ему нужно ходить в детский сад");
        }
        if (age >=7 && age <=14) {
            System.out.println("Ему нужно ходить в школу.");
        }
        if (age >=18 && age <=24) {
            System.out.println("Его место в университете");
        } else {
            System.out.println("Ему пора ходить на работу");
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
        int age = 28 ;
        if(age < 5) {
            System.out.println("Он не может кататься на аттракционе");
        }
        if(age >= 5 && age < 14) {
            System.out.println("Он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        } else  {
            System.out.println("Он может кататься без сопровождения взрослого");
        }
    }
    public static void task6 () {
        System.out.println("Задача 6");
        int seat = 89;
        if (seat <= 60) {
            System.out.println("Есть сидячее места");
        }
        if (seat > 60 && seat <= 102) {
            System.out.println("Только стоячие места");
        } else {
            System.out.println("Вагон уже полностью забит");
        }
    }
    public static void task7 () {
        System.out.println("Задача 7");
        int one = 1;
        int two = 2;
        int three = 3;
        boolean first = one > two || one > three;
        boolean second = two > one || two > three;
        boolean third = three > one || three > two;
        if (first) {
            System.out.println("one самое бальшое число");
        } else {
            System.out.println("one не самое большое число");
        }
        if (second) {
            System.out.println("two самое бальшое число");
        } else {
            System.out.println("second не самое большое число");
        }
        if (third) {
            System.out.println("three самое бальшое число");
        } else {
            System.out.println("third не самое большое число");
        }


    }
}