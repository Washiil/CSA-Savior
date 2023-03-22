public class TextBook extends Book {
    private int edition;
    private boolean isEbook;

    public TextBook(String title, String author, int edition, boolean isEbook) {
        super(title, author);
        this.edition = edition;
        this.isEbook = isEbook;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public boolean isEbook() {
        return isEbook;
    }

    public void setEbook(boolean isEbook) {
        this.isEbook = isEbook;
    }

    public String toString() {
        return "Textbook edition # " + edition;
    }
}