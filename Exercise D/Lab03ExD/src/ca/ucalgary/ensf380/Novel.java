package ca.ucalgary.ensf380;

public class Novel extends Fiction {
    private Author[] theAuthor;
    private Series mySeries;

    
    public Novel() {
    	super("default", 0);
    }
    public Novel(String isbn,int pages) {
        super(isbn,pages);
    }

    public String theme() {
        return "Method theme called from Novel";
    }

    public Author[] getTheAuthor() {
        return theAuthor;
    }

    public void setTheAuthor(Author[] authors) {
        this.theAuthor = authors;
    }

    public Series getMySeries() {
        return mySeries;
    }

    public void setMySeries(Series series) {
        this.mySeries = series;
    }
    
    @Override
    public String coverArt() {
    	return "Method coverArt called from Novel";
    }
    
    @Override
    public String genre() {
    	return "Method genre called from Novel";
    }
    
}
