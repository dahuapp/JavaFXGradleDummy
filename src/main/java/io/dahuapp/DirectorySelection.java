/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package io.dahuapp;

import java.io.File;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;
import java.util.logging.Logger;

/**
 *
 * @author Jean-Baptiste
 */
public class DirectorySelection {
    
    private File file;
    private DirectoryChooser directoryChooser = new DirectoryChooser();
    private Stage parent ;
    
    
    public DirectorySelection(Stage primaryStage) {
        
        parent = primaryStage ;
    }
    
    public void start() {
         
        parent.setTitle("Select Directory");
                //Open directory from existing directory
                if(file != null){
                    File existDirectory = file.getParentFile();
                    directoryChooser.setInitialDirectory(existDirectory);
                }
                 
                //Show open file dialog
                file = directoryChooser.showDialog(null);      
    }
    
    String getDir() {
        return file.getAbsolutePath() + "/";
    }
}
