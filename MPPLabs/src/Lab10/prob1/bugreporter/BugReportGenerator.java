package Lab10.prob1.bugreporter;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import java.util.Map;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import Lab10.prob1.classfinder.ClassFinder;

/**
 * This class scans the package lesson10.labs.prob2.javapackage
 * for classes with annotation @BugReport. It then generates a bug report
 * bugreport.txt, formatted like this:
 *
 * Joe Smith
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 *
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 *
 * Tom Jones
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 *
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 *
 *
 */
public class BugReportGenerator {
	private static final Logger LOG = Logger.getLogger(BugReportGenerator.class.getName());
	private static final String PACKAGE_TO_SCAN = "Lab10.prob1.javapackage";
	private static final String REPORT_NAME = "bug_report.txt";
	private static final String REPORTED_BY = "reportedBy: ";
	private static final String CLASS_NAME = "classname: ";
	private static final String DESCRIPTION = "description: ";
	private static final String SEVERITY = "severity: ";
	public void reportGenerator() {
		List<Class<?>> classes = ClassFinder.find(PACKAGE_TO_SCAN);

		//sample code for reading annotations -- you will need to change
		//this quite a bit to solve the problem
		//Sample code below obtains a list of names of developers assigned to bugs
		List<String> names = new ArrayList<String>();


		String projectDirectory = System.getProperty("user.dir");
		Path filePath = Paths.get(projectDirectory, "src", "Lab10", "prob1", "bugreport.txt");

		PrintWriter printWriter;

		try {
			printWriter = new PrintWriter(filePath.toString());
		} catch (Exception e) {
			System.out.println("No such file at path: " + filePath);
			return;
		}

		Map<String, List<BugReport >> groupedReport = classes.stream()
				.filter(cl -> cl.isAnnotationPresent(BugReport.class))
				.map(cl -> (BugReport)cl.getAnnotation(BugReport.class))
				.collect(Collectors.groupingBy(BugReport::assignedTo));

		System.out.println(groupedReport);

		for (Map.Entry<String, List<BugReport>> entry: groupedReport.entrySet()) {
			String assignedTo = entry.getKey();
			List<BugReport> reports = entry.getValue();
			printWriter.println(assignedTo);

			for(BugReport report: reports) {
				printWriter.println("\treportedBy: " + report.reportedBy());
				printWriter.println("\tclassname: " + report.getClass());
				printWriter.println("\tdescription: " + report.description());
				printWriter.println("\tseverity: " + report.severity());
				printWriter.println();
			}
			printWriter.println();
		}
		printWriter.close();

	}
}
