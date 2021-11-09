
public class TimePeriod
	{
		private String name;
		private int dateStart;
		private int dateEnd;
		private int points;
		
		public TimePeriod(String n, int s, int e, int p)
		{
			n = name;
			s = dateStart;
			e = dateEnd;
			p = points; 
		}

		public String getName()
			{
				return name;
			}

		public void setName(String name)
			{
				this.name = name;
			}

		

		public int getDateStart()
			{
				return dateStart;
			}

		public void setDateStart(int dateStart)
			{
				this.dateStart = dateStart;
			}

		public int getDateEnd()
			{
				return dateEnd;
			}

		public void setDateEnd(int dateEnd)
			{
				this.dateEnd = dateEnd;
			}

		public int getPoints()
			{
				return points;
			}

		public void setPoints(int points)
			{
				this.points = points;
			}
	}
