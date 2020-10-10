package cafe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Salad {
    private String name;
    private List<VegInterface> ingr;

    Salad(String name, VegInterface... vegs) {
        this.name = name;
        ingr = new ArrayList<VegInterface>();
        for (VegInterface veg : vegs) {
            ingr.add(veg);
        }


    }
    public double carb(){
        double carb=0;
        for (VegInterface veg:ingr) {
            carb+=veg.getCarbohydrates();

        }
        return carb;
    }
    public double fats(){
        double fats=0;
        for (VegInterface veg:ingr) {
            fats+=veg.getFats();

        }
        return fats;
    }
    public double proteins(){
        double proteins=0;
        for (VegInterface veg:ingr) {
            proteins+=veg.getProteins();

        }
        return proteins;
    }
    public double kkal(){
        double kkal=0;
        for (VegInterface veg:ingr) {
            kkal+=veg.getKkal();

        }
        return kkal;
    }
    public void sortCarbs(){
        for (VegInterface veg:ingr){

        Collections.sort(ingr, Collections.<VegInterface>reverseOrder());
    }}
    public String getName(){
        return name;

    }
}



