public String doubleChar(String str) {
  String result ="";
    for (int i=0;i<str.length();i++) {
        char c=str.charAt(i);
        result+=c;
        result+=c;
    }
    return result;
}
