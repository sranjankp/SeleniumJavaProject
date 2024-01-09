package runner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
               // plugin={"html:target/cucumber_html_report.html"},
                //		monochrome=true,
                features="src/test/java/features",
                glue="stepdiffinition",
                //tags="@all")
                 tags="@all,@smoke")
          //    tags="@all""@smoke")
public class Runner {

}
/*
for executing only one feature file like as searchPr
  features="src/test/java/features/searchPr.feature",
*/

