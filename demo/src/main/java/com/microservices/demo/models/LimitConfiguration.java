/**
 * 
 */
package com.microservices.demo.models;

/**
 * @author 781245
 *
 */
public class LimitConfiguration {

	private int maximum;
	private int minimum;
	
	/**
	 * 
	 */
	public LimitConfiguration() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param maximum
	 * @param minimum
	 */
	public LimitConfiguration(int maximum, int minimum) {
		this.maximum = maximum;
		this.minimum = minimum;
	}

	/**
	 * @return the maximum
	 */
	public int getMaximum() {
		return maximum;
	}

	/**
	 * @param maximum the maximum to set
	 */
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}

	/**
	 * @return the minimum
	 */
	public int getMinimum() {
		return minimum;
	}

	/**
	 * @param minimum the minimum to set
	 */
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}

	@Override
	public String toString() {
		return "LimitConfiguration [maximum=" + maximum + ", minimum=" + minimum + "]";
	}

}
