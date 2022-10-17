import razredi.DeluxeBurger;
import razredi.Hamburger;
import razredi.HealthyBurger;

public class Main {
    public static void main(String[] args) {
        Hamburger hambi = new Hamburger("Basic", "Beef", 3.56, "White");
        double hamPrice = hambi.itemizeHamburger();
        hambi.addHamburgerAddition1("Tomato", 0.27);
        hambi.addHamburgerAddition2("Lettuce", 0.75);
        hambi.addHamburgerAddition3("Cheese", 1.13);
        System.out.println("Total Burger price is " + hambi.itemizeHamburger() + "\n");

        HealthyBurger hambi2 = new HealthyBurger("Chicken", 5.67);
        hambi2.addHamburgerAddition1("Egg", 5.43);
        hambi2.addHealthAddition1("Lentils", 3.41);
        System.out.println("Total Burger price is " + hambi2.itemizeHamburger() + "\n");

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addHamburgerAddition3("Add something.", 50.53);
        deluxeBurger.itemizeHamburger();
    }
}