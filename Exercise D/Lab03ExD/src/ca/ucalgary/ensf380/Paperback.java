package ca.ucalgary.ensf380;

public abstract class Paperback extends Book {
	public Paperback(String isbn, int pages) {
        super(isbn, pages);
    }

    public abstract String coverArt();
}

