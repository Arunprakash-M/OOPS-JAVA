public class Student {
    private int id;
    private String Name;
    private int Grade;
    private int FeesPaid;
    private int TotalFees;
    public Student(int id,String Name,int Grade){
        FeesPaid = 0;
        this.TotalFees = 40000;
        this.id = id;
        this.Name = Name;
        this.id = id;
    }
    public void setGrade(int Grade){
        this.Grade = Grade;
    }
    public void PayFees(int Fees){
        FeesPaid += Fees;
        School.updateTotalMoneyEarned(FeesPaid);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public int getGrade() {
        return Grade;
    }

    public int getFeesPaid() {
        return FeesPaid;
    }

    public int getTotalFees() {
        return TotalFees;
    }
    public int getRemainingFees(){
        return TotalFees - FeesPaid;
    }
}
