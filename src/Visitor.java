
public interface Visitor {
    public void visit(Painting painting);
    void visit(Island island);
    void visit(Lake lake);
    void visit(Boat boat);
    void visit(Flag flag);
    void visit(Tree tree);
    void visit(Kid kid);
    void visit(Kite kite);
}
