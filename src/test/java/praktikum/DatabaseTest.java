package praktikum;

import org.junit.Assert;
import org.junit.Test;

public class DatabaseTest {
    Database database = new Database();

    @Test
    public void checkBunsCount() {
        int expectedBunsCount = 3;
        Assert.assertEquals("Количество булочек не совпадает", expectedBunsCount, database.availableBuns().size());
    }

    @Test
    public void checkIngredientsCount() {
        int expectedIngredientsCount = 6;
        Assert.assertEquals("Количество ингредиентов не совпадает", expectedIngredientsCount, database.availableIngredients().size());
    }
}
