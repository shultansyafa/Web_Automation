package stepDef;
import com.google.common.base.FinalizableReferenceQueue;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import runner.BaseTest;

import java.io.IOException;

import static java.sql.DriverManager.getDriver;

public class cucumberHooks extends BaseTest {

    @Before
    public void beforeTest() {
        getDriver();
    }

    @After
    public void afterTest(){
        driver.close();
    }
}
