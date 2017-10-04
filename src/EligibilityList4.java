import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.HashSet;


public class EligibilityList4
{
    public static void main(String[] args) throws IOException 
    {
	/*
	 * brCurrentWeek is the current week eligibility to read in
	 */
	BufferedReader brCurrentWeek = new BufferedReader(new FileReader(new File("September 28, 2017.csv")));
	/*
	 * brPreviousWeek is the previous week eligibility to read in
	 */
	BufferedReader brPreviousWeek = new BufferedReader(new FileReader(new File("September 1, 2017.csv")));


	try(BufferedWriter bw = new BufferedWriter(new FileWriter(new File("C:\\Users\\dcrowder\\Desktop\\Eligibility\\Eligibility2.csv"))))
	{

	    Date date = new Date();

	    /* 
	     * firstSplit[1] = names
	     * secondSplit[2]+secondSplit[3] = failing class
	     * thirdSplit[1].substring(0, thirdSplit[1].length()-5) = class Average
	     *
	     *  System.out.println(firstSplit[1] + "\t" + secondSplit[2]+secondSplit[3] + "\t" 
	     *  + thirdSplit[1].substring(0, thirdSplit[1].length()-5) + " %" );
	     */

	    String line;
	    String tempName = " ";
	    String tempClass = " ";
	    String tempAve = " ";
	    String tempGrade = " ";
	    String tempName2 = " ";
	    String tempClass2 = " ";
	    String tempAve2 = " ";
	    String tempGrade2 = " ";
	    String tempName3 = " ";
	    String tempClass3 = " ";
	    String tempAve3 = " ";
	    String tempGrade3 = " ";
	    String tempName4 = " ";
	    String tempClass4 = " ";
	    String tempAve4 = " ";
	    String tempGrade4 = " ";
	    String tempName5 = " ";
	    String tempClass5 = " ";
	    String tempAve5 = " ";
	    String tempGrade5 = " ";
	    String tempName6 = " ";
	    String tempClass6 = " ";
	    String tempAve6 = " ";
	    String tempGrade6 = " ";
	    String tempName7 = " ";
	    String tempClass7 = " ";
	    String tempAve7 = " ";
	    String tempGrade7 = " ";

	    HashSet<String> currentWeek = new HashSet<String>();

	    bw.write(",,,," + date.toString());

	    /*
	     * Read in the current week and Save each name to a HashSet
	     */
	    while((line = brCurrentWeek.readLine()) != null) 
	    {    
		String [] firstSplit = line.split("\"");  // first split
		String [] secondSplit = firstSplit[3].split(" ");  // split around 2 spaces
		String [] thirdSplit = firstSplit[3].split(":");  //  split after the :
		String [] fourthSplit = firstSplit[1].split(" ");  // fourthSplit[0] last name, fourthSplit[1] first name
		String [] fifthSplit = firstSplit[2].split(","); // fifthSplit[2] is grade

		/*
		 * 	fourthSplit[0] + " " + fourthSplit[1] = last, first name
		 *   	firstSplit[1] = names
		 *	secondSplit[2]+secondSplit[3] = failing class
		 *	thirdSplit[1].substring(0, thirdSplit[1].length()-5) = class Average
		 *
		 *	System.out.println(firstSplit[1] + "\t" + secondSplit[2]+secondSplit[3] + "\t" 
		 *		+ thirdSplit[1].substring(0, thirdSplit[1].length()-5) + " %" );
		 */

		/*
		 * name not equal to name in next line
		 */
		if(!(fourthSplit[0] + " " + fourthSplit[1]).equalsIgnoreCase(tempName))  
		{
		    if(tempName.equalsIgnoreCase(tempName2) && tempName.equalsIgnoreCase(tempName3)
			    && tempName.equalsIgnoreCase(tempName4) && tempName.equalsIgnoreCase(tempName5)
			    && tempName.equalsIgnoreCase(tempName6) && tempName.equalsIgnoreCase(tempName7)) 
		    {
			/*
			 * writes out student failing 7 classes
			 */
			bw.write(tempGrade + " , " + tempName + " ,, " + tempClass + " " + tempAve + " " 
				+ tempClass2 + " " + tempAve2 + " " + tempClass3 + " " + tempAve3 + " "
				+ tempClass4 + " " + tempAve4 + " " + tempClass5 + " " + tempAve5
				+ " " + tempClass6 + " " + tempAve6 + " " + tempClass7 + " " + tempAve7);
			bw.newLine();
			currentWeek.add(tempName);
		    }
		    else if(tempName.equalsIgnoreCase(tempName2) && tempName.equalsIgnoreCase(tempName3)
			    && tempName.equalsIgnoreCase(tempName4) && tempName.equalsIgnoreCase(tempName5)
			    && tempName.equalsIgnoreCase(tempName6)) 
		    {
			/*
			 * writes out student failing 6 classes
			 */
			bw.write(tempGrade + " , " + tempName + " ,, " + tempClass + " " + tempAve + " " 
				+ tempClass2 + " " + tempAve2 + " " + tempClass3 + " " + tempAve3 + " "
				+ tempClass4 + " " + tempAve4 + " " + tempClass5 + " " + tempAve5
				+ " " + tempClass6 + " " + tempAve6);
			bw.newLine();
			currentWeek.add(tempName);
		    }
		    else if(tempName.equalsIgnoreCase(tempName2) && tempName.equalsIgnoreCase(tempName3)
			    && tempName.equalsIgnoreCase(tempName4) && tempName.equalsIgnoreCase(tempName5)) 
		    {
			/*
			 * prints out student failing 5 classes
			 */
			bw.write(tempGrade + " , " + tempName + " ,, " + tempClass + " " + tempAve + " " 
				+ tempClass2 + " " + tempAve2 + " " + tempClass3 + " " + tempAve3 + " "
				+ tempClass4 + " " + tempAve4 + " " + tempClass5 + " " + tempAve5);
			bw.newLine();
			currentWeek.add(tempName);
		    }
		    else if(tempName.equalsIgnoreCase(tempName2) && tempName.equalsIgnoreCase(tempName3)
			    && tempName.equalsIgnoreCase(tempName4)) 
		    {
			/*
			 * writes out student failing 4 classes
			 */
			bw.write(tempGrade + " , " + tempName + " ,, " + tempClass + " " + tempAve + " " 
				+ tempClass2 + " " + tempAve2 + " " + tempClass3 + " " + tempAve3 + " "
				+ tempClass4 + " " + tempAve4);
			bw.newLine();
			currentWeek.add(tempName);
		    }
		    else if(tempName.equalsIgnoreCase(tempName2) && tempName.equalsIgnoreCase(tempName3)) 
		    {
			/*
			 * writes out student failing 3 classes
			 */
			bw.write(tempGrade + " , " + tempName + " ,, " + tempClass + " " + tempAve + " " 
				+ tempClass2 + " " + tempAve2 + " " + tempClass3 + " " + tempAve3);
			bw.newLine();
			currentWeek.add(tempName);
		    }
		    else if(tempName.equalsIgnoreCase(tempName2))  
		    {   
			/*
			 * writes out student failing 2 classes
			 */
			bw.write(tempGrade + " , " + tempName + " ,, " + tempClass + " " + tempAve + " " 
				+ tempClass2 + " " + tempAve2);
			bw.newLine();
			currentWeek.add(tempName);
		    }
		    else	
		    {
			/*
			 * writes out student failing 1 class
			 */
			bw.write(tempGrade + " , " + tempName + " ,, " + tempClass + " " + tempAve);
			bw.newLine();
			currentWeek.add(tempName);
		    }

		    tempName = fourthSplit[0] + " " + fourthSplit[1];
		    tempClass = secondSplit[2]+secondSplit[3];
		    tempAve = thirdSplit[1].substring(0, thirdSplit[1].length()-5); 
		    tempGrade = fifthSplit[2];
		}
		else		// name equal to name in next line
		{
		    if((fourthSplit[0] + " " + fourthSplit[1]).equalsIgnoreCase(tempName) && (fourthSplit[0] + " " + fourthSplit[1]).equalsIgnoreCase(tempName2) 
			    && (fourthSplit[0] + " " + fourthSplit[1]).equalsIgnoreCase(tempName3) && (fourthSplit[0] + " " + fourthSplit[1]).equalsIgnoreCase(tempName4)
			    && (fourthSplit[0] + " " + fourthSplit[1]).equalsIgnoreCase(tempName5) && (fourthSplit[0] + " " + fourthSplit[1]).equalsIgnoreCase(tempName6))
		    {
			tempName7 = fourthSplit[0] + " " + fourthSplit[1];
			tempClass7 = secondSplit[2]+secondSplit[3];
			tempAve7 = thirdSplit[1].substring(0, thirdSplit[1].length()-5);
			tempGrade7 = fifthSplit[2];
		    }
		    else if((fourthSplit[0] + " " + fourthSplit[1]).equalsIgnoreCase(tempName) && (fourthSplit[0] + " " + fourthSplit[1]).equalsIgnoreCase(tempName2) 
			    && (fourthSplit[0] + " " + fourthSplit[1]).equalsIgnoreCase(tempName3) && (fourthSplit[0] + " " + fourthSplit[1]).equalsIgnoreCase(tempName4)
			    && (fourthSplit[0] + " " + fourthSplit[1]).equalsIgnoreCase(tempName5))
		    {
			tempName6 = fourthSplit[0] + " " + fourthSplit[1];
			tempClass6 = secondSplit[2]+secondSplit[3];
			tempAve6 = thirdSplit[1].substring(0, thirdSplit[1].length()-5);
			tempGrade6 = fifthSplit[2];
		    }
		    else if((fourthSplit[0] + " " + fourthSplit[1]).equalsIgnoreCase(tempName) && (fourthSplit[0] + " " + fourthSplit[1]).equalsIgnoreCase(tempName2) 
			    && (fourthSplit[0] + " " + fourthSplit[1]).equalsIgnoreCase(tempName3) && (fourthSplit[0] + " " + fourthSplit[1]).equalsIgnoreCase(tempName4))
		    {
			tempName5 = fourthSplit[0] + " " + fourthSplit[1];
			tempClass5 = secondSplit[2]+secondSplit[3];
			tempAve5 = thirdSplit[1].substring(0, thirdSplit[1].length()-5);
			tempGrade5 = fifthSplit[2];
		    }
		    else if((fourthSplit[0] + " " + fourthSplit[1]).equalsIgnoreCase(tempName) && (fourthSplit[0] + " " + fourthSplit[1]).equalsIgnoreCase(tempName2) 
			    && (fourthSplit[0] + " " + fourthSplit[1]).equalsIgnoreCase(tempName3))
		    {
			tempName4 = fourthSplit[0] + " " + fourthSplit[1];
			tempClass4 = secondSplit[2]+secondSplit[3];
			tempAve4 = thirdSplit[1].substring(0, thirdSplit[1].length()-5);
			tempGrade4 = fifthSplit[2];
		    }
		    else if((fourthSplit[0] + " " + fourthSplit[1]).equalsIgnoreCase(tempName) && (fourthSplit[0] + " " + fourthSplit[1]).equalsIgnoreCase(tempName2))
		    {
			tempName3 = fourthSplit[0] + " " + fourthSplit[1];
			tempClass3 = secondSplit[2]+secondSplit[3];
			tempAve3 = thirdSplit[1].substring(0, thirdSplit[1].length()-5);
			tempGrade3 = fifthSplit[2];
		    }
		    else
		    {
			tempName2 = fourthSplit[0] + " " + fourthSplit[1];  // tempName = firstSplit[1] save current class average in temp2
			tempClass2 = secondSplit[2]+secondSplit[3];  
			tempAve2 = thirdSplit[1].substring(0, thirdSplit[1].length()-5);
			tempGrade2 = fifthSplit[2];
		    }
		}
	    }

	    if(tempName.equalsIgnoreCase(tempName2) && tempName.equalsIgnoreCase(tempName3)
		    && tempName.equalsIgnoreCase(tempName4) && tempName.equalsIgnoreCase(tempName5)
		    && tempName.equalsIgnoreCase(tempName6) && tempName.equalsIgnoreCase(tempName7)) 
	    {
		/*
		 * writes out last student on list failing 7 classes
		 */
		bw.write(tempGrade + " , " + tempName + " ,, " + tempClass + " " + tempAve + " " 
			+ tempClass2 + " " + tempAve2 + " " + tempClass3 + " " + tempAve3 + " "
			+ tempClass4 + " " + tempAve4 + " " + tempClass5 + " " + tempAve5
			+ " " + tempClass6 + " " + tempAve6 + " " + tempClass7 + " " + tempAve7);
		bw.newLine();
		currentWeek.add(tempName);
	    }
	    else if(tempName.equalsIgnoreCase(tempName2) && tempName.equalsIgnoreCase(tempName3)
		    && tempName.equalsIgnoreCase(tempName4) && tempName.equalsIgnoreCase(tempName5)
		    && tempName.equalsIgnoreCase(tempName6)) 
	    {
		/*
		 * writes out last student on list failing 6 classes
		 */
		bw.write(tempGrade + " , " + tempName + " ,, " + tempClass + " " + tempAve + " " 
			+ tempClass2 + " " + tempAve2 + " " + tempClass3 + " " + tempAve3 + " "
			+ tempClass4 + " " + tempAve4 + " " + tempClass5 + " " + tempAve5
			+ " " + tempClass6 + " " + tempAve6);
		bw.newLine();
		currentWeek.add(tempName);
	    }
	    else if(tempName.equalsIgnoreCase(tempName2) && tempName.equalsIgnoreCase(tempName3)
		    && tempName.equalsIgnoreCase(tempName4) && tempName.equalsIgnoreCase(tempName5)) 
	    {
		/*
		 * writes out last student on list failing 5 classes
		 */
		bw.write(tempGrade + " , " + tempName + " ,, " + tempClass + " " + tempAve + " " 
			+ tempClass2 + " " + tempAve2 + " " + tempClass3 + " " + tempAve3 + " "
			+ tempClass4 + " " + tempAve4 + " " + tempClass5 + " " + tempAve5);
		bw.newLine();
		currentWeek.add(tempName);
	    }
	    else if(tempName.equalsIgnoreCase(tempName2) && tempName.equalsIgnoreCase(tempName3)
		    && tempName.equalsIgnoreCase(tempName4)) 
	    {
		/*
		 * writes out last student on list failing 4 classes
		 */
		bw.write(tempGrade + " , " + tempName + " ,, " + tempClass + " " + tempAve + " " 
			+ tempClass2 + " " + tempAve2 + " " + tempClass3 + " " + tempAve3 + " "
			+ tempClass4 + " " + tempAve4);
		bw.newLine();
		currentWeek.add(tempName);
	    }
	    else if(tempName.equalsIgnoreCase(tempName2) && tempName.equalsIgnoreCase(tempName3)) 
	    {
		/*
		 * writes out last student on list failing 3 classes
		 */
		bw.write(tempGrade + " , " + tempName + " ,, " + tempClass + " " + tempAve + " " 
			+ tempClass2 + " " + tempAve2 + " " + tempClass3 + " " + tempAve3);
		bw.newLine();
		currentWeek.add(tempName);
	    }
	    else if(tempName.equalsIgnoreCase(tempName2))  
	    {   
		/*
		 * writes out last student on list failing 2 classes
		 */
		bw.write(tempGrade + " , " + tempName + " ,, " + tempClass + " " + tempAve + " " 
			+ tempClass2 + " " + tempAve2);
		bw.newLine();
		currentWeek.add(tempName);
	    }
	    else	
	    {
		/*
		 * writes out last student on list failing 1 class
		 */
		bw.write(tempGrade + " , " + tempName + " ,, " + tempClass + " " + tempAve);
		bw.newLine();
		currentWeek.add(tempName);
	    }

	    bw.write("PREVIOUS WEEK");

	    /*
	     * Read in the previous week 
	     */
	    while((line = brPreviousWeek.readLine()) != null) 
	    {    
		String [] firstSplit = line.split("\"");  // first split
		String [] secondSplit = firstSplit[3].split(" ");  // split around 2 spaces
		String [] thirdSplit = firstSplit[3].split(":");  //  split after the :
		String [] fourthSplit = firstSplit[1].split(" ");  // fourthSplit[0] last name, fourthSplit[1] first name
		String [] fifthSplit = firstSplit[2].split(","); // fifthSplit[2] is grade

		/*
		 * name not equal to name in next line
		 */

		if(!(fourthSplit[0] + " " + fourthSplit[1]).equalsIgnoreCase(tempName))  
		{
		    if(tempName.equalsIgnoreCase(tempName2) && tempName.equalsIgnoreCase(tempName3)
			    && tempName.equalsIgnoreCase(tempName4) && tempName.equalsIgnoreCase(tempName5)
			    && tempName.equalsIgnoreCase(tempName6) && tempName.equalsIgnoreCase(tempName7)) 
		    {
			if(currentWeek.contains(tempName))
			{
			    /*
			     * writes out student failing 7 classes
			     */
			    bw.write(tempGrade + " , " + tempName + " , " + tempClass + " " + tempAve + " " 
				    + tempClass2 + " " + tempAve2 + " " + tempClass3 + " " + tempAve3 + " "
				    + tempClass4 + " " + tempAve4 + " " + tempClass5 + " " + tempAve5
				    + " " + tempClass6 + " " + tempAve6 + " " + tempClass7 + " " + tempAve7);
			    bw.newLine();
			}
		    }
		    else if(tempName.equalsIgnoreCase(tempName2) && tempName.equalsIgnoreCase(tempName3)
			    && tempName.equalsIgnoreCase(tempName4) && tempName.equalsIgnoreCase(tempName5)
			    && tempName.equalsIgnoreCase(tempName6)) 
		    {
			if (currentWeek.contains(tempName))
			{
			    /*
			     * writes out student failing 6 classes
			     */
			    bw.write(tempGrade + " , " + tempName + " , " + tempClass + " " + tempAve + " " + tempClass2
				    + " " + tempAve2 + " " + tempClass3 + " " + tempAve3 + " " + tempClass4 + " "
				    + tempAve4 + " " + tempClass5 + " " + tempAve5 + " " + tempClass6 + " " + tempAve6);
			    bw.newLine();
			}
		    }
		    else if(tempName.equalsIgnoreCase(tempName2) && tempName.equalsIgnoreCase(tempName3)
			    && tempName.equalsIgnoreCase(tempName4) && tempName.equalsIgnoreCase(tempName5)) 
		    {
			if (currentWeek.contains(tempName))
			{
			    /*
			     * writes out student failing 5 classes
			     */
			    bw.write(tempGrade + " , " + tempName + " , " + tempClass + " " + tempAve + " " + tempClass2
				    + " " + tempAve2 + " " + tempClass3 + " " + tempAve3 + " " + tempClass4 + " "
				    + tempAve4 + " " + tempClass5 + " " + tempAve5);
			    bw.newLine();
			}
		    }
		    else if(tempName.equalsIgnoreCase(tempName2) && tempName.equalsIgnoreCase(tempName3)
			    && tempName.equalsIgnoreCase(tempName4)) 
		    {
			if (currentWeek.contains(tempName))
			{
			    /*
			     * writes out student failing 4 classes
			     */
			    bw.write(tempGrade + " , " + tempName + " , " + tempClass + " " + tempAve + " " + tempClass2
				    + " " + tempAve2 + " " + tempClass3 + " " + tempAve3 + " " + tempClass4 + " "
				    + tempAve4);
			    bw.newLine();
			}
		    }
		    else if(tempName.equalsIgnoreCase(tempName2) && tempName.equalsIgnoreCase(tempName3)) 
		    {
			if (currentWeek.contains(tempName))
			{
			    /*
			     * writes out student failing 3 classes
			     */
			    bw.write(tempGrade + " , " + tempName + " , " + tempClass + " " + tempAve + " " + tempClass2
				    + " " + tempAve2 + " " + tempClass3 + " " + tempAve3);
			    bw.newLine();
			}
		    }
		    else if(tempName.equalsIgnoreCase(tempName2))  
		    {    
			if (currentWeek.contains(tempName))
			{
			    /*
			     * writes out student failing 2 classes
			     */
			    bw.write(tempGrade + " , " + tempName + " , " + tempClass + " " + tempAve + " " + tempClass2
				    + " " + tempAve2);
			    bw.newLine();
			}
		    }
		    else	
		    {
			if (currentWeek.contains(tempName))
			{
			    /*
			     * writes out student failing 1 class
			     */
			    bw.write(tempGrade + " , " + tempName + " , " + tempClass + " " + tempAve);
			    bw.newLine();
			}
		    }

		    tempName = fourthSplit[0] + " " + fourthSplit[1];
		    tempClass = secondSplit[2]+secondSplit[3];
		    tempAve = thirdSplit[1].substring(0, thirdSplit[1].length()-5); 
		    tempGrade = fifthSplit[2];
		}
		else		// name equal to name in next line
		{
		    if((fourthSplit[0] + " " + fourthSplit[1]).equalsIgnoreCase(tempName) && (fourthSplit[0] + " " + fourthSplit[1]).equalsIgnoreCase(tempName2) 
			    && (fourthSplit[0] + " " + fourthSplit[1]).equalsIgnoreCase(tempName3) && (fourthSplit[0] + " " + fourthSplit[1]).equalsIgnoreCase(tempName4)
			    && (fourthSplit[0] + " " + fourthSplit[1]).equalsIgnoreCase(tempName5) && (fourthSplit[0] + " " + fourthSplit[1]).equalsIgnoreCase(tempName6))
		    {
			tempName7 = fourthSplit[0] + " " + fourthSplit[1];
			tempClass7 = secondSplit[2]+secondSplit[3];
			tempAve7 = thirdSplit[1].substring(0, thirdSplit[1].length()-5);
			tempGrade7 = fifthSplit[2];
		    }
		    else if((fourthSplit[0] + " " + fourthSplit[1]).equalsIgnoreCase(tempName) && (fourthSplit[0] + " " + fourthSplit[1]).equalsIgnoreCase(tempName2) 
			    && (fourthSplit[0] + " " + fourthSplit[1]).equalsIgnoreCase(tempName3) && (fourthSplit[0] + " " + fourthSplit[1]).equalsIgnoreCase(tempName4)
			    && (fourthSplit[0] + " " + fourthSplit[1]).equalsIgnoreCase(tempName5))
		    {
			tempName6 = fourthSplit[0] + " " + fourthSplit[1];
			tempClass6 = secondSplit[2]+secondSplit[3];
			tempAve6 = thirdSplit[1].substring(0, thirdSplit[1].length()-5);
			tempGrade6 = fifthSplit[2];
		    }
		    else if((fourthSplit[0] + " " + fourthSplit[1]).equalsIgnoreCase(tempName) && (fourthSplit[0] + " " + fourthSplit[1]).equalsIgnoreCase(tempName2) 
			    && (fourthSplit[0] + " " + fourthSplit[1]).equalsIgnoreCase(tempName3) && (fourthSplit[0] + " " + fourthSplit[1]).equalsIgnoreCase(tempName4))
		    {
			tempName5 = fourthSplit[0] + " " + fourthSplit[1];
			tempClass5 = secondSplit[2]+secondSplit[3];
			tempAve5 = thirdSplit[1].substring(0, thirdSplit[1].length()-5);
			tempGrade5 = fifthSplit[2];
		    }
		    else if((fourthSplit[0] + " " + fourthSplit[1]).equalsIgnoreCase(tempName) && (fourthSplit[0] + " " + fourthSplit[1]).equalsIgnoreCase(tempName2) 
			    && (fourthSplit[0] + " " + fourthSplit[1]).equalsIgnoreCase(tempName3))
		    {
			tempName4 = fourthSplit[0] + " " + fourthSplit[1];
			tempClass4 = secondSplit[2]+secondSplit[3];
			tempAve4 = thirdSplit[1].substring(0, thirdSplit[1].length()-5);
			tempGrade4 = fifthSplit[2];
		    }
		    else if((fourthSplit[0] + " " + fourthSplit[1]).equalsIgnoreCase(tempName) && (fourthSplit[0] + " " + fourthSplit[1]).equalsIgnoreCase(tempName2))
		    {
			tempName3 = fourthSplit[0] + " " + fourthSplit[1];
			tempClass3 = secondSplit[2]+secondSplit[3];
			tempAve3 = thirdSplit[1].substring(0, thirdSplit[1].length()-5);
			tempGrade3 = fifthSplit[2];
		    }
		    else
		    {
			tempName2 = fourthSplit[0] + " " + fourthSplit[1];  // tempName = firstSplit[1] save current class average in temp2
			tempClass2 = secondSplit[2]+secondSplit[3];  
			tempAve2 = thirdSplit[1].substring(0, thirdSplit[1].length()-5);
			tempGrade2 = fifthSplit[2];
		    }
		}
	    }

	    if(tempName.equalsIgnoreCase(tempName2) && tempName.equalsIgnoreCase(tempName3)
		    && tempName.equalsIgnoreCase(tempName4) && tempName.equalsIgnoreCase(tempName5)
		    && tempName.equalsIgnoreCase(tempName6) && tempName.equalsIgnoreCase(tempName7)) 
	    {
		if (currentWeek.contains(tempName))
		{
		    /*
		     * Writes out last student on list failing 7 classes
		     */
		    bw.write(tempGrade + " , " + tempName + " , " + tempClass + " " + tempAve + " " + tempClass2 + " "
			    + tempAve2 + " " + tempClass3 + " " + tempAve3 + " " + tempClass4 + " " + tempAve4 + " "
			    + tempClass5 + " " + tempAve5 + " " + tempClass6 + " " + tempAve6 + " " + tempClass7 + " "
			    + tempAve7);
		    bw.newLine();
		}
	    }
	    else if(tempName.equalsIgnoreCase(tempName2) && tempName.equalsIgnoreCase(tempName3)
		    && tempName.equalsIgnoreCase(tempName4) && tempName.equalsIgnoreCase(tempName5)
		    && tempName.equalsIgnoreCase(tempName6)) 
	    {
		if (currentWeek.contains(tempName))
		{
		    /*
		     * Writes out last student on list failing 6 classes
		     */
		    bw.write(tempGrade + " , " + tempName + " , " + tempClass + " " + tempAve + " " + tempClass2 + " "
			    + tempAve2 + " " + tempClass3 + " " + tempAve3 + " " + tempClass4 + " " + tempAve4 + " "
			    + tempClass5 + " " + tempAve5 + " " + tempClass6 + " " + tempAve6);
		    bw.newLine();
		}
	    }
	    else if(tempName.equalsIgnoreCase(tempName2) && tempName.equalsIgnoreCase(tempName3)
		    && tempName.equalsIgnoreCase(tempName4) && tempName.equalsIgnoreCase(tempName5)) 
	    {
		if (currentWeek.contains(tempName))
		{
		    /*
		     * Writes out last student on list failing 5 classes
		     */
		    bw.write(tempGrade + " , " + tempName + " , " + tempClass + " " + tempAve + " " + tempClass2 + " "
			    + tempAve2 + " " + tempClass3 + " " + tempAve3 + " " + tempClass4 + " " + tempAve4 + " "
			    + tempClass5 + " " + tempAve5);
		    bw.newLine();
		}
	    }
	    else if(tempName.equalsIgnoreCase(tempName2) && tempName.equalsIgnoreCase(tempName3)
		    && tempName.equalsIgnoreCase(tempName4)) 
	    {
		if (currentWeek.contains(tempName))
		{
		    /*
		     * Writes out last student on list failing 4 classes
		     */
		    bw.write(tempGrade + " , " + tempName + " , " + tempClass + " " + tempAve + " " + tempClass2 + " "
			    + tempAve2 + " " + tempClass3 + " " + tempAve3 + " " + tempClass4 + " " + tempAve4);
		    bw.newLine();
		}
	    }
	    else if(tempName.equalsIgnoreCase(tempName2) && tempName.equalsIgnoreCase(tempName3)) 
	    {
		if (currentWeek.contains(tempName))
		{
		    /*
		     * Writes out last student on list failing 3 classes
		     */
		    bw.write(tempGrade + " , " + tempName + " , " + tempClass + " " + tempAve + " " + tempClass2 + " "
			    + tempAve2 + " " + tempClass3 + " " + tempAve3);
		    bw.newLine();
		}
	    }
	    else if(tempName.equalsIgnoreCase(tempName2))  
	    {    
		if (currentWeek.contains(tempName))
		{
		    /*
		     * Writes out last student on list failing 2 classes
		     */
		    bw.write(tempGrade + " , " + tempName + " , " + tempClass + " " + tempAve + " " + tempClass2 + " "
			    + tempAve2);
		    bw.newLine();
		}
	    }
	    else	
	    {
		if (currentWeek.contains(tempName))
		{
		    /*
		     * Writes out last student on list failing 1 class
		     */
		    bw.write(tempGrade + " , " + tempName + " , " + tempClass + " " + tempAve);
		    bw.newLine();
		}
	    }


	    bw.flush();
	    brCurrentWeek.close();
	    brPreviousWeek.close();
	    System.out.println("SUCCESS");
	}
	catch(IOException e)
	{
	    e.printStackTrace();
	    System.out.println("Error:  Threw an Acception");
	}
    }  // end of main method
}  //  end of EligibilityList4 Class


