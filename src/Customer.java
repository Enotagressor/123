public class Customer extends Person{
    private int cardNumber;

    public Customer(String name, int age, int phone, int cardNumber) {
        super(name, age, phone);
        this.cardNumber = cardNumber;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }
}
