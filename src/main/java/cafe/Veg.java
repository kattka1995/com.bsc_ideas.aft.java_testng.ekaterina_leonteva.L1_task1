package cafe;

public abstract class Veg {
    protected double proteins;
    protected double fats;
    protected double carbohydrates;
    protected double kkal;
    String name;

    public String getName() {
        return name;
    }

    public abstract void setName(String name);

    public double getProteins() {
        return proteins;
    }

    public abstract void setProteins(double proteins);

    public double getFats() {
        return fats;
    }

    public abstract void setFats(double fats);

    public double getKkal() {
        return kkal;
    }

    public abstract void setKkal(double kkal);

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public abstract void setCarbohydrates(double carbohydrates);
}
