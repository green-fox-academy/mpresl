//import java.io.*;
//import java.math.*;
//import java.util.Scanner;
//
//public class asciiArt {
//    public static void main(String args[]) {
//        Scanner in = new Scanner(System.in);
//        int L = in.nextInt();
//        int H = in.nextInt();
//        if (in.hasNextLine()) {
//            in.nextLine();
//        }
//        String T = in.nextLine();
//        for (int i = 0; i < H; i++) {
//            String ROW = in.nextLine();
//            String letter = ROW.substring(20, 24);
//            System.out.println(letter);
//        }
//
//        // Write an answer using System.out.println()
//        // To debug: System.err.println("Debug messages...");
//
//        System.out.println("answer");
//    }
//}
//class Program
//{
//    static void Main(string[] args)
//    {
//// Declare an array containing the alphabet and “?”
//        string[] tableauAlphabet = new string[] { “a”, “b”, “c”, “d”, “e”, “f”, “g”, “h”, “i”, “j”, “k”, “l”, “m”, “n”, “o”, “p”, “q”, “r”, “s”, “t”, “u”, “v”, “w”, “x”, “y”, “z”, “?” };
//
//        // The width of each character in ASCII art
//        int L = int.Parse(Console.ReadLine());
//
//        // The height of each character in ASCII art
//        int H = int.Parse(Console.ReadLine());
//
//        // The string to convert in ASCII art
//        string T = Console.ReadLine();
//
//        // An array which will contain the letters in ASCII art
//        string[] tableauASCII = new string[27*H];
//
//        // An array to store the index in tableauAlphabet of each letter of the string to convert
//        int [] indexT = new int[T.Length];
//
//        for (int i = 0; i < H; i++)
//        {
//            string ROW = Console.ReadLine();
//
//
//            // Storing each letter ASCII Art in an array
//            //-> example : for character "A" the 1st line is in tableauASCII[0]
//            //                               the 2nd line is in tableauASCII[27]
//            //                               the 3rd line is in tableauASCII[54], etc.
//            for (int j = 0; j<(27); j++)
//            {
//                tableauASCII[(27*i) + j] = ROW.Substring(j * L, (L));
//            }
//
//        }
//
//        // Lowering all the characters of the string passed
//        string TtoLower = T.ToLower();
//
//        // Declaring a positioning variable for the string to convert, will allow us to store index for identical characters in the string
//        int a = -1;
//
//        // Check if every character of the string exists in the tableauAlphabet, and store the index found in an array indexT
//        foreach(char c in TtoLower)
//        {
//            // Incrementing the variable of position foreach character treated
//            a++;
//
//            // converting the character to a string to use the .Contains method
//            string caractère = c.ToString();
//
//            // check if the character exists in the array
//            if (tableauAlphabet.Contains(caractère))
//            {
//                // if he is, we store the index found in the indexT array
//                indexT[TtoLower.IndexOf(c,a)] = Array.IndexOf(tableauAlphabet, caractère);
//            }
//            // Otherwise, we store the index of the "?" character
//            else
//                indexT[TtoLower.IndexOf(c,a)] = 26;
//        }
//
//        // We use the array indexT, containing the index of each character in the string to convert, to get and pass the ASCII Art lines corresponding
//        for (int k = 0; k < H; k++)
//        {
//            Console.WriteLine();
//            for(int l = 0; l < T.Length; l++)
//            {
//                Console.Write(tableauASCII[(indexT[l] + k * 27)]);
//            }
//        }
//
//    }
//}