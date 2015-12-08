package task;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class RomanNumeralsSteps {
    private int arabicNumber;
    private String romanNumber;

    @Given("arabic number $arabicNumber")
    public void givenArabicNumber(int arabicNumber) {
        this.arabicNumber = arabicNumber;
    }

    @When("I convert it to roman number")
    public void convertNumber() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        romanNumber = romanNumeralsConverter.convert(arabicNumber);
    }

    @Then("result should be $result")
    public void resultAssert(String result) {
        Assert.assertThat(romanNumber, is(equalTo(result)));
    }
}
