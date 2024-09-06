package testngbasic;

import org.testng.annotations.Test;

public class DisableTestCase {

    @Test(enabled = false)
    public void verifyLogIn(){
        System.out.println("Verify Login");
    }
    @Test
    public void verifySIgnUp(){
        System.out.println("Verify SignUp");
    }

}
