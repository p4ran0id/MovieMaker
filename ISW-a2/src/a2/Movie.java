package a2;

import java.util.HashSet;
import java.util.Iterator;

public class Movie
{
	private String title;
	private int time;
	private  int number;
	private static int nextNumber = 1; 
	HashSet<Performer> performerInMovie = new HashSet<Performer>();
	Director director;

	// Constructor
	
	// Constructor with an Director (A2.2)
	public Movie(String title, int time, Director director) {
		this();
		//this.number = nextNumber;
		//nextNumber = nextNumber + 1;
		this.time = time;
		this.title = title;
		this.director = director;
		director.setMoviesCount(director.getMoviesCount() + 1);
		
	}
	// Constructor with no Arguments
	public Movie(){
		super();
		this.number = nextNumber;
		nextNumber = nextNumber + 1;
	}

	// getter-setter
	public void setTitle(String title)
	{
		this.title = title;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTime(int time)
	{
		this.time = time;
	}

	public int getTime()
	{
		return time;
	}

	// showInformation shows all Attributes for an object of Movie
	public void showInformation()
	{
		System.out.println("Number:  " + this.number);
		System.out.println("Title :  " + this.title);
		System.out.println("Time  :  " + this.time);
		//System.out.println("________________________");
		System.out.println("----------------------------");
	}
	
	// Movie Management
	
	public void addPerformer (Performer performer){
		performerInMovie.add(performer);
	}
	
	public boolean containsPerformer (Performer performer){
		return performerInMovie.contains(performer);
		}
	
	public void allPerformer (){
		for (Iterator<Performer> it = performerInMovie.iterator(); it.hasNext(); ) {
	        Performer f = it.next();
	        System.out.println("Name:  "+f.getFirstname()+"  "+f.getLastname());
		}
	}
	
	public void outstandingPerformer (){
		for (Iterator<Performer> it = performerInMovie.iterator(); it.hasNext(); ) {
	        Performer f = it.next();
	        if (f.isOutstanding())
	            System.out.println("Outstanding:  "+f.getFirstname()+"  "+f.getLastname());
	    }
	}
	
	public void removePerformer (Performer performer){
		performerInMovie.remove(performer);
	}

}

