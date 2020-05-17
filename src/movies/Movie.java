package movies;

public class Movie {
    private String name;
    private String category;

    public Movie (String aName, String aCategory){

    this.name = aName;
    this.category = aCategory;

    }

    public String getMovieName(){
        return this.name;
    }

    public String getMovieCategory(){
        return this.category;
    }

    public void setMovieName(String aName){
        this.name = aName;
    }

    public void setMovieCategory(String aCategory){
        this.category = aCategory;
    }





}
