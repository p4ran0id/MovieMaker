package com.moviemanager.a2;

/**
 * Class Performer to manage performers.
 * @author Dennis
 *
 */
public class Performer {
	/**
	 * first name of Performer.
	 */
	private String firstname;
	/**
	 * last name of Performer.
	 */
	private String lastname;
	/**
	 * the Gender of performer.
	 */
	private Gender gender;
	/**
	 * movie acted in (a1).
	 */
	private Movie movie;
	/**
	 * outstanding param for Performer.
	 * Performers aren´t outstanding by default
	 */
	private boolean outstanding = false;
	/**
	 * get the first Name of the Performer.
	 * @return first Name
	 */
	public final String getFirstname() {
		return firstname;
	}
	/**
	 * set the first name.
	 * @param theFirstName firsName of Performer
	 */
	public final void setFirstname(final String theFirstName) {
		this.firstname = theFirstName;
	}
	/**
	 * get the last Name of the Performer.
	 * @return lastName
	 */
	public final String getLastname() {
		return lastname;
	}
	/**
	 * set the first Name of the Performer.
	 * @param theLastName last name of performer
	 */
	public final void setLastname(final String theLastName) {
		this.lastname = theLastName;
	}
	/**
	 * get Gender of Performer.
	 * @return gender
	 */
	public final Gender getGender() {
		return gender;
	}
	/**
	 * set Gender of Performer.
	 * @param theGender gender of perf
	 */
	public final void setGender(final Gender theGender) {
		this.gender = theGender;
	}
	/**
	 * get Movie. (a1)
	 * @return movie
	 */
	public final Movie getMovie() {
		return movie;
	}
	/**
	 * set Movie for performer.
	 * @param theMovie Movie
	 */
	public final void setMovie(final Movie theMovie) {
		this.movie = theMovie;
	}
	/**
	 * Outstanding performer.
	 * @return true if outstanding
	 */
	public final boolean isOutstanding() {
		return outstanding;
	}
	/**
	 * set outstanding of Performer.
	 * @param theOutstanding true/false
	 */
	public final void setOutstanding(final boolean theOutstanding) {
		this.outstanding = theOutstanding;
	}
}
