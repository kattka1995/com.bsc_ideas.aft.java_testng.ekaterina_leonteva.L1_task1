package cafe;

import java.util.Locale;

public class Runner {//Леонтьева Екатерина Андреевна. Задание 2, Вариант: 	- Шеф-повар. Определить иерархию овощей. Сделать салат. Посчитать калорийность. Провести сортировку овощей для салата на основе одного из параметров. Найти овощи в салате, соответствующие заданному диапазону параметров.

    public static void main(String[] args) {
        try {
            Salad salad1 = new Salad("летний", new Cucurbitaceae(Vegetables.CUCUMBER, 100),
                    new Cucurbitaceae(Vegetables.ZUCCHINI, 100));
            System.out.println(salad1.formatSalad(salad1.getName(), salad1.proteins(),
                    salad1.fats(), salad1.carb(), salad1.kkal()));
            Cucurbitaceae cucumber = new Cucurbitaceae(Vegetables.CUCUMBER, 150);
            Cucurbitaceae zucchini = new Cucurbitaceae(Vegetables.ZUCCHINI, 250);
            Roots carrot = new Roots(Vegetables.CARROT, 39);
            Salad salad2 = new Salad("vegans", cucumber, zucchini, carrot);
            System.out.println(salad2.formatSalad(salad2.getName(), salad2.proteins(), salad2.fats(),
                    salad2.carb(), salad2.kkal()));
            Salad salad3 = new Salad("картофельный", new Potato(Vegetables.RED_POTATO, 250),
                    new Potato(Vegetables.WHITE_POTATO, 130),
                    new Roots(Vegetables.CARROT, 146),
                    new Cucurbitaceae(Vegetables.ZUCCHINI, 100),
                    new Cucurbitaceae(Vegetables.CUCUMBER, 100));
            System.out.println(salad3.formatSalad(salad3.getName(), salad3.proteins(), salad3.fats(), salad3.carb(), salad3.kkal()));
            System.out.println(String.format(Locale.ENGLISH,
                    "Отсортированный по убыванию список количества углеводов в овощах в салате %s %s",
                    salad2.getName(), salad2.sortCarbs()));
            System.out.println(String.format("В салате %s содержатся следующие ингредиенты, в которых количество грамм белка более 1 %s",
                    salad3.getName(), salad3.sortProteins()));
        } catch (MyException e) {
            System.out.println("При создании салата возникла ошибка. " + e.exVeg());
        }
    }
}