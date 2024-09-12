public class MonthlyCreditCardBalance {
    public static void main(String[] args) {
        double creditCardBalance = 5000;
        double INTEREST_RATE = 1.17;

        creditCardBalance *= INTEREST_RATE;
        System.out.println("The credit card balance after a month is $" + creditCardBalance);
        creditCardBalance *= INTEREST_RATE;
        System.out.println("The credit card balance after two months is $" + creditCardBalance);
    }
}