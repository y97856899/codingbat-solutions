public String lastTwo(String str) {
  if (str.length()<2) return str;
  String a = str.substring(str.length()-2,str.length()-1);
  String b = str.substring(str.length()-1,str.length());
  String c = str.substring(0,str.length()-2);
  return c+b+a;
}
