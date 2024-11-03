package oldshelf;
// import org.junit.jupiter.api.Test;
// import  org.junit.jupiter.api.Assertions.*;

// class OldSelectionTest {

//     @Test
//     void testGetAgeOrTitle_WithTextBook() {
//         // Positive test case
//         TextBook textBook = new TextBook("Object Oriented Systems");
//         assertEquals("Object Oriented Systems", OldSelection.getAgeOrTitle(textBook));
//     }

//     @Test
//     void testGetAgeOrTitle_WithComic() {
//         // Positive test case
//         Comic comic = new Comic("Batman: The Killing Joke", 30);
//         assertEquals("Batman: The Killing Joke", OldSelection.getAgeOrTitle(comic));
//     }

//     @Test
//     void testGetAgeOrTitle_WithFiction() {
//         // Positive test case
//         Fiction fiction = new Fiction("Good Omens", FictionType.Comedy);
//         assertEquals("Good Omens", OldSelection.getAgeOrTitle(fiction));
//     }

//     @Test
//     void testGetAgeOrTitle_WithInvalidObject() {
//         // Negative test case
//         String invalidObject = "Not a Book";
//         assertNull(OldSelection.getAgeOrTitle(invalidObject));
//     }
// }

public class OldSelection {
	public static String getAgeOrTitle(Object o) {
		
		if (o instanceof Book book) {
			return switch (book) {
				case Comic comic -> comic.getTitle();
				case Fiction fiction -> fiction.getName();
				case TextBook textBook -> textBook.getSubject();
				default -> null;
			};
		}
		return null;
		
	}

	public static void main(String[] args) {
		TextBook t = new TextBook("Object Oriented Systems");
		Comic c = new Comic("Batman: The Killing Joke", 30);
		Fiction f = new Fiction("Good Omens", FictionType.Comedy);
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
