package org.example;

import org.example.enums.Gender;

public class JavaClass extends GeneralClass{

    private String projectorName;
    private int noOfComputer;
    private String teacherStack;
    private boolean isIntellij;


    public boolean isIntellij() {
        return isIntellij;
    }

    public void setIntellij(boolean intellij) {
        isIntellij = intellij;
    }

    public String getTeacherStack() {
        return teacherStack;
    }

    public void setTeacherStack(String teacherStack) {
        this.teacherStack = teacherStack;
    }

    public int getNoOfComputer() {
        return noOfComputer;
    }

    public void setNoOfComputer(int noOfComputer) {
        this.noOfComputer = noOfComputer;
    }

    public String getProjectorName() {
        return projectorName;
    }

    public void setProjectorName(String projectorName) {
        this.projectorName = projectorName;
    }


    @Override
    public String toString() {
        GeneralClass generalClass = new GeneralClass();
        generalClass.setGenderOfTeacher(getGenderOfTeacher());
        generalClass.setNameOfTeacher(getNameOfTeacher());
        generalClass.setNoOfBoard(getNoOfStudents());
        generalClass.setNoOfChairs(getNoOfChairs());
        generalClass.setNoOfFans(getNoOfFans());
        generalClass.setNoOfTables(getNoOfTables());

        return "JavaClass{\n" +
                "projectorName='" + projectorName + '\'' +
                ",\nnoOfComputer=" + noOfComputer +
                ",\nteacherStack='" + teacherStack + '\'' +
                ",\nisIntellij=" + isIntellij +
                ",\ngeneralClass= "+generalClass+
                ",\n" +  + '\'' +
                "\n}";
    }
//
//    public void setGeneralClass(GeneralClass generalClass) {
//        this.generalClass = generalClass;
//    }
//
//    public GeneralClass getGeneralClass(){
//        return generalClass;
//    }
}