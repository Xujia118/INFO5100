public class Bicycle {
    // Fields
    private static int counter = 0;
    private int id;
    private int cadence;
    private int speed;
    private int weight;
    private int price;
    private String gear;
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
        private int wheelSize;
        private int numMirrors;
        private String suspensionType;
        private String tyreBrand;
        private String frameType;
        private String brakeType;

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
        private static int counter = 0;
        private int id;
        Boolean has_fenders;
        Boolean has_pannier_mount;
        private int wheelSize;
        private String suspensionType;
        private String tyreBrand;
        private String frameType;
        private String brakeType;

        public CityBike(Boolean has_fenders, Boolean has_pannier_mount) {
            this.has_fenders = has_fenders;
            this.has_pannier_mount = has_pannier_mount;
            id = ++counter;

            String hasFenders = null;
            if (has_fenders == true) {
                hasFenders = " has fenders";
            } else {
                hasFenders = " and does not have fenders";
            }

            String hasPannier = null;
            if (has_pannier_mount == true) {
                hasPannier = " and has pannier mount.";
            } else {
                hasPannier = " but does not have pannier mount.";
            }

            System.out.println("City Bike" + id + hasFenders + hasPannier);
        }

        public void shop() {}
        public void carry() {}
        public void steal() {}
    }
}
