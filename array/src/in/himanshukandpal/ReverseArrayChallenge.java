package in.himanshukandpal;

public class ReverseArrayChallenge {
    public static void main(String[] args) {
        String mainString = "abcdef";
        String reversedString = "";
        char[] string = mainString.toCharArray();
        for (int i=string.length-1;i>=0;i--){
            reversedString += string[i];
        }
        System.out.println("Main String: "+mainString);
        System.out.println("Reversed String: "+reversedString);
    }
}
