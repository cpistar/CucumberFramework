package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BrowserUtils;
import utilities.Driver;

public class DemoQADatePickerPAge {
	public DemoQADatePickerPAge() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy (id = "datePickerMonthYearInput")
	public WebElement firstDatePicker;
	
	@FindBy (css = ".react-datepicker__year-select")
	public WebElement yearDropDown;
	
	@FindBy (css = ".react-datepicker__month-select")
	public WebElement monthDropDown;
	
	@FindBy (css = ".react-datepicker__day")
	public List<WebElement> days;
	
	BrowserUtils utils = new BrowserUtils();
	public void pickADare(String year, int month, String day) {
		utils.selectByValue(yearDropDown, year);
		utils.selectByIndex(monthDropDown, month);
		
		for(WebElement webElement : days) {
			if(webElement.getText().equals(day)) {
				webElement.click();
				break;
			}
		}
	}
}	
