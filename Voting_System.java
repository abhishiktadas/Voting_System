package Java;
import java.util.Scanner;

public class Voting_System {

	    public static void main(String[] args) 
	    {
	        Scanner scanner = new Scanner(System.in);
	        Voting_Machine votingMachine = new Voting_Machine();

	        // Adding candidates
	        votingMachine.addCandidate("Alice");
	        votingMachine.addCandidate("Bob");

	        String continueVoting;
	        do 
	        {
	            System.out.println("Enter your voter ID:");
	            String voterId = scanner.nextLine();

	            System.out.println("Enter candidate name to vote:");
	            String candidateName = scanner.nextLine();

	            votingMachine.castVote(voterId, candidateName);

	            System.out.println("Do you want to continue voting? (yes/no)");
	            continueVoting = scanner.nextLine();
	        } 
	        while (continueVoting.equalsIgnoreCase("yes"));

	        // Display results
	        votingMachine.displayResults();
	        scanner.close();
	    }
}
