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
        this.students.add(new Student("luis morgado", "2160435"));        

        this.students.add(new Student("ricardo martinho", "2121213"));        
        this.students.add(new Student("aluno nome", "21112  22"));  
        this.students.add(new Student("Francisco Ronsani", "2160477"));   
    }

    public ArrayList<Student> getStudents() {
        return (ArrayList<Student>) students.clone();
    }
    
}
