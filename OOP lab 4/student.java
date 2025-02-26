import java.util.Scanner;
class student {
  private String name;
  private int rollNumber;
  private String department;

    public student() {
        this.name = "Unknown";
        this.rollNumber = 0;
        this.department = "Unknown";
    }

    public student(String name, int rollNumber, String Department) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.department = department;
    }

    public student(student student) {
        this.name = student.name;
        this.rollNumber = student.rollNumber;
        this.department = student.department;
    }

    public void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Departmentr: " + department);
        
    }
}
class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            System.out.println("\nEnter details for Student " + (i + 1) + ":");

            System.out.print("Enter Student Name: ");
            String name =input.nextLine();
            System.out.print("Enter Roll Number: ");
            int rollNumber = input.nextInt();
            System.out.print("Enter Department Name: ");
            String department =input.nextLine();
        }
    }
}

   