package inputprocessingoutput;

public class PrintingQuotes {
    public static void main(String[] args) {

        String s1 = "We should love one another.";
        String s2 = "Well, who said this? ";
        String s3 = "Jesus";
        String s4 = "Jesus says: ";
        String s5 = "\"A new command I give you: Love one another. As I have loved you, so you must love one another" +
                ".\"";
        String s6 = s1 + "\n" + s2 + s3 + "\n" + s4 + s5;

        System.out.println(s6);

//        System.out.println(s1 + "\n" + s2 + " " + s3 + "\n" + s4 + s5 );
    }
}
