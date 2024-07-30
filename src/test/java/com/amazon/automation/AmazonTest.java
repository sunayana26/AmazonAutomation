package com.amazon.automation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonTest extends BaseTest {

    @Test
    public void testHomePageTitle() {
        driver.get("https://www.amazon.com");
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Amazon"), "Title does not contain 'Amazon'");
    }
}
