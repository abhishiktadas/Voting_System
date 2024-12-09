package Java;

public class Candidate 
{
    private String name;
    private int votes;

    public Candidate(String name) 
    {
        this.name = name;
        this.votes = 0;
    }

    public String getName() 
    {
        return name;
    }

    public void addVote() 
    {
        votes++;
    }

    public int getVotes() 
    {
        return votes;
    }
}

