public String right2(String str) {
  if (str.length()<3)return str;
  String a = str.substring(0,str.length()-2);
  String b = str.substring(str.length()-2,str.length());
  return b+a;
}
