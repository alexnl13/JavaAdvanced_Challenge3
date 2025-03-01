import java.util.Arrays;

public abstract class Point implements Mappable {
    private double[] location;

    public Point(GeoPoint geoPoint) {
        this.location = new double[]{geoPoint.getLatitude(), geoPoint.getLongitude()};
    }

    private double[] location() {
        return location;
    };

    @Override
    public void render() {
        System.out.println(String.format("POINT (%s)", Arrays.toString(location())));
    }
}
