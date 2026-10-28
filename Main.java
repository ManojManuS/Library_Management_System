class Main{
    public static void main(String[]args){
        LibraryItems[] items={
            new Book("Atomic Habits", "James Clear"),
            new Magazine("Tech code", 25),
            new Newspaper("Times of India", "27-10-2026")
        };
        for(LibraryItems item:items){
            item.displayDeatils();
            System.out.println("-------------------------");
        }

    }
}