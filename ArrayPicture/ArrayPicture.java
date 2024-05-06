import  java.io.*;
  
  /*
  Jayden Fitts
  CSCE 111
  Writing file example, in a method.
  Creating ppm File output.ppm

  install Name: PBM/PPM/PGM Viewer for Visual Studio Code
  Id: ngtystr.ppm-pgm-viewer-for-vscode
  Description: PBM/PPM/PGM Viewer for Visual Studio Code
  Version: 1.1.5
  Publisher: ngtystr
  
  */
public class ArrayPicture {
    public static void main(String[] args) {
    //set the size of your square 600.
        int mySize = 600;
        //build 3 parallel arrays. You can rename them if you want.
        int[][] red = new int[mySize][mySize];
        int[][] green = new int[mySize][mySize];
        int[][] blue = new int[mySize][mySize];
        //and idea for createing colors  - Maroon
        int maroonR = 88;
        int maroonG = 0;
        int maroonB = 0;
        // and here is White.
        int whiteR = 255;
        int whiteG = 255;
        int whiteB = 255;

        // your code here
        // Fill the arrays using loops, equations,
        // user input for color choices (validate data if you do this)
        // or use methods to do this.
        // Hint, fill with one color, then overwrite certian areas with
        // another color.
        for (int i = 0; i < mySize; i++) {
            for (int j = 0; j < mySize; j++) {
                red[i][j] = 0;
                green[i][j] = 0;
                blue[i][j] = 200;
            }
        }
        for (int i = 350; i < mySize; i++) {
            for (int j = 0; j < mySize; j++) {
                red[i][j] = 194;
                green[i][j] = 178;
                blue[i][j] = 128;
            }
        }
        for (int i = 50; i < 100; i++) {
            for (int j = 50; j < 100; j++) {
                red[i][j] = 255;
                green[i][j] = 255;
                blue[i][j] = 0;
            }
        }
        for (int i = 400; i < 450; i++) {
            for (int j = 500; j < 510; j++) {
                red[i][j] = 0;
                green[i][j] = 255;
                blue[i][j] = 0;
            }
        }




        // when arrays are filled, send them to writeFile
        writeFile(red, green, blue, "C");

        // convert your image to gray scale (Black and white)

        //your Gray code here
        for (int i = 0; i < mySize; i++) {
            for (int j = 0; j < mySize; j++) {
                red[i][j] = ((int)(0.3 * red[i][j]) + (int)(0.59 * green[i][j]) + (int)(0.11 * blue[i][j]));
                green[i][j] = ((int)(0.3 * red[i][j]) + (int)(0.59 * green[i][j]) + (int)(0.11 * blue[i][j]));
                blue[i][j] = ((int)(0.3 * red[i][j]) + (int)(0.59 * green[i][j]) + (int)(0.11 * blue[i][j]));
            }
        }

        // when arrays are filled, send them to writeFile
        writeFile(red, green, blue, "G");
    }//end main

    // do not change anything below this line, but feel free to read it and learn.

/**
 * Given 3 parallel arrays, Writefile will write an output
 * file in PPM format that can be viewed with a ppm viewer.
 * All 3 arrays must be the same size.
 * @param r 2 dimentional array of integers from 0 - 255
 * @param g 2 dimentional array of integers from 0 - 255
 * @param b 2 dimentional array of integers from 0 - 255
 * you do not need to edit this method
 */
    public static void writeFile(int[][] r, int[][] g, int[][] b, String outputType) {
        //the output will be based on the array size sent.
        int size = r.length;
        //pixel will store the color to be output to the file.
        String pixel;
        try {
            //open a file in the current directory. will overwrite
            //previous versions.
            String fileName = "output"+outputType+".ppm";
            File output = new File(fileName);
            FileWriter fw = new FileWriter(output);
            //create the header of PPM files.
            fw.write("P3\n"+ size + " " + size +"\n255\n");
            //write out all pixels from the RGB arrays.
            for (int i = 0; i < size ; i++) {
                for (int j = 0; j < size ; j++) {
                    pixel = String.format("%d %d %d ",r[i][j], g[i][j], b[i][j]);
                    fw.write(pixel);
                }//end for j
            }//end for i
            fw.close();
        }
        catch(Exception e) {
            System.out.println("Error writing file.");
        }//end try catch

  	} // end writeFile2
  }  // end class
