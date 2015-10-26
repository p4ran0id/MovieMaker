package com.moviemanager.a2;

/**
 * Class Director extends Performer.
 * @author Dennis
 *
 */
public class Director extends Performer {
	/**
	 * movies the Director directed.
	 */
	private int moviesCount = 0;
	/**
	 * count of Movies this Director directed.
	 * @return number nof directed Movies
	 */
	public final int getMoviesCount() {
		return moviesCount;
	}
	/**
	 * set count of directed Movies.
	 * @param theCount count of directed Movies
	 */
	public final void setMoviesCount(final int theCount) {
		this.moviesCount = theCount;
	}

}

