/**
 * 
 */
package com.codes.zip.model;

/**
 * @author Girish Thumbadi
 *
 */
public class Range {

	private Zip lower;
	private Zip upper;

	/**
	 * 
	 */
	public Range(int lower, int upper) {
		this.lower = new Zip(lower);
		this.upper = new Zip(upper);
	}

	/**
	 * @return the lower
	 */
	public final int getLower() {
		return lower.getCode();
	}

	/**
	 * @param lower the lower to set
	 */
	public final void setLower(int lower) {
		this.lower = new Zip(lower);
	}

	/**
	 * @return the upper
	 */
	public final int getUpper() {
		return upper.getCode();
	}

	/**
	 * @param upper the upper to set
	 */
	public final void setUpper(int upper) {
		this.upper = new Zip(upper);
	}

	/**
	 * 
	 * @return
	 */
	public String formatString() {
		return String.format("[%d,%d]", this.lower.getCode(), this.upper.getCode());
	}

}
