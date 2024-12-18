package newshelf;


public class NewSelection {

	// Complete this method 
	/**
	 * 
	 * @param o object
	 * returns if o is not a book, returns empty string, if Comic, returns title, of Fiction
	 * returns name, and if TextBook, returns subject.
	 */
	public static String getAgeOrTitle(Object o) {
		
		 return switch(o)
		 {
			case Comic comic->comic.title();
			case Fiction fiction -> fiction.name();
			case TextBook textBook -> textBook.subject();
			default -> null;
		 };
	}

	public static void main(String[] args) {
		
		//  Write a test code here and execute and text.
		IBook t = new TextBook("Object Oriented Systems");
		IBook c = new Comic("Batman: The Killing Joke", 30);
		IBook f = new Fiction("Good Omens", FictionType.Comedy);
		System.out.println("Verifying ToString method of books : ");
		System.out.println(t.toString() + "\n");
		System.out.println(c.toString() + "\n");
		System.out.println(f.toString() + "\n");

		System.out.println("Using  getAgeorTItle method : ");
		System.out.println("getting  getAgeorTItle for textbook : " + getAgeOrTitle(t) + "\n");
		System.out.println("getting  getAgeorTItle for comic: " + getAgeOrTitle(c) + "\n");
		System.out.println("getting  getAgeorTItle for Fiction : " + getAgeOrTitle(f) + "\n");
		
	}
}
