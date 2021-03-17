package org.ada;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonDetails extends HotelBase {
	public PersonDetails() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="first_name")
	private WebElement firstName;
	@FindBy(id="last_name")
	private WebElement lastName;
	@FindBy(id="address")
	private WebElement add;
	@FindBy(id="cc_num")
	private WebElement ccNum;
	@FindBy(id="cc_type")
	private WebElement ccType;
	@FindBy(id="cc_exp_month")
	private WebElement expiryM;
	@FindBy(id="cc_exp_year")
	private WebElement expiryyear;
	@FindBy(id="cc_cvv")
	private WebElement cVv;
	@FindBy(id="book_now")
	private WebElement bookNow;
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getAdd() {
		return add;
	}
	public WebElement getCcNum() {
		return ccNum;
	}
	public WebElement getCcType() {
		return ccType;
	}
	public WebElement getExpiryM() {
		return expiryM;
	}
	public WebElement getExpiryyear() {
		return expiryyear;
	}
	public WebElement getcVv() {
		return cVv;
	}
	public WebElement getBookNow() {
		return bookNow;
	}

}
