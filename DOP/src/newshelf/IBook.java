package newshelf;

public interface IBook {

}
enum FictionType {

	Comedy,
	Tragedy,
	GoK
}
   record TextBook(String subject) implements IBook{
      public String toString() {
         return "Subject of the TextBook : " + this.subject + "\n";
      }
   }
    record Comic(String title,int ageOfMainCharacter) implements IBook{
      @Override
      public String toString() {
         return "Title: "+this.title + "\nAge of Main Character: " + this.ageOfMainCharacter;
      }
   
       
      @Override
      public int hashCode() {
         return this.title.hashCode()+ageOfMainCharacter;
      }
   }
    record Fiction(String name,FictionType type) implements IBook{
      @Override
      public String toString() {
         return "Name : " + this.name + "\nFictional Type : " + type + "\n";
      }
   }


