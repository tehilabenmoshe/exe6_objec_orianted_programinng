public class ShortPrintVisitor implements Visitor{

    private String str = "";

    public String getShortPrint() {
        return str;
    }

    @Override
    public void visit(Painting painting) {
    }

    @Override
    public void visit(Island island) {
        str += (island.getFullName()+"\n");
    }

    @Override
    public void visit(Lake lake) {
        str += (lake.getFullName()+"\n");
    }

    @Override
    public void visit(Boat boat) {
        str += (boat.getFullName()+"\n");
    }

    @Override
    public void visit(Flag flag) {
        str += (flag.getFullName()+"\n");
    }

    @Override
    public void visit(Tree tree) {
        str += (tree.getFullName()+"\n");
    }

    @Override
    public void visit(Kid kid) {
        str += (kid.getFullName()+"\n");
    }

    @Override
    public void visit(Kite kite) {
        str += (kite.getFullName()+"\n");
    }

}
