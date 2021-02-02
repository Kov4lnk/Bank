public class Main {
    public static void main(String[] args) {
        BankAccount accOfMine = new BankAccount();
        accOfMine.setAccNumber(55825256);
        accOfMine.setBalance(300000);
        accOfMine.setEmail("abcd@gmail.com");
        accOfMine.setPhoneNumber("+380934609291");
        System.out.println("Here is a new bamk account. It's number is " + accOfMine.getAccNumber() + ". The amount of money is "
        + accOfMine.getBalance() + ". It is registered on " + accOfMine.getEmail() + ". An appropriate information is " +
                        "sent to your phonenumber " + accOfMine.getPhoneNumber() + "."
                );

        accOfMine.depositFunds(40);
        System.out.println("Amount is " + accOfMine.getBalance());
        accOfMine.withdrawal(500);
        System.out.println("Amount after withDraw is " + accOfMine.getBalance()); 
    }
}
