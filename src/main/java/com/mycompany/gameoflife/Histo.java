/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.gameoflife;

/**
 *
 * @author Bruno
 */
public class Histo{
        int gen;
        int size;
        int[][][] history;
            
            public Histo(Matrix state, int gen){
                this.gen = gen;
                this.size = state.size;
                history = new int[gen][state.size+2][state.size+2];
            }
            public String Print(int a, int b){
                String output = "";
                for(int l = a; l <= b; l++){
                    for(int i = 1; i<=size;i++){
                        for(int j = 1; j<=size;j++){
                            if(history[l][j][i] == 0)
                                output +=(" " + "\u25A1");
                            else
                                output +=(" " + "\u25A0");
                        }
                        output+= "\n";
                    }        
                output+= "\n";
                }
                return output;
            }  
        
            
            
    }
