import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Painting implements Element{
    Map<String, SimpleElement> pathToElementMap;
    List<SimpleElement> elementList;

    Painting(){
        elementList=new ArrayList<>();
        pathToElementMap = new HashMap<>();
    }

    public void addElement(Element element){
        pathToElementMap.put(((SimpleElement)element).getFullName(), (SimpleElement)element);
        if (((SimpleElement)element).getPath().isEmpty()){
            elementList.add((SimpleElement)element);
        }
        else {
            SimpleElement containingElement = pathToElementMap.get(((SimpleElement)element).getPath());
            if (containingElement instanceof CompositeElement){
                ((CompositeElement) containingElement).addElement((SimpleElement)element);
            }
            else{throw new RuntimeException("ERROR");}
			//TODO: add element as a child of containingElement
        }
    }

    public void accept(Visitor visitor){
        for(SimpleElement el: elementList){
            el.accept(visitor);
        }
        visitor.visit(this);
    }

    public String getName() {
        return Painting.class.getSimpleName().toLowerCase();
    }

    public Habitat getHabitat(){ return Habitat.TERRESTRIAL; }
}
