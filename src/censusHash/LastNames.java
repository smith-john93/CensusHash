package censusHash;

public class LastNames {

		private String name;
		private int rank;
		private String occurs;
		private String perHundred;
		private String perThousand;
		
		public LastNames() {
			setName(name);
			this.name = getName();
			setRank(rank);
			this.rank = getRank();
			setOccurs(occurs);
			this.occurs = getOccurs();
			setPerHundred(perHundred);
			this.perHundred = getPerHundred();
			setPerThousand(perThousand);
			this.perThousand = getPerThousand();
		}
		
		public int getRank() {
			return rank;
		}

		public void setRank(int rank) {
			this.rank = rank;
		}

		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public String getOccurs() {
			return occurs;
		}
		
		public void setOccurs(String occurs) {
			this.occurs = occurs;
		}
		
		public String getPerHundred() {
			return perHundred;
		}
		
		public void setPerHundred(String perHundred) {
			this.perHundred = perHundred;
		}
		
		public String getPerThousand() {
			return perThousand;
		}
		
		public void setPerThousand(String perThousand) {
			this.perThousand = perThousand;
		}
		
		@Override
		public String toString() {
			return "Last Name: " + name + "\n  Rank: " + rank + "\n  Occurs: " + occurs
					+"\n  Proportion per 100k: " + perHundred + "\n  Cumulative Proportion per 100k:  "
					+ perThousand;
		}

}
