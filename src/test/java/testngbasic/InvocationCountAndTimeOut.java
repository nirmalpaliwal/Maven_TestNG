package testngbasic;

import org.testng.annotations.Test;

public class InvocationCountAndTimeOut {

    @Test(invocationCount = 3) //Invocation Count, Used when we want to run our single test case multiple times
    public void verifyInvocationCount() { // if we define invocation count=3 for single test case then it behave like 3 test case
        System.out.println("Hello Guys");
    }

    @Test(invocationCount = 10000, invocationTimeOut = 1) //(not used now)Invocation timeout, Used when we want to run our single test case multiple times within timelimit
    public void verifyInvocationTimeOut() { // if some test cases pending to execute at time out happen then all test case will not execute and throw thread timeout Exception
        System.out.println("Boss Hello");
    }
}
