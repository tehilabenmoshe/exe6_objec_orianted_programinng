public class Diagram extends PaperDecorator{

    public Diagram(Paper p) {
        super(p);
    }

    @Override
    public String write(){
        return super.write() + writeWithDiagram();
    }
    private String writeWithDiagram(){
        return "Diagram";
    }
}
