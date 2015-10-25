package a2;

import a2.Movie;
import a2.Performer;

public class MyFirstMovieManager {
	
/**
 * @param args
 */
public static void main(String[] args) {
	// Create Performers
	Performer perf1 = new Performer();
	Performer perf2 = new Performer();
	Performer perf3 = new Performer();
	Performer perf4 = new Performer();
	
	perf1.setFirstname("Robert");
	perf1.setLastname("Downey jr.");
	perf1.setGender(Gender.MALE);
	
	perf2.setFirstname("Scarlett");
	perf2.setLastname("Johannson");
	perf2.setGender(Gender.FEMALE);
	perf2.setOutstanding(true);
	
	perf3.setFirstname("Jack");
	perf3.setLastname("Black");
	perf3.setGender(Gender.MALE);
	
	perf4.setFirstname("Bruce");
	perf4.setLastname("Willis");
	perf4.setGender(Gender.MALE);
	
	
	// Create Director
	Director dir1 = new Director ();
	dir1.setFirstname("Joss");
	dir1.setGender(Gender.MALE);
	dir1.setLastname("Whedon");

	// Create a Movie
	Movie mov1 = new Movie ("The Avengers", 120, dir1);
	
	//add Performer
	mov1.addPerformer(perf1);
	mov1.addPerformer(perf2);
	mov1.addPerformer(perf3);
	
	
	// show Information
	
	mov1.showInformation();
	mov1.allPerformer();
	mov1.containsPerformer(perf1);
	mov1.outstandingPerformer();
	mov1.removePerformer(perf2);
	mov1.allPerformer();
	mov1.containsPerformer(perf4);
	}
}
	
