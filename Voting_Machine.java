package Java;

import java.util.ArrayList;
import java.util.List;

public class Voting_Machine 
{
    private List<Candidate> candidates;

    public Voting_Machine() {
        candidates = new ArrayList<>();
    }

    public void addCandidate(String name) {
        candidates.add(new Candidate(name));
    }

    public boolean castVote(String voterId, String candidateName) {
        Voter voter = new Voter(voterId);
        if (voter.hasVoted()) {
            System.out.println("Voter has already voted!");
            return false;
        }

        for (Candidate candidate : candidates) {
            if (candidate.getName().equalsIgnoreCase(candidateName)) {
                candidate.addVote();
                voter.vote();
                System.out.println("Vote casted for " + candidateName);
                return true;
            }
        }
        System.out.println("Candidate not found!");
        return false;
    }

    public void displayResults() {
        System.out.println("Voting Results:");
        for (Candidate candidate : candidates) {
            System.out.println(candidate.getName() + ": " + candidate.getVotes() + " votes");
        }
    }
}