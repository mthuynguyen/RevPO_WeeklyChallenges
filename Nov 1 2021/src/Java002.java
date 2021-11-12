public class Java002 {
    public static String pigLatin(String strInput) {
        StringBuilder strOut = new StringBuilder();
        for (String str : strInput.split("[ .]")) {
            if (str.length() <= 1) {
                strOut.append(str + (str.length()==1?"way ":""));
                continue;
            }
            switch (Character.toLowerCase(str.charAt(0))) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    strOut.append(str + "way ");
                    break;
                default:
                    strOut.append(
                        (str.charAt(0) >= 'A' && str.charAt(0) <= 'Z'?Character.toUpperCase(str.charAt(1)):str.charAt(1))
                        + (str.length() > 2?str.substring(2):"")
                        + Character.toLowerCase(str.charAt(0))
                        + "ay "
                    );
            }
        }
        strOut.deleteCharAt(strOut.length()-1);
        if (strInput.charAt(strInput.length()-1) > 0 && strInput.charAt(strInput.length()-1) < '0') strOut.append(".");
        return strOut.toString();
    }

    public static void main(String args[]) {
        System.out.println(pigLatin("Cats are great pets."));
        System.out.println(pigLatin("Tom got a small piece of pie."));
        System.out.println(pigLatin("He told us a very exciting tale."));
    }
}
