import java.util.Date;
public class students {

		int osis_num;
		double fte;
		String last_name; 
		String first_name;
		int grade; 
		boolean never_attended;
		boolean sped;
		Date ats_admit_date;
		Date per_school_admit_date;
		Date ats_disc_date;
		Date per_school_disc_date;
		
		public students(
				int osis_num,
				double fte,
				String last_name,
				String first_name,
				int grade,
				boolean never_attended,
				boolean sped,
				Date ats_admit_date,
				Date per_school_admit_date,
				Date ats_disc_date,
				Date per_school_disc_date) {
			// TODO Auto-generated constructor stub
			this.osis_num = osis_num;
			this.fte = fte;
			this.last_name = last_name; 
			this.first_name =first_name ;
			this.grade = grade; 
			this.never_attended = never_attended;
			this.sped = sped;
			this.ats_admit_date = ats_admit_date;
			this.per_school_admit_date = per_school_admit_date;
			this.ats_disc_date= ats_disc_date;
			this.per_school_disc_date = per_school_disc_date;
		}
	}
