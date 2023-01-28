public class Book
{
    public int pages;
    public int words;
    public String name;
    public String author;
    public String title;
    
    public int getPages() {
        return pages;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public void setPages(int pages) {
        this.pages = pages;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
}