import java.util.ArrayList;
public class School{
  ArrayList<Student> students = new ArrayList<Student>();
  ArrayList<Teacher> faculty = new ArrayList<Teacher>();

//Adds student to arraylist of students
  public void addStudent(Student s){
    students.add(s);
  }
  
//Adds teacher to arraylist of teachers(faculty)
  public void addTeacher(Teacher t){
    faculty.add(t);
  }
  
//returns studenst in grade level from parameter
  public String getGradeLevel(int level){
    String hold = "";
    for(Student x : students){
      if(x.getLevel() == level){
        hold += x.toString() + "\n";
      }
    }
    return hold;
  }

/*returns faculty and student list, each person being line by line, teachers call teacher toString,
if student is a highschooler, downcasts and uses toString from highschoolstudent, otherwise uses
student toString*/
  public String toString(){
    String hold = "Faculty:\n";
    for(Teacher a : faculty){
      hold += a.toString() + "\n";
    }
    hold += "\nStudent Body:\n";
    for(Student x : students){
      if(x instanceof HighSchoolStudent){
        hold += ((HighSchoolStudent)x).toString() + "\n";
      }
      else{
        hold += x.toString() + "\n";
      }
    }
    return hold;
  }

}