package project1;

public class CooCooClock {
    public static void main(String[] args) {
        System.out.println(cuckooClock("03:38", 1));
    }


        public static String cuckooClock(String inputTime, int chimes) {
           int hourStart = Integer.parseInt(inputTime.substring(0, 2));
           int minStart = Integer.parseInt(inputTime.substring(3));
           while(chimes > 0) {
               for (int hours = hourStart; hours <=12 ; hours++) {
                   for (int mins = minStart / 15 ; mins < 4 ; mins++) {
                       int adding = 0;
                       if (mins > 0) adding = 1;
                            else if (mins ==  0) adding = hours;
                       if (minStart % 15 != 0) {adding = 0;
                       minStart = 0;}
                        chimes = chimes - adding;
                        if (chimes <= 0) {
                            inputTime = ((hours<10)?"0"+hours:hours) + ":" + ((mins==0)?"00": mins*15);
                            break;
                        }
                   }
                   minStart = 0;
                   if (chimes <= 0) break;
               }
               hourStart = 1;
            }
            return inputTime;
        }
}
