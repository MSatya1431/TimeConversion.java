import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result 
{

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s)
    {
    // Write your code here
        String[] tokens = s.split(":");
        int hour = Integer.parseInt(tokens[0]);
        int minute = Integer.parseInt(tokens[1]);
        int second = Integer.parseInt(tokens[2].substring(0, 2));
        String amPm = tokens[2].substring(2);
        if (amPm.equals("PM") && hour < 12)
        {
            hour += 12;
        }
        if (amPm.equals("AM") && hour == 12) 
        {
            hour = 0;
        }
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

}
public class Solution 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
