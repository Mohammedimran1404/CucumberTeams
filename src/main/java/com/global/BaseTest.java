package com.global;

import org.openqa.selenium.WebDriver;
import com.pagefactory.CalendarPage;
import com.pagefactory.FilterFunctionalityPage;
import com.pagefactory.GeneralPage;
import com.pagefactory.LoginPage;
import com.pagefactory.ManageDelegatePage;
import com.pagefactory.SearchBarDataPage;
import com.pagefactory.SearchBarPage;
/* This Class contains all objects which is used for 
   reusability
   @Author Mohammed Imran */
public class BaseTest{
	public static WebDriver driver;
	public UtilFunctions utilities = new UtilFunctions(driver);
	public CreateLog log = new CreateLog();
	public PropertyFile propertyfile= new PropertyFile();
	public Validations validations= new Validations();
	public   LoginPage loginpage;
	public GeneralPage generalpage;
	public SearchBarPage searchbarpage;
	public FilterFunctionalityPage filter_functionalitypage;
	public CalendarPage calendarpage;
	public ManageDelegatePage manage_delegatepage;
	public SearchBarDataPage searchbar_datapage;
	public String url = propertyfile.getApplicationUrl();
	public String email=propertyfile.getApplicationEmail();
	public String pass=propertyfile.getApplicationPassword();
	public String browser=propertyfile.getBrowserName();
	
}
