/**
 * 
 */
package com.codes.zip;

import com.codes.zip.impl.ZipCodeServiceImpl;
import com.codes.zip.model.Range;
import com.codes.zip.model.Ranges;
import com.codes.zip.service.ZipCodeService;

/**
 * @author Girish Thumbadi
 *
 */
public class Main {

	/**
	 * 
	 */
	private static void test1() {
		Ranges ranges = new Ranges();
		ranges.add(new Range(94133, 94133));
		ranges.add(new Range(94226,94399));
		ranges.add(new Range(94228,94390));
		ranges.add(new Range(94200,94299));
		ranges.add(new Range(94500,94600));
		ZipCodeService service = new ZipCodeServiceImpl(ranges );
		Ranges minRange = service.genMinRange();
		System.out.println("Input : " + ranges);
		System.out.println("Output : " + minRange);
		System.out.println("\n");
	}
	
	/**
	 * 
	 */
	private static void test2() {
		Ranges ranges = new Ranges();
		ranges.add(new Range(94133, 94133));
		ranges.add(new Range(94200,94299));
		ranges.add(new Range(94226,94399));
		ZipCodeService service = new ZipCodeServiceImpl(ranges );
		Ranges minRange = service.genMinRange();
		System.out.println("Input : " + ranges);
		System.out.println("Output : " + minRange);
		System.out.println("\n");
	}
	
	/**
	 * 
	 */
	private static void test3() {
		Ranges ranges = new Ranges();
		ranges.add(new Range(94133, 94133));
		ranges.add(new Range(94200,94299));
		ranges.add(new Range(94600,94699));
		ZipCodeService service = new ZipCodeServiceImpl(ranges );
		Ranges minRange = service.genMinRange();
		System.out.println("Input : " + ranges);
		System.out.println("Output : " + minRange);
		System.out.println("\n");
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		test1();
		test2();
		test3();
	}
}
