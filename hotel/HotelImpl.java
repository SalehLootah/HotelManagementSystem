package hotel;

import java.io.*;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Date;
import java.util.Random;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import java.text.*;

/**
 *
 * @author Anas Albaadry & Saleh Lootah
 */
public class HotelImpl implements Hotel{
    public static ArrayList<Room>rooms;
    public static ArrayList<Guest>guests;
    public static ArrayList<Booking>bookings;
    public static ArrayList<Payment>payments;
    public static ArrayList<VIP>VIPGuests;
    public static final SimpleDateFormat d8 = new SimpleDateFormat("yyyy-MM-dd");
    
    static class Room{
        private long roomNumber;
        private String roomType;
        private double price;
        private int capacity;
        private String facilities;
        
        //Constructor Start
        public Room(long roomNumber, String roomType, double price, int capacity, String facilities){
            this.roomNumber = roomNumber;
            this.roomType = roomType;
            this.price = price;
            this.capacity = capacity;
            this.facilities = facilities;
        }
        
    }
    
    static class Guest{
        private long guestID;
        private String fName;
        private String lName;
        private Date dateJoin;
        
        public Guest(long guestID,String fName,String lName,Date dateJoin){
            this.guestID = guestID;
            this.fName = fName;
            this.lName = lName;
            this.dateJoin = dateJoin;
        }
    }
    
    static class Booking{
        private long id;
        private long guestID;
        private long roomNumber;
        private Date bookingDate;
        private Date checkinDate;
        private Date checkoutDate;
        
        public Booking(long id,long guestID,long roomNumber,Date bookingDate,Date checkinDate, Date checkoutDate){
            this.id = id;
            this.guestID = guestID;
            this.roomNumber = roomNumber;
            this.bookingDate = bookingDate;
            this.checkinDate = checkinDate;
            this.checkoutDate = checkoutDate;
        }
    }
    
    static class Payment{
        private Date date;
        private long guestID;
        private double amount;
        private String payReason;
        
        public Payment(Date date, long guestID, double amount, String payReason){
            this.date = date;
            this.guestID = guestID;
            this.amount = amount;
            this.payReason = payReason;
        }
    }
    
    class VIP extends Guest{
        private Date VIPStartDate;
        private Date VIPEndData;
        
        public VIP(long guestID, String fName, String lName, Date dateJoin, Date VIPstartDate, Date VIPEndDate) {
            super(guestID, fName, lName, dateJoin);
            this.VIPStartDate = VIPStartDate;
            this.VIPEndData = VIPEndDate;
        }
        
        public void setVIP(Date VIPStartDate, Date VIPEndDate){
            this.VIPEndData = VIPEndDate;
            this.VIPStartDate = VIPStartDate;
        }
        
        public Date getVIPStartDate(){
            return this.VIPStartDate = VIPStartDate;
        }
        public Date getVIPEndDate(){
            return this.VIPEndData = VIPEndData;
        }
    
    }
    
    /**
    * Load all the room records from a text file
    *
    * @param  roomsTxtFileName  the text file for all room records
    * @return true if loading data successfully, otherwise false
    */
    
    public boolean importRoomsData(String roomsTxtFileName) {
        try{
            File file = new File(roomsTxtFileName);
            BufferedReader in = new BufferedReader(new FileReader(file));
            String st;
            rooms = new ArrayList<Room>();

            while ((st = in.readLine()) != null){
                String[] roomData = st.split(",");
                Room newRoom = new Room(Long.valueOf(roomData[0]),roomData[1],Double.valueOf(roomData[2]),Integer.valueOf(roomData[3]), roomData[4]);
                rooms.add(newRoom);
            }
            in.close();
            return true;
        }
        catch(Exception e){
            System.out.println("ERORR");
            return false;
        }
        
    }
    
    /**
    * Load all the guest records from a text file
    *
    * @param  guestsTxtFileName  the text file for all guest records
    * @return true if loading data successfully, otherwise false
    */
    
