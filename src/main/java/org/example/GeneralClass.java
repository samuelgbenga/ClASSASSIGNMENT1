package org.example;

import org.example.enums.Gender;

public class GeneralClass {
        private  int noOfBoard;
        private  int noOfTables;
        private int noOfChairs;
        private int noOfStudents;
        private String nameOfTeacher;
        private int noOfFans;
        private Gender genderOfTeacher;



        public Gender getGenderOfTeacher() {
            return genderOfTeacher;
        }

        public void setGenderOfTeacher(Gender genderOfTeacher) {
            this.genderOfTeacher = genderOfTeacher;
        }

        public int getNoOfFans() {
            return noOfFans;
        }

        public void setNoOfFans(int noOfFans) {
            this.noOfFans = noOfFans;
        }

        public String getNameOfTeacher() {
            return nameOfTeacher;
        }

        public void setNameOfTeacher(String nameOfTeacher) {
            this.nameOfTeacher = nameOfTeacher;
        }

        public int getNoOfStudents() {
            return noOfStudents;
        }

        public void setNoOfStudents(int noOfStudents) {
            this.noOfStudents = noOfStudents;
        }

        public int getNoOfChairs() {
            return noOfChairs;
        }

        public void setNoOfChairs(int noOfChairs) {
            this.noOfChairs = noOfChairs;
        }

        public int getNoOfTables() {
            return noOfTables;
        }

        public void setNoOfTables(int noOfTables) {
            this.noOfTables = noOfTables;
        }

        public int getNoOfBoard() {
            return noOfBoard;
        }

        public void setNoOfBoard(int noOfBoard) {
            this.noOfBoard = noOfBoard;
        }

        @Override
        public String toString() {
            return "GeneralClass{\n" +
                    "noOfBoard=" + noOfBoard +
                    ",\nnoOfTables=" + noOfTables +
                    ",\nnoOfChairs=" + noOfChairs +
                    ",\nnoOfStudents=" + noOfStudents +
                    ",\nnameOfTeacher='" + nameOfTeacher + '\'' +
                    ",\nnoOfFans= " + noOfFans +
                    ",\ngenderOfTeacher= " + genderOfTeacher +
                    "\n}";
        }



    }


