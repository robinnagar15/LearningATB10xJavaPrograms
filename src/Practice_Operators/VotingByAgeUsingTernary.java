package Practice_Operators;

public class VotingByAgeUsingTernary {
    public static void main(String[] args) {

        int age=17;
        boolean hasVoterId=true;

        String votingEligibility= (age<18)? "Not Eligible" : hasVoterId ? "Eligible to vote":"Voter ID required";
        System.out.println(votingEligibility);
    }
}