    public boolean importGuestsData(String guestsTxtFileName) {
        try{
        File file = new File(guestsTxtFileName);
            BufferedReader in = new BufferedReader(new FileReader(file));
            String st;
            guests = new ArrayList<Guest>();
            VIPGuests = new ArrayList<VIP>();
            while((st = in.readLine()) != null){
                String[] guestData = st.split(",");
                if(guestData.length > 4){
                    VIP newVIPGuest = new VIP(Long.valueOf(guestData[0]),guestData[1],guestData[2],d8.parse(guestData[3]),d8.parse(guestData[4]),d8.parse(guestData[5]));
                    VIPGuests.add(newVIPGuest);
                }
                else{
                    Guest newGuest = new Guest(Long.valueOf(guestData[0]),guestData[1],guestData[2],d8.parse(guestData[3]));
                    guests.add(newGuest);
                }
            }
            in.close();
            return true;
        }
        catch(Exception e){
            System.out.println("Error while reading guest list");
            return false;
        }  
    }
    
    /**
    * Load all the booking records from a text file
    *
    * @param  bookingsTxtFileName  the text file for all booking records
    * @return true if loading data successfully, otherwise false
    */
    
    public boolean importBookingsData(String bookingsTxtFileName) {
        return true;
    }
    
    /**
    * Load all the payment records from a text file
    *
    * @param  paymentsTxtFileName  the text file for all payment records
    * @return true if loading data successfully, otherwise false
    */
    
    public boolean importPaymentsData(String paymentsTxtFileName) {
        return true;
    }
    
    /**
    * Display all room information in the current hotel
    */
    
    public void displayAllRooms() {
        
    }
    
    /**
    * Display all guest information in the current hotel
    */
    
    public void displayAllGuests() {
        
    }
    
    /**
    * Display all booking information in the current hotel
    */
    
    public void displayAllBookings() {
        
    }
    
    /**
    * Display all payment information in the current hotel
    */
    
    public void displayAllPayments() {
        
    }
    
    /**
    * Add one room to the hotel
    *
    * @param roomNumber   the room number
    * @param roomType     the room type
    * @param price        the room price (with no discount)
    * @param capacity     the maximal number of people to stay
    * @param facilities   the facilities of the room
    * @return             true if adding the room successfully, otherwise false
    */
    
    public boolean addRoom(int roomNumber, RoomType roomType, double price, int capacity, String facilities) {
        return true;
    }
    
    /**
    * Remove one room from the hotel
    *
    * @param roomNumber   the room number
    * @return             true if removing the room successfully, otherwise false
    */
    
    public boolean removeRoom(int roomNumber) {
        return true;
    }
    
    /**
    * Add one standard guest to the hotel
    *
    * @param fName    the first name of the guest
    * @param lName    the last name of the guest
    * @param dateJoin the date of registration
    * @return         true if adding the guest successfully, otherwise false
    */
    
    public boolean addGuest(String fName, String lName, LocalDate dateJoin) {
        return true;
    }
    
    /**
    * Add one VIP guest to the hotel
    *
    * @param fName        the first name of the guest
    * @param lName        the last name of the guest
    * @param dateJoin     the date of registration
    * @param VIPstartDate the start date of VIP membership
    * @param VIPexpiryDate the expiry date of VIP membership
    * @return             true if adding the guest successfully, otherwise false
    */
    
    public boolean addGuest(String fName, String lName, LocalDate dateJoin, LocalDate VIPstartDate, LocalDate VIPexpiryDate) {
        return true;
    }
    
    /**
    * Remove one guest from the hotel
    *
    * @param guestID the guest unique ID
    * @return        true if removing the guest successfully, otherwise false
    */
    
    public boolean removeGuest(int guestID) {
        return true;
    }
    
    /**
    * check for a room's availability
    *
    * @param roomNumber a unique room number
    * @param checkin    the check-in date
    * @param checkout   the check-out date
    * @return           true if the room is available for this period
    */
    
