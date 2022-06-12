package builder;

public class Test {
    public static void main(String[] args){
        Laptop laptop = new Laptop.LaptopBuilder("16 GB","34GB","3.2HGZ").build();
        System.out.println("Laptop config: " + laptop);

        Laptop laptop2 = new Laptop.LaptopBuilder("32 GB","64GB","4.2HGZ").setBluetoothEnabled(true).setGraphicsEnabled(false).build();
        System.out.println("Laptop config: " + laptop2);

        Laptop laptop3 = new Laptop.LaptopBuilder("8 GB","16GB","1.2HGZ").setBluetoothEnabled(true).build();
        System.out.println("Laptop config: " + laptop3);

        Laptop laptop4 = new Laptop.LaptopBuilder("14 GB","120GB","2.2HGZ").setBluetoothEnabled(false).build();
        System.out.println("Laptop config: " + laptop4);

        Laptop laptop5 = new Laptop.LaptopBuilder("14 GB","120GB","2.2HGZ").setBluetoothEnabled(true).build();
        System.out.println("Laptop config: " + laptop5);

        Laptop laptop6 = new Laptop.LaptopBuilder("14 GB","120GB","2.2HGZ").setBluetoothEnabled(false).build();
        System.out.println("Laptop config: " + laptop6);
    }
}
