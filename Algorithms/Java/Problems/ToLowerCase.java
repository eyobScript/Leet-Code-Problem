public class ToLowerCase {
        public String toLowerCase(String s) {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                char character = s.charAt(i);
                int asciiValue = (int) character;

                // Check if the character is uppercase
                if (asciiValue >= 65 && asciiValue <= 90) {
                    char lowercase = (char) (asciiValue + 32); // Convert to lowercase
                    result.append(lowercase); // Append lowercase character
                } else {
                    result.append(character); // Append unchanged character
                }
            }

            return result.toString(); // Return the resulting String
        }

    public static void main(String[] args) {
        // Create an instance of the ToLowerCase class
        ToLowerCase toLowerCase = new ToLowerCase();

        // Test the toLowerCase method
        String input = "Hello WORLD!";
        String output = toLowerCase.toLowerCase(input);

        // Print the result
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);

    }
}
