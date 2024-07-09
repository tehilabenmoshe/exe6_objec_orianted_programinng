public class Table extends PaperDecorator{

    public Table(Paper p) {
        super(p);
    }

    @Override
    public String write(){
        return super.write() + writeWithTable();
    }
    private String writeWithTable(){
        return "Table ";
    }
}


