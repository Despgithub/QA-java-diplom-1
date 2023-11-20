package praktikum;

import org.junit.Assert;
import org.junit.Test;


public class IngredientTest {

    @Test
    public void getIngredientNameTest() {
        Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "Соус традиционный галактический", 15);
        Assert.assertEquals("Имя не совпадает", "Соус традиционный галактический", ingredient.getName());
    }

    @Test
    public void getIngredientPriceTest() {
        int expectedPrice = 15;
        Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "Соус традиционный галактический", 15);
        Assert.assertEquals("Цена не совпадает", expectedPrice, ingredient.getPrice(), 0);
    }

    @Test
    public void getIngredientTypeTest() {
        Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "Соус традиционный галактический", 15);
        Assert.assertEquals("Тип не совпадает", "SAUCE", ingredient.getType().toString());

    }
}
