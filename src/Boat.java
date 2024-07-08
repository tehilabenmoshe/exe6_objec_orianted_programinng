 

public class Boat extends SimpleElement{
    Material material;

    public Boat(double width, double length, Material m, String path) {
        super(width, length, path);
        this.material=m;
    }

    public Material getMaterial() {
        return material;
    }

    public String getName() {
        return "boat";
    }

    @Override
    public Habitat getHabitat() {
        return Habitat.AQUATIC;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
