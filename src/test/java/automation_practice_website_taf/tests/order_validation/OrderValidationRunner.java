package automation_practice_website_taf.tests.order_validation;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/automation_practice_website_taf/tests/order_validation",
        glue = {"automation_practice_website_taf.tests"},
        monochrome = true
)

public class OrderValidationRunner extends AbstractTestNGCucumberTests{
}
