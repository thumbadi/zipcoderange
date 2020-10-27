/**
 * 
 */
package com.codes.zip.impl;

import java.util.Collections;
import java.util.LinkedList;

import com.codes.zip.model.Range;
import com.codes.zip.model.Ranges;
import com.codes.zip.service.ZipCodeService;

/**
 * @author Girish Thumbadi
 *
 */
public class ZipCodeServiceImpl implements ZipCodeService {

	private Ranges ranges;

	/**
	 * 
	 */
	public ZipCodeServiceImpl(Ranges ranges) {
		this.ranges = ranges;
	}

	/**
	 * 
	 */
	@Override
	public Ranges genMinRange() {
		LinkedList<Range> items = new LinkedList<>();
		for (Range range : ranges.sortedItems()) {
			// compare last upper bound with current lower bound
			if (items.isEmpty() || items.peek().getUpper() < range.getLower()) {
				items.push(range);
				continue;
			}
			// compare last upper bound with current upper bound
			Range next = items.pop();
			if (next.getUpper() < range.getUpper()) {
				next.setUpper(range.getUpper());
			}
			items.push(next);
		}
		Collections.reverse(items);
		return new Ranges(items);
	}
}
