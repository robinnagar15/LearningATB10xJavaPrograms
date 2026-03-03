package OOPs_Practice;

class Book {
    String title;
    int price;

    Book(String t, int p) {
        title = t;
        price = p;
    }
    void displayBookDetails() {
        System.out.println("Book title is: " + title);
        System.out.println("Book price is: " + price);
        System.out.println("------------------------");
    }
}
     class Main4 {
        public static void main(String[] args) {

            Book b1 = new Book("The finance knowledge",299);
            Book b2 = new Book("FitFine", 199);

            b1.displayBookDetails();
            b2.displayBookDetails();
        }
    }
