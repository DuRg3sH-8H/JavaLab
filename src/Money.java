public class Money {
    int rupee;
    int paisa;

    public void setMoney(int rupee, int paisa) {
        this.rupee = rupee;
        this.paisa = paisa;
    }

    public Money addMoney(Money other) {
        Money result = new Money();

        result.rupee = this.rupee + other.rupee;
        result.paisa = this.paisa + other.paisa;

        if (result.paisa >= 100) {
            int extraRupees = result.paisa / 100;
            result.paisa %= 100;
            result.rupee += extraRupees;
        }

        return result;
    }

    public void displayMoney() {
        System.out.println("Total amount: " + rupee + " rupees and " + paisa + " paisa");
    }

    public static void main(String[] args) {
        Money money1 = new Money();
        Money money2 = new Money();

        System.out.print("Name : Durga Shankar Bhandari \n");
        System.out.print("Roll no. : 191818 \n");
        System.out.print("----------------------------------------\n");


        money1.setMoney(50, 75);

        money2.setMoney(30, 50);

        System.out.print("Money1: ");
        money1.displayMoney();
        System.out.print("Money2: ");
        money2.displayMoney();

        Money totalMoney = money1.addMoney(money2);

        totalMoney.displayMoney();
    }

}
