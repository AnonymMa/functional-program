package ch01.sec02;

public interface I4 {
    private static String getPrefix(String p) {
        return p.equals("male") ? "Mr." : "Ms.";
    }

    public static String getName(String n, String p) {
        return getPrefix(p) + n;
    }
}
