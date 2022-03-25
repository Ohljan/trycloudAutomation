package com.trycloud.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/trycloud/step_definitions",
        features ="src/test/resources/features",
        plugin =  {
                //"pretty",
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",

        },
        dryRun = false,
        tags = "@fails",
        publish=true



)
public class CukesRunner {

}
