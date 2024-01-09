package runner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
               
                features="src/test/java/features",
                glue="stepdiffinition",
                tags="@ninja")
              
public class Runner {

}
/*
for executing only one feature file like as search 
  features="src/test/java/features/search",
*/

