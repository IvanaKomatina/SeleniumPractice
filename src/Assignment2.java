import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.cssSelector(".form-control.ng-pristine.ng-invalid")).sendKeys("Ivana");
		driver.findElement(By.name("email")).sendKeys("ivana@ivana.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("123456");
		driver.findElement(By.id("exampleCheck1")).click();
		
		WebElement genderDropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown = new Select(genderDropdown);
		dropdown.selectByVisibleText("Female");
		
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.name("bday")).sendKeys("12.17.2022");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
	}
}
