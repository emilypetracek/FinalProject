
public class TimeTravelers
	{
		private String name;
		private int era;
		private String strengths;
		private String weaknesses;
		private int points;
	
		public TimeTravelers (String n, int e, String s, String w, int p)
		{
			n =name;
			e = era;
			s = strengths;
			w = weaknesses;
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

		

		public int getEra()
			{
				return era;
			}

		public void setEra(int era)
			{
				this.era = era;
			}

		public String getStrengths()
			{
				return strengths;
			}

		public void setStrengths(String strengths)
			{
				this.strengths = strengths;
			}

		public String getWeaknesses()
			{
				return weaknesses;
			}

		public void setWeaknesses(String weaknesses)
			{
				this.weaknesses = weaknesses;
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
