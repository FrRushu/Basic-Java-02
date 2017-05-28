package OOP;

/**
 * Created by Rushu on 5/29/2017.
 */
public class deluxeBurger extends hamburger {
    public deluxeBurger() {
        super("Delux", "Beef & chicken", 350, "White");
        super.addAdditionToHamburger1("French fry ",80);
        super.addAdditionToHamburger2("Pepsi ",30);
    }

    @Override
    public void addAdditionToHamburger1(String name, double price) {
        System.out.println("Not allowed to do that");
    }

    @Override
    public void addAdditionToHamburger2(String name, double price) {
        System.out.println("Not allowed to do that");
    }

    @Override
    public void addAdditionToHamburger3(String name, double price) {
        System.out.println("Not allowed to do that");
    }

    @Override
    public void addAdditionT0Hamburger4(String name, double price) {
        System.out.println("Not allowed to do that");;
    }
}
