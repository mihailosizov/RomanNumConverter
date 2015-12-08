package task;

import de.codecentric.jbehave.junit.monitoring.JUnitReportingRunner;
import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.List;

@RunWith(JUnitReportingRunner.class)
public class RomanNumeralsScenario  extends JUnitStories {
    private Configuration configuration;

    public RomanNumeralsScenario() {
        super();
        configuration = new Configuration() {
        };
    }

    @Override
    public InjectableStepsFactory stepsFactory() {
        return new InstanceStepsFactory(configuration(), new RomanNumeralsSteps());
    }

    protected List<String> storyPaths() {
        return Arrays.asList("task/roman-numerals-conversion.story");
    }

    @Override
    public Configuration configuration() {
        return configuration;
    }
}
