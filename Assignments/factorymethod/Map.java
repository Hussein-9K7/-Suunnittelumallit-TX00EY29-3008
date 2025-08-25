package factorymethod;

// هذا كلاس مجرد يمثل أي خريطة عامة
// الفكرة: هذا يحتوي الـ Factory Method (createTile) بشكل مجرد
// والخرائط الفرعية (CityMap/WildernessMap) تنفذه بطريقتها.
public abstract class Map {

    // حجم الخريطة بسيط حتى يكون واضح للمبتدئين
    protected int width = 5;
    protected int height = 5;

    // مصفوفة البلاطات
    protected Tile[][] tiles;

    // المُنشئ يبني الخريطة باستعمال الـ Factory Method
    public Map() {
        tiles = new Tile[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                tiles[i][j] = createTile(); // هنا استدعاء المصنع
            }
        }
    }

    // هذه هي الـ Factory Method (مجردة)
    public abstract Tile createTile();

    // عرض الخريطة على شكل أحرف
    public void display() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(tiles[i][j].getCharacter() + " ");
            }
            System.out.println();
        }
    }
}
