package hotel;

import java.time.LocalDate;

/**
 *
 * @author Anas Albaadry & Saleh Lootah
 */
public class HotelImpl implements Hotel{
    /**
    * Load all the room records from a text file
    *
    * @param  roomsTxtFileName  the text file for all room records
    * @return true if loading data successfully, otherwise false
    */
    @Override
    public boolean importRoomsData(String roomsTxtFileName) {
        return true;
    }
    
    /**
    * Load all the guest records from a text file
    *
    * @param  guestsTxtFileName  the text file for all guest records
    * @return true if loading data successfully, otherwise false
    */
    @Override
    public boolean importGuestsData(String guestsTxtFileName) {
        return true;
    }
    
    /**
    * Load all the booking records from a text file
    *
    * @param  bookingsTxtFileName  the text file for all booking records
    * @return true if loading data successfully, otherwise false
    */
    @Override
    public boolean importBookingsData(String bookingsTxtFileName) {
        return true;
    }
    
    /**
    * Load all the payment records from a text file
    *
    * @param  paymentsTxtFileName  the text file for all payment records
    * @return true if loading data successfully, otherwise false
    */
    @Override
    public boolean importPaymentsData(String paymentsTxtFileName) {
        return true;
    }
    
    /**
    * Display all room information in the current hotel
    */
    @Override
    public void displayAllRooms() {
        
    }
    
    /**
    * Display all guest information in the current hotel
    */
    @Override
    public void displayAllGuests() {
        
    }
    
    /**
    * Display all booking information in the current hotel
    */
    @Override
    public void displayAllBookings() {
        
    }
    
    /**
    * Display all payment information in the current hotel
    */
    @Override
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
    @Override
    public boolean addRoom(int roomNumber, RoomType roomType, double price, int capacity, String facilities) {
        return true;
    }
    
    /**
    * Remove one room from the hotel
    *
    * @param roomNumber   the room number
    * @return             true if removing the room successfully, otherwise false
    */
    @Override
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
    @Override
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
    @Override
    public boolean addGuest(String fName, String lName, LocalDate dateJoin, LocalDate VIPstartDate, LocalDate VIPexpiryDate) {
        return true;
    }
    
    /**
    * Remove one guest from the hotel
    *
    * @param guestID the guest unique ID
    * @return        true if removing the guest successfully, otherwise false
    */
    @Override
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
    @Override
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
    @Override
    public int[] availableRooms(RoomType roomType, LocalDate checkin, LocalDate checkout) {
        return null;     
    }
    
    /**
    * Make a booking for one room type.
    * If more than one room avaible, choose one room randomly to book
    *
    * @param guestID    a unique guest ID
    * @param roomType   a room type
    * @param checkin    the check-in date
    * @param checkout   the check-out date
    * @return           the booked room number if the booking is successful,
    *                   otherwise, return -1
    */
    @Override
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
    @Override
    public boolean checkOut(int bookingID, LocalDate actualCheckoutDate) {
        return true;
    }
    
    /**
    * Cancel a booking by offering a unique booking ID.
    *
    * @param bookingID a unique booking ID
    * @return          true if the cancellation is successful, otherwise false.
    */
    @Override
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
    @Override
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
    @Override
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
    @Override
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
    @Override
    public void displayPaymentsOn(LocalDate thisDate) {
        
    }
    
    /**
   * Save all the room records in a text file
   *
   * @param  roomsTxtFileName  the text file for all room records
   * @return true if saving data successfully, otherwise false
   */
    @Override
    public boolean saveRoomsData(String roomsTxtFileName) {
        return true;
    }
    
    /**
    * Save all the guest records in a text file
    *
    * @param  guestsTxtFileName  the text file for all guest records
    * @return true if saving data successfully, otherwise false
    */
    @Override
    public boolean saveGuestsData(String guestsTxtFileName) {
        return true;
    }
    
    /**
    * Save all the booking records in a text file
    *
    * @param  bookingsTxtFileName  the text file for all booking records
    * @return true if saving data successfully, otherwise false
    */
    @Override
    public boolean saveBookingsData(String bookingsTxtFileName) {
        return true;
    }
    
    /**
    * Save all the payment records in a text file
    *
    * @param  paymentsTxtFileName  the text file for all payment records
    * @return true if saving data successfully, otherwise false
    */
    @Override
    public boolean savePaymentsData(String paymentsTxtFileName) {
        return true;
    }
    
}