/**
 * 
 */
package it.unibo.oop.lab.enum2;
import it.unibo.oop.lab.enum2.Place;

/**
 * Represents an enumeration for declaring sports.
 * 
 * 1) You must add a field keeping track of the number of members each team is
 * composed of (1 for individual sports)
 * 
 * 2) A second field will keep track of the name of the sport.
 * 
 * 3) A third field, of type Place, will allow to define if the sport is
 * practiced indoor or outdoor
 * 
 */
public enum Sport {

	BASKET(Place.INDOOR, 10, "BASKET"), 
	VOLLEY(Place.INDOOR, 5, "VOLLEY"),
	TENNIS(Place.OUTDOOR, 1, "TENNIS"),
	BIKE(Place.OUTDOOR, 1, "BIKE"),
	F1(Place.OUTDOOR, 1, "F1"), 
	MOTOGP(Place.OUTDOOR, 1, "MOTOGP"), 
	SOCCER(Place.OUTDOOR, 11, "SOCCER");
    /*
     * TODO
     * 
     * Declare the following sports:
     * 
     * - basket
     * 
     * - volley
     * 
     * - tennis
     * 
     * - bike
     * 
     * - F1
     * 
     * - motogp
     * 
     * - soccer
     * 
     */

    /*
     * TODO
     * 
     * [FIELDS]
     * 
     * Declare required fields
     */
	private final Place place;
	private final int noTeamMembers;
	private final String actualName;
	
    /*
     * TODO
     * 
     * [CONSTRUCTOR]
     * 
     * Define a constructor like this:
     * 
     * - Sport(final Place place, final int noTeamMembers, final String actualName)
     */
	Sport(final Place place, final int noTeamMembers, final String actualName) {
		this.place = place;
		this.noTeamMembers = noTeamMembers; 
		this.actualName = actualName;
	}

    /*
     * TODO
     * 
     * [METHODS] To be defined
     * 
     * 
     * 1) public boolean isIndividualSport()
     * 
     * Must return true only if called on individual sports
     * 
     * 
     * 2) public boolean isIndoorSport()
     * 
     * Must return true in case the sport is practices indoor
     * 
     * 
     * 3) public Place getPlace()
     * 
     * Must return the place where this sport is practiced
     * 
     * 
     * 4) public String toString()
     * 
     * Returns the string representation of a sport
     */
	public boolean isIndividualSport() {
		return noTeamMembers==1;
	}
	
	public boolean isIndoorSport() {
		return place==Place.INDOOR;
	}
	
	public Place getPlace() {
		return place;
	}

	public String toString() {
		return (actualName + " is a " + place + "it is play by " + noTeamMembers);
	}
	
}
