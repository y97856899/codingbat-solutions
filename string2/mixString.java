public String mixString(String a, String b) {
  String result ="";
  int max =Math.max(a.length(),b.length());
  for (int i= 0;i<max;i++) {
    if (i <a.length()) 
      result +=a.charAt(i);
            
    if (i<b.length()) 
       result +=b.charAt(i);
            
  }
  return result;
}
