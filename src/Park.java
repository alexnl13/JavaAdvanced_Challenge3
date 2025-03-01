public class Park extends Point {

    private String name;

    public Park(String name, GeoPoint geoPoint) {
        super(geoPoint);
        this.name = name;
    }

    @Override
    public void render() {
        System.out.print("Render " + name + " as ");
        super.render();
    }
}
