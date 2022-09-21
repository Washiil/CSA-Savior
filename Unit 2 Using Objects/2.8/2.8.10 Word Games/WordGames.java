public class WordGames
{
    private String word;
    
    public WordGames(String text)
    {
        word = text;
    }
    
    public String scramble()
    {
        int len = word.length();
        String half1 = word.substring(0, len / 2);
        String half2 = word.substring(len / 2, len);
        
        return half2 + half1;
        // switch first half
        // and second half
    }
    
    
    public String bananaSplit(int insertIdx, String insertText)
    {
        int len = word.length();
        String half1 = word.substring(0, insertIdx);
        String half2 = word.substring(insertIdx, len);
        return half1 + insertText + half2;
    }
    
    
    public String bananaSplit(String insertChar, String insertText)
    {
        int len = word.length();
        int index = word.indexOf(insertChar);
        String half1 = word.substring(0, index);
        String half2 = word.substring(index, len);
        return half1 + insertText + half2;
    }
    
    
    public String toString()
    {
        return "[" + word + "]";
    }
    
    
}