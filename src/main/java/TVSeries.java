public class TVSeries implements IWatch {

    private String name;


    public TVSeries (String name){this.name = name;}
    public String watch(int minutes){return "You watched " + this.name + " for " + minutes + " minutes.";}



}
