public String frontBack(String str) {
  if (str.length()<=1) return str;
  String front = str.substring(0,1);
  String mid = str.substring(1,str.length()-1);
  String last = str.substring(str.length()-1,str.length());
  return last+mid+front;
}
