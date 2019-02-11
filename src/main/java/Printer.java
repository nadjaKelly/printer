public class Printer {

    private int sheets;
    private int toner;



    public Printer(int sheets, int toner){
        this.sheets = sheets;
        this.toner = toner;
    }


    public int getSheets(){
        return this.sheets;
    }

    public int getToner(){
        return this.toner;
    }

    public String print(int pages, int copies){

        if (this.sheets >= (pages * copies)) {
            this.sheets -= (pages * copies);
            this.toner -= (pages * copies);
            return "Print complete";
        } else {
            return "Cannot print.";
        }
    }

    public int refillPaper(int newSheets){
        return this.sheets += newSheets;
    }



}
