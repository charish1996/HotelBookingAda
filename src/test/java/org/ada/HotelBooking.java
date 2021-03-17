package org.ada;

import java.util.concurrent.TimeUnit;

public class HotelBooking extends HotelBase {
	public static void main(String[] args) {
		HotelBase ada = new HotelBase();
		ada.browserConfig();
		
		ada.openBrowser("http://adactinhotelapp.com/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		HotelLogin l= new HotelLogin();
//		ada.readerExcel(l.getTxtUser(), "D:\\selenium\\Demo\\Excel\\studentData.xlsx", "Sheet1");
		ada.typetext(l.getTxtUser(), ada.readerExcel("D:\\selenium\\HotelBooking\\ExcelFiles\\Login.xlsx", "Sheet1", 1, 0));
		ada.typetext(l.getTxtPass(), ada.readerExcel("D:\\\\selenium\\\\HotelBooking\\\\ExcelFiles\\\\Login.xlsx", "Sheet1", 1, 1));
		ada.click(l.getBtnLogin());
		
		HotelDetails d = new HotelDetails();
		ada.dropDown(d.getLocation(), 4);
		ada.dropDown(d.getHotels(), 1);
		ada.dropDown(d.getRoomType(), 2);
		ada.dropDown(d.getRoomNo(), 1);
		ada.typetext(d.getInDate(), "20022021");
		ada.typetext(d.getOutDate(), "21022021");
		ada.dropDown(d.getTxtAperRoom(), 1);
		ada.dropDown(d.getTxtCperRoom(), 0);
		ada.click(d.getBtnSubmit());
		
		SelectHotel s = new SelectHotel();
		ada.click(s.getRadioButton());
		ada.click(s.getCont());
		
		PersonDetails p = new PersonDetails();
		ada.typetext(p.getFirstName(), "charish");
		ada.typetext(p.getLastName(), "saisankar");
		ada.typetext(p.getAdd(), "12A London");
		ada.typetext(p.getCcNum(), "1234567890123456");
		ada.dropDown(p.getCcType(), 1);
		ada.dropDown(p.getExpiryM(), 11);
		ada.dropDown(p.getExpiryyear(), 11);
		ada.typetext(p.getcVv(), "155");
		ada.click(p.getBookNow());
		
		
		HotelConfirmation c = new HotelConfirmation();
		ada.scroll(c.getOrderNo(), "true");
		ada.writeExcel("D:\\\\selenium\\\\HotelBooking\\\\ExcelFiles\\\\Login.xlsx", "Sheet1", 3, 0, ada.getAttribute(c.getOrderNo(), "value"));
	}

}
