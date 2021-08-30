package edu.JavaCourse.studentOrder.validators;

import edu.JavaCourse.studentOrder.domain.CityRegisterCheckerResponse;
import edu.JavaCourse.studentOrder.domain.Person;
import edu.JavaCourse.studentOrder.exception.CityRegisterException;

public interface CityRegisterChecker  {
    public CityRegisterCheckerResponse checkPerson(Person person) throws CityRegisterException;
}
