package stringAssignments;

public class DeleteConsonants {
    public static void main(String[] args) {
        String str = "Hello,have a good day";
        String result = removeConsonants(str);
        System.out.println(result);
    }
    public static String removeConsonants(String input)
    {
        return input.replaceAll("[b-df-hj-np-tv-zB-DF-HJ-NP-TV-Z]", "");
    }
}
