import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Bun;

import static praktikum.Constants.*;

@RunWith(Parameterized.class)
public class BunTest {
    private final String name;
    private final float price;

    public BunTest(String name, float price) {
        this.name = name;
        this.price = price;
    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][]{
                {FLU_BUN, FLU_BUN_PRICE},
                {CRAT_BUN, CRAT_BUN_PRICE}
        };
    }

    @Test
    public void getNameTest() {
        Bun bun = new Bun(name, price);
        String actualName = bun.getName();
        Assert.assertEquals(actualName, name);
    }

    @Test
    public void getPriceTest() {
        Bun bun = new Bun(name, price);
        float actualPrice = bun.getPrice();
        Assert.assertEquals(actualPrice, price, DELTA);
    }
}

