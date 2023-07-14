import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Newwindow {

	public static void main(String[] args) {

		ChromeOptions ops = new ChromeOptions();

		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(ops);
		driver.get("https://www.amazon.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://www.flipkart.com/");
		WebElement Logo = driver.findElement(By.xpath("//a[@aria-label='Amazon']"));
		System.out.println("Height:" + Logo.getRect().getDimension().getHeight());
		System.out.println("Width:" + Logo.getRect().getDimension().getWidth());
		System.out.println("Xaxis:" + Logo.getRect().getX());
		System.out.println("Yaxis:" + Logo.getRect().getY());
		
		
		//span[text()='Brands']/following::I[@class='a-icon a-icon-checkbox']/following-sibling::*/child::span[text()='Nokia']
		

	}

}
