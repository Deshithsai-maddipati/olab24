package oldshelf;

public class TextBook extends Book {

	private final String subject;
	public TextBook(String subject) {
		this.subject=subject;
	}
    public String getSubject()
	{
		return this.subject;
	}
	@Override
	public String toString() {
		return "Subject of the TextBook : " + this.subject + "\n";
	}

}
