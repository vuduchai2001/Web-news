package Entity;

public class TinTuc {
	private int ID;
	private String caption;
	private String image;
	private String category;
	private boolean trending;
	private String date;
	private String detailssss;
	public String getDetailssss() {
		return detailssss;
	}
	public void setDetailssss(String detailssss) {
		this.detailssss = detailssss;
	}
	public TinTuc(int iD, String caption, String image, String category, boolean trending, String date, String details) {
		ID = iD;
		this.caption = caption;
		this.image = image;
		this.category = category;
		this.trending = trending;
		this.date = date;
		this.detailssss = details;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public TinTuc() {
		
	}
	@Override
	public String toString() {
		return "TinTuc [ID=" + ID + ", caption=" + caption + ", image=" + image + ", trending=" + trending + ", date="
				+ date + "]";
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getCaption() {
		return caption;
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public boolean isTrending() {
		return trending;
	}
	public void setTrending(boolean trending) {
		this.trending = trending;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
}
