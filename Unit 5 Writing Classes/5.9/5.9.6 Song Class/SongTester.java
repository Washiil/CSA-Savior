public class SongTester
{
    public static void main(String[] args)
    {
        Song song1 = new Song("Washi", "Defenition Essays make me want to cry", 1337, 1337);
        System.out.println(song1);
        song1.setArtist("Hope you");
        song1.setTitle("are having");
        System.out.println(song1);
        song1.setArtist("So much");
        song1.setTitle("Fun!");
        System.out.println(song1);
    }
}