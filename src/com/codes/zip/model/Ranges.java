/**
 * 
 */
package com.codes.zip.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Girish Thumbadi
 *
 */
public class Ranges {

	List<Range> ranges;

	/**
	 * 
	 */
	public Ranges(List<Range> ranges) {
		this.ranges = ranges;
	}

	/**
	 * 
	 */
	public Ranges() {
		this.ranges = new ArrayList<>();
	}

	/**
	 * 
	 * @param range
	 */
	public void add(Range range) {
		ranges.add(range);
	}

	/**
	 * 
	 * @return
	 */
	private void sort() {
		List<Range> result = new ArrayList<Range>(ranges);
		result.sort((r1, r2) -> r1.getLower() - r2.getLower());
	}

	/**
	 * 
	 * @return
	 */
	public List<Range> sortedItems() {
		this.sort();
		return this.ranges;
	}

	/*
	 * 
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for (Range range : ranges) {
			builder.append(range.formatString());
		}
		return builder.toString();
	}
}
