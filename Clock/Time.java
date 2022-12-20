public class Time
{
   // add class variables here
    //private int time;
    private int hour;
    private int minute;
    /*
     * Sets the default time to 12:00.
     */
    public Time (){
      hour = 12;
      minute = 0;
    }
    
    /*
     * Sets hour to h and minute to m.
     */
    public Time (int h, int m)
    {
      if(h >= 1 && h<= 23){
        hour = h;
      }
      else{
        hour = 0;
      }
      if(m >= 1 && m <= 59){
        minute = m;
      }
      else{
        minute = 0;
      }
    }
    
    /*
     * Returns the time as a String of length 4 in the format: 0819.
     */
     public String toString ()
     {
       if(hour < 10){
         if(minute < 10){
           return("0" + hour + "0" + minute);
         }
         else{
           return("0" + hour + minute);
         }
       }
      if(minute < 10){
           return("" + hour + "0" + minute);
      }
      return("" + hour + minute);
     }
     /* - Returns the time as a String converted from military time to standard time. 
     For example, 0545 becomes 5:45 am and 1306 becomes 1:06 pm.
     */
     	public String convert()
      {
        String hold = " am";
        if(minute == 0){
          if(hour == 0){
            return("12:00" + hold);
          }
          if(hour == 12){
            hold = " pm";
            return("12:00" + hold);
          }
          if(hour > 12 && hour < 24){
            hold = " pm";
            return((hour % 12) + ":00" + hold);
          }
          return("" + hour + ":00" + hold);
        }
        if(hour == 0){
          return("12:" + minute + hold);
        }
        if(hour == 12){
          hold = " pm";
          return("12:" + minute + hold);
        }
        if(hour > 12 && hour < 24){
          hold = " pm";
          return((hour % 12) + ":" + minute + hold);
        }
        return("" + hour + ":" + minute + hold);
      }
      
     /*  - Advances the time by one minute. Remember that 60 minutes = 1 hour. 
     Therefore, if your time was 0359, and you add one minute, it becomes 0400. 
     2359 should increment to 0000.
     */
      public void increment()
      {
        if(minute == 59){
          minute = 0;
          hour++;
        }
        else{
          minute++;
        }
        if(hour >= 24){
          hour = 0;
        }
      }
}