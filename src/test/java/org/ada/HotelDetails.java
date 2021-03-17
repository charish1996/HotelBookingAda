package org.ada;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelDetails extends HotelBase {
	public HotelDetails() {
			PageFactory.initElements(driver, this);
	}
	@FindBy(name="location")
	private WebElement location;
	@FindBy(id="hotels")
	private WebElement hotels;
	@FindBy(id="room_type")
	private WebElement roomType;
	@FindBy(id="room_nos")
	private WebElement roomNo;
	@FindBy(id="datepick_in")
	private WebElement inDate;
	@FindBy(id="datepick_out")
	private WebElement outDate;
	@FindBy(id="adult_room")
	private WebElement txtAperRoom;
	@FindBy(id="child_room")
	private WebElement txtCperRoom;
	@FindBy(id="Submit")
	private WebElement btnSubmit;
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public WebElement getRoomType() {
		return roomType;
	}
	public WebElement getRoomNo() {
		return roomNo;
	}
	public WebElement getInDate() {
		return inDate;
	}
	public WebElement getOutDate() {
		return outDate;
	}
	public WebElement getTxtAperRoom() {
		return txtAperRoom;
	}
	public WebElement getTxtCperRoom() {
		return txtCperRoom;
	}
	public WebElement getBtnSubmit() {
		return btnSubmit;
	}
}
