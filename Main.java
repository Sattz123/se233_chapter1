import java.io.*;
import java.nio.file.*;
import java.util.List;
import java.util.Scanner;

/* My idea of this assignments
    in Main.java File
    1. Read csv file and separate all the data in to their types (see example as ADT assignment Data.java or Programming Assignment 2)
    2. Type the data that want to write in to their types.
    3. Use example like this:
       String filePath = "path/to/your/file.txt";  // Change to your file path
        String newLine = "This is the new line to insert.";
        int insertAfterLine = 570;

        try {
            // Read all lines from the file
            List<String> lines = Files.readAllLines(Paths.get(filePath));

            // Check if the file has at least insertAfterLine lines
            if (insertAfterLine >= lines.size()) {
                // If the file has fewer lines, append at the end
                lines.add(newLine);
            } else {
                // Insert new line after the specified line (570 is index 569 since list is 0-based)
                lines.add(insertAfterLine, newLine);
            }

            // Write the updated content back to the file
            Files.write(Paths.get(filePath), lines);
       Finish read and write in to their types and specific lines.

       in UniData.java file
       Just output the file

 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        File uniFile = new File("C:\\Users\\CAMT\\Documents\\stewie java\\New folder\\dbassignment1\\src\\2024 QS World University Rankings 1.1 (For qs.com).csv");

//        Scanner read = new Scanner(uniFile);
//        Path path = Paths.get("C:\\Users\\CAMT\\Documents\\stewie java\\New folder\\dbassignment1\\src\\2024 QS World University Rankings 1.1 (For qs.com).csv");
//
//        List<String> lines = Files.readAllLines(path);
//
//        lines.forEach(System.out::println);

        Scanner read = new Scanner(uniFile);
         for(int i=0; i<1; i++){
             read.nextLine();
         }

         while(read.hasNext()){
             String data = read.nextLine();
             System.out.println(data);
         }
         read.close();

        // FileReader fileRead = new FileReader(uniFile);
        // int ch;
        // while((ch = fileRead.read()) != -1){
        //     System.out.print((char)ch);
        // }
        // fileRead.close();
    } 
}