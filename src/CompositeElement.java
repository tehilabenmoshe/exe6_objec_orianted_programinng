import java.util.ArrayList;
import java.util.List;

public abstract class CompositeElement extends SimpleElement{

    List<SimpleElement> elementList;

    public CompositeElement(double width, double length, String path) {
        super(width, length, path);
        elementList = new ArrayList<>();
    }

    public abstract void addElement(SimpleElement element);

    public List<SimpleElement> getElements(){
        return elementList;
    }
}
