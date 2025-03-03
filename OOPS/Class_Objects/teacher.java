package JAVA.OOPS.Class_Objects;

public class teacher {
   String Name;
   int id;
   int salary;
   String Subject;

   public void setDetails(String name, int id, int salary, String subject) {
      this.Name = name;
      this.id = id;
      this.salary = salary;
      this.Subject = subject;
   }

   public void displayData() {
      System.out.println("------ Teacher's Details ------");
      System.out.println("Teacher Name is :-> " + Name);
      System.out.println("Teacher ID :-> " + id);
      System.out.println("Teacher Salary :-> " + salary);
      System.out.println("Teacher Subject :-> " + Subject);

      System.out.println("I'm " + Name + ", My Id is : " + id + ", Salary is : " + salary + " & Subject is : " + Subject);
   }

   public int annualSalary (int newSalary) {
      return this.salary =  newSalary * 12;
   }

   public void updateTeacher(String name, int id, int salary, String subject) {
      this.Name = name;
      this.id = id;
      this.salary = salary;
      this.Subject = subject;
   }

   public void GiveRaise (int percentage) {
      salary += (salary * percentage) / 100;
      System.out.println("\nSalary After " + percentage + "% raise :-> " + salary);
   }
}
