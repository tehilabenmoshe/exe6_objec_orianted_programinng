import java.util.ArrayList;
import java.util.List;

public abstract class CompositeElement extends SimpleElement{

    List<SimpleElement> elementList;
    private String name;

    public CompositeElement(double width, double length, String path, String name) {
        super(width, length, path);
        this.name = name;
        elementList = new ArrayList<>();
    }

    public abstract void addElement(SimpleElement element);

    public List<SimpleElement> getElements(){
        return elementList;
    }


    public String getFullName(){
        return getPath().isEmpty()? getName() : getPath() +"/"+getName();
    }

    public String getName(){
        return name;
    }
}


