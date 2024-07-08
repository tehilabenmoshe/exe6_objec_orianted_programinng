
public class AreaCalculatorVisitor implements Visitor{

    private int totalArea = 0;

    public int getTotalArea() {
        return totalArea;
    }

    @Override
    public void visit(Painting painting) {
    }

    @Override
    public void visit(Island island) {
        double r = island.getWidth() / 2.0;
        double area = Math.PI * Math.pow(r, 2);
        totalArea +=  (int)area;
    }

    @Override
    public void visit(Lake lake) {
        double r = lake.getWidth() / 2.0;
        double area = Math.PI * Math.pow(r, 2);
        totalArea +=  (int)area;
    }

    @Override
    public void visit(Boat boat) {
        double r = boat.getWidth() / 2.0;
        double len = (boat.getLength() - r);
        double area = boat.getWidth() * len + Math.PI * Math.pow(r, 2) / 2;
        totalArea += (int)area;
    }

    @Override
    public void visit(Flag flag) {
        double area = flag.getWidth() * flag.getLength();
        totalArea += (int)area;
    }

    @Override
    public void visit(Tree tree) {
        double area = (tree.getWidth() / 2.0) * tree.getLength();
        totalArea += (int)area;
    }

    @Override
    public void visit(Kid kid) {
        double r = kid.getWidth() / 2.0;
        double lenRect = (kid.getLength() - kid.getWidth());
        double area = kid.getWidth() * lenRect + Math.PI * Math.pow(r, 2);
        totalArea += (int)area;
    }

    @Override
    public void visit(Kite kite) {
        double area = kite.getWidth() * kite.getLength() / 2.0;
        totalArea += (int)area;
    }
}
