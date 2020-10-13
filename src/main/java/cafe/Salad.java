package cafe;

import java.util.*;

public class Salad {//класс Салаты. Необходим для создания салатов, получения БЖУ и калорий в салате, сортировки ингредиентов салата
    // public ArrayList ugli = new ArrayList<VegInterface>();
    // public ArrayList proteinMoreThan1 = new ArrayList<VegInterface>();
    private String name;
    private List<VegInterface> ingr;
    private List<String> proteinMoreThan1;
    private List<String> ugli;

    Salad(String name, VegInterface... vegs) {//конструктор класса Салаты
        this.name = name;
        ingr = new ArrayList<VegInterface>();
        for (VegInterface veg : vegs) {
            ingr.add(veg);
        }
    }

    public double carb() { //получение количества углеводов для салата
        double carb = 0;
        for (VegInterface veg : ingr) {
            carb += veg.getCarbohydrates();
        }
        return carb;
    }

    public double fats() {//получение количества жиров для салата
        double fats = 0;
        for (VegInterface veg : ingr) {
            fats += veg.getFats();
        }
        return fats;
    }

    public double proteins() {//получение количества белков для салата
        double proteins = 0;
        for (VegInterface veg : ingr) {
            proteins += veg.getProteins();
        }
        return proteins;
    }

    public double kkal() {//получение количества калорий для салата
        double kkal = 0;
        for (VegInterface veg : ingr) {
            kkal += veg.getKkal();
        }
        return kkal;
    }

    public List<String> sortProteins() { //вывод овощей, в которых более 1 грамм белка
        proteinMoreThan1 = new ArrayList<String>();
        Collections.sort(ingr, new Comparator<VegInterface>() {
            public int compare(VegInterface veg1, VegInterface veg2) {
                return veg1.getProteins().compareTo(veg2.getProteins());
            }
        });
        for (VegInterface veg : ingr) {
            if (veg.getProteins() > 1) {
                proteinMoreThan1.add(String.format(Locale.ENGLISH, "%s %.2f", veg.getName(), veg.getProteins()));
            }
        }
        return proteinMoreThan1;
    }

    public List<String> sortCarbs() { //сортировка по углеводам в салате
        ugli = new ArrayList<String>();
        Collections.sort(ingr, Collections.reverseOrder(new Comparator<VegInterface>() {
            public int compare(VegInterface veg1, VegInterface veg2) {
                return veg1.getCarbohydrates().compareTo(veg2.getCarbohydrates());
            }
        }));
        for (VegInterface veg : ingr) {
            ugli.add(String.format(Locale.ENGLISH, "%s %.2f", veg.getName(), veg.getCarbohydrates()));
        }
        return ugli;
    }

    public String getName() {//получение имени салата
        return name;
    }

    public String formatSalad(String name, double protein, double fats, double carb, double kkal) { //вывод бжу для салата
        String sa = String.format(Locale.ENGLISH,
                "Название салата: %s, содержит %.2f белков, %.2f жиров, %.2f углеводов. Общая калорийность: %.2f",
                name, protein, fats, carb, kkal);
        return sa;
    }
}







