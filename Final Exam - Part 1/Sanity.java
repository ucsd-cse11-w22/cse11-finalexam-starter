import tester.*;

class FinalPart1_Sanity {
    void testInterest(Tester t) {
        Interest i = new Interest();
        t.checkExpect(1, i.simpleInterest(1, 1, 1));
        t.checkExpect(2134.14, i.compoundInterest(10000.00, 3.875, 5, 12));
    }

    void testBank(Tester t) {
        Customer c = new Customer(1, "Greg", "1234");
        Account a = new Account(0, c);

        t.checkExpect("Deposit successful", a.deposit(1.25));
        t.checkExpect("Withdrawal successful", a.withdraw(1.0));
        t.checkExpect("Insufficient balance", a.withdraw(1.0));
    }
}