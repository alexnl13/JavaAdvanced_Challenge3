import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Park> parks = new ArrayList<>();
        parks.add(new Park("Mahtra LKA", new GeoPoint(59.13, 25.01)));
        parks.add(new Park("Kõrvemaa MKA", new GeoPoint(59.20,25.54)));

        Layer<Park> parkLayer = new Layer();
        parkLayer.addElements(parks);

        List<River> rivers = new ArrayList<>();
        rivers.add(new River("Pärnu river", new GeoPoint(58.37,24.47), new GeoPoint(58.42, 24.7), new GeoPoint(58.49,24.88)));
        rivers.add(new River("Narva river", new GeoPoint(59.47, 28.04), new GeoPoint(59.35, 28.19)));

        Layer<River> riverLayer = new Layer<>();
        riverLayer.addElements(rivers);

        parkLayer.renderLayer();
        riverLayer.renderLayer();
    }
}