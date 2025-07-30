public boolean stringE(String str) {
  int count=0;
  for(char c : str.toCharArray()){
    if(c=='e') count ++;
    
  }
  if (count>3)return false;
  if (count<1)return false;
  return true;
}
