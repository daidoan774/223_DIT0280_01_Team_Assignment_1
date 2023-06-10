package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(10000);
        WebElement name = driver.findElement(By.xpath("//input[@name='username']"));
        System.out.println(name.getText());
        name.sendKeys("Admin");

        WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
        System.out.println(name.getText());
        pass.sendKeys("admin123");

        WebElement button = driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));
        System.out.println(button.getText());
        button.click();

        Thread.sleep(5000);
        WebElement proTime = driver.findElement(By.xpath("//div[@class='orangehrm-attendance-card-profile']"));
        System.out.println(proTime.getText());
        proTime.getText();

        WebElement admin = driver.findElement(By.xpath("//a[@class='oxd-main-menu-item']/span[text()='Admin']"));
        System.out.println(admin.getText());
        admin.click();

        Thread.sleep(5000);
        WebElement pim = driver.findElement(By.xpath("//a[@class='oxd-main-menu-item']/span[text()='PIM']"));
        System.out.println(pim.getText());
        pim.click();

        Thread.sleep(5000);
        WebElement leave = driver.findElement(By.xpath("//a[@class='oxd-main-menu-item']/span[text()='Leave']"));
        System.out.println(leave.getText());
        leave.click();

        Thread.sleep(5000);
        WebElement time = driver.findElement(By.xpath("//a[@class='oxd-main-menu-item']/span[text()='Time']"));
        System.out.println(time.getText());
        time.click();

        Thread.sleep(5000);
        WebElement recruite = driver.findElement(By.xpath("//a[@class='oxd-main-menu-item']/span[text()='Recruitment']"));
        System.out.println(recruite.getText());
        recruite.click();

        Thread.sleep(5000);
        WebElement info = driver.findElement(By.xpath("//a[@class='oxd-main-menu-item']/span[text()='My Info']"));
        System.out.println(info.getText());
        info.click();

        Thread.sleep(5000);
        WebElement perform = driver.findElement(By.xpath("//a[@class='oxd-main-menu-item']/span[text()='Performance']"));
        System.out.println(perform.getText());
        perform.click();

        Thread.sleep(5000);
        WebElement directory = driver.findElement(By.xpath("//a[@class='oxd-main-menu-item']/span[text()='Directory']"));
        System.out.println(directory.getText());
        directory.click();

        Thread.sleep(5000);
        WebElement maintenance = driver.findElement(By.xpath("//a[@class='oxd-main-menu-item']/span[text()='Maintenance']"));
        System.out.println(maintenance.getText());
        maintenance.click();

        Thread.sleep(5000);
        WebElement buzz = driver.findElement(By.xpath("//a[@class='oxd-main-menu-item']/span[text()='Buzz']"));
        System.out.println(buzz.getText());
        buzz.click();
    }
}
