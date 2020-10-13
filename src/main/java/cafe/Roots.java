package cafe;

public class Roots extends Veg implements VegInterface {//Создание класса Корнеплоды, овощи данного класса используются для приготовления салатов

    Roots(Vegetables vegetables, double weight) throws MyException { //конструктор класса Корнеплоды
        switch (vegetables) {
            case CARROT:
            case RADISH:
                setName(vegetables.name());
                setProteins(vegetables.getProteins() * weight / 100);
                setCarbohydrates(vegetables.getCarbs() * weight / 100);
                setFats(vegetables.getFats() * weight / 100);
                setKkal(vegetables.getCarbs() * weight / 100 * 4
                        + vegetables.getFats() * weight / 100 * 9
                        + vegetables.getProteins() * weight / 100 * 4);
                break;
            default:
                throw new MyException(vegetables);
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setKkal(double kkal) {//задание количества калорий
        this.kkal = kkal;
    }

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
