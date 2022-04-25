package ro.fasttrackit.codeEx1;

public class BasketMain {
    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("mar");
        basket.add("portocala");
        basket.add("banana");
        basket.add("zmeura");
        basket.add("struguri");
        basket.add("mar");

        System.out.println(basket.distinct());
        System.out.println(basket.customCount());
        System.out.println(basket.count());
        System.out.println(basket.position("banana"));
        System.out.println(basket.find("zmeura"));
        System.out.println(basket.remove("portocala"));


    }
}
