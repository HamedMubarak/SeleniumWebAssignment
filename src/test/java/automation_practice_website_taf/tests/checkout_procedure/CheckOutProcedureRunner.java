package automation_practice_website_taf.tests.checkout_procedure;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/automation_practice_website_taf/tests/checkout_procedure",
        glue = {"automation_practice_website_taf.tests"},
        monochrome = true
)

public class CheckOutProcedureRunner extends AbstractTestNGCucumberTests{
}
