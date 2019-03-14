import hotel.HotelImpl;
import java.util.*;
import java.text.*;

public class Test{
	public static final String roomsTxtFileName = "C:\\Users\\Fat Dickson\\OneDrive - University of Exeter\\School-Big-Dickson\\Object Oriented Programming\\Hotel\\hotel\\src\\data\\rooms.txt";
	public static final String guestsTxtFileName = "C:\\Users\\Fat Dickson\\OneDrive - University of Exeter\\School-Big-Dickson\\Object Oriented Programming\\Hotel\\hotel\\src\\data\\guests.txt";
	public static final String bookingsTxtFileName = "C:\\Users\\Fat Dickson\\OneDrive - University of Exeter\\School-Big-Dickson\\Object Oriented Programming\\Hotel\\hotel\\src\\data\\bookings.txt";
	public static final String paymentsTxtFileName = "C:\\Users\\Fat Dickson\\OneDrive - University of Exeter\\School-Big-Dickson\\Object Oriented Programming\\Hotel\\hotel\\src\\data\\payments.txt";
	public static final SimpleDateFormat d8 = new SimpleDateFormat("yyyy-MM-dd");


	public static void main(String[] args) {

		HotelImpl hotel = new HotelImpl(roomsTxtFileName, guestsTxtFileName, bookingsTxtFileName, paymentsTxtFileName);
		try{
		Date checkin = d8.parse("2019-03-22");
		Date checkout = d8.parse("2019-03-23");
		hotel.addGuest("Lucas", "Martin Calderon",checkin);
		hotel.addGuest("Josh", "du Parc Braham",checkout);
		hotel.addRoom(1002, "Single", 90.00, 5, "own bathroom");
		System.out.println("");
		hotel.displayAllRooms();
		System.out.println("");
		hotel.displayAllBookings();
		System.out.println("");
		hotel.displayAllPayments();
		System.out.println("");
		hotel.displayAllGuests();
		}catch(Exception e){e.printStackTrace();}
	}
} 