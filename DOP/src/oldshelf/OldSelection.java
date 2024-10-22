package oldshelf;

public class OldSelection {
	public static String getAgeOrTitle(Object o) {
		
		if (o instanceof Book) {
			if(o instanceof Comic)
			{
				return ((Comic)o).getTitle();
			}
			else if(o instanceof Fiction)
			{
				return ((Fiction)o).getName();
			}
			else if(o instanceof TextBook)
			{
				return ((TextBook)o).getSubject();
			}
			else
			  return null;

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
