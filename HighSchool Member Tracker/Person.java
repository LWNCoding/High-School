public abstract class Person{ 
  private String firstName;
  private String lastName;
  
//sets first/last name from the corresponding parameters
  public Person(String fName, String lName){ 
    firstName = fName;
    lastName = lName;
  }

//prints out first and last name in the following format: last name, first name
  public String getFullName(){
    return lastName + ", " + firstName;
  }
}