package testngbasic;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethods { // 1 to 1
//Depends On Method not in used now because in real project we run test cases in parallel-->No Output will get
//Test cases shuld be executes independently
    @Test
    public void verifyLogIn(){
        Assert.assertTrue(false);
        System.out.println("Verify Login");
    }

    @Test(dependsOnMethods ="verifyLogIn"/*,priority = -3*/) //if parent test case fail then child test case also fails due to it depend on parent test case
    public void verifyHomePage(){
        System.out.println("Verify Home page");
    }
    @Test
    public void verifySIgnUp(){
        System.out.println("Verify SignUp");
    }
}
