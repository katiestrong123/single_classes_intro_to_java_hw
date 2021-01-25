public class Printer {

    private int paperRemaining;

    public Printer(int paperRemaining){
        this.paperRemaining = paperRemaining;
    }

    public int hasPaper(){
        return this.paperRemaining;
    }

//    public int print(int pages){
//        if (paperRemaining >= pages) {
//            return paperRemaining - pages;
//        } else {
//            System.out.println("Not enough paper.");
//        }
//        }

    public String print(int pages){
        if (paperRemaining >= pages) {
            return "Printing...";
        } else {
           return "Not enough paper.";
        }
    }
}
