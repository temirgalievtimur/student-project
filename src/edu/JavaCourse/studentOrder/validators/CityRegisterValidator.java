package edu.JavaCourse.studentOrder.validators;

import edu.JavaCourse.studentOrder.domain.AnswerCityRegister;
import edu.JavaCourse.studentOrder.domain.CityRegisterCheckerResponse;
import edu.JavaCourse.studentOrder.domain.StudentOrder;
import edu.JavaCourse.studentOrder.exception.CityRegisterException;

public class CityRegisterValidator {

    public String hostname;
    protected int port;
    private String login;
    String password;
    private CityRegisterChecker personChecker;

    public CityRegisterValidator() {
        personChecker = new FakeCityRegisterChecker();
    }

    public AnswerCityRegister checkCityRegister(StudentOrder so){
        try {
            CityRegisterCheckerResponse hans =  personChecker.checkPerson(so.getHuband());
            CityRegisterCheckerResponse wans = personChecker.checkPerson(so.getWife());
            CityRegisterCheckerResponse cans = personChecker.checkPerson(so.getChild());
        } catch (CityRegisterException e) {
            e.printStackTrace();
        }
        AnswerCityRegister ans = new AnswerCityRegister();
        ans.success = false;
        return ans;
    }
}
