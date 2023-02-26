package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class DataTablesPage {

    public DataTablesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class='dt-button buttons-create']")
    public WebElement newBtn;

    @FindBy(id = "DTE_Field_first_name")
    public WebElement firstNameField;

    @FindBy(id = "DTE_Field_last_name")
    public WebElement lastNameField;

    @FindBy(id = "DTE_Field_position")
    public WebElement positionField;

    @FindBy(id = "DTE_Field_office")
    public WebElement officeField;

    @FindBy(id = "DTE_Field_extn")
    public WebElement extensionField;

    @FindBy(id = "DTE_Field_start_date")
    public WebElement startDateField;

    @FindBy(id = "DTE_Field_salary")
    public WebElement salaryField;

    @FindBy(xpath = "//button[@class='btn']")
    public WebElement createBtn;

    @FindBy(xpath = "//*[@type='search']")
    public WebElement searchInput;

    @FindAll({@FindBy(xpath = "//tbody//tr//td[@class='sorting_1']")})
    public List<WebElement> tableNames;


}
