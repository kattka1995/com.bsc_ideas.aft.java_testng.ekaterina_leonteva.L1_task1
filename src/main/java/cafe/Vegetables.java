package cafe;

public enum Vegetables {
    //Potatoes
    WHITE_POTATO(2.0, 0.1, 17.1),
    RED_POTATO(1.9, 0.1, 19.7),
    //Roots
    CARROT(1.3, 0.1, 6.7),
    RADISH(1.2, 0.1, 3.4),
    //Cucurbitaceae
    CUCUMBER(0.9, 0.1, 2.8),
    ZUCCHINI(0.6, 0.3, 4.6),
    //Other
    GARLIC(6.5, 0.5, 29.9),
    ONION(1.4, 0.1, 10.4),
    TOMATO(1.1, 0.2, 3.7);

    private final double proteins;
    private final double fats;
    private final double carbohydrates;

    Vegetables(double proteins, double fats, double carbohydrates) {

        this.proteins = proteins;
        this.carbohydrates = carbohydrates;
        this.fats = fats;
    }


    public double getCarbs() {
        return this.carbohydrates;
    }

    public double getFats() {
        return this.fats;
    }

    public double getProteins() {
        return this.proteins;
    }
}
