import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
// import those classes which is use in this program.
 
class aaa{
	
public static void main(String agr[])throws IOException{
	
File f1=new File("filecsv.csv");                 // CSV FILE
FileReader f= new FileReader(f1);
BufferedReader br= new BufferedReader(f);
String s;                                              
s=br.readLine();                 
// This will read the file data row by row(line by line).

 while(s!= null){
// this loop read each single line of file.

String f2,k;
f2=s.replace('[','@');
k=f2.replace(']','*');
// Replace '[' , ']' those characters by any unused special charcters(symbol) which is not in your csv file.

 String[] arrOfStr = k.split("[,@*]+");  
 /* this will split @,* which is inside the split([,write those charcter you want to split in string]+); 
 syntax  inside [ ]+  
 */
        for (String a : arrOfStr) {
            System.out.println(a); 
    } 
	/* now, this loop display each row without [ ] and then, you can use " a variable " where you want */ 

s=br.readLine();
 // this will continue the reading of file untill null not found
 }
}
}