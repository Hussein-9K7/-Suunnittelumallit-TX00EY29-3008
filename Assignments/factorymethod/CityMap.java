package factorymethod;

import java.util.Random;

public class CityMap extends Map {
    private final Random random = new Random();
    @Override
    public Tile createTile() {
        int n = random.nextInt(3);
        if (n == 0) return new RoadTile();
        else if (n == 1) return new ForestTile();
        else return new BuildingTile();
    }
}
