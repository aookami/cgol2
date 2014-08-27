/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.gameoflife;

import static java.lang.Integer.parseInt;
import java.util.Random;

/**
 *
 * @author Bruno
 */
public class Matrix{

        int size;
        int[][] mata;

       
        int[][] matb;
        
        public Matrix(int size){
            this.size = size;
            this.mata = new int[size+2][size+2];
            this.matb = new int[size+2][size+2];
        }
        public void LifeCo(int x, int y){
            if(x > 0 && y > 0 && x<=size && y <=size){
                mata[x][y] = 1;
                matb[x][y] = 1;
            }
            else
                throw new IllegalArgumentException("OutOfBoundsCoord");
        }
        public void processString(String line){
            
            String[] strr = new String[5000];      

            int i = 0;
            strr =  line.split(":");
            
            
            for(int j = 0; j < strr.length-1; j = j+2){
              int x, y;
              
              x = parseInt(strr[j]);
              y = parseInt(strr[j+1]);
              LifeCo(x,y);
            }
        }
        public void setRandomString(int msize, int pop){
            String output = "";
            int randomNum;
    
            Random rand = new Random();
            for(int i = 0; i<pop; i++){
                for(int j = 0; j<2; j++){             
                    //randomNum = 0 + (int)(Math.random()*msize);
                    randomNum = Math.abs(rand.nextInt(msize)+1);
                   
                    
                    output += randomNum + ":";
                    
                }
                
            }
            output = output.substring(0,pop-2);
            processString(output);
            
            
        }
        public String Print(){
                String output = "";
                
                    for(int i = 1; i<=size;i++){
                        for(int j = 1; j<=size;j++){
                            if(matb[j][i] == 0)
                                output +=(" " + "\u25A1");
                            else
                                output +=(" " + "\u25A0");
                        }
                        output+= "\n";
                    }        
                output+= "\n";
          
                return output;
            }  
        
    }
