package Day16.Thread;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTest {
  public static void main (String[] args) throws ParseException {
	Timer timer = new Timer();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	Date firstTime = sdf.parse("2022-06-22 14:30:00");
	timer.schedule(new LogTimerTask(), firstTime, 1000 * 5);
	
  }
}

class LogTimerTask extends TimerTask {
  
  @Override
  public void run () {
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	String strTime = sdf.format(new Date());
	System.out.println(strTime + " Data backup success!");
  }
}