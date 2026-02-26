package Utils;

import org.testng.annotations.DataProvider;

public class TestDataProvider {
    @DataProvider(name = "loginData")
    public Object[][] getLoginData() {

        return new Object[][] {
                // email, password, expectedResult
                {"standard_user", "secret_sauce", "success"},
                {"locked_out_user", "secret_sauce", "error"},
                {"standard_user", "secret_s1auce", "error"},
                {"", "", "error"}
        };
    }


}
