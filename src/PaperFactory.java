public class PaperFactory {

    public static Paper createPaper(String code){

        switch (code.toLowerCase()){

            case "ac":
                return new AcademicPaper();

            case "cn":
                return new Contract();

            case "jr":
                return new JournalArticle();

            case "bk":
                return new Book();

            default:
                throw new IllegalArgumentException("Unknown page name.");
        }
    }

    public static Paper addAttribute(Paper paper, String attribute) {

        switch (attribute.toLowerCase()) {
            case "tb":
                return new Table(paper);

            case "eq":
                return new Equation(paper);

            case "d":
                return new Diagram(paper);

            case "nt":
                return new Note(paper);

            default:
                throw new IllegalArgumentException("Unknown attribute.");
        }
    }
}