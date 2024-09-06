package testngbasic;

import org.testng.annotations.Test;

public class PriorityWith {

// if we dont define priority  to any test case then test cases executes in ascending order of method name

    @Test(priority = 1)
    public void testCase10(){
        System.out.println("Test Case 10");
    }

    @Test(priority = 2)
    public void testCaseY(){
        System.out.println("Test Case Y");
    }

    @Test //ByDefault Priority is 0 (if two test case have no priority then executes in ascending order of method name
    public void testCaseH(){
        System.out.println("Test Case H");
    }

    @Test(priority = -1)
    public void testCaseA(){
        System.out.println("Test Case A");
    }

    @Test
    public void testCaseD(){
        System.out.println("Test Case D");
    }

    @Test(priority = -250)
    public void testCaseR(){
        System.out.println("Test Case R");
    }

    @Test(priority ='A') // If we Define Priority in Character then it takes ascci value & compare with priority set in integer
    public void testCaseX(){
        System.out.println("Test Case X");
    }

    @Test(priority ='q')
    public void testCaseZ(){
        System.out.println("Test Case Z");
    }


    @Test(priority ='R')
    public void testCase8(){
        System.out.println("Test Case 8");
    }


    @Test(priority = 10)
    public void testCasez(){
        System.out.println("Test Case z");
    }

    @Test(priority = 7)
    public void testCasec(){
        System.out.println("Test Case c");
    }

    @Test(priority = 7)  //if two test case have same priority then executes in ascending order of method name
    public void testCaset(){
        System.out.println("Test Case t");
    }
}
