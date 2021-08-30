package edu.JavaCourse.studentOrder;

import edu.JavaCourse.studentOrder.domain.*;
import edu.JavaCourse.studentOrder.mail.MailSender;
import edu.JavaCourse.studentOrder.validators.ChildrenValidator;
import edu.JavaCourse.studentOrder.validators.CityRegisterValidator;
import edu.JavaCourse.studentOrder.validators.StudentValidator;
import edu.JavaCourse.studentOrder.validators.WeddingValidator;

public class StudentOrderValidator {

    private CityRegisterValidator cityRegisterValidator;
    private WeddingValidator weddingValidator;
    private ChildrenValidator childrenValidator;
    private StudentValidator studentValidator;
    private MailSender mailSender;

    public StudentOrderValidator(){
        cityRegisterValidator = new CityRegisterValidator();
        weddingValidator = new WeddingValidator();
        childrenValidator  = new ChildrenValidator();
        studentValidator = new StudentValidator();
        mailSender = new MailSender();
    }

    public static void main(String[] args) {
        StudentOrderValidator studentOrderValidator =  new StudentOrderValidator();
        studentOrderValidator.checkAll();
    }
    void checkAll(){

            StudentOrder so = readStudentOrder();
            System.out.println("start");

            AnswerCityRegister acr = checkCityRegister(so);

            AnswerWedding aw = checkWedding(so);
            AnswerChildren ac = checkChildren(so);
            AnswerStudent as = checkStudent(so);

            sendMail(so);
            System.out.println("finish");
    }
    public StudentOrder readStudentOrder() {
        SaveStudentOrder.buildStudentOrder();
        return new StudentOrder();
        //return null;
    }
    public AnswerCityRegister checkCityRegister(StudentOrder so){
        return cityRegisterValidator.checkCityRegister(so);
    }
    public AnswerWedding checkWedding(StudentOrder so){
       return weddingValidator.checkWedding(so);
    }
    public AnswerChildren checkChildren(StudentOrder so){
       return childrenValidator.checkChildren(so);
    }
    public AnswerStudent checkStudent(StudentOrder so){
       return studentValidator.checkStudent(so);
    }
    public void sendMail(StudentOrder so) {
        mailSender.SendMail(so);
    }
}
