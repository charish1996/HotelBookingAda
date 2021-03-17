package org.ada;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelConfirmation extends HotelBase {
	public HotelConfirmation() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="order_no")
	private WebElement orderNo;
	public WebElement getOrderNo() {
		return orderNo;
	}

}
