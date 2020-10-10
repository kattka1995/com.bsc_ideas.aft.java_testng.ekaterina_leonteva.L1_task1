package cafe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Salad {
    public ArrayList ugli = new ArrayList();
    public ArrayList proteinMoreThan1 = new ArrayList();
    private String name;
    private List<VegInterface> ingr;

    Salad(String name, VegInterface... vegs) {
        this.name = name;
        ingr = new ArrayList<VegInterface>();
        for (VegInterface veg : vegs) {
            ingr.add(veg);
        }


    }

    public double carb() {
        double carb = 0;
        for (VegInterface veg : ingr) {
            carb += veg.getCarbohydrates();

        }
        return carb;
    }

    public double fats() {
        double fats = 0;
        for (VegInterface veg : ingr) {
            fats += veg.getFats();

        }
        return fats;
    }

    public double proteins() {
        double proteins = 0;
        for (VegInterface veg : ingr) {
            proteins += veg.getProteins();

        }
        return proteins;
    }

    public double kkal() {
        double kkal = 0;
        for (VegInterface veg : ingr) {
            kkal += veg.getKkal();

        }
        return kkal;
    }

    public ArrayList sortCarbs() { //сортировка по углеводам в салате
        for (VegInterface veg : ingr) {
            ugli.add(veg.getName() + " " + veg.getCarbohydrates());
            Collections.sort(ugli, Collections.<VegInterface>reverseOrder());
        }
        return ugli;
    }

    public ArrayList sortProteins() {//вывод овощей, в которых более 1 грамм белка
        for (VegInterface veg : ingr) {
            if (veg.getProteins() > 1) {
                proteinMoreThan1.add(veg.getProteins() + " " + veg.getName() + " ");
                Collections.sort(proteinMoreThan1, Collections.<VegInterface>reverseOrder());
            }
        }
        return proteinMoreThan1;
    }

    public String getName() {
        return name;

    }
}



