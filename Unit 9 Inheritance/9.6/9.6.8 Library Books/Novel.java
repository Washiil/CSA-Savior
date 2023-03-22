public class Novel extends Book {
    private int readingLevel;
    private String genre;

    public Novel(String title, String author, int readingLevel, String genre) {
        super(title, author);
        this.readingLevel = readingLevel;
        this.genre = genre;
    }

    public int getReadingLevel() {
        return readingLevel;
    }

    public void setReadingLevel(int readingLevel) {
        this.readingLevel = readingLevel;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String toString() {
        return genre + " Novel";
    }
}