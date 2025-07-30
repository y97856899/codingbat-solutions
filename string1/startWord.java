public String startWord(String str, String word) {
  if (str.length()>= word.length()) {
    String a = str.substring(1, word.length());
    String b = word.substring(1);
    if (a.equals(b)) return str.substring(0, word.length());

  }
  return "";
}
