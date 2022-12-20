public class HighSchoolStudent extends Student{
  private double gpa;

/*calls student constructor that sets first and last name. Also sets GPA to 0 if below 0 or above 5,
otherwise sets to input GPA*/
  public HighSchoolStudent(String fName, String lName, int gLevel, double gpa){
    super(fName, lName, gLevel);
    if(gpa >= 0 && gpa <= 5){
      this.gpa = gpa;
    }
    else{
      this.gpa = 0;
    }
  }

//returns GPA
  public double getGPA(){
    return gpa;
  }

//returns student toString and adds GPA 
  public String toString(){
    return super.toString() + "\n   GPA: " + gpa;
  }
}