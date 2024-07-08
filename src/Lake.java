 
public class Lake extends CompositeElement {
    public Lake(String name, double diameter, String path) {
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
        return Habitat.TERRESTRIAL;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        for(SimpleElement el: elementList) {
            el.accept(visitor);
        }
    }


    public void addElement(SimpleElement element){
        if(element.getHabitat() != Habitat.AQUATIC) {
            elementList.add(element);
        } else{
            System.out.println(this.getName() + " cannot contain an " + element.getClass());
        }
    }
}
