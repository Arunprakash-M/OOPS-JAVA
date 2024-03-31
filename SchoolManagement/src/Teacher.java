public class Teacher {
    //this class is responsible for keeping track of teachers
    private int id;
    private String Name;
    private int Salary;
    private int SalaryEarned;
    public Teacher(int id,String Name,int Salary){
        this.id=id;
        this.Name=Name;
        this.Salary=Salary;
        this.SalaryEarned=0;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return Name;
    }
    public int getSalary(){
        return Salary;
    }
    public void setSalary(int Salary){
        this.Salary= Salary;
    }
    public void recievedSalary(int Salary){
        SalaryEarned+=Salary;
        School.updateTotalMoneySpent(Salary);
    }

}
