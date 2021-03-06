package beans;

import java.io.Serializable;

public class SummarisedPost implements Serializable {
	
	private int postId;
	private String title;
	private String date;
	private String odate;
	private String fname;
	private String lname;
	private String summary;
	
	public SummarisedPost() {}

	public SummarisedPost(int postId, String title, String date, String fname, String lname, String summary) {
		this.postId = postId;
		this.title = title;
		this.date = date;
		this.fname = fname;
		this.lname = lname;
		this.summary = summary;
	}

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		if(lname == null)
			return "";
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getSummary() {
		if(summary == null)
			return "";
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}
	
	private String getOrdinalSuffixOf(int i) {
		
	    int j = i % 10;
	    int k = i % 100;
	    
	    if (j == 1 && k != 11) {
	        return i + "st";
	    }
	    if (j == 2 && k != 12) {
	        return i + "nd";
	    }
	    if (j == 3 && k != 13) {
	        return i + "rd";
	    }
	    
	    return i + "th";
	}

	public String getOdate() {
		
		String d = date;
		
		String yy = d.substring(0, d.indexOf('-'));
		String mm = d.substring(d.indexOf('-') + 1, d.lastIndexOf('-'));
		String dd = d.substring(d.lastIndexOf('-') + 1);
		
		String months[] = new String[] {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		
		String rd = getOrdinalSuffixOf(Integer.parseInt(dd)) + " " + months[Integer.parseInt(mm) - 1] + ", " + yy;

		return rd;
		
		
	}

	
	
	

}
