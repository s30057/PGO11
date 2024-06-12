public class Main {
    public static void main(String[] args) {
        try {
            Admin admin = new Admin("Admin", "Jeden");
            Employee employee1 = new Employee("Employee", "Jeden");
            Employee employee2 = new Employee("Employee", "Dwa");
            Client client1 = new Client("Client", "Jeden");
            Client client2 = new Client("Client", "Dwa");
            Client client3 = new Client("Client", "Trzy");
            Client client4 = new Client("Client", "Cztery");
            employee1.acceptDeposit(2000, client1.getAccount());
            employee1.acceptDeposit(1000, client2.getAccount());
            employee1.acceptDeposit(2000, client3.getAccount());
            employee1.acceptDeposit(3000, client4.getAccount());
            client1.getAccount().transfer(200, client2.getAccount());
            client2.getAccount().transfer(700, client3.getAccount());
            client3.getAccount().transfer(100, client4.getAccount());
            client4.getAccount().transfer(300, client1.getAccount());
            client1.getAccount().transfer(400, client3.getAccount());
            client3.getAccount().transfer(200, client2.getAccount());
            client2.getAccount().transfer(150, client1.getAccount());
            client1.getAccount().transfer(300, client4.getAccount());
            client4.getAccount().transfer(350, client2.getAccount());
            client2.getAccount().transfer(100, client3.getAccount());
            System.out.println("Client 1 - Balance: " + client1.getAccount().checkBalance());
            System.out.println("Client 2 - Balance: " + client2.getAccount().checkBalance());
            System.out.println("Client 3 - Balance: " + client3.getAccount().checkBalance());
            System.out.println("Client 4 - Balance: " + client4.getAccount().checkBalance());
        } catch (AccountOperationException e) {
            System.out.println(e.getMessage());
        }
    }
}