import java.util.ArrayList;
import java.util.List;

public class Layer<T extends Mappable> {

    private List<T> layerElements = new ArrayList<>();

    public void addElement(T element) {
        layerElements.add(element);
    }

    public void addElements(List<T> elements) {
        elements.forEach(element -> layerElements.add(element));
    }

    public void renderLayer() {
        layerElements.forEach(e -> e.render());
    }
}
