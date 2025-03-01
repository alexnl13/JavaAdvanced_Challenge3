import java.util.Arrays;

public abstract class Line implements Mappable {
    private double [][] locations;

    public Line(GeoPoint gp1, GeoPoint gp2, GeoPoint... geoPoints) {
        locations = new double[geoPoints.length+2][2];
        locations[0] = new double[]{gp1.getLongitude(), gp1.getLatitude()};
        locations[1] = new double[]{gp2.getLongitude(), gp2.getLatitude()};
        int index = 2;
        for (GeoPoint gp : geoPoints) {
            locations[index] = new double[]{gp.getLongitude(), gp.getLatitude()};
            index++;
        }
    }

    private double[][] locations() {
        return locations;
    }

    @Override
    public void render() {
        System.out.println(String.format("LINE (%s)", Arrays.deepToString(locations())));
    }
}
