package OOP;

/**
 * Created by Rushu on 5/27/2017.
 * =============task=============
 *The purpose of the application is to help a company called takeout
 * to menage their process of selling hamburgers.
 * Our application will help takeout to select type of burgers, some of the additional items to be added to the burgers and pricing
 * We want to create a base hamburger , but also two other type of ham of hamburgers that are popular ones in takeout
 * The basic hunger should have the following items.
 * bread roll type , meat and up to 4 additional additions (things are like lettuce , tomato , carrot , etc) that the customer can
 * select to be added to the burger . Each one of this item get charged an additional price , so you need some way to track how many
 * items get added and to calculate the price.  (for the base burger and all the additions)
 * This burger has a base price and the additions are separately priced.
 *
 * Create a Hamburger class to deal with all the above.
 * The constructor should only include the roll type, meat and price.
 *
 * Also create two extra varieties of Hamburgers (classes) to create for
 * a)  Healthy burger - (On a brown rye bread roll), plus two addition items can be added.
 * The healthy burger can have a total of 6 items (additions in total )
 * hint:: you probably want to process the 2 additional items in the new class, not the base class,
 * since the two additions are only appropriate for this new class.
 *
 *b) Deluxe hamburger - comes with chips and drinks as additions, but no extra addition are allowed.
 * hint: You have to find a way to  automatically  add these new additions at the time the deluxe burger object is created ,
 * and then prevent other addition being mode.
 * All 3 classes should have a method that can be called any time to show the base price of the hamburger plus all additional's ,
 * each showing the addition name and addition price  and a grand total for the burger
 *  For the two additional classes this may require you to be looking at the base class for pricing and then adding totals onto that.
 *
 */
public class main{

    public static void main(String args []){
        //task1
//        hamburger hm = new hamburger("Basic ","Chicken ",100,"White ");
//        double price = hm.itemizedHamburger();
//        hm.addAdditionToHamburger1("Tomato", 9);
//        hm.addAdditionToHamburger2("Lettuce", 15);
//        System.out.println("Total burger price is "+hm.itemizedHamburger());

        //task2
//        healthyBurger hb = new healthyBurger("Beef ", 180);
//        hb.addAdditionToHamburger1("Lettuce",15);
//        hb.addHealthyAddition1("Salad",7);
//        System.out.println("Total healthy burger price is "+hb.itemizedHamburger());

        //task 3
        deluxeBurger deluxe = new deluxeBurger();
        deluxe.itemizedHamburger();
        deluxe.addAdditionToHamburger1("Bla",2);




    }


}