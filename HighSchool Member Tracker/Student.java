public class Student extends Person{
  private static int studentIdCount;
  private int studentId;
  private int level;

/*calls person default constructor which sets first and lase name. Also sets grade level to 
input grade if between 0 and 12 inclusive, otherwise sets grade level to 0. The constructor 
also increments and sets student id*/
  public Student(String fName, String lName, int gLevel){
    super(fName, lName);
    if(gLevel >= 0 && gLevel <= 12){
      level = gLevel;
    }
    else{
      level = 0;
    }
    studentIdCount++;
    studentId = studentIdCount;
  }

//returns grade level
  public int getLevel(){
    return level;
  }

//returns student id
  public int getID(){
    return studentId;
  }

//returns person getFullName(which returns last name, first name) plus grade level and student id
  public String toString(){
    return super.getFullName() + "\n   Grade Level: " + level + "\n   ID #: " + studentId; 
  }

}