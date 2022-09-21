public class CoinTester
{
    public static void main(String[] args) {

       Coins foo = new Coins(3, 2, 1, 4);
       
       foo.bankValue();
       
       foo.addQuarter();
       foo.addQuarter();
       foo.addDime();
       foo.addPenny();
       foo.addPenny();
       foo.addPenny();
       
       foo.bankCount();
       foo.bankValue();
    }
}