/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class Script {
    
    File file;
    
    ArrayList<ScriptLine> scriptLines;
    
    ArrayList<String> comments;

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public ArrayList<ScriptLine> getScriptLines() {
        return scriptLines;
    }

    public void setScriptLines(ArrayList<ScriptLine> scriptLines) {
        this.scriptLines = scriptLines;
    }

    public ArrayList<String> getComments() {
        return comments;
    }

    public void setComments(ArrayList<String> comments) {
        this.comments = comments;
    }

    public Script(File file, ArrayList<ScriptLine> scriptLines, ArrayList<String> comments) {
        this.file = file;
        this.scriptLines = scriptLines;
        this.comments = comments;
    }
    
    

    
    
    
}
