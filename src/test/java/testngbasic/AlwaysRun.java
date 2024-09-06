package testngbasic;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AlwaysRun {

    @Test
    public void verifySIgnUp(){
        Assert.assertTrue(false);
        System.out.println("Verify SignUp");
    }
//when parent test case fail and we want to run child test case then 'alwaysRun=true' is used
    @Test(dependsOnMethods ="verifySIgnUp",alwaysRun = true)
    public void verifyLogIn(){
        System.out.println("Verify Login");
    }
    @Test
    public void verifyHomePage(){
        System.out.println("Verify Home page");
    }
}

