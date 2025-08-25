package factorymethod;

public class Game {
    public static Map createMap(String type) {
        if (type.equalsIgnoreCase("city")) return new CityMap();
        else if (type.equalsIgnoreCase("wilderness")) return new WildernessMap();
        else return null;
    }

    public static void main(String[] args) {
        Map city = createMap("city");
        System.out.println("City map:");
        city.display();

        System.out.println();

        Map wild = createMap("wilderness");
        System.out.println("Wilderness map:");
        wild.display();
    }
}
