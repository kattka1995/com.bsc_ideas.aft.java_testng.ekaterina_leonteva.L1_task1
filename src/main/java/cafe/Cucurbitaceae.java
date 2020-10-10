package cafe;

public class Cucurbitaceae extends Veg implements VegInterface {

    Cucurbitaceae(Vegetables vegetable, double weight) {
        switch (vegetable) {
            case CUCUMBER:
            case ZUCCHINI:
                setName(vegetable.name());
                setProteins(vegetable.getProteins() * weight / 100);
                setCarbohydrates(vegetable.getCarbs() * weight / 100);
                setFats(vegetable.getFats() * weight / 100);
                setKkal(vegetable.getCarbs() * weight / 100 * 4 + vegetable.getFats() * weight / 100 * 9 + vegetable.getProteins() * weight / 100 * 4);
                break;
            default:
                System.out.println("Это не огурцовые,уходи");
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
