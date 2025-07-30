public String alarmClock(int day, boolean vacation) {
  if ((day==0 || day==6 )&& vacation == true ){
    return "off";
  }else if ((day==0 || day==6 )&& vacation == false )return "10:00";
  else if (vacation == true) return "10:00";
  else return "7:00";
}
