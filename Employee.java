public class Employee extends User {
    private static int idCounter = 1;
    private int employeeId;
    public Employee(String firstName, String lastName) {
        super(firstName, lastName);
        this.employeeId = idCounter++;
    }
    public int getEmployeeId() {
        return employeeId;
    }
    public void addClient(Client client) {
    }
    public void openBankAccount(Client client) {
        client.getAccount(); 
    }
    public void acceptDeposit(double amount, BankAccount account) {
        account.deposit(amount);
    }
}