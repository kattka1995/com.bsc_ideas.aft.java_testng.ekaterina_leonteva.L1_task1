package cafe;

public class Roots extends Veg implements VegInterface {
    Roots(Vegetables vegetables, double weight) {
        switch (vegetables) {
            case CARROT:
            case RADISH:
                setName(vegetables.name());
                setProteins(vegetables.getProteins() * weight / 100);
                setCarbohydrates(vegetables.getCarbs() * weight / 100);
                setFats(vegetables.getFats() * weight / 100);
                setKkal(vegetables.getCarbs() * weight / 100 * 4 + vegetables.getFats() * weight / 100 * 9 + vegetables.getProteins() * weight / 100 * 4);
                break;
            default:
                System.out.println("Не относится к Roots");
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