    public boolean isAvailable(int roomNumber, LocalDate checkin, LocalDate checkout) {
        return true;
    }
    
    /**
    * Search for available rooms for one room type
    * @param roomType   a room type
    * @param checkin    the check-in date
    * @param checkout   the check-out date
    * @return           an array of available room numbers for this period
    */
    
    public int[] availableRooms(RoomType roomType, LocalDate checkin, LocalDate checkout) {
        return null;     
    }
    
    /**
    * Make a booking for one room type.
    * If more than one room available, choose one room randomly to book
    *
    * @param guestID    a unique guest ID
    * @param roomType   a room type
    * @param checkin    the check-in date
    * @param checkout   the check-out date
    * @return           the booked room number if the booking is successful,
    *                   otherwise, return -1
    */
    
    public int bookOneRoom(int guestID, RoomType roomType, LocalDate checkin, LocalDate checkout) {
        return 1;
    }
    
    /**
    * Check out by offering a unique booking ID.
    *
    * @param bookingID a unique booking ID
    * @param actualCheckoutDate the actual check-out date
    * @return          true if the check-out is successful, otherwise false.
    */
    
    public boolean checkOut(int bookingID, LocalDate actualCheckoutDate) {
        return true;
    }
    
    /**
    * Cancel a booking by offering a unique booking ID.
    *
    * @param bookingID a unique booking ID
    * @return          true if the cancellation is successful, otherwise false.
    */
    
    public boolean cancelBooking(int bookingID) {
        return true;
    }
    
    /**
    * Search for a guest
    *
    * @param firstName the guest first name
    * @param lastName  the guest last name
    * @return          an array of guest IDs who match the name
    */
    
    public int[] searchGuest(String firstName, String lastName) {
        return null;
    }
    
    /**
    * Print out a guest's booking information (if any)
    * by given the unique guest ID.
    *
    * @param guestID a unique guest ID
    *
    */
    
    public void displayGuestBooking(int guestID) {
        
    }
    
    /**
    * Display on the screen all the booking information by given a date
    * The output contains booking ID, the guest name, the room number,
    * the room type, the room price, the payment price (if the guest is
    * a VIP, the payment price is different from the room price, otherwise,
    * it equals the room price)
    *
    * @param  thisDate  a given date
    */
    
    public void displayBookingsOn(LocalDate thisDate) {
        
    }
    
    /**
    * Display on the screen all the payments on a given date.
    * This is to check how much income on a specific day.
    * The output contains the guest ID, the payment amount,
    * the payment reason (”booking”, ”VIPmembership” or ”refund”).
    * If it is due to cancelling, the payment amount refers to the
    * refund amount – a negative value.
    *
    * @param  thisDate  a given date
    */
    
    public void displayPaymentsOn(LocalDate thisDate) {
        
    }
    
    /**
   * Save all the room records in a text file
   *
   * @param  roomsTxtFileName  the text file for all room records
   * @return true if saving data successfully, otherwise false
   */
    
    public boolean saveRoomsData(String roomsTxtFileName) {
        return true;
    }
    
    /**
    * Save all the guest records in a text file
    *
    * @param  guestsTxtFileName  the text file for all guest records
    * @return true if saving data successfully, otherwise false
    */
    public boolean saveGuestsData(String guestsTxtFileName) {
        return true;
    }
    
    /**
    * Save all the booking records in a text file
    *
    * @param  bookingsTxtFileName  the text file for all booking records
    * @return true if saving data successfully, otherwise false
    */
    public boolean saveBookingsData(String bookingsTxtFileName) {
        return true;
    }
    
    /**
    * Save all the payment records in a text file
    *
    * @param  paymentsTxtFileName  the text file for all payment records
    * @return true if saving data successfully, otherwise false
    */
    
    public boolean savePaymentsData(String paymentsTxtFileName) {
        return true;
    }

    private SimpleDateFormat SimpleDateFormat(String ddMMyyyy) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}