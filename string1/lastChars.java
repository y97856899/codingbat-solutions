public String lastChars(String a, String b) {
    if (a.equals("")) {
        if (b.equals("")) return "@" + "@";
        String last = b.substring(b.length()-1, b.length());
        return "@" + last;
    }
    String first = a.substring(0, 1);
    if (b.equals("")) return first + "@";
    String last = b.substring(b.length()-1, b.length());
    
    return first + last;
}
