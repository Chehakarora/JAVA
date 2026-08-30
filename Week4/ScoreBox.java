public class ScoreBox
{
    private int score;
    public ScoreBox(int score)
    {
        if(score>=0)
            this.score=score;
    }
    public int getScore()
    {
        return score;
    }
    public void setScore(int score)
    {
        if(score>=0)
            this.score=score;
    }
    public String toString()
    {
        return "ScoreBox{score="+score+"}";
    }
}