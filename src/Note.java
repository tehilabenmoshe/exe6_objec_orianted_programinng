public class Note extends PaperDecorator{

    public Note(Paper p) {
        super(p);
    }

    @Override
    public String write(){
        return super.write() + writeWithNote();
    }

    private String writeWithNote(){
        return "Note ";
    }
}
