package finalProject;

public class PaliReverseString extends MenuControl
{
    public static boolean checkPalindrome(String userInput)
    {
        String reversed;
        //storing input and reversed string

        //userInput = ConsoleIO.getString("Hi this is reverse string palindrom! Enter a palindrome string: ");
        String input = userInput.replaceAll("[^a-zA-Z]","");
        //replace all non characters with nothing
        input = input.toLowerCase();
        //changes the string to lower case

        reversed = reverse(input);
        //reverses the the string

        return input.equals(reversed);
        
    }

    static String reverse(String input)
    {
        String reversed = "";
        //storing the reverse of the string
        for (int i = 0;i < input.length(); i++)
        {
            reversed = input.charAt(i) + reversed;
        }
        return reversed;
    }
}


