import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LongPrintVisitor implements Visitor{
    private String str = "";

    public String getLongPrint() {
        return str;
    }

    @Override
    public void visit(Painting painting) {
    }

    @Override
    public void visit(Island island) {
        List <SimpleElement> list = island.getElements();
        if(list.isEmpty()){
            str += "An empty island named " + island.getName() + ". ";
        }else {
            str += "An island named " + island.getName() + " containing: ";
        }
    }

    @Override
    public void visit(Lake lake) {
        List <SimpleElement> list = lake.getElements();
        if(list.isEmpty()){
            str += "An empty lake named " + lake.getName() + ". ";
        }else {
            str += "An lake named " + lake.getName() + " containing: ";
        }
    }

    @Override
    public void visit(Boat boat) {
        str += "A boat made of " + boat.getMaterial() + " material. ";
    }

    @Override
    public void visit(Flag flag) {
        str += "A flag of color: " + flag.getColor() + flag.getCarrierHeight();
    }

    @Override
    public void visit(Tree tree) {
        str += "An tree with an amount of " + tree.getLeavesAmount() + " leaves. ";
    }

    @Override
    public void visit(Kid kid) {
        int year = 2024 - (int)kid.getBirthYear();
        str += "A " + year + " old kid with " + kid.getHairColor() + " hair. ";
    }

    @Override
    public void visit(Kite kite) {
        str += "A flag of color: " + kite.getColor() + ". ";
    }
}
