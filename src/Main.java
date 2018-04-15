public class Main {

    public static void main(String[] args) {
        CrazyLogger cl = new CrazyLogger();
        cl.doLog("first log");
        cl.doLog("second log");
        cl.doLog("third log");
        cl.doLog("fourth log");

        System.out.println(cl);
    }
}
