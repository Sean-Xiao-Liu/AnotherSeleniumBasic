package introduction;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Scroll{

    WebDriver driver;

    public  void scrollToElement(WebElement element){
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);");
    }

    public void scrollToBottom(WebDriver driver){
        ((JavascriptExecutor)driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    public void scrollToTop(WebDriver driver){
        ((JavascriptExecutor)driver).executeScript("window.scrollTo(0, 0)");
    }
}
