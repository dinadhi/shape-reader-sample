package org.demo;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Runner {

	public Integer findShapeIndex(Shape aShape, List<Shape> shapes) {

		return shapes.indexOf(aShape);
	}

	public void sortByArea(List<Shape> aShapes) {
		if(!aShapes.isEmpty()) {
			System.out.println("\nPrinting all shapes sorted by area:\n");
			Collections.sort(aShapes, new Comparator<Shape>() {
				@Override
				public int compare(Shape aShape1, Shape aShape2) {
					return Double.compare(aShape1.getArea(), aShape2.getArea());
				}
			});
		}
	}

	public void printShapes(List<Shape> aShapes) {
		if(!aShapes.isEmpty()) {
			System.out.println("\nPrinting all shapes (unsorted):\n");
			System.out.println(aShapes);
		}
			
	}

	public static void main(String[] args) {
		try {
			if (args.length != 1) {
				System.out.println("Please provide valid test data file location");
			}
			List<Shape> lShapes = CSVFileReader.populateList("D:\\testdata.csv");
			
			Runner lRunner = new Runner();
			lRunner.printShapes(lShapes);

			lRunner.sortByArea(lShapes);
			lRunner.printShapes(lShapes);
		} catch (Exception exp) {
			System.out.println("Please pass file to main method as parameter.");
		}

	}
}
