public String endUp(String str) {
  if (str.length()<3) return str.toUpperCase();
  String last = str.substring(str.length()-3,str.length());
  String first = str.substring(0,str.length()-3);
  return first+last.toUpperCase();
  

}
