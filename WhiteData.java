package chapter12;

public class WhiteData {
    public static void main(String[] args) throws java.io.IOException
    {
        java.io.File file = new java.io.File("className.txt");
        if(file.exists()){
            System.out.println("File exists already");
            System.exit(1);
        }
        // create a file
        java.io.PrintWriter outputFile = new java.io.PrintWriter(file);
        //write to file
        outputFile.print("Abe Bob Cal ");
        outputFile.println(25);
        outputFile.print("Dan Erl Fit ");
        outputFile.println(19);
        outputFile.close();


    }
}
