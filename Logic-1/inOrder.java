public boolean inOrder(int a, int b, int c, boolean bOk) {
  if (b>a &&c>b) return true;
  else if (c>b && bOk==true) return true;
  else return false;
}
