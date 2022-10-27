import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;

/** ***************************************************
 *  Name:           Sveinson
 *  Class:          CS30S
 * 
 *  Assignment:     Loading from disk variations
 * 
 *  Description:    differnt ways to load an array from disk
 * 
 *************************************************************/

public class CS30SLoadArrayFromDiskVariations {

    public static void main(String[] args) throws IOException{
    // ***** constants *******
    
    // ***** variables *****
    
        String banner = "";             // output banner
        String prompt = "";             // prompt for user input
        
        String strin = "";              // string fro keyboard input
        String strout = "";             // string for formatted output
        
        String delim = "[ ]+";          // delimiter for splitting input records
        String[] tokens = null;         // used to split input records
        
        BufferedReader fin = null;      // declare the file input variable
        
        // a new line character that works on every computer system
        String nl = System.lineSeparator();
        
        int[] list = new int[500];       // an array of 10 ints
        int[] anotherList = new int[5];
        
        int count = 0;          // actual size the array
        int n = 0;              // int read from keyboard
        
        System.out.println("the array list is at " + list);
    
    // ***** objects *****
    
        Scanner scanner = new Scanner(System.in);
        //NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        // file io buffers for reading and writing to text files
        
        try{
            fin = new BufferedReader(new FileReader("arrayData.txt"));
        }catch(FileNotFoundException e){
            System.out.println("file not found");
        }
        //PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outfle.txt")));
    
    // ***** print banners *****
    
        banner = "*****************************" + nl;
        banner += "Name:        Sveinson" + nl;
        banner += "Class:       CS30S" + nl;
        banner += "Assignment:  Intro Array Example" + nl;
        banner += "*****************************" + nl + nl;
        
        System.out.println(banner);
        //fout.print(banner);
    
    // ***** Get Input *****
    // ***** Main Processing *****
    
        // populate the array
        // for(int i = 0; i < list.length; i++){
            // list[i] = i;
        // }// end for i =  (populate array)
        
        // load array from simple data file
        // count = 0;              // input item counter
        // strin = fin.readLine();
        
        // while(strin != null){
            // //System.out.println(strin);
            // list[count++] = Integer.parseInt(strin);
            
            // strin = fin.readLine();
        // }// end eof
        
        // load from a data file with n values per line
        count = 0;              // input item counter
        strin = fin.readLine();
        
        while(strin != null){
            //System.out.println(strin);
            tokens = strin.split(delim);
            //System.out.println(tokens.length);
            
            // loop over tokens
            for(int i = 0; i < tokens.length; i++){
                list[count] = Integer.parseInt(tokens[i]);
                count++;
            }// end for i
            
            strin = fin.readLine();
        }// end eof
        
        // print the array
        // for(int i : list){
            // System.out.println(i);
        // }// end for each
        printList(list, count);
        //printList(list);
        
        // add another pointer to the array in the heap
        // System.out.println(anotherList.length);
        // anotherList = list;
        // System.out.println(anotherList.length);
        // System.out.println(list);
        // System.out.println(anotherList);
        // System.out.println(anotherList[8]);
        // anotherList[8] = 123;
        // System.out.println(anotherList[8]);
        // System.out.println(list[8]);
        
        // load an array from keyboard
        // System.out.println("enter up to 10 numbers 0 to end.");
        
        // count = 0;      // counted 0 numbers so far
        
        // n = scanner.nextInt();      // read first int and prime the loop
        
        // while(n != 0 && count < list.length){
            // list[count] = n;
            // count++;
            // n = scanner.nextInt();
        // }// end while
        
        // // for(int i = 0; i < count; i++){
            // // System.out.println(list[i]);
        // // }// end for
        // printList(list, count);
    
    // ***** Print Formatted Output *****
    
    
    // ***** Closing Message *****
    
        System.out.println();
        System.out.println("end of processing");
        //fout.println("End of Processing");
        
    // **** close io buffers *****
    
        //fin.close();
        //fout.close();
    } // end main 
    
    // ****** static methods ******
    // print the entire list
    public static void printList(int[] l){
        for(int i : l){
            System.out.println(i);
        }// end for each
    }// print list
    
    // print only the filled part of the list
    public static void printList(int[] l, int length){
        for(int i = 0; i < length; i++){
            System.out.println(l[i]);
        }// end for
    }// end print partial list for
    
} // end FormatTemplate
