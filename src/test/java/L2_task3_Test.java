import com.bsc_ideas.aft.java_testng.ekaterina_leonteva.L1_task3.MyException;
import com.bsc_ideas.aft.java_testng.ekaterina_leonteva.L1_task3.Runner;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.Locale;
import java.util.Random;

public class L2_task3_Test { //Леонтьева Екатерина Андреевна. Задание:Разработать 3-5 тестовых сценария и с помощью
    public Integer count;
    // библиотеки TestNG протестировать функциональность калькулятора (разработанную в рамках задания 2 первой лекции).
    // Предусмотреть наличие в сценарии как позитивных, так и негативных тестов.
    // В тестовом классе использовать @BeforeClass и @AfterClass (если возможно) для подготовки тестов
    // (например, создание экземпляра класса Calculator, подготовки исходных значений для расчета).Создать пользовательское
    // исключение, добавить методы, ожидающие возникновение исключений, использовать при этом параметры
    // expectedExceptions и expectedExceptionsMessageRegExp;
    //для одного или нескольких наборов тестов реализовать возможность параллельного выполнения тестов
    // (реализовать параллельное выполнение методов, тестов и классов);
    Runner runner = new Runner();
    Boolean successTest;

    @BeforeClass
    public Integer createCount() {
        count = 0;
        return count;
    }

    @AfterClass
    public void countResult() {
        System.out.println(count);
    }

    @AfterMethod
    public void method1() {
        if (successTest) System.out.println("Тест выполнен");
        else System.out.println("Тест провален");
    }

    @BeforeMethod
    public void before1() {
        successTest = false;
        count++;
    }

    @Test(groups = "PositiveResult", description = "Этот тест проверяет деление положительных чисел")
    public void testDivisionPositiveNumbers() {
        Random random = new Random();
        double x = random.nextInt(1000) + 1;
        double y = random.nextInt(1000) + 1;
        Assert.assertEquals(x / y, runner.division(x, y), "Выполнена проверка деления положительных чисел");
        System.out.println("Выполнена проверка деления положительных чисел");
        successTest = true;
    }

    @Test(groups = "PositiveResult", description = "Этот тест проверяет деление отрицательных чисел")
    public void testDivisionNegativeNumbers() {
        double x = Math.random() * (-1001);
        double y = Math.random() * (-1001);
        Assert.assertEquals(x / y, runner.division(x, y));
        System.out.println("Выполнена проверка деления отрицательных чисел");
        successTest = true;
    }

    @Test(groups = "AnyResult", description = "Этот тест проверяет деление положительного числа на отрицательное")
    public void testDivisionCheck() {
        double x = Math.random() * (1001);
        double y = Math.random() * (-1001);
        Assert.assertTrue(runner.division(x, y) < 0);
        System.out.println("Выполнена проверка, что результат деления положительного числа на отрицательное число не будет положительным");
        successTest = true;
    }

    @Test(groups = "AnyResult", description = "Этот тест проверяет деление числа на число, равное ему")
    public void testDivisionSameNumbers() {
        double x = Math.random() * (1001);
        Assert.assertEquals(x / x, runner.division(x, x));
        System.out.println("Выполнена проверка деления числа на число, равное ему");
        successTest = true;
    }

    @Test(groups = "AnyResult", description = "Этот тест проверяет деление числа на единицу")
    public void testDivision1() {
        double x = Math.random() * (1001);
        Assert.assertEquals(x / 1, runner.division(x, 1));
        System.out.println("Выполнена проверка деления на единицу");
        successTest = true;
    }

    @Test(expectedExceptions = {MyException.class}, description = "Этот тест проверяет деление числа на ноль",
            expectedExceptionsMessageRegExp = "Деление на ноль")
    public void testException() throws MyException {
        double x = Math.random() * (1001);
        System.out.println("Выполнена проверка деления на ноль");
        successTest = true;
        runner.division(x, 0);
    }

    @Test(dataProvider = "data-pr", description = "Этот тест проверяет деление положительных чисел из DataProvider")
    public void testDivisionDataProvider(Double value, Double value1) {
        Assert.assertEquals(value / value1, runner.division(value, value1));
        System.out.println(String.format(Locale.ENGLISH, "Выполнена проверка деления положительных чисел %.2f и %.2f из data-pr", value, value1));
        successTest = true;
    }

    @DataProvider(name = "data-pr")
    public Object[][] dataProviderMethod() {
        return new Object[][]{
                {8.0, 4.0},
                {4.0, 2.0},
        };
    }
}
