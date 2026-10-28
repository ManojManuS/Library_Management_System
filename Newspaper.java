public class Newspaper extends LibraryItems {
  String date;

  public Newspaper(String title, String date) {
    super(title);
    this.date = date;
  }

  @Override
  public void displayDeatils(){
    super.displayDeatils();
    System.out.println("Date:" + date);
  }
}
