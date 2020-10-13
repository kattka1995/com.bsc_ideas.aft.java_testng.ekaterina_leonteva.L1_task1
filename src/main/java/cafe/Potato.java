package cafe;

public class Potato extends Veg implements VegInterface {//класс Картофель, овощи данного класса используются для приготовления салатов

    Potato(Vegetables vegs, double weight) throws MyException {//конструктор класса картофель
        switch (vegs) {
            case WHITE_POTATO:
            case RED_POTATO:
                setName(vegs.name());
                setProteins(vegs.getProteins() * weight / 100);
                setCarbohydrates(vegs.getCarbs() * weight / 100);
                setFats(vegs.getFats() * weight / 100);
                setKkal(vegs.getCarbs() * weight / 100 * 4 + vegs.getFats() * weight / 100 * 9
                        + vegs.getProteins() * weight / 100 * 4);
                break;
            default:
                throw new MyException(vegs);
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setKkal(double kkal) {
        this.kkal = kkal;
    }//задание количества калорий

    public void setProteins(double proteins) {
        this.proteins = proteins;
    }//задание количества белков

    public void setFats(double fats) {
        this.fats = fats;
    }//задание количества жиров

    public void setCarbohydrates(double carbohydrates) {//задание количества углеводов
        this.carbohydrates = carbohydrates;
    }
}
