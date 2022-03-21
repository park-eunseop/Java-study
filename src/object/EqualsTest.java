package object;

class Student{
    int studentId;
    String studentName;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return studentId+" : "+studentName;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student){
            Student std = (Student) obj;
            if(this.studentId==std.studentId)
                return true;
            else return false;
        }
        return false;
    }
}



public class EqualsTest {
    public static void main(String[] args) {
        Student studentLee = new Student(100, "Lee");
        Student studentLee2 = studentLee;
        Student park = new Student(100,"Lee");

        if(studentLee == studentLee2){
            System.out.println("studentLee와 studentLee2의 주소는 같습니다.");
        }
        else{
            System.out.println("studentLee와 studentLee2의 주소는 다릅니다.");
        }
        if(studentLee.equals(studentLee2)){
            System.out.println("studentLee와 studentLee2의 동일합니다.");
        }
        else{
            System.out.println("studentLee와 studentLee2의 동일하지 않습니다.");
        }

        if(studentLee == park){
            System.out.println("studentLee와 park 주소는 같습니다.");
        }
        else{
            System.out.println("studentLee와 park 주소는 다릅니다.");
        }
        if(studentLee.equals(park)){
            System.out.println("studentLee와 park 동일합니다.");
        }
        else{
            System.out.println("studentLee와 park 동일하지 않습니다.");
        }

    }

}
