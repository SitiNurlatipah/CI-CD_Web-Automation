package starter;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

import org.openqa.selenium.By;

public class Logout extends PageObject {
    private By clickPeopleIcon(){return By.xpath("//*[@id=\"app\"]/div[1]/header/div/button[2]");}
    private By clickLogoutButton(){return By.xpath("//*[@tabindex=\"0\"]/div[2]");}
    @Step
    public void clickPeopleButton(){$(clickPeopleIcon()).click();}
    @Step
    public void klikLogoutButton(){$(clickLogoutButton()).click();}


}
