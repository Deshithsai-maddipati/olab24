package oldshelf;

public class Fiction extends Book {

	private final String name;
	private static FictionType type;
	public  Fiction(String title,FictionType comedy) {
		this.name=title;
		Fiction.type=comedy;
	}
	public String getName()
	{
       return this.name;
	}
	@Override
	public String toString() {
		return "Name : " + this.name + "\nFictional Type : " + type + "\n";
	}

}
