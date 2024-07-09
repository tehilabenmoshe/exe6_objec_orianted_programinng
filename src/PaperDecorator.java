
public abstract class  PaperDecorator implements Paper{
    private Paper itsPaper;
    public PaperDecorator(Paper itsPaper) {
        this.itsPaper = itsPaper;
    }

    @Override
    public String write(){
        return itsPaper.write();
    }

}
