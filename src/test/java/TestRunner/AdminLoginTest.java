package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\Tarun32\\OneDrive\\Desktop\\new\\InetBankingV1_CucumberProject\\src\\test\\java\\FeatureFiles\\AdminLogin.feature",
		glue = "Stepdefinitions",
		monochrome = true,
		dryRun = false
		)
public class AdminLoginTest 
{

}
