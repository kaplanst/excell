package project1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NOKtheBestTest {
    @Test
    public void nOKtheBestTest(){

        Assert.assertEquals(NOKtheBest.Nok(new int[]{2, 19, 4, 31, 13, 33}), 1010724);
        Assert.assertEquals(NOKtheBest.Nok(new int[]{7, 8, 89, 3, 15, 17}), 1270920);

    }

}
