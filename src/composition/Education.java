/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composition;

import java.util.Arrays;

/**
 *
 * @author simeonkakpovi
 */
public class Education {
    
    private String[] schools;
    
    
    public String[] getEducation(){
        return schools;
    }
    
    public void setEducation(String[] schools){
        this.schools = schools;
    }
    
    @Override
    public String toString(){
        return "\nEducation: " + Arrays.toString(schools);
    }
    
}
