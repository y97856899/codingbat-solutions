public String withoutX2(String str) {
    if (str == null|| str.length( )==0) return str;
    
    String result="";
    if (str.length()>= 1) {
        if (str.charAt(0)!='x') 
            result+= str.charAt(0);
        
    }
    
    if (str.length() >= 2) {
        if (str.charAt(1)!='x') 
            result += str.charAt(1);
        
    }
    
    if (str.length()>2) {
      result +=str.substring(2);
    }
    return result;
}