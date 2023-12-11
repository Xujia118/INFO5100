public class Client {
    public static void main(String[] args) {
        // Singleton pattern: get instance of ReservationSystem
        ReservationSystem reservationSystem = ReservationSystem.getInstance();

        // Make reservations
        reservationSystem.makeReservation("John");

        // Try to make another reservation (will not be available)
        reservationSystem.makeReservation("Jane");
        reservationSystem.makeReservation("Bob");

        // Cancel a reservation
        reservationSystem.cancelReservation("John");

        // Make a new reservation (now available)
        reservationSystem.makeReservation("Alice");
    }
}
