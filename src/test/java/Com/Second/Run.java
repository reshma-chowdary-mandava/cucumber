package Com.Second;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions

        ( 
        		tags= {"@sanity,@uat"},
//		features={"src/test/java/Com/Second/WithExample.feature"}, 
//		
//		plugin = {"html:src/test/java/Com/Second/Output/report.html",
//		"json:src/test/java/Com/Second/Output/report.json",
//		"junit:src/test/java/Com/Second/Output/report.junit",
//		"pretty"
//		
//		},
		monochrome= true
				)



public class Run {
	
}
