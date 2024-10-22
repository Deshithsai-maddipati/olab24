package oldshelf;

public class Comic extends Book {

	private final String Title;
	private final int ageOfMainCharacter;
	public Comic(String title,int age) {
		this.Title=title;
		this.ageOfMainCharacter=age;
	}
	public String getTitle()
	{
       return this.Title;
	}
	
	@Override
	public String toString() {
		return "Title : " + this.Title + "\nAge of MainCharactor : " + this.ageOfMainCharacter + "\n";
	}

	
	@Override
	public int hashCode() {
		return this.Title.hashCode()+ageOfMainCharacter;
	}
	
	@Override
	public boolean equals(Object o) {
		 return this.Title.hashCode()==o.hashCode();
	}
}
