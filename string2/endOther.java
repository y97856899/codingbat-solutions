public boolean endOther(String a, String b) {
    a=a.toLowerCase();
    b=b.toLowerCase();

    if(  a.endsWith(b) || b.endsWith(a)) return true;
    return false;
}
