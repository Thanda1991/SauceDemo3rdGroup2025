package Utils;

import org.testng.annotations.DataProvider;

public class TestDataProvider {
    @DataProvider(name = "loginData")
    public Object[][] getLoginData() {

        return new Object[][] {
                // email, password, expectedResult
                {"valid@test.com", "Pass123", "success"},
                {"wrong@test.com", "Pass123", "error"},
                {"valid@test.com", "wrong", "error"},
                {"", "", "error"}
        };
    }
}
