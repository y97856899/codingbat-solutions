public String deFront(String str) {    
  String res = "";
  if (str.length()>= 1&&str.charAt(0) == 'a')  res += 'a';
  
  if (str.length() >= 2 && str.charAt(1) == 'b') res += 'b';
  if (str.length() > 2) res += str.substring(2);
  

  return res;

}
