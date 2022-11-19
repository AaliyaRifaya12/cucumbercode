package com.pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.base.BaseClass;


public class SearchHotelPage extends BaseClass {
	
	
	
	public SearchHotelPage() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//select[@name='location']")
	private WebElement location;

	@FindBy(id="username_show")
	private WebElement textLoginMsg;

	@FindBy(xpath="//select[@name='hotels']")S
	private WebElement hotels;

	@FindBy(xpath="//select[@name='room_type']")
	private WebElement room_type;

	@FindBy(xpath="//select[@name='room_nos']")
	private WebElement room_nos;

	@FindBy(id="datepick_in")
	private WebElement txtCheckInDate;

	@FindBy(id="datepick_out")
	private WebElement txtCheckOutDate;

	@FindBy(id="adult_room")
	private WebElement AdultPerRoom;

	@FindBy(id="child_room")
	private WebElement ChildrenPerRoom;

	@FindBy(xpath="//input[@type='submit']")
	private WebElement btnSearch;

	@FindBy (id = "checkin_span")
	private WebElement txtDateInMsg;

	@FindBy (id = "checkout_span")
	private WebElement txtDateOutMsg;

	@FindBy (id ="location_span")
	private WebElement txtLocationMsg;

	public WebElement getLocation() {
		return location;
	}
	public void setLocation(WebElement location) {
		this.location = location;
	}
	public WebElement getTextLoginMsg() {
		return textLoginMsg;
	}
	public void setTextLoginMsg(WebElement textLoginMsg) {
		this.textLoginMsg = textLoginMsg;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public void setHotels(WebElement hotels) {
		this.hotels = hotels;
	}
	public WebElement getRoom_type() {
		return room_type;
	}
	public void setRoom_type(WebElement room_type) {
		this.room_type = room_type;
	}
	public WebElement getRoom_nos() {
		return room_nos;
	}
	public void setRoom_nos(WebElement room_nos) {
		this.room_nos = room_nos;
	}
	public WebElement getTxtCheckInDate() {
		return txtCheckInDate;
	}
	public void setTxtCheckInDate(WebElement txtCheckInDate) {
		this.txtCheckInDate = txtCheckInDate;
	}
	public WebElement getTxtCheckOutDate() {
		return txtCheckOutDate;
	}
	public void setTxtCheckOutDate(WebElement txtCheckOutDate) {
		this.txtCheckOutDate = txtCheckOutDate;
	}
	public WebElement getAdultPerRoom() {
		return AdultPerRoom;
	}
	public void setAdultPerRoom(WebElement adultPerRoom) {
		AdultPerRoom = adultPerRoom;
	}
	public WebElement getChildrenPerRoom() {
		return ChildrenPerRoom;
	}
	public void setChildrenPerRoom(WebElement childrenPerRoom) {
		ChildrenPerRoom = childrenPerRoom;
	}
	public WebElement getBtnSearch() {
		return btnSearch;
	}
	public void setBtnSearch(WebElement btnSearch) {
		this.btnSearch = btnSearch;
	}
	public WebElement getTxtDateInMsg() {
		return txtDateInMsg;
	}
	public void setTxtDateInMsg(WebElement txtDateInMsg) {
		this.txtDateInMsg = txtDateInMsg;
	}
	public WebElement getTxtDateOutMsg() {
		return txtDateOutMsg;
	}
	public void setTxtDateOutMsg(WebElement txtDateOutMsg) {
		this.txtDateOutMsg = txtDateOutMsg;
	}
	public WebElement getTxtLocationMsg() {
		return txtLocationMsg;
	}
	public void setTxtLocationMsg(WebElement txtLocationMsg) {
		this.txtLocationMsg = txtLocationMsg;
	}
	public void searchButtonCommonStep() {
//clicksearchbutton
	
	WebElement btnsubmit = driver.findElement(By.name("Submit"));
	btnsubmit.click();
}
	//Common Steps
		
	public void searchHotelsCommonStep(String location,String room_nos,String datepick_in,String datepick_out,String adult_room) {
WebElement eleLoc = driver.findElement(By.xpath("//select[@name='location']"));
Select select = new Select(eleLoc);
select.selectByVisibleText(location);

WebElement roomnos = driver.findElement(By.xpath("//select[@name='room_nos']"));
Select select1 = new Select(roomnos);
select1.selectByVisibleText(room_nos);


WebElement datepicin = driver.findElement(By.id("datepick_in"));
Select select2 = new Select(datepicin);
select2.selectByVisibleText(datepick_in);


WebElement datepicout = driver.findElement(By.id("datepick_out"));
Select select3 = new Select(datepicout);
select3.selectByVisibleText(datepick_out);

WebElement adult = driver.findElement(By.id("adult_room"));
Select select4 = new Select(adult);
select4.selectByVisibleText(adult_room);



}		
//1.Selecting all fields

public void searchHotel(String location,String hotels,String room_type,String room_nos,String datepick_in,String datepick_out,String adult_room,String child_room) {

	
	WebElement hotel = driver.findElement(By.xpath("//select[@name='hotels']"));
	Select select3 = new Select(hotel);
	select3.selectByValue(hotels);
	
	WebElement roomtype = driver.findElement(By.xpath("//select[@name='room_type']"));
	Select select4 = new Select(roomtype);
	select4.selectByValue(room_type);
	
	WebElement child = driver.findElement(By.id("child_room"));
	Select select5 = new Select(child);
	select5.selectByValue(child_room);
	
		
	searchButtonCommonStep();
	
	
}
//entering manadatory fields only
public void searchHotels(String location,String room_nos,String datepick_in,String datepick_out,String adult_room) {

	
	searchHotelsCommonStep(location,room_nos,datepick_in,datepick_out,adult_room);
	
	searchButtonCommonStep();
}

//Without entering any fields
public void SearchHotels() {
	searchButtonCommonStep();

}



}
	


