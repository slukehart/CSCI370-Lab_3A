package com.example.advandedadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView student;
    private Student student1;
    private Student student2;
    private Student student3;
    private Student student4;
    private Student student5;




    private class Student {
        private String firstName;
        private String lastName;
        private String major;

        Student(String firstName, String lastName, String major) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.major = major;

        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getMajor() {
            return major;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setMajor(String major) {
            this.major = major;
        }
    }






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        student1 = new Student("Spencer", "Lukehart", "CITA");
        student2 = new Student("Matt", "Walt", "CSCI");
        student3 = new Student("Winston", "Churchill", "Politics");
        student4 =  new Student("Abraham", "Lincoln", "Math");
        student5 = new Student("George", "Washington", "Leadership");

        ArrayList<Student> studentArray = new ArrayList<>();
        studentArray.add(student1);
        studentArray.add(student2);
        studentArray.add(student3);
        studentArray.add(student4);
        studentArray.add(student5);



    }




}