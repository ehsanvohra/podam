/**
 * 
 */
package uk.co.jemos.podam.test.strategies;

import java.util.Calendar;

import uk.co.jemos.podam.api.AttributeDataStrategy;
import uk.co.jemos.podam.exceptions.PodamMockeryException;
import uk.co.jemos.podam.test.utils.PodamTestUtils;

/**
 * @author mtedone
 * 
 */
public class MyBirthdayStrategy implements AttributeDataStrategy<Calendar> {

	/**
	 * {@inheritDoc}
	 */
	public Calendar getValue() throws PodamMockeryException {

		Calendar myBirthday = PodamTestUtils.getMyBirthday();

		return myBirthday;
	}

	// ------------------->> Constants

	// ------------------->> Instance / Static variables

	// ------------------->> Constructors

	// ------------------->> Public methods

	// ------------------->> Getters / Setters

	// ------------------->> Private methods

	// ------------------->> equals() / hashcode() / toString()

	// ------------------->> Inner classes

}
