package edu.JavaCourse.studentOrder;

import edu.JavaCourse.studentOrder.other.Adult;
import edu.JavaCourse.studentOrder.domain.StudentOrder;

public class SaveStudentOrder {
    public static void main(String[] args) {
        buildStudentOrder();
//        StudentOrder so = new StudentOrder();
//        long ans = saveStudentOrder(so);
    }

    static long saveStudentOrder(StudentOrder so){
        long answer = 1488;
        System.out.println("Сделано");
        return answer;
    }

    public static StudentOrder buildStudentOrder(){
        StudentOrder so = new StudentOrder();
        StudentOrder so1 =so;


        return so;
    }
}
