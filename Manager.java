package one;


public class Manager {

	 private int mid;
	 private String mname;
	 private String mmail;
	 public int getMid() {
		 return mid;
	 }
	 public void setMid(int mid) {
		 this.mid = mid;
	 }
	 public String getMname() {
		 return mname;
	 }
	 public void setMname(String mname) {
		 this.mname = mname;
	 }
	 public String getMmail() {
		 return mmail;
	 }
	 public void setMmail(String mmail) {
		 this.mmail = mmail;
	 }
	 
	 public void display()
	 {
		 System.out.println(mid);
		 System.out.println(mname);
		 System.out.println(mmail);
	 }


}
