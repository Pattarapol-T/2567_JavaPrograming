
public class Book {
	private String title;
	private Auther auther;
	private int page;
	Book(String title,Auther auther,int page) {
		this.title = title;
		this.auther = auther;
		this.page = page;
	}
	Book(String title,Auther auther){
		/*this.title = title;
		this.auther = auther;
		this.page = 0;*/
		this(title,auther,0);
	}
	Book() {
		this.title = null;
		this.auther = null;
		this.page = 0;
	}
	public String getTitle() {
		return this.title;
	}
	public Auther getAuther() {
		return this.auther;
	}
	public void setpage(int page) {
		this.page = page;
	}
	public String getpage() {
		return title+" has "+page+"page wite by"+toString();
	}

}
