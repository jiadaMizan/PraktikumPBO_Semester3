package J1.BikeDemo;

public class BikeDemo11 {
    public static void main(String[] args) {
        Bike11 mountainBike1 = new Bike11();
        Bike11 mountainBike2 = new Bike11();
        RoadBike11 roadBike1 = new RoadBike11();

        mountainBike1.setBrand("Trek");
        mountainBike1.speedAcceleration(10);
        mountainBike1.gearChange(2);
        mountainBike1.printInfo();

        mountainBike2.setBrand("Giant");
        mountainBike1.speedAcceleration(20);
        mountainBike2.gearChange(3);
        mountainBike2.printInfo();

        roadBike1.setBrand("Specialized");
        roadBike1.setTireWidth(25);
        roadBike1.speedAcceleration(15);
        roadBike1.gearChange(4);
        roadBike1.printInfo();
    }
}
