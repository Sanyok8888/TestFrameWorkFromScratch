package alluretheinternetloginpagehometask.testpackage;

import alluretheinternetloginpagehometask.BaseTest;
import alluretheinternetloginpagehometask.theinternetloginpage.TheInternetLoginPageLocatorsClass;
import alluretheinternetloginpagehometask.dataproviders.DataProviders;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import testdata.User;

public class TheInternetLoginPageTest extends BaseTest {

    @Test(dataProvider = "user-credentials", dataProviderClass = DataProviders.class)
    @Description("Error message should appear")

    public void errorMessageShouldAppear(String login, String password, String errorMessage) {

        User user = new User(login, password);
        TheInternetLoginPageLocatorsClass theInternetLoginPageLocatorsClass = new TheInternetLoginPageLocatorsClass(driver);

        theInternetLoginPageLocatorsClass.navigate();
        theInternetLoginPageLocatorsClass.login(user);
        Assert.assertEquals(theInternetLoginPageLocatorsClass.getErrorMessage(), errorMessage);

    }
}
