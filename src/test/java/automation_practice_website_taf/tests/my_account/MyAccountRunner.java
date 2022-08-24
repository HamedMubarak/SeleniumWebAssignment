package automation_practice_website_taf.tests.my_account;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/automation_practice_website_taf/tests/my_account",
        glue = {"automation_practice_website_taf.tests"},
        monochrome = true
)

public class MyAccountRunner extends  AbstractTestNGCucumberTests {
}
