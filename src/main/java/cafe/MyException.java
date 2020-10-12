package cafe;

public class MyException extends Exception {//исключение при добавлении в салат ингредиента неверного класса овощей
    private Vegetables details;

    MyException(Vegetables a) {
        details = a;
    }

    public String exVeg() {
        return details + " не относится к выбранному классу овощей";
    }
}
