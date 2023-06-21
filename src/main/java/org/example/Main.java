package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static   ChromeDriver driver = new ChromeDriver();
    public static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

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
//        WebElement proTime = driver.findElement(By.xpath("//div[@class='orangehrm-attendance-card-profile']"));
//        System.out.println(proTime.getText());
//        proTime.getText();
//
//        WebElement admin = driver.findElement(By.xpath("//a[@class='oxd-main-menu-item']/span[text()='Admin']"));
//        System.out.println(admin.getText());
//        admin.click();
//
//        Thread.sleep(5000);
//        WebElement pim = driver.findElement(By.xpath("//a[@class='oxd-main-menu-item']/span[text()='PIM']"));
//        System.out.println(pim.getText());
//        pim.click();
//
//        Thread.sleep(5000);
//        WebElement leave = driver.findElement(By.xpath("//a[@class='oxd-main-menu-item']/span[text()='Leave']"));
//        System.out.println(leave.getText());
//        leave.click();
//
//        Thread.sleep(5000);
//        WebElement time = driver.findElement(By.xpath("//a[@class='oxd-main-menu-item']/span[text()='Time']"));
//        System.out.println(time.getText());
//        time.click();
//
//        Thread.sleep(5000);
//        WebElement recruit = driver.findElement(By.xpath("//a[@class='oxd-main-menu-item']/span[text()='Recruitment']"));
//        System.out.println(recruit.getText());
//        recruit.click();
//
//        Thread.sleep(5000);
//        WebElement info = driver.findElement(By.xpath("//a[@class='oxd-main-menu-item']/span[text()='My Info']"));
//        System.out.println(info.getText());
//        info.click();
//
//        Thread.sleep(5000);
//        WebElement perform = driver.findElement(By.xpath("//a[@class='oxd-main-menu-item']/span[text()='Performance']"));
//        System.out.println(perform.getText());
//        perform.click();
//
//        Thread.sleep(5000);
//        WebElement directory = driver.findElement(By.xpath("//a[@class='oxd-main-menu-item']/span[text()='Directory']"));
//        System.out.println(directory.getText());
//        directory.click();
//
//        Thread.sleep(5000);
//        WebElement maintenance = driver.findElement(By.xpath("//a[@class='oxd-main-menu-item']/span[text()='Maintenance']"));
//        System.out.println(maintenance.getText());
//        maintenance.click();
//
////        driver.navigate().back();
//
//        Thread.sleep(5000);
//        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
//        System.out.println(password.getText());
//        password.sendKeys("admin123");
//
//        WebElement btn = driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--large oxd-button--secondary orangehrm-admin-access-button']"));
//        System.out.println(btn.getText());
//        btn.click();
//
//        Thread.sleep(5000);
//        WebElement buzz = driver.findElement(By.xpath("//a[@class='oxd-main-menu-item']/span[text()='Buzz']"));
//        System.out.println(buzz.getText());
//        buzz.click();
//
//        Thread.sleep(5000);
//        WebElement dashboard = driver.findElement(By.xpath("//a[@class='oxd-main-menu-item']/span[text()='Dashboard']"));
//        System.out.println(dashboard.getText());
//        dashboard.click();

//        Thread.sleep(5000);
//        WebElement request = driver.findElement(By.xpath("//p[text()=' (11) Leave Requests to Approve']"));
//        System.out.println(request.getText());
//        request.click();
//
//        Thread.sleep(5000);
//        driver.navigate().back();
//
//        Thread.sleep(5000);
//        WebElement timesheet = driver.findElement(By.xpath("//p[text()=' (9) Timesheets to Approve']"));
//        System.out.println(timesheet.getText());
//        timesheet.click();
//
//        Thread.sleep(5000);
//        driver.navigate().back();
//
//        Thread.sleep(5000);
//        WebElement pending = driver.findElement(By.xpath("//p[text()='(1) Pending Self Review']"));
//        System.out.println(pending.getText());
//        pending.click();
//
//        Thread.sleep(5000);
//        driver.navigate().back();

//        Thread.sleep(5000);
//        WebElement candidate = driver.findElement(By.xpath("//p[text()='(1) Candidate to Interview']"));
//        System.out.println(candidate.getText());
//        candidate.click();
//
//        Thread.sleep(5000);
//        driver.navigate().back();

//
//        Thread.sleep(10000);
//        WebElement assignleave = driver.findElement(By.xpath("//p[text()='Assign Leave']"));
//        System.out.println(assignleave.getText());
//        assignleave.click();
//
//        Thread.sleep(10000);
//        driver.navigate().back();
//        Thread.sleep(5000);
//        WebElement dashboard = driver.findElement(By.xpath("//a[@class='oxd-main-menu-item']/span[text()='Dashboard']"));
//        System.out.println(dashboard.getText());
//        dashboard.click();

