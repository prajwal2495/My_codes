import java.util.Scanner;
public class ElectionResults {
	
	public static void main(String[] args) {

        System.out.println("Hello World!");
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number of people contesting for election");
        int noOfPeople = scan.nextInt();
        Person persons[] = new Person[noOfPeople];

        System.out.println("enter the name and vote won for each candidate");
        for (int i = 0; i < noOfPeople; i++) {
            String name = scan.next();
            int vote = scan.nextInt();
            persons[i] = new Person(name, vote);
			System.out.println(persons[i]);
        }
		
        Person winner = personWithHighAlphabiticalAndVote(persons);
		System.out.println("Winner name is " + winner.name + " with vote " + winner.vote);
}
	private static Person personWithHighAlphabiticalAndVote(Person[] persons) {
        Person winner = null;
        for (int i = 0; i < persons.length - 1; i++) {
            winner = persons[i].compare(persons[i + 1]);
        }
        return winner;
	}
}

class Person {
    String name;
    int vote;

    Person(String name, int vote) {
        this.name = name;
        this.vote = vote;
    }

    public Person compare(Person person) {
        if (this.vote == person.vote) {
            if (this.name.compareTo(person.name) >= 1) {
                return this;
            }
            return person;
        }
        if (this.vote > person.vote) {
            return this;
        }
        return person;
    }
}