package Collect;

public class Variables {

    // static variable 
    static String companyName = "Tech";

    // instance variables
    String emp_name;
    int emp_id;

    void display() {
        // local variable
        int bonus = 5000;

        System.out.println("Company Name: " + companyName);
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Employee Name: " + emp_name);
        System.out.println("Bonus: " + bonus);
       
    }

    public static void main(String[] args) {

        Variables e1 = new Variables();
        Variables e2 = new Variables();

        e1.emp_id = 347;
        e1.emp_name = "Naviii";

        e2.emp_id = 348;
        e2.emp_name = "Riya";

      
        e2.display();
    }
}
