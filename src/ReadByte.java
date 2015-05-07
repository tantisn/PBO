import java.io.*;
class ReadByte {
public static void main (String args []) throws IOException {
byte data [] = new byte [10];
System.out.println("Enter Some Characters : ");
System.in.read(data); // read an array bytes from key board
System.out.print("You Entered : ");
for(int i=0; i <data.length;i++)
System.out.print((char) data[i]);
}
}