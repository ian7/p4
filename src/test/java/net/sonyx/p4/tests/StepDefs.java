package net.sonyx.p4.tests;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.sonyx.p4.Position;
import org.junit.Assert;

/**
 * Created by Marcin on 05-Dec-16.
 */
public class StepDefs {
    Position p = null;

    @Given("^we have fresh position$")
    public void weHaveFreshPosition() throws Throwable {
        p = new Position();
    }

    @When("^I move it$")
    public void iMoveIt() throws Throwable {
        p.move(new Position(1, 2));
    }

    @Then("^it should be somewhere else$")
    public void itShouldBeSomewhereElse() throws Throwable {
        Assert.assertNotEquals(p.getX(),0,0);
        Assert.assertNotEquals(p.getY(),0,0);
    }
}
