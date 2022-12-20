class Main {
  public static void main(String[] args) {
    Student s = new Student("Veronica", "Telly", 5);
  System.out.println("\n\nprinting student:\n");
  System.out.println(s);

  System.out.println("\n\nprinting highschoolstudent:\n");
  HighSchoolStudent h = new HighSchoolStudent("Ronald", "Smithers", 9, 2.75);
  System.out.println(h);

  System.out.print("\n\njust printing student's grade:  ");
  System.out.println(s.getLevel());

  System.out.print("\n\njust printing high school student's ID:  ");
  System.out.println(h.getID());

  System.out.print("\n\njust printing high school student's gpa:  ");
  System.out.println(h.getGPA());

  School sch = new School();
  sch.addStudent(new HighSchoolStudent("Jerimiah", "Flanders", 12, 4.1));
  sch.addStudent(new Student("Abigail", "Adams", 4));
  sch.addStudent(new HighSchoolStudent("Nancy", "Morgan", 9, 3.4));
  sch.addStudent(new HighSchoolStudent("Vincent", "Ramos", 11, 2.7));
  sch.addStudent(new HighSchoolStudent("Sandra", "Jones", 10, 3.8));
  sch.addStudent(new Student("Zachary", "Anderson", 2));
  sch.addStudent(new Student("Pedro", "Monmart", 7));
  sch.addStudent(new HighSchoolStudent("Janelle", "Richards", 12, 3.5));

  sch.addTeacher(new Teacher("Renee", "Applebee", "Mathematics"));
  sch.addTeacher(new Teacher("Anthony", "Barrons", "Physics"));                   
  sch.addTeacher(new Teacher("Lillian", "Jackson", "Computer Science"));
  sch.addTeacher(new Teacher("Marian", "Simpson", "Chemistry"));
  sch.addTeacher(new Teacher("Dominic", "Edwards", "Government"));
  sch.addTeacher(new Teacher("Beverly", "Clarke", "English Composition"));

  System.out.println("\n\nprinting school: \n");
  System.out.println(sch);

  System.out.println("\n\njust seniors: \n" + sch.getGradeLevel(12));

  }
}