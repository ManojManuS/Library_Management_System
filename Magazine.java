public class Magazine extends LibraryItems {
  int IssueNumber;

  public Magazine(String title, int IsuueNumber) {
    super(title);
    this.IssueNumber = IssueNumber;
  }

  @Override
  public void displayDeatils(){
    super.displayDeatils();
    System.out.println("Issue Number:" + IssueNumber);
  }
}
