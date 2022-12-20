public class Teacher extends Person{
  private String subject;

/*calls person default constructor which sets first and last name, also sets which subject they 
teach*/ 
  public Teacher(String fName, String lName, String subject){
    super(fName, lName);
    this.subject = subject;
  }

//returns person toString and then subject taught
  public String toString(){
    return super.getFullName() + "\t\tSubject: " + subject;
  }
}