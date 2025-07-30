public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
  if (a<b && b<c && c>a )return true;
  else if (equalOk ==true &&a<=b && b<=c && c>=a )return true;
  else return false;
  
}
