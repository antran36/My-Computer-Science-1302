public class TimeSpan implements Comparable<TimeSpan>

 {
	private int hours;
	private int minutes;

	public TimeSpan(int hours, int minutes)
	{
		this.hours= 0;
		this.minutes= 0;
		add(hours,minutes);
	}
	public void add(int hours, int minutes)
	{
		if(hours<0 || minutes <0)
		{
			throw new IllegalArgumentException();
		}
		this.hours += hours;
		this.minutes += minutes;

		this.hours += this.minutes/60;
		this.minutes = this.minutes %60;
	}
	public String toString() {
		return hours +"h " + minutes +"m";
	}
/**
 the method compare timespan object with another timespan 
 @param timespanobject
 @return int
*/
 public int compareTo(TimeSpan other) {
	if(hours > other.hours)
	{
		return 1;
	}
	else if(hours == other.hours)
	{
		if(minutes == other.minutes){

			return 0;
		}
		if(minutes > other.minutes)
			{
				return 1;
			}
			if(minutes < other.minutes)
			{
				return -1;
			}
	}
		return -1;
	}
}

	
