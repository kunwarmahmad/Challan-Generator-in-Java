import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        App st = new App();

        System.out.print("\n\nEnter Student Name : ");
        st.setName(get.nextLine());
        System.out.print("Enter Reg Number : ");
        st.setReg(get.nextLine());
        System.out.print("Enter your Department : ");
        st.setDept(get.nextLine());

        System.out.print("Is Student availing transport services Press (y/n) : ");
        String choiceT = get.nextLine();

        System.out.print("\nIf Student is a day scholar Press (1) ");
        System.out.print(" else is Student a Hostelite Press (2): ");

        String choice;
        choice = get.nextLine();
        if (choice.equals("1")) {
            st.setAdmFee(10000);
            st.setSemFee(80000);
            if (choiceT.equals("y")) {
                st.setTrans(2000);
                st.setTotal(10000 + 80000 + 2000);
            } else
                st.setTotal(10000 + 80000);
        }

        else if (choice.equals("2")) {
            st.setAdmFee(10000);
            st.setSemFee(80000);
            st.setHostelFee(30000);
            if (choiceT.equals("y")) {
                st.setTrans(2000);
                st.setTotal(10000 + 80000 + 30000 + 2000);
            } else
                st.setTotal(10000 + 80000 + 30000);
        } else
            System.out.println("");

        st.showInfo();
    }
}
