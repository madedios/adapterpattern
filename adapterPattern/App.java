package adapterPattern;

public class App {
    public static void main(String[] args) {

        Laptop laptop = new Laptop();
        Refrigerator refrigerator = new Refrigerator();
        SmartphoneCharger smartphoneCharger = new SmartphoneCharger();

        PowerOutlet laptopPower = new LaptopAdapter(laptop);
        PowerOutlet refrigeratorPower = new RefrigeratorAdapter(refrigerator);
        PowerOutlet smartphonePower = new SmartphoneAdapter(smartphoneCharger);

        System.out.println(laptopPower.plugIn());
        System.out.println(refrigeratorPower.plugIn());
        System.out.println(smartphonePower.plugIn());
    }
}