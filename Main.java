import java.util.ArrayList;
import java.util.Arrays;
import java.io.FileNotFoundException;  
import java.util.Scanner; 
import java.io.File; 

class Main {
  public static void main(String args[]) throws FileNotFoundException{   
    // Reads each line of the text file containing data about legal permanent residents
    Scanner myReader = new Scanner(new File("LawfulPermanentResidents-ArrayList.txt"));

    // Create an ArrayList of Integers named 'data' and add each integer in the text file into the ArrayList

    //**hint: myReader.nextInt() gets each integer in the text file
    while (myReader.hasNextInt()) {
      
    }

    // Closes the Scanner
    myReader.close();

    // If you'd like: Make sure you correctly added all of the data using Arrays.toString() and data.toArray()
 

    // Add each line of the text file "CountryNames-Arraylist" based on what was done for 'data' into a new ArrayList of Strings called 'names'
    // **hint: since these are Strings not ints, use .hasNextLine() and .nextLine()



    // Remember to close the scanner


    // If you'd like: Make sure the names were all added into the ArrayList correctly using Arrays.toString() and names.toArray()
 

    // Print out each country and its corresponding population of legal permanent residents given that the index is shared between ArrayLists


    // The population of legal permanent residents for one country was too large to be accurate
    // Find the largest population and remove that population and country ** hint: record the index and the maximum and compare using a for loop



    // remove the country and the data that corresponds to this inaccurate data using the recorded index


    // Using the table provided in the student worksheet, add a country of interest and its population of legal permanent residents in the thousands to each of the ArrayLists


    // Print out this new dataset and add a title
    System.out.println("\n" + "New Dataset of Legal Permanent Residents in the Thousands");


    // Use the method in the Main called findLarger to find which of two countries has a larger population of legal permanent residents
 
    // Extension: go to Country.java and create an object that will represent the countries
    //Create four countries of your choice using the legal permanent resident data in the table and the Country.java class you created
 



    // Create an Arraylist of type Country and add the countries you made into the Arraylist
 


    // Print out the Arraylist of Countries with the toString method in the Country class and make sure to label what you are printing out
    System.out.println("\n Number of Legal Permanent Residents by Country in the Thousands");


    // Run findLargest method located in the Main class to find the country with the largest population of legal permanent residents
    

  }
  // Create a static method that will automatically print out which of two countries has a larger population of legal permanent residents
  //**hint: you will need to know which two countries to compare, the index of the countries in their ArrayList and the population data for each country
  public static void findLarger (            ){
    // Find the index of each country in the ArrayList to find the population that corresponds and print out the country with the larger population
   


  }
  // Extension: Create a static method that will automatically print out the country with the largest population of legal permanent residents
  //**hint: you will need to know what countries are in the ArrayList

    // Iterate through the ArrayList and compare with the variables to find the index of the maximum population
   
    // Print out the country with the largest population of legal permanent residents based on the index
    
  

}
