import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cart {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		int j=0;
		//Array
		String[] itemsNeeded = {"Cucumber", "Brocolli", "Beetroot", "Carrot"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		for(int i=0;i<products.size();i++) {
			//format it to get actual vegetable name
			//Brocolli - 1 Kg
			String[] name = products.get(i).getText().split("-");
			// first part will be Brocolli
			//Second part will be -1 KG
			
			//triming spaces
			String formatedName = name[0].trim();
		
			
			// Check whether name you extracted is present in array or not
			// convert array into arrayList for easy search
			List itemsNeededList = Arrays.asList(itemsNeeded);
			if(itemsNeededList.contains(formatedName)) {
				j++;
				//click on add to cart
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==itemsNeeded.length) {
					break;
				}
			}
		}
	}

}
