package lab1;
import java.util.Scanner;

public class VowelCopy {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] inputChars = new char[30];
        char[] vowelChars = new char[30];
        int[] vowelCounts = new int[5];
        int[] vowelIndices = new int[5];

        System.out.print("Enter a string to a maximum length of 30: ");
        String inputStr = input.nextLine();

        // check if input string length is greater than 30
        if (inputStr.length() > 30) {
            System.out.println("The string is too long. Please enter again.");
            System.exit(0);
        }

        inputChars = inputStr.toCharArray();
        int vowelIndex = 0;

        for (int i = 0; i < inputChars.length; i++) {
            char currentChar = inputChars[i];
            if (isVowel(currentChar)) {
                vowelChars[vowelIndex] = currentChar;
                vowelCounts[getVowelIndex(currentChar)]++;

                if (vowelIndices[getVowelIndex(currentChar)] == 0) {
                    vowelIndices[getVowelIndex(currentChar)] = vowelIndex;
                }

                vowelIndex++;
            }
        }

        System.out.print("The output of the second array is:\n");
        for (int i = 0; i < vowelIndex; i++) {
            System.out.print(vowelChars[i]);
        }
        System.out.println();

        System.out.print("The counts are as follows:\n");
        System.out.printf("a=%d\ne=%d\ni=%d\no=%d\nu=%d\n", vowelCounts[0], vowelCounts[1], vowelCounts[2],
                vowelCounts[3], vowelCounts[4]);

        System.out.print("The index of the second array where each vowel first appeared:\n");
        for (int i = 0; i < 5; i++) {
            char vowel = getVowelChar(i);
            int index = vowelIndices[i];
            if (index != 0) {
                System.out.printf("%c = %d\n", vowel, index);
            } else {
                System.out.printf("%c is not in the input\n", vowel);
            }
        }
    }

    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static int getVowelIndex(char c) {
        if (c == 'a') {
            return 0;
        } else if (c == 'e') {
            return 1;
        } else if (c == 'i') {
            return 2;
        } else if (c == 'o') {
            return 3;
        } else {
            return 4;
        }
    }

    public static char getVowelChar(int i) {
        if (i == 0) {
            return 'a';
        } else if (i == 1) {
            return 'e';
        } else if (i == 2) {
            return 'i';
        } else if (i == 3) {
            return 'o';
        } else {
            return 'u';
        }
    }
}
