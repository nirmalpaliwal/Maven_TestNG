package testngbasic;

import org.testng.annotations.*;

public class BeforeAfterMethodAndClassPrint {

    //public WebDriver driver;

    @BeforeClass  //this will execute before(At First) exeute all of the test case or methods
    public void beforeClassDemo(){
        System.out.println("Before Class");
    }

    @AfterClass  //this will execute after (At Last) exeute all of the test case or methods
    public void afterClassDemo(){
        System.out.println("After Class");
    }

    @BeforeMethod //(Prerequisite) this method will execute before exeute each of the test case
    public void beforeMethodDemo(){
        System.out.println("Before Method ");
    }

    @AfterMethod //(Postrequisite)this method will execute after exeute each of the test case
            public void afterMethodDemo(){
            System.out.println("After Method ");
    }

    @Test
    public void verifyMethod_1(){
        System.out.println("Method 1");


    }
    @Test
    public void verifyMethod_2(){
        System.out.println("Method 2");
        // Assert.assertFalse(true);//Assert.assertTrue(false);


    }
    @Test
    public void verifyMethod_3(){
        System.out.println("Method 3");

    }
}
