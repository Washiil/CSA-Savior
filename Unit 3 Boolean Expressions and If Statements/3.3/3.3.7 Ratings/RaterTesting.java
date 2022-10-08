public class RaterTesting
{
    public static void main(String[] args)
    {
        Rater collegeBoard = new Rater("College board", 2);
        collegeBoard.updateReview();
        System.out.println(collegeBoard);
        collegeBoard.setRating(3);
        collegeBoard.updateReview();
        System.out.println(collegeBoard);
    }
}