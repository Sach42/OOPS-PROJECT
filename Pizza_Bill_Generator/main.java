package Pizza_Bill_Generator;

public class main {
    public static void main(String[] args) {
        Pizza p1 = new Pizza(true); 
        p1.addExtraCheese();
        p1.addExtraTopping();
        p1.packFood();
        p1.generateBill();

    }
}
