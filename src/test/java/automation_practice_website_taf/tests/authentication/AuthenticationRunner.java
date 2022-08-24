package automation_practice_website_taf.tests.authentication;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/automation_practice_website_taf/tests/authentication",
        glue = {"automation_practice_website_taf.tests"},
        monochrome = true
)

public class AuthenticationRunner extends AbstractTestNGCucumberTests {
}
