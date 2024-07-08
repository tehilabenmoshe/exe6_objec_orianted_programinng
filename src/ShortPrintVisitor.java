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
        str += island.getPath();
    }

    @Override
    public void visit(Lake lake) {
        str += lake.getPath();
    }

    @Override
    public void visit(Boat boat) {
        str += boat.getPath();
    }

    @Override
    public void visit(Flag flag) {
        str += flag.getPath();
    }

    @Override
    public void visit(Tree tree) {
        str += tree.getPath();
    }

    @Override
    public void visit(Kid kid) {
        str += kid.getPath();
    }

    @Override
    public void visit(Kite kite) {
        str += kite.getPath();
    }

}
