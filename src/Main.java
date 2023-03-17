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

    public static void task1() {
        System.out.println("Задача 1");
        int personAge = 17;
        if (personAge > 17) {
            System.out.println("Если возраст человека равен " + personAge + ", то он совершеннолетний");
        }
        if (personAge <= 17) {
            System.out.println("Если возраст человека равен " + personAge + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2() {
        System.out.println("task2");
        int temperature = 10;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }
        if (temperature >= 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
    }

    public static void task3() {
        System.out.println("task3");
        int speed = 50;
        if (speed > 60) {
            System.out.println("НЕсли скорость " + speed + "км/ч, то  придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + "км/ч, то можно ездить спокойно");
        }
    }

    public static void task4() {
        System.out.println("task4");
        int agg = 24;
        if (2 <= agg && agg < 6) {
            System.out.println("Если возраст человека равен " + agg + ",то ему нужно ходить в детский сад");
        } else {
        }
        if (7 <= agg && agg < 18) {
            System.out.println("Если возраст человека равен " + agg + ",то ему нужно ходить в в школу");
        } else {
        }
        if (18 <= agg && agg < 24) {
            System.out.println("Если возраст человека равен " + agg + ",то его место в университете");
        } else {
        }
        if (agg >= 24) {
            System.out.println("Если возраст человека равен " + agg + ",то ему пора ходить на работу");
        } else {
        }
    }

    public static void task5() {
        System.out.println("task5");
        int agg = 14;
        if (agg < 5) {
            System.out.println("Если возраст ребенка равен " + agg + ", то ему нельзя кататься на аттракционе");
        } else {
        }
        if (5 < agg && agg < 14) {
            System.out.println("Если возраст ребенка равен " + agg + ", то ему можно кататься на аттракционе в сопровождении");
        } else {
        }
        if (agg >= 14) {
            System.out.println("Если возраст ребенка равен " + agg + ", то ему можно кататься без сопровождения взрослого");
        }
    }

    public static void task6() {
        System.out.println("task6");
        int capacity = 102;
        int sittingPlaces = 60;
        int standingPlaces = capacity - sittingPlaces;

        int seatsUsed = 55;
        int standUsed = 22;
        if (seatsUsed < sittingPlaces) {
            System.out.println("в вагоне есть " + (sittingPlaces - seatsUsed) + " сидячих мест");
        } else {
            System.out.println("в вагоне нет сидячих мест");
        }
        if (standUsed < standingPlaces) {
            System.out.println("в вагоне есть " + (standingPlaces - standUsed) + " стоячих мест");
        } else {
            System.out.println("в вагоне нет стоячих мест");
        }
    }

    public static void task7() {
        System.out.println("task7");
        int one = 20;
        int two = 20;
        int three = 20;
        if (one > two && one > three) {
            System.out.println("максимальное число " + one);
        } else {
            if (one == three) {
                System.out.println(one + "=" + three + ", one и three являются максимальным числом");
            }
        }
        if (two > one && two > three) {
            System.out.println("максимальное число " + two);
        } else {
            if (one == two) {
                System.out.println(one + "=" + two + ", one и two являются максимальным числом");
            }
        }
        if (three > one && three > two) {
            System.out.println("максимальное число " + three);
        } else {
            if (two == three) {
                System.out.println(two + "=" + three + ", two и three являются максимальным числом");
            }
            if (one == two && one == three && two == three) {
                System.out.println(one + "=" + two + "=" + three + ", все цифры равны");
            }
        }
    }
}




