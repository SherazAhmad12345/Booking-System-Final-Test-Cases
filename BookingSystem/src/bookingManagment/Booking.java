package bookingManagment;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Booking {
  private String bookingID;
  private Date date;
  private String userID;
  private String startTime;
  private String endTime;
  private String roomID;
  private double depositPaid;
  private double totalCost;
  private double hourlyRate;
  private boolean checkedIn;

  public Booking(String userID, String roomID, String bookingID, Date date, String startTime, String endTime, double depositPaid, double totalCost, double hourlyRate)
  {
	  this.userID = userID;
	  this.roomID = roomID;
	  this.bookingID = bookingID;
	  this.date = date;
	  this.startTime = startTime;
	  this.endTime = endTime;
	  this.depositPaid = depositPaid;
	  this.totalCost = totalCost;
	  this.hourlyRate = hourlyRate;
	  this.checkedIn = false;
  }
  
  public String getUserID()
  {
	  return userID;
  }
  
  public String getRoomID()
  {
	  return roomID;
  }
  
  public String getBookingID()
  {
	  return bookingID;
  }
  
  public Date getDate()
  {
	  return date;
  }
  
  public String getStartTime()
  {
	  return startTime;
  }
  
  public String getEndTime()
  {
	  return endTime;
  }
  
  public void setEndTime(String endTime)
  {
	  this.endTime = endTime;
  }
  
  public double getDepositPaid()
  {
	  return depositPaid;
  }
  
  public double getHourlyRate()
  {
	  return hourlyRate;
  }
  
  public double getTotalCost()
  {
	  return totalCost;
  }

  //True if "now" falls within this booking's reserved date/time window
  public boolean isActiveAt(Date now)
  {
	  Calendar start = Calendar.getInstance();
	  start.setTime(date);
	  applyTimeOfDay(start, startTime);

	  Calendar end = Calendar.getInstance();
	  end.setTime(date);
	  applyTimeOfDay(end, endTime);

	  return !now.before(start.getTime()) && !now.after(end.getTime());
  }

  //a booking can only be cancelled before it starts
  public boolean hasStarted(Date now)
  {
	  return !now.before(combineDateAndTime(date, startTime));
  }

  //a booking can only be extended before it ends
  public boolean hasExpired(Date now)
  {
	  return now.after(combineDateAndTime(date, endTime));
  }

  public static Date combineDateAndTime(Date date, String hhmm)
  {
	  Calendar calendar = Calendar.getInstance();
	  calendar.setTime(date);
	  applyTimeOfDay(calendar, hhmm);
	  return calendar.getTime();
  }

  public boolean isCheckedIn()
  {
	  return checkedIn;
  }

  public void setCheckedIn(boolean checkedIn)
  {
	  this.checkedIn = checkedIn;
  }

  //deposit is lost if user doesn't scan into the room within 30 min of the start time
  public boolean isDepositForfeited(Date now)
  {
	  if (checkedIn)
	  {
		  return false;
	  }

	  Calendar deadline = Calendar.getInstance();
	  deadline.setTime(date);
	  applyTimeOfDay(deadline, startTime);
	  deadline.add(Calendar.MINUTE, 30);

	  return now.after(deadline.getTime());
  }

  private static void applyTimeOfDay(Calendar calendar, String hhmm)
  {
	  String[] parts = hhmm.split(":");
	  calendar.set(Calendar.HOUR_OF_DAY, Integer.parseInt(parts[0]));
	  calendar.set(Calendar.MINUTE, Integer.parseInt(parts[1]));
	  calendar.set(Calendar.SECOND, 0);
	  calendar.set(Calendar.MILLISECOND, 0);
  }

  @Override
  public String toString()
  {
	  String base = roomID + " on " + new SimpleDateFormat("MM/dd/yy").format(date) + " " + startTime + "-" + endTime;
	  if (checkedIn)
	  {
		  return base + " [checked in]";
	  }
	  if (isDepositForfeited(new Date()))
	  {
		  return base + " [deposit lost]";
	  }
	  return base;
  }

  //For testing purposes only.
  
  public void setDate(Date date)
  {
	  this.date = date;
  }

}
