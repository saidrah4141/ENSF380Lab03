import java.util.*;
public class University {
    
    private static List<Student> students = new ArrayList<>();
    private static List<Student> elegibleStudents = new ArrayList<>();
    public static void main(String[] args) {
       
        Address address = new Address("123 Main St", "Calgary", "AB", "T2N 1N4", "Canada");

        Professor professor = new Professor("Dr. Smith", "123-456-7890", "dr.smith@university.ca", address, "P12345", 95000.0);

        Student student1 = new Student("John Doe", "987-654-3210", "john.doe@student.ca", address, "S12345", professor, 75.0);
        Student student2 = new Student("Jane Roe", "987-654-3211", "jane.roe@student.ca", address, "S12346", professor, 70.0);
        Student student3 = new Student("Sam Poe", "987-654-3212", "sam.poe@student.ca", address, "S12347", professor, 65.0);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        
        for (Student student:students) {
            if(student.isEligibleToEnroll()) {
                student.setSupervisor(professor);
                elegibleStudents.add(student);
            }
                
        }
       
        
        System.out.println("Professor "+ professor.getName() +" supervises "+ elegibleStudents.size()+ " students :");
        for (Student student:elegibleStudents) {
            System.out.println(student.getName());
                
        }
        
        
      
        
       
    }
}