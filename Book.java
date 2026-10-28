public class Book extends LibraryItems {
  String Author;

  public Book(String title, String Author) {
    super(title);
    this.Author = Author;
  }

  @Override
  public void displayDeatils(){
    super.displayDeatils();
    System.out.println("Author Name:" + Author);
  }
}
