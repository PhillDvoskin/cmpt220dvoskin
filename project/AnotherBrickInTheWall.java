import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnotherBrickInTheWall {
	// pass an array of parameters without actually creating an array
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        String rows = input.nextLine();
        String bricks = input.nextLine();
        // make a list bricklist that will use the arrays to split them up using spaces and convert the values the user 
        // entered to store those values as integers into the list
        List<Integer> brickList = Arrays.asList(bricks.split(" ")).stream().map(i -> Integer.parseInt(i)).collect(Collectors.toList());
        // make a loop variable that will split up the rows and count the first element of the array
        int loop = Integer.parseInt(rows.split(" ")[0]);
        // make a wall length variable that will split up the numbers for the length and check for the second element
        // of the array
        int walLength = Integer.parseInt(rows.split(" ")[1]);
        // make a temporary variable counter with value 0
        int counter =0;
        // make a variable for wallTrue that starts out as true
        boolean wallTrue = true;
        // while the look variable is greater than 0 and the statement is true
        while (loop > 0 && wallTrue) {
            //build length of wall
            int builtLength = 0;
            // iterate through i using the counter variable and the size from list
            for (int i=counter;i<brickList.size();i++) {
                counter = i+1;
                // pass the value of i to length
                int length = brickList.get(i);
                builtLength += length;
                // if the wall length is equal to buildLength then break the code and go to the outer loop
                if(builtLength == walLength){
                    break;
                    // if the buildLength is greater than wallLength then pass the value of false to wallTrue
                    // and break out of the code
                }else if(builtLength > walLength){
                    wallTrue = false;
                    break;
                }
            }
            // iterate down each time the loop is run
            loop--;
        }
        // print out YES or NO for different values of wallTrue
        System.out.println(wallTrue ? "YES" : "NO");
    }
}