 
public class Kite extends SimpleElement {
    Color color;

    public Kite(double width, double height, Color color, String path) {
        super(width, height, path);
        this.color = color;
    }

     public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
	
    @Override
    public String getName() {
        return "kite";
    }

    @Override
    public Habitat getHabitat() {
        return Habitat.TERRESTRIAL;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
