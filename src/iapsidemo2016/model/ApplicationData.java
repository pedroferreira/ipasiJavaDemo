/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iapsidemo2016.model;

import java.util.ArrayList;

/**
 *
 * @author romeu
 */
public class ApplicationData {
    
    private static final ApplicationData instance = new ApplicationData();

    public static ApplicationData getInstance() {
        return instance;
    }
    private ArrayList<Student> students;

    public ApplicationData(){      
        this.students = new ArrayList<>();
        
        this.students.add(new Student("pedro ferreira", "2121212"));
        this.students.add(new Student("dorin plammadeala", "2111222"));

    }

    public ArrayList<Student> getStudents() {
        return (ArrayList<Student>) students.clone();
    }
    
}
