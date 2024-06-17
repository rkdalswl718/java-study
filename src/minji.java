class Present {
    int money;
    Present(){
        this(100);
    }
    Present(int money) {
        this.money = money;
    }

    String letter() {
        return "This is for you! Money: " + money;
    }
    String letter(String k) {
        return "This is for you! Money: " + money+"you can do "+k+"!!!";
    }
}

class PresentList extends Present {
    int amount;
    int price;

    PresentList(int money, int amount, int price) {
        super(money);
        this.amount = amount;
        this.price = price;
    }

    String letter() {
        return super.letter() + ", Amount: " + amount + ", Price: " + price;
    }
}

public class minji {
    public static void main(String[] args) {
        PresentList p[] = {
                new PresentList(100, 100, 122),
                new PresentList(200, 300, 344),
                new PresentList(400, 1500, 203)
        };

        Present present = new Present(50000);
        System.out.println(p[0].letter());
    }
}
