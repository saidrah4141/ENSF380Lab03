package ca.ucalgary.ensf380;

public abstract class Fiction extends Paperback {
	
	public Fiction(String isbn, int pages) {
		super(isbn, pages);
	}
	
	
	public abstract String coverArt();

		

    public abstract String genre();
}
