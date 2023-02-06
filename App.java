import java.time.LocalDate;

public class App {
    // States
    private String name;
    private String reg;
    private String dept;

    private String scholar;
    private int hostelFee;

    private int trans;
    private int admFee;
    private int semFee;
    private int total;
    public static LocalDate currentDate;

    // Methods

    static {
        LocalDate date = LocalDate.now();
        currentDate = date;
    }

    public String getName() {
        return name;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getSemFee() {
        return semFee;
    }

    public void setSemFee(int semFee) {
        this.semFee = semFee;
    }

    public int getAdmFee() {
        return admFee;
    }

    public void setAdmFee(int admFee) {
        this.admFee = admFee;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHostelFee() {
        return hostelFee;
    }

    public void setHostelFee(int hostelFee) {
        this.hostelFee = hostelFee;
    }

    public String getScholar() {
        return scholar;
    }

    public void setScholar(String scholar) {
        this.scholar = scholar;
    }

    public int getTrans() {
        return trans;
    }

    public void setTrans(int trans) {
        this.trans = trans;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getReg() {
        return reg;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public static void getCurrentDate() {
        System.out.println("Date           : " + currentDate);
    }

    public void showInfo() {
        System.out.print("\n\n----------************----------");
        System.out.println("\n          FEE CHALLAN");
        System.out.println("Univerisity    : COMSATS Lahore\n");
        System.out.println("Student Name   : " + getName());
        System.out.println("Registration   : " + getReg());
        System.out.println("Student Dept   : " + getDept());
        System.out.print("--------------------------------\n");
        System.out.println("Admission Fees : " + getAdmFee());
        System.out.println("Semester Fees  : " + getSemFee());
        System.out.println("Hostel Fees    : " + getHostelFee());
        System.out.println("Transport Fees : " + getTrans());
        System.out.println("Total Fees     : " + getTotal());
        getCurrentDate();
        System.out.print("--------------------------------");
        System.out.print("\n----------************----------\n\n\n");

    }

}
