package rest.entity;

public class EntityAdvert {

	private int advertId;
	private String advertHeader;
	private String advertBody;
	private String advertCategory;
	private String advertPhoneNumber;
	private String advertDateTime;
	private int advertAuthorId;

	public EntityAdvert() {}

	public EntityAdvert(int advertId, String advertHeader, String advertBody, String advertCategory, String advertPhoneNumber, String advertDateTime, int advertAuthorId) {
		this.advertId = advertId;
		this.advertHeader = advertHeader;
		this.advertBody = advertBody;
		this.advertCategory = advertCategory;
		this.advertPhoneNumber = advertPhoneNumber;
		this.advertDateTime = advertDateTime;
		this.advertAuthorId = advertAuthorId;
	}

	public int getAdvertId() {
		return advertId;
	}

	public void setAdvertId(int advertId) {
		this.advertId = advertId;
	}

	public String getAdvertHeader() {
		return advertHeader;
	}

	public void setAdvertHeader(String advertHeader) {
		this.advertHeader = advertHeader;
	}

	public String getAdvertBody() {
		return advertBody;
	}

	public void setAdvertBody(String advertBody) {
		this.advertBody = advertBody;
	}

	public String getAdvertCategory() {
		return advertCategory;
	}

	public void setAdvertCategory(String advertCategory) {
		this.advertCategory = advertCategory;
	}

	public String getAdvertPhoneNumber() {
		return advertPhoneNumber;
	}

	public void setAdvertPhoneNumber(String advertPhoneNumber) {
		this.advertPhoneNumber = advertPhoneNumber;
	}

	public String getAdvertDateTime() {
		return advertDateTime;
	}

	public void setAdvertDateTime(String advertDateTime) {
		this.advertDateTime = advertDateTime;
	}

	public int getAdvertAuthorId() {
		return advertAuthorId;
	}

	public void setAdvertAuthorId(int advertAuthorId) {
		this.advertAuthorId = advertAuthorId;
	}

}