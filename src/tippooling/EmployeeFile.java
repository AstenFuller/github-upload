package tippooling;
import java.io.*;

public class EmployeeFile {
	private PrintWriter outputFile;
	private FileWriter fwriter;
	
	public void newEmployeeFile(Name name)	throws IOException  {
		outputFile = new PrintWriter(name + ".txt");
		outputFile.println(name);
		outputFile.close();
		
		fwriter = new FileWriter("Employees.txt");
		outputFile = new PrintWriter(fwriter);
		outputFile.println(name);
		fwriter.close();
		outputFile.close();
	}
	
	public void addEmployeeHours(Name name, Day day, Hours hours) throws IOException  {
		fwriter = new FileWriter(name + ".txt");
		outputFile = new PrintWriter(fwriter);
		
		outputFile.println(day + ": " + hours + " hours");
		fwriter.close();
		outputFile.close();
	}

}

