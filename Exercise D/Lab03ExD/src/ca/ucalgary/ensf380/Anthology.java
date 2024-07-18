package ca.ucalgary.ensf380;

public class Anthology extends Fiction{
    private Story[] stories;

    public Anthology() {
    	super("default", 0);
    }
    
    public Anthology(String isbn,int pages) {
    	super(isbn, pages);
    }

    public String storyOrder() {
    	String order = "Story Order:\n";
        
        for (int i = 0; i < stories.length; i++) {
            order += (i + 1) + ". " + stories[i].plot() + "\n";
        }
        
        return order;
    }
    
    @Override
    public String coverArt() {
        return "Method coverArt called from Anthology";
    }

    public Story[] getStory() {
        return stories;
    }

    public void setStory(Story[] stories) {
        this.stories = stories;
    }

	@Override
	public String genre() {
		return "Method genre called from Fiction";
	}
}
