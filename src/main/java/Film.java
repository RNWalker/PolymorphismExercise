public abstract class Film implements IWatch{

    protected String name;
    protected double runtime;
    protected double rating;


    public Film(String name){
        this.name = name;
        this.rating = rating;

    }

    public String pause(){ return "Press play to continue";}

    public abstract String addToFavourites();

    public String watch(int minutes){ return "You watched " + this.name + " for " + minutes + " minutes.";}

}
