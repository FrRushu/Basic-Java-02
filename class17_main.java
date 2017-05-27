package Polymorphism;
/**
 * Created by Rushu on 5/27/2017.
 * Polymorphism in java
 */
class movie{
    private String name;

    public movie(String name) {
        this.name = name;
    }
    public String plot(){
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class jaws extends movie{
    public jaws(){
        super("Jaws");
    }

    public String plot(){
        return "Bla bla bla";
    }
}

class independenceDay extends movie{
    public independenceDay(){
        super("Independence Day ");
    }

    @Override
    public String plot() {
        return "LOL";
    }
}

class avator extends movie{
    public avator(){
        super("Avator");
    }

    @Override
    public String plot() {
        return "protect the environment";
    }
}


class starWars extends movie{
    public starWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial forces try to take over the universe";
    }
}

class wolfOfWallStreet extends movie{
    public wolfOfWallStreet() {
        super("Wolf Of Wall Street");
    }

    //no plot method
}



public class class17_main {

    public  static void main(String args []){
        for (  int i=1;i<11;i++ ){
            movie allMovie = randomMovie();
            System.out.println("Movie #" + i + " :"+ allMovie.getName() +"\n"+
            "Plot : " +allMovie.plot()

            );
        }


    }

    public static movie randomMovie(){

        int randomNumber = (int) (Math.random()*5)+1;
        System.out.println("Random number generated was : " + randomNumber);
        switch (randomNumber){
            case 1:
                return new jaws();

            case 2:
                return new independenceDay();

            case 3:
                return new avator();

            case 4:
                return new starWars();

            case 5:
                return new wolfOfWallStreet();

        }
        return null;
    }
}
