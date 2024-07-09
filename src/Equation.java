public class Equation extends PaperDecorator{

    public Equation(Paper p) {
        super(p);
    }

    @Override
    public String write(){
        return super.write() + writeWithEquation();
    }
    private String writeWithEquation(){
        return "Equation";
    }
}


