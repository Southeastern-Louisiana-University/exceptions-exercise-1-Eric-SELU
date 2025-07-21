package chapter12;


import java.util.Scanner;

public class ReadData {
    public static void main(String[] args) throws Exception
    {
        // create a File Instance
        java.io.File myFile = new java.io.File("className.txt");
        // create Scanner for myFile
        Scanner scanner = new Scanner(myFile);
        String first = scanner.next();
        String middle = scanner.next();
        String last = scanner.next();
        int age = scanner.nextInt();
        System.out.println(first + " " + middle + " " + last + "age is " + age);
        }
    }
