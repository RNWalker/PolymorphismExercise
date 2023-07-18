public class Musical extends Film {

    private int numberOfSongs;
    private boolean isWicked;

    public Musical(String name, int numberOfSongs, boolean isWicked){
        super(name);
        this.numberOfSongs = numberOfSongs;
        this.isWicked = false;
    }

    public String addToFavourites(){ return "this Musical has been added to favourites!";}

    public String characterSings(){ return "this person could just have said this normally";}
}



