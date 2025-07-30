public String left2(String str) {
  if (str.length()<3)return str;
  String a = str.substring(0,2);
  String b = str.substring(2,str.length());
  return b+a;
  
}
