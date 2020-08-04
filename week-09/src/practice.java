import java.util.Scanner;
import java.util.*;
import java.io.*;
import java.math.*;


public class practice {
    /**
     * Auto-generated code below aims at helping you parse
     * the standard input according to the problem statement.
     **/

        public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            int L = 4;
            int H = 5;

            String T = "?M?KE";
            T = T.toLowerCase();

            String asciiLtrs = " #  ##   ## ##  ### ###  ## # # ###  ## # # #   # # ###  #  ##   #  ##   ## ### # # # # # # # # # # ### ### # # # # #   # # #   #   #   # #  #    # # # #   ### # # # # # # # # # # #    #  # # # # # # # # # #   #   # ### ##  #   # # ##  ##  # # ###  #    # ##  #   ### # # # # ##  # # ##   #   #  # # # # ###  #   #   #   ## # # # # #   # # #   #   # # # #  #  # # # # #   # # # # # # #    ## # #   #  #  # # # # ### # #  #  #       # # ##   ## ##  ### #    ## # # ###  #  # # ### # # # #  #  #     # # # ##   #  ###  #  # # # #  #  ###  #  ";
            String alph = "abcdefghijklmnopqrstuvwxyz?";
            int rowSize = 27 * L;
            
            for (int i = 0; i < H; i++) {
                StringBuilder line = new StringBuilder();
                for (int j = 0; j < T.length(); j++) {
                    int letterIndex;
                    if (Character.isLetter(T.charAt(j)) ){
                        letterIndex = alph.indexOf(T.charAt(j));
                    }else {
                        letterIndex = 26;
                    }
                    int shift = L * letterIndex;
                    int start = (rowSize * i) + shift;
                    int end = start + L;
                    line.append(asciiLtrs.substring(start,end));
                }
                System.out.println(line);
            }
        }
    }

