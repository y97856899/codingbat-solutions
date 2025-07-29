public String backAround(String str) {
  if (str.length()<=1)return str+str+str;
  String last = str.substring(str.length()-1,str.length());
  return last +str +last;
  
}
