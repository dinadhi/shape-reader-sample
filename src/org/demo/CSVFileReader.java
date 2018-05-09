package org.demo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVFileReader {

	public static List<Shape> populateList(String aFileLocation) {

		String csvFileName = aFileLocation;
		BufferedReader br = null;
		String line = "";
		String splitter = ",";
		List<Shape> shapesList = new ArrayList<Shape>();
		try {
			br = new BufferedReader(new FileReader(csvFileName));
			System.out.println("Reading Shapes...\n");
			while ((line = br.readLine()) != null) {
				// use comma(,) as separator
				String[] shapeValues = line.split(splitter);

				if (shapeValues.length == 3 && "circle".equals(shapeValues[1])) {

					System.out.println("Reading Circle with id " + shapeValues[0] + "\n");
					shapesList.add(new Circle(Integer.valueOf(shapeValues[0]), Double.valueOf(shapeValues[2])));
				}
				if (shapeValues.length == 4 && "rectangle".equals(shapeValues[1])) {

					System.out.println("Reading Rectangle with id " + shapeValues[0] + "\n");
					shapesList.add(new Rectangle(Integer.valueOf(shapeValues[0]), Double.valueOf(shapeValues[2]),
							Double.valueOf(shapeValues[3])));
				}

			}

		} catch (FileNotFoundException e) {
			System.out.println("Oops..File location or File name is not valid");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		return shapesList;

	}

}
