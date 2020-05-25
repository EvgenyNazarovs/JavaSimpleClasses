public class Printer {

    private int paper;
    private int toner;

    public Printer(int paper, int toner){
        this.paper = paper;
        this.toner = toner;
    }

    public int getPaper(){
        return this.paper;
    }

    public void print(int numberOfPages, int numberOfCopies){
        int requiredPaper = numberOfCopies * numberOfPages;
        if (this.paper >= (requiredPaper)) {
            this.paper -= requiredPaper;
            this.toner -= requiredPaper;
        }
    }

    public int getToner(){
        return this.toner;
    }
}
