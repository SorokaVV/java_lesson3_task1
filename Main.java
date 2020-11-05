public class Main {
    public static void main(String[] args) {
        float price = 13590.90f;
        int mile = 20;
        int amount_mile = (int) (price / mile);
        System.out.println("Вам начисленно: " + amount_mile + " миль");
    }
}