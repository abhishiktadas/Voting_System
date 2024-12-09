package Java;

import java.util.HashSet;
import java.util.Set;

public class Voter 
{

	private String voterId;
    private static Set<String> votedVoters = new HashSet<>();

    public Voter(String voterId) 
    {
        this.voterId = voterId;
    }

    public boolean hasVoted() 
    {
        return votedVoters.contains(voterId);
    }

    public void vote() 
    {
        votedVoters.add(voterId);
    }


}


