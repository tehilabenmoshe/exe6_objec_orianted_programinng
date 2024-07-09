 
public class Lake extends CompositeElement {
    public Lake(String name, double diameter, String path) {
        super(diameter,diameter,path, name);
        //TODO: fix
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
        if(element.getHabitat() == Habitat.AQUATIC || element.getHabitat() == Habitat.AMPHIBIAN) {
            elementList.add(element);
        } else{
            System.out.println(this.getName() + " cannot contain " + element.getClass());
        }
    }
}
