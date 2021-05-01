package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WebOrdersHomePage {

    public WebOrdersHomePage () {
        WebDriver driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "ctl00_MainContent_fmwOrder_ddlProduct")
    public WebElement chooseProduct;

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtQuantity")
    public WebElement chooseQuantity;

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtUnitPrice")
    public WebElement pricePerUnit;

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtTotal")
    public WebElement getTotal;

    @FindBy(xpath = "//input[@value='Calculate']")
    public WebElement calculateBtn;

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtName")
    public WebElement inputName;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox2")
    public WebElement inputStreet;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox3")
    public WebElement inputCity;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox4")
    public WebElement inputState;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox5")
    public WebElement inputZip;

    @FindBy(id = "ctl00_MainContent_fmwOrder_cardList_0")
    public WebElement visaCardBtn;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox6")
    public WebElement inputCCNumber;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox1")
    public WebElement inputExpDate;

    @FindBy(id = "ctl00_MainContent_fmwOrder_InsertButton")
    public WebElement processBtn;

    @FindBy(xpath = "//*[.='Order']")
    public WebElement orderButton;

    @FindBy(xpath = "//*[@id='ctl00_MainContent_fmwOrder_ddlProduct']")
    public WebElement products;

    @FindBy(xpath = "//*[contains(@id,'Quantity')]")
    public WebElement quantity;

    @FindBy(xpath = "//*[contains(@id,'UnitPrice')]")
    public WebElement unitPrice;

    @FindBy(xpath = "//*[contains(@id,'Total')]")
    public WebElement totalPrice;

    @FindBy(xpath = "//*[@value='Calculate']")
    public WebElement calculateButton;

    @FindBy (id = "ctl00_MainContent_fmwOrder_txtDiscount")
    public WebElement discountBox;

    @FindBy (tagName = "strong")
    public WebElement successMessage;

    @FindBy (xpath = "//a[@href='Default.aspx']")
    public WebElement allOrdersPart;
}
