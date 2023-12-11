public class ReservationSystem {
    private static ReservationSystem instance;
    private boolean isReservationAvailable;

    private ReservationSystem() {
        isReservationAvailable = true;
    }

    public static ReservationSystem getInstance() {
        if (instance == null) {
            instance = new ReservationSystem();
        }
        return instance;
    }

    public boolean makeReservation(String customerName) {
        if (isReservationAvailable) {
            System.out.println("Reservation made for " + customerName);
            isReservationAvailable =  false;
            return true;
        } else {
            System.out.println("Sorry, reservation is unavailable at this moment.");
            return false;
        }
    }

    public void cancelReservation(String customerName) {
        System.out.println("Reservation canceled for " + customerName);
        isReservationAvailable = true;
    }

}
