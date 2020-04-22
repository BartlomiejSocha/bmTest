package Panel;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class GeneralForm extends Header {

    public GeneralForm(WebDriver driver) {
        super(driver);
    }
    public void ScrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("javascript:window.scrollTo(0,700)");
    }

    public WebElement waitForVisibility(WebElement webElement) {
        Actions actions = new Actions(driver);
        actions.moveToElement(webElement);
        actions.perform();
        return webElement;
    }

    public void selectClientRadio(){
        //waitForVisibility(radio1);
        radio1.click();
    }

    public void typeClientName(){
        txaClientName.sendKeys("BlueServices Test");
    }
    public void typeEmail(){
        //waitForVisibility(txaEmail);
        txaEmail.sendKeys("bs@blueservices.pl");
    }
    public void typeCompanyName(){
        //waitForVisibility(txaCompanyName);
        txaCompanyName.sendKeys("");
        ScrollDown();
    }
    public void typeTelephoneNumber(){
        //waitForVisibility(txaTelephone);
        txaTelephone.sendKeys("+48 123 123 123");
    }
    public void selectPrzelewy(){
        //waitForVisibility(tabTemat);
        tabTemat.click();
        fieldPrzel.sendKeys("Przelewy natychmiastowe");
        tabTemat.click();
    }
    public void typeDetailsBody(){
        //waitForVisibility(fieldBody);
        fieldBody.sendKeys("automat test Blueservices");
    }
    public void selectRadio(){
        //waitForVisibility(chBox1);
        chBox1.click();
        //waitForVisibility(chBox2);
        chBox2.click();
    }
    public void selectClose(){
        chClose.click();
    }

}
