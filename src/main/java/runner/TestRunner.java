package runner;


import org.junit.runner.RunWith;		
import cucumber.api.CucumberOptions;		
import cucumber.api.junit.Cucumber;		

@RunWith(Cucumber.class)				
@CucumberOptions(features="C:\\SeleniumJava\\Myworkspace\\CucumberSeleniumBDD\\src\\main\\java\\features",
glue={"stepDefinations"})						

public class TestRunner {

}
