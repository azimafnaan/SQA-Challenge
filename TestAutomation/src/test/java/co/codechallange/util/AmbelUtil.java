package co.codechallange.util;

public class AmbelUtil {
  public static final int Wait_Time = 200;
  public static final String Landing_Title= "Ambel - Your Appointment Solution";

  public static void waitForSee(){
    try{
      Thread.sleep(15000);
    }
    catch(Exception e){
      e.printStackTrace();
    }
  }

}
