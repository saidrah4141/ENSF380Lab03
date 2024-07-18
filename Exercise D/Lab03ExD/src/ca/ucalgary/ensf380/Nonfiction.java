package ca.ucalgary.ensf380;

public class Nonfiction extends Paperback {
    private Category deweyClassification;

    public Nonfiction() {
    	super("default", 0);
    }
    public Nonfiction(String isbn, int pages) {
        super(isbn, pages);
    }

    public String topic() {
        return "Method topic called from Nonfiction";
    }
    
    public Category getDeweyClassification() {
        return deweyClassification;
    }

    public void setDeweyClassification(Category cat) {
        this.deweyClassification = cat;
    }
    
    public String coverArt() {
    	return "Method coverArt called from Paperback";
    }
    
}
