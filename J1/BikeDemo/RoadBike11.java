package J1.BikeDemo;

public class RoadBike11 extends Bike11 {
    private int tireWidth;

    public void setTireWidth(int width){
        tireWidth = width;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Tire Width : " + tireWidth + " mm");
        System.out.println("Bike Type : Road Bike");
    }
}
