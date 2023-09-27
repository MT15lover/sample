package Com.Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import Com.cucumber_basecalss.Base_class;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (features = "src\\test\\java\\cucumber.feature",glue="stepdefiniton")
public class Test_runner {

	public static WebDriver driver;
	
	@BeforeClass
	public void setUp() throws Exception {
	
	
		driver = Base_class.launchbrowser();
	}
	

	@AfterClass
	public void tearDown() throws Exception {
		driver.close();
		
	}
	
	
}




