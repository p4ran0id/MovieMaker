package com.moviemanager.a2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/**
 * This class manages the Movies in collection.
 *
 * @author Denis Davydov
 */
public class Movie {
	/**
	 * The Title of Movie.
	 */
	private String title;
	/**
	 * The length of Movie.
	 */
	private int time;
	/**
	 * number of Movie in collection.
	 */
	private  int number;
	/**
	 * Number for next Movie, also All Movies count.
	 */
	private static int nextNumber = 1;
	/**
	 *  Performers acting in the Movie.
	 */
	private final Set<Performer>performerInMovie = new HashSet<Performer>();
	/**
	 * the Movie Director.
	 */
	private Director director;

	/**
	 * Movie Constructor - Create an new Movie.
	 * @param theTitle the title of Movie
	 * @param theTime the time of Movie
	 * @param theDirector the director of Movie
	 */
	public Movie(final String theTitle, final int theTime,
			final Director theDirector) {
		this();
		//this.number = nextNumber;
		//nextNumber = nextNumber + 1;
		//set time
		this.time = theTime;
		//set Title
		this.title = theTitle;
		//set Director
		this.director = theDirector;
		//inc number of Movies directed
		director.setMoviesCount(director.getMoviesCount() + 1);
	}
	/**
	 * Constructor for Movie.
	 * no param
	 */
	public Movie() {
		super();
		this.number = nextNumber;
		nextNumber = nextNumber + 1;
	}

	// getter-setter
	/**
	 * set Movie Title.
	 * @param theTitle new movie title
	 */
	public final void setTitle(final String theTitle) {
		this.title = theTitle;
	}
	/**
	 * get Movie Title.
	 * @return the movie Title
	 */
	public final String getTitle() {
		return title;
	}
	/**
	 * set Movie length.
	 * @param theTime movie length
	 */
	public final void setTime(final int theTime) {
		this.time = theTime;
	}
	/**
	 * get Movie length.
	 * @return movie length
	 */
	public final int getTime() {
		return time;
	}

	/**
	 *  showInformation shows all Attributes for a Movie.
	 */
	public final void showInformation() {
		System.out.println("Number:  " + this.number);
		System.out.println("Title :  " + this.title);
		System.out.println("Time  :  " + this.time);
		//System.out.println("________________________");
		System.out.println("----------------------------");
	}
	// Movie Management
	/**
	 * add a Performer to a Movie.
	 * @param thisPerformer Performer in Movie
	 */
	public final void addPerformer(final Performer thisPerformer) {
		performerInMovie.add(thisPerformer);
	}
	/**
	 * check if Performer performer is in Movie.
	 * @param performer Performer to check for
	 * @return true if performer is in this Movie
	 */
	public final boolean containsPerformer(final Performer performer) {
		return performerInMovie.contains(performer);
		}
	/**
	 * Print all Performers in this Movie.
	 */
	public final void allPerformer() {
		Performer f;
		for (final Iterator<Performer> it = performerInMovie.iterator();
				it.hasNext();) {
	        f = it.next();
	        System.out.println("Name:  " + f.getFirstname()
	        		+ "  " + f.getLastname());
		}
	}
	/**
	 * print all Outstanding performers.
	 */
	public final void outstandingPerformer() {
		Performer f;
		for (final Iterator<Performer> it = performerInMovie.iterator();
				it.hasNext();) {
	        f = it.next();
	        if (f.isOutstanding()) {
				System.out.println("Outstanding:  "
				+ f.getFirstname() + "  " + f.getLastname());
			}
	    }
	}
	/**
	 * Delete a Performer from Movie.
	 * @param performer Performer to remove
	 */
	public final void removePerformer(final Performer performer) {
		performerInMovie.remove(performer);
	}

}

