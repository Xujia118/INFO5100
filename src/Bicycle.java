public class Bicycle {
    // Fields
    private static int counter = 0;
    private int id;
    private int cadence;
    private int gear;
    private int speed;
    private int weight;
    private int price;
    private String brand;
    private String Country;
    private String Type;

    // Constructor
    public Bicycle() {
        id = ++counter;
        System.out.println("Bicycle" + id + " is created.");
    }

    // Methods
    public void Travel() {}
    public void Brake() {}
    public void Park() {}

    public static class MountainBike {
        private static int counter = 0;
        private int id;
        private String suspensionType;
        private String tyreBrand;

        public MountainBike(String suspensionType, String tyreBrand) {
            id = ++ counter;
            this.suspensionType = suspensionType;
            this.tyreBrand = tyreBrand;
            System.out.println("Mountain Bike" + id + " has " + suspensionType + " suspension and " + tyreBrand + " tyre.");
        }

        public void jump() {}
        public void race() {}
        public void sell() {}
    }

    public static class CityBike {
        Boolean has_fenders;
        Boolean has_pannier_mount;

        public CityBike(Boolean has_fenders, Boolean has_pannier_mount) {
            super();
            this.has_fenders = has_fenders;
            this.has_pannier_mount = has_pannier_mount;
        }

        public void shop() {}
        public void carry() {}
        public void steal() {}
    }
}
