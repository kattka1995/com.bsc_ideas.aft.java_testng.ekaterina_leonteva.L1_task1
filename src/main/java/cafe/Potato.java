package cafe;

public class Potato extends Veg implements VegInterface {
    Potato(Vegetables vegs, double weight) {
        switch (vegs) {
            case WHITE_POTATO:
            case RED_POTATO:
                setName(vegs.name());
                setProteins(vegs.getProteins() * weight / 100);
                setCarbohydrates(vegs.getCarbs() * weight / 100);
                setFats(vegs.getFats() * weight / 100);
                setKkal(vegs.getCarbs() * weight / 100 * 4 + vegs.getFats() * weight / 100 * 9 + vegs.getProteins() * weight / 100 * 4);
                break;
            default:
                System.out.println("Продукт не относится к картохе");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setKkal(double kkal) {
        this.kkal = kkal;
    }


    public void setProteins(double proteins) {
        this.proteins = proteins;

    }

    public void setFats(double fats) {
        this.fats = fats;

    }

    public void setCarbohydrates(double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }


}
