
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {
   public static  WebDriver driver;


    public static void main(String[] args) throws InterruptedException {


        //TestCase();
        ebay();


    }
    public static void OpenDriver(){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mokraoui\\Desktop\\D\\Dr\\chromedriver.exe");
        driver=new ChromeDriver();
    }


    public static void TestCase() throws InterruptedException {

        // this is URL varible
        String url = "https://www.ebay.com/";
        // this is method how to get a website
        driver.get(url);


        // this is how to fin a object in the page
        WebElement searchPhone = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
        searchPhone.sendKeys("COMPUTURE");

        WebElement clickSearchButton = driver.findElement(By.xpath("//*[@id='gh-ac']"));
        clickSearchButton.click();

        Thread.sleep(2000);
        WebElement homepage = driver.findElement(By.xpath("//*[@id='nav-hamburger-menu']"));
        homepage.click();

        driver.close();








    }

    public static void ebay() throws InterruptedException {

        // this is URL varible
        String url = "https://www.ebay.com/";
        // this is method how to get a website
        driver.get(url);
        Thread.sleep(2000);
        WebElement search = driver.findElement(By.xpath("//*[@id='gh-ac']"));
        search.sendKeys("watches");

        WebElement Clciksearch = driver.findElement(By.xpath("//*[@id='gh-btn']"));
        Clciksearch.click();
        Thread.sleep(5000);
        WebElement selectwatch = driver.findElement(By.xpath("//*[@id='srp-river-results']/ul/li[1]/div/div[2]/a/h3"));
        selectwatch.click();

        Thread.sleep(9000);
        WebElement buy = driver.findElement(By.xpath("//*[@id='binBtn_btn']"));

        buy.click();

        System.out.println("Yasmine completed the test as expected");

        driver.quit();


    }
}
