// TODO: Implement Composite (change this file).
 
public class Island extends CompositeElement {
    public Island(String name, double diameter, String path) {
        //TODO: fix
        super(0,0,null);
    }

    @Override
    public String getName() {
        //TODO: fix
        return null;
    }

    @Override
    public Habitat getHabitat() {
        return Habitat.AQUATIC;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);

        for(SimpleElement el: elementList) {
            el.accept(visitor);
        }
    }

    public void addElement(SimpleElement element){
        if(element.getHabitat() != Habitat.TERRESTRIAL) {
            elementList.add(element);
        } else{
            System.out.println(this.getName() + " cannot contain an " + element.getClass());
        }
    }
}