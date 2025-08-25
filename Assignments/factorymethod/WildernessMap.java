package factorymethod;

import java.util.Random;

public class WildernessMap extends Map {
    private final Random random = new Random();
    @Override
    public Tile createTile() {
        int n = random.nextInt(3);
        if (n == 0) return new SwampTile();
        else if (n == 1) return new WaterTile();
        else return new ForestTile();
    }
}
