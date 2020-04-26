/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course;

/**
 *
 * @author HP
 */
public class Course {
    String courseName;
    Instructor instructor;
    Textbook textbook;
// Constructor
    public Course(String name, Instructor instr, Textbook text){
        this.courseName = name;
        this.instructor = instr;
        this.textbook = text;
    }
//    Methods
    public String getName(){
        return this.courseName;
    }
    public Instructor getInstructor(){
        return this.instructor;
    }
    public TextBook getTextbook(){
        return this.textbook;
    }
    public String toString(){
        String str = "------------------------------------------\n";
        str += "Course Name : " + this.courseName + "\n";
        str += "------------------------------------------\n";
        str += this.instructor.toString();
        str += "\n------------------------------------------\n";
        str += this.textbook.toString();
        str += "\n------------------------------------------";
        return str;
    }
}

