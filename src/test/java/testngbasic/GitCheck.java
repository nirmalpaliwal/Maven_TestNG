package testngbasic;

import org.testng.annotations.Test;

public class WithoutPriority {

// if we dont define priority  to any test case then test cases executes in ascending order of method name

    @Test
    public void testCase10(){
        System.out.println("Test Case 10");
    }

    @Test
    public void testCaseY(){
        System.out.println("Test Case Y");
    }

    @Test
    public void testCaseH(){
        System.out.println("Test Case H");
    }

    @Test
    public void testCaseA(){
        System.out.println("Test Case A");
    }

    @Test
    public void testCaseD(){
        System.out.println("Test Case D");
    }

    @Test
    public void testCaseR(){
        System.out.println("Test Case R");
    }

    @Test
    public void testCaseX(){
        System.out.println("Test Case X");
    }

    @Test
    public void testCaseZ(){
        System.out.println("Test Case Z");
    }


    @Test
    public void testCase8(){
        System.out.println("Test Case 8");
    }


    @Test
    public void testCasez(){
        System.out.println("Test Case z");
    }

    @Test
    public void testCasec(){
        System.out.println("Test Case c");
    }

    @Test
    public void testCaset(){
        System.out.println("Test Case t");
    }
	@Test
    public void testCaseO(){
        System.out.println("Test Case O");
    }
}

