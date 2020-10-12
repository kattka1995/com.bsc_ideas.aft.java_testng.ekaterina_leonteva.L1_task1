package cafe;

public abstract class Veg {//класс Овощи. Абстрактный класс, содержит в себе общие методы для всех классов овощей
    protected double proteins;
    protected double fats;
    protected double carbohydrates;
    protected double kkal;
    String name;

    public String getName() {
        return name;
    }

    public abstract void setName(String name);//задание имени

    public Double getProteins() {
        return proteins;
    }//получение количества белков

    public abstract void setProteins(double proteins);//задание количества белков

    public double getFats() {//получение количества жиров
        return fats;
    }

    public abstract void setFats(double fats);//задание количества жиров

    public double getKkal() {
        return kkal;
    }//получение количества калорий

    public abstract void setKkal(double kkal);//задание количества калорий

    public Double getCarbohydrates() {
        return carbohydrates;
    }//получение количества углеводов

    public abstract void setCarbohydrates(double carbohydrates);//задание количества углеводов
}
