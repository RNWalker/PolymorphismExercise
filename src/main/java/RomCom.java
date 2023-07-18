public class RomCom extends Film {

    private String cheesyQuotes;

    public RomCom(String name, String cheesyQuotes){
        super(name);
        this.cheesyQuotes = cheesyQuotes;
    }

    public String addToFavourites(){ return "this RomCom has been added to favourites!";}

    public String addToFavourites(String message){ return message + " is a bad choice to add to favourites.";}

    public String castJenniferAniston(){ return "oh good, another romcom with Jennifer Aniston...";}

}
