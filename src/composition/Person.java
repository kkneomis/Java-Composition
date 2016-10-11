/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composition;

/**
 *
 * @author simeonkakpovi
 */
//Person.java
public class Person {
//composition has-a relationship
    private String name;
    private Job job;
    private Education education;
    
    public Person(String name){
        this.name = name;
        this.job= new Job();
        this.job.setRole("Teacher");
        job.setSalary(1000);
        
        this.education= new Education();
        String[] schools= {"Howard", "Morehouse", "UMD", "Harvard", "USC", "GWU", "American", "MIT", "Morgan", "Tulane" };
        education.setEducation(schools);
    }
    
    public long getSalary() {
        return job.getSalary();
    }
    
    public String[] getEducation(){
        return education.getEducation();
    }
    
    
    @Override
    public String toString(){
        return "Name: " + this.name + education.toString() + " " + job.toString();
    }
    
}