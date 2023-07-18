public class Thriller extends Film{

    private String scareFactor;

    public Thriller(String name, String scareFactor){
        super(name);
        this.scareFactor = scareFactor;
    }

    public String addToFavourites(){ return "this Thriller has been added to favourites!";}

    public String addScaryChild(){ return "this movie is scarier with an evil 5 year old";}
}
