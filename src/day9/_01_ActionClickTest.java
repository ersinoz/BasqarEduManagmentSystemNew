package day9;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import utils.BaseStaticDriver;

public class _01_ActionClickTest extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://demoqa.com/buttons");

        WebElement clickButton = driver.findElement(By.xpath("//button[text()='Click Me']"));

        Actions builder = new Actions(driver);
        Action build = builder.moveToElement(clickButton).click().build();
        build.perform();

        String dynamicClickMessage = driver.findElement(By.id("dynamicClickMessage")).getText();
        Assert.assertEquals("You have done a dynamic click", dynamicClickMessage);
    }

}
