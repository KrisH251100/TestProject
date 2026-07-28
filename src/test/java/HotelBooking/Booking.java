package HotelBooking;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Booking extends BaseClassss {
	WebDriver driver;

	@BeforeClass
	public static void beforeclass() {
		browserLaunch();
		enterApplicationUrl("https://www.omrbranch.com/");
		maximizeWindow();
		implicitWait();
	}

	@AfterClass
	public static void afterclass() {
		closeAllWindow();
	}

	@Test
	public void test1() throws InterruptedException {

		// Login Credentials
		WebElement username = findLocatorById("email");
		sendKeysElement(username, "kishorekk2511@gmail.com");

		WebElement password = findLocatorById("pass");
		sendKeysElement(password, "Kishore@123");

		WebElement loginbtn = findLocatorByXpath("//button[@type='submit']");
		clickElement(loginbtn);

		// Print Welcome Text
		WebElement wel = findLocatorByXpath("//a[@class='icoTwitter mr-2 dropdown-toggle']");
		getTextElement(wel);
		System.out.println(getTextElement(wel));

		// Print Explore Hotels Text
		WebElement explore = findLocatorByXpath("//h5[@class='font35 font-weight-bold text-white mb-4']");
		getTextElement(explore);
		System.out.println(getTextElement(explore));

		// Book Hotel
		WebElement state = findLocatorById("state");
		selectOptionByText(state, "Tamil Nadu");

		WebElement city = findLocatorById("city");
		selectOptionByText(city, "Chennai");

		WebElement room = findLocatorById("room_type");
		selectOptionByText(room, "Standard");
		selectOptionByText(room, "Deluxe");
		selectOptionByText(room, "Suite");
		selectOptionByText(room, "Luxury");
		selectOptionByText(room, "Studio");

		WebElement checkin = findLocatorByName("check_in");
		clickElement(checkin);

		WebElement clickdate = findLocatorByXpath("//a[text()='30']");
		clickElement(clickdate);

		WebElement checkout = findLocatorByName("check_out");
		clickElement(checkout);

		WebElement clickdate1 = findLocatorByXpath("//a[text()='31']");
		clickElement(clickdate1);

		WebElement norooms = findLocatorById("no_rooms");
		selectOptionByText(norooms, "5-Five");

		WebElement noadults = findLocatorById("no_adults");
		selectOptionByText(noadults, "2-Two");

		WebElement nochildren = findLocatorById("no_child");
		sendKeysElement(nochildren, "5");

		frameSwitch();

		WebElement searchbtn = findLocatorByXpath("//button[@type='submit']");
		clickElement(searchbtn);

		navigateRefresh();
		WebElement selectHotel = findLocatorByXpath("//h5[text()='Select Hotel']");
		getTextElement(selectHotel);
		System.out.println(getTextElement(selectHotel));

		List<WebElement> phthotels = findElementsByXpath("//div[@class='col-md-5 hotel-suites']//child::h5");
		for (WebElement ht : phthotels) {
			System.out.println(ht.getText());
		}

		List<WebElement> prize = findElementsByXpath("//div[@class='prize']//child::strong");
		for (WebElement fullprize : prize) {
			System.out.println(fullprize.getText());
			System.out.println("GIT");
		}

		WebElement selhot = findLocatorByXpath("//h2[text()='$ 1,100']//following::a");
		clickElement(selhot);

		acceptAlert();

		WebElement printhotelname = findLocatorByXpath("//h5[text()='Hyatt Regency Chennai Standard']");
		getTextElement(printhotelname);
		System.out.println("Hotel Booked - " + getTextElement(printhotelname));

		WebElement myself = findLocatorById("own");
		clickElement(myself);

		WebElement mr = findLocatorById("user_title");
		selectOptionByText(mr, "Mr.");

		WebElement fname = findLocatorById("first_name");
		sendKeysElement(fname, "Krishna");

		WebElement lname = findLocatorById("last_name");
		sendKeysElement(lname, "Kishore");

		WebElement phoneno = findLocatorById("user_phone");
		sendKeysElement(phoneno, "7358551086");

		WebElement uemail = findLocatorById("user_email");
		sendKeysElement(uemail, "kishore@gmail.com");

		WebElement gst = findLocatorById("gst");
		clickElement(gst);

		WebElement gstno = findLocatorById("gst_registration");
		sendKeysElement(gstno, "9043592058");

		WebElement comname = findLocatorById("company_name");
		sendKeysElement(comname, "Greens Tech OMR Branch");

		WebElement comadd = findLocatorById("company_address");
		sendKeysElement(comadd, "Thoraipakkam");

		WebElement next = findLocatorById("step1next");
		clickElement(next);

		WebElement bed = findLocatorById("bed");
		clickElement(bed);

		WebElement req = findLocatorById("other_request");
		clickElement(req);
		sendKeysElement(req, "Clean the rooms before checkin");

		WebElement next1 = findLocatorById("step2next");
		clickElement(next1);

		WebElement card = findLocatorByXpath("//div[@class='credit-card pm']");
		clickElement(card);

		WebElement cardtype = findLocatorById("payment_type");
		selectOptionByText(cardtype, "Debit Card");

		WebElement cards = findLocatorById("card_type");
		selectOptionByText(cards, "Visa");

		WebElement cardno = findLocatorById("card_no");
		sendKeysElement(cardno, "5555555555552222");

		WebElement cname = findLocatorById("card_name");
		sendKeysElement(cname, "Kishore");

		WebElement month = findLocatorById("card_month");
		selectOptionByText(month, "November");

		WebElement year = findLocatorById("card_year");
		selectOptionByText(year, "2030");

		WebElement cvv = findLocatorById("cvv");
		sendKeysElement(cvv, "259");

		WebElement button = findLocatorById("submitBtn");
		clickElement(button);

		WebElement bookcon = findLocatorByXpath("//h2[@name='booking-code']//child::strong");
		getTextElement(bookcon);
		String pp = getTextElement(bookcon).substring(1);
		System.out.println(pp);

		WebElement printbook = findLocatorByXpath("//h2[text()=' Booking is Confirmed ']");
		getTextElement(printbook);
		String hi = getTextElement(printbook).substring(12);
		System.out.println(hi);

		WebElement hot = findLocatorByXpath("//strong[text()='Hyatt Regency Chennai']");
		getTextElement(hot);
		System.out.println(getTextElement(hot));
		

	}
}
