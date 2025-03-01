public class River extends Line {

    private String name;

    public River(String name, GeoPoint gp1, GeoPoint gp2, GeoPoint... geoPoints) {
        super(gp1, gp2, geoPoints);
        this.name = name;
    }

    @Override
    public void render() {
        System.out.print("Render " + name + " as ");
        super.render();
    }
}
