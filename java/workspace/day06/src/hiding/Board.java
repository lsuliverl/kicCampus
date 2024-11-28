package hiding;

public class Board {
	private int number;
	private String title;
	private String contents;
	private String writer;
	private int views; 
	private String date;
	
	public Board( int number, String title, String contents, String writer,
			int views, String date ) {
		this.number = number;
		this.title = title;
		this.contents = contents;
		this.writer = writer;
		this.views = views;
		this.date = date;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	
}
