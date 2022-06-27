package stepdefinitions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {

    //Cucumberde feature ve stepdefinition eşleşmesi class bazinda degil
    // package seviyesindedir dolayisi ile @Before ve @After stepdefinitions package'i altinda herhangi bir yerde olabilir
    //ancak uygulamada genellikle hooks isminde bir class olusturup onun içine konulur
        @Before
        public void setUp(){
        }
        @After
        public void tearDown(Scenario scenario){
            final byte[] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            if (scenario.isFailed()) {
                scenario.attach(screenshot, "image/png","screenshots");
            }
            Driver.closeDriver();
        }
    }

