package exampractise.prob2;

public class Book extends LendingItem {
    private String isbn;
    private String title;
    private String authorFirstName;
    private String authorLastName;

    Book(String isbn, String title, String fname, String lname) {
        this.isbn = isbn;
        this.title = title;
        this.authorFirstName = fname;
        this.authorLastName = lname;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }

        Book book = (Book)obj;
        return book.isbn.equals(isbn)
                && book.title.equals(title)
                && book.authorFirstName.equals(authorFirstName)
                && book.authorLastName.equals(authorLastName);
    }
}
