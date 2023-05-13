abstract class bank{

    abstract void getLoan();

}

class Sbi extends bank{
    private String name;
    private String accType;
    private int accNo;
    static double interest = 9.5;
    private long loanAmt;

    Sbi(String name, String accType, int accNo, long loanAmt){
        this.name = name;
        this.accType = accType;
        this.accNo = accNo;
        this.loanAmt = loanAmt;
    }

    void getLoan(){
        double roi = loanAmt+(interest*loanAmt);
        System.out.println("\tSBI"  +"\t"+"\t" + name +"\t"+"\t" + accNo +"\t"+"\t" +"\t"+loanAmt +"\t"+"\t"+interest+"%"+"\t"+"\t"+  roi);    }
}
class Icici extends bank{
    private String name;
    private String accType;
    private int accNo;
    static double interest = 7.8;
    private long loanAmt;

    Icici(String name, String accType, int accNo, long loanAmt){
        this.name = name;
        this.accType = accType;
        this.accNo = accNo;
        this.loanAmt = loanAmt;
    }

    void getLoan(){
        double roi = loanAmt+(interest*loanAmt);
        System.out.println("\tICICI"  +"\t"+"\t"+ name +"\t"+"\t" +  accNo +"\t"+"\t" +"\t"+loanAmt +"\t"+"\t"+interest+"%"+"\t"+"\t"+  roi);
        
    }
}
class Axis extends bank{
    private String name;
    private String accType;
    private int accNo;
    static double interest = 8.4;
    private long loanAmt;

    Axis(String name, String accType, int accNo, long loanAmt){
        this.name = name;
        this.accType = accType;
        this.accNo = accNo;
        this.loanAmt = loanAmt;
    }

    void getLoan(){
        double roi = loanAmt+(interest*loanAmt);
        System.out.println("\tAXIS"  +"\t"+"\t" + name +"\t"+"\t" + accNo +"\t"+"\t" +"\t"+ loanAmt +"\t"+"\t"+interest+"%"+"\t"+"\t"+  roi);
    }
}
public class bank_management {

    public static void main(String[] args) {
       bank b1 ;
       System.out.println("________________________________________LOAN INTEREST OFFERED BY DIFF BANKS _____________________________________________");
         System.out.println("\tBANK NAME\t HOLDER's NAME\t\tACCOUNT NUMBER \t\tLOAN AMOUNT\tINTERESTt\tROI");
            b1 = new Sbi("Anshuman Panda", "Savings", 123456, 100000);
            b1.getLoan();
            System.out.println();
            b1 = new Icici("Doraemon Panda", "Savings", 123456, 100000);
            b1.getLoan();
            System.out.println();
            b1 = new Axis("Shinchan Panda", "Savings", 123456, 100000);
            b1.getLoan();
            System.out.println("_________________________________________________________________________________________________________________________");
    }
}