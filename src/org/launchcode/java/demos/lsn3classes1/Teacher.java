package org.launchcode.java.demos.lsn3classes1;

public class Teacher {
    //firstName, lastName, subject, and yearsTeaching. Add getters and setters to the class
    // and add the access level to each field and method in the class.
    // When adding your getters and setters, think about what we read about in the section on Encapsulation.
    //
    //What access modifier restricts access the most for what we need?
    //If it is a field, could we restrict the access to private and use getters and setters?
    //If we do set fields to private, what access level do we have to give our getters and setters?

    private String firstName;
    private String lastName;
    private String subject;
    private int yearsTeaching;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String aFirstName){
        firstName = aFirstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String aLastName){
        lastName = aLastName;
    }

    public String getSubject(){
        return subject;
    }

    public void setSubject (String aSubject){
        subject = aSubject;
    }

    public int getYearsTeaching (){
        return yearsTeaching;
    }

    public void setYearsTeaching(int aYearsTeaching) {
        yearsTeaching = aYearsTeaching;
    }


}
