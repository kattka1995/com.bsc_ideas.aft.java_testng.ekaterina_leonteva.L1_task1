package cafe;

public class Cucurbitaceae extends Veg implements VegInterface {//Класс Огурцовые, овощи данного класса используются для приготовления салатов

    Cucurbitaceae(Vegetables vegetable, double weight) throws MyException {//конструктор класса Огурцовые
        {
            switch (vegetable) {
                case CUCUMBER:
                case ZUCCHINI:
                    setName(vegetable.name());
                    setProteins(vegetable.getProteins() * weight / 100);
                    setCarbohydrates(vegetable.getCarbs() * weight / 100);
                    setFats(vegetable.getFats() * weight / 100);
                    setKkal(vegetable.getCarbs() * weight / 100 * 4
                            + vegetable.getFats() * weight / 100 * 9
                            + vegetable.getProteins() * weight / 100 * 4);
                    break;
                default:
                    throw new MyException(vegetable);
            }
        }
    }

    public void setName(String name) {//задание имени
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
