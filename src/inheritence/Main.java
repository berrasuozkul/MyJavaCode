package inheritence;

public class Main {
    public static void main(String[]args){
        person person = new person();
        Customer Customer = new Customer();
        employee employee = new employee();
        Customer.age=19;
        employee.age=22;
        System.out.println(Customer.age);
        System.out.println(employee.age);

        customerManager customerManager = new customerManager();
        employeeManager employeeManager = new employeeManager();
        personManager personManager = new personManager();
        customerManager.list();
        employeeManager.bestEmployee();
    }
}
