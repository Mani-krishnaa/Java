package arrays;

/*

Array of objects menas creating a object and put it in an array
 That's precisely what an array of objects is.

Two steps:

Create objects → s1, s2, s3
Put them into an array → students[0] = s1  */
class Student {
    String name;
    int rollNum;
    int Attendence;

    public static class ArrayOfObjects {

        public static void main(String[] args) {
            Student s1 = new Student();
            s1.name = "Mani";
            s1.rollNum = 12;
            s1.Attendence = 23;

            Student s2 = new Student();
            s2.name = "Kishor";
            s2.rollNum = 2;
            s2.Attendence = 253;

            Student s3 = new Student();
            s3.name = "Ravi";
            s3.rollNum = 132;
            s3.Attendence = 243;

            Student students[] = new Student[3];
            students[0] = s1;
            students[1] = s2;
            students[2] = s3;

            for (int i = 0; i < students.length; i++) {
                System.out.println(students[i].name + " " + students[i].rollNum + " " + students[i].Attendence);

            }

        }

    }

}