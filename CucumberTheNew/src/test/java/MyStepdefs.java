import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class MyStepdefs {


    @Given("my account balance is ${int}")
    public void myAccountBalanceIs$Balance(int arg) {
        System.out.println(arg);
    }

    @When("I withdraw ${int}")
    public void iWithdraw$Withdraw(int arg) {
        System.out.println(arg);
    }

    @Then("my balance should be ${int}")
    public void myBalanceShouldBe$Result(int arg) {
    }


    @Given("I want to by some {string}")
    public void iWantToBySome(String arg0) {
        
    }

    @When("I clicked {string} icon {int} times")
    public void iClickedIconTimes(String arg0, int arg1) {
        
    }

    @Then("{int} {string} are in the cart")
    public void areInTheCart(int arg0, String arg1) {
        Assert.assertEquals(5, 5, "Five is Five");
    }

    @Given("I'm on the store page")
    public void iMOnTheStorePage() {
        
    }

    @When("I add a {string} to the Cart")
    public void iAddAToTheCart(String arg0) {
        
    }

    @Then("I see {int} {string} in the Cart")
    public void iSeeInTheCart(int arg0, String arg1) {
    }
}