//        Thread.sleep(10000);
//        WebElement leavelist = driver.findElement(By.xpath("//p[text()='Leave List']"));
//        System.out.println(leavelist.getText());
//        leavelist.click();
//
//        Thread.sleep(5000);
//        driver.navigate().back();
//
//        Thread.sleep(5000);
//        WebElement timesheets = driver.findElement(By.xpath("//p[text()='Timesheets']"));
//        System.out.println(timesheets.getText());
//        timesheets.click();
//
//        Thread.sleep(5000);
//        driver.navigate().back();
//
//        Thread.sleep(5000);
//        WebElement applyleave = driver.findElement(By.xpath("//p[text()='Apply Leave']"));
//        System.out.println(applyleave.getText());
//        applyleave.click();
//
//        Thread.sleep(5000);
//        driver.navigate().back();
//
//        Thread.sleep(5000);
//        WebElement myleave = driver.findElement(By.xpath("//p[text()='My Leave']"));
//        System.out.println(myleave.getText());
//        myleave.click();
//
//        Thread.sleep(5000);
//        driver.navigate().back();
//
//        Thread.sleep(5000);
//        WebElement mytimesheet = driver.findElement(By.xpath("//p[text()='My Timesheets']"));
//        System.out.println(mytimesheet.getText());
//        mytimesheet.click();
//
//        Thread.sleep(5000);
//        driver.navigate().back();
        WebElement myInfo = driver.findElement(By.xpath("//a[@class='oxd-main-menu-item']/span[text()='My Info']"));
        System.out.println(myInfo.getText());
        myInfo.click();

//        Thread.sleep(5000);
//        WebElement licenseDate = driver.findElement(By.xpath("//div[@class = \"oxd-date-wrapper\"]"));
//        System.out.println(licenseDate.getText());
//        licenseDate.click();
//        Thread.sleep(5000);
//        WebElement sex = driver.findElement(By.xpath("//input[@value=\"1\"]"));
//        System.out.println(sex.getText());
//        sex.click();


        Thread.sleep(5000);
        WebElement contactDetails = driver.findElement(By.xpath("//a[@class=\"orangehrm-tabs-item\"][text()=\"Contact Details\"]"));
        System.out.println(contactDetails.getText());
        contactDetails.click();

        Thread.sleep(5000);
        WebElement saveContactDetail = driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]"));
        System.out.println(saveContactDetail.getText());
        saveContactDetail.click();

        Thread.sleep(5000);
        WebElement emergencyContacts = driver.findElement(By.xpath("//a[@class=\"orangehrm-tabs-item\"][text()=\"Emergency Contacts\"]"));
        System.out.println(emergencyContacts.getText());
        emergencyContacts.click();

        Thread.sleep(5000);
        WebElement dependents = driver.findElement(By.xpath("//a[@class=\"orangehrm-tabs-item\"][text()=\"Dependents\"]"));
        System.out.println(dependents.getText());
        dependents.click();

        Thread.sleep(5000);
        WebElement immigration = driver.findElement(By.xpath("//a[@class=\"orangehrm-tabs-item\"][text()=\"Immigration\"]"));
        System.out.println(immigration.getText());
        immigration.click();

        Thread.sleep(5000);
        WebElement job = driver.findElement(By.xpath("//a[@class=\"orangehrm-tabs-item\"][text()=\"Job\"]"));
        System.out.println(job.getText());
        job.click();

        Thread.sleep(5000);
        WebElement salary = driver.findElement(By.xpath("//a[@class=\"orangehrm-tabs-item\"][text()=\"Salary\"]"));
        System.out.println(salary.getText());
        salary.click();

        Thread.sleep(5000);
        WebElement taxExemptions = driver.findElement(By.xpath("//a[@class=\"orangehrm-tabs-item\"][text()=\"Tax Exemptions\"]"));
        System.out.println(taxExemptions.getText());
        taxExemptions.click();

        Thread.sleep(5000);
        WebElement reportTo = driver.findElement(By.xpath("//a[@class=\"orangehrm-tabs-item\"][text()=\"Report-to\"]"));
        System.out.println(reportTo.getText());
        reportTo.click();

        Thread.sleep(5000);
        WebElement quality = driver.findElement(By.xpath("//a[@class=\"orangehrm-tabs-item\"][text()=\"Qualifications\"]"));
        System.out.println(quality.getText());
        quality.click();

        Thread.sleep(5000);
        WebElement member = driver.findElement(By.xpath("//a[@class=\"orangehrm-tabs-item\"][text()=\"Memberships\"]"));
        System.out.println(member.getText());
        member.click();
    }

    public static void click(String xpath){
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath)));
        var element = driver.findElement(By.xpath(xpath));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }
}
