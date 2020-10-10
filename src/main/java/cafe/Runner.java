package cafe;

public class Runner {
    public static void main(String[] args) {
        Salad salad1 = new Salad("летний", new Cucurbitaceae(Vegetables.CUCUMBER, 100), new Cucurbitaceae(Vegetables.ZUCCHINI, 100));
        System.out.println(String.format("Название салата: %s, содержит %s белков, %s жиров, %s углеводов Общая калорийность: %s ", salad1.getName(), salad1.proteins(), salad1.fats(), salad1.carb(), salad1.kkal()));
        Cucurbitaceae cucumber = new Cucurbitaceae(Vegetables.CUCUMBER, 100);
        Cucurbitaceae zucchini = new Cucurbitaceae(Vegetables.ZUCCHINI, 100);
        Roots carrot = new Roots(Vegetables.CARROT, 100);
        Salad salad2 = new Salad("vegans", cucumber, zucchini, carrot);
        System.out.println(String.format("Название салата: %s, содержит %s белков, %s жиров, %s углеводов Общая калорийность: %s ", salad2.getName(), salad2.proteins(), salad2.fats(), salad2.carb(), salad2.kkal()));

        Salad salad3 = new Salad("картофельный", new Potato(Vegetables.RED_POTATO, 250), new Potato(Vegetables.WHITE_POTATO, 130), new Roots(Vegetables.CARROT, 146), new Cucurbitaceae(Vegetables.ZUCCHINI, 100), new Cucurbitaceae(Vegetables.CUCUMBER, 100));
        System.out.println(String.format("Название салата: %s, содержит %s белков, %s жиров, %s углеводов Общая калорийность: %s ", salad3.getName(), salad3.proteins(), salad3.fats(), salad3.carb(), salad3.kkal()));
        System.out.println(String.format("Список количества углеводов в овощах в салате %s, отсортированный по убыванию: %s", salad2.getName(), salad2.sortCarbs()));
        System.out.println(String.format("В салате %s содержатся следующие ингредиенты, в которых количество грамм белка более 1 %s", salad3.getName(), salad3.sortProteins()));
    }
}
