package Test_Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\karth\\Desktop\\Selenium\\New_maven\\TCF\\src\\test\\resources\\Feature\\Acatin.feature",
		glue="Step_definition")

public class Runner {

}
