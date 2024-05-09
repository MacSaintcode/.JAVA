package onlinecode;

class stringedit {
    
    public static String insertString(String originalString, String stringToBeInserted, int index) {
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < originalString.length(); i++) {
            newString.append(originalString.charAt(i));
            if (i == index) {
                newString.append(stringToBeInserted);
            }
        }
        return newString.toString();
    }

    public static void main(String[] args) {
        String originalString = "GeeksGeeks";
        String stringToBeInserted = "For";
        int index = 4;
        String modifiedString = insertString(originalString, stringToBeInserted, index);
        System.out.println("Modified String: " + modifiedString);
    }
}
