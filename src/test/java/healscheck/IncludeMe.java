package healscheck;

import org.testng.Assert;
import org.testng.annotations.Test;
import steps.HealsCheckSteps;

public class IncludeMe {

    @Test(description = "Heals check steps description")
    public void checkLoginAndPassword(){
        HealsCheckSteps healsCheckSteps = new HealsCheckSteps();

        Assert.assertTrue(healsCheckSteps.checkLoginAndPassword("eeeeeee","eeeeeee"));
        Assert.assertTrue(healsCheckSteps.checkLoginAndPassword("ddddd","dddddd"));
    }
}
