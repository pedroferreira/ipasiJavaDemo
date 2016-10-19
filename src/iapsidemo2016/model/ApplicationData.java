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
        this.students.add(new Student("Nelson Silva", "2160482"));
        this.students.add(new Student("pedro ferreira", "2121212"));
        this.students.add(new Student("dorin plamadeala", "2160473"));
        this.students.add(new Student("tiago francisco", "2160424")); 
        this.students.add(new Student("bruno leitão", "2160449")); 
        this.students.add(new Student("diogo carvalho", "2160454")); 
        this.students.add(new Student("andré paulo", "2160446")); 
        this.students.add(new Student("João Vieira ", "2160451"));
        this.students.add(new Student("Shane carreira ", "2160426"));
        this.students.add(new Student("andre correia","21212121"));
        this.students.add(new Student("leonardo santos", "2160425")); 
        this.students.add(new Student("cenas", "2160425")); 
        
        

    }

    public ArrayList<Student> getStudents() {
        return (ArrayList<Student>) students.clone();
    }
    
}
