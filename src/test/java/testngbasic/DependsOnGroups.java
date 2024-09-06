package testngbasic;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroups { // 1 to many

    @Test(groups = {"smoke"})
    public void verifyAddToCart(){
        //Assert.assertTrue(false);
        System.out.println("Verify Add To Cart");
    }

    @Test(dependsOnGroups={"smoke"} )
    public void verifyOrder(){
        System.out.println("Verify Order");
    }

    @Test(dependsOnGroups={"smoke"} )
    public void verifyPayment(){
        System.out.println("Verify Payment");
    }
}
