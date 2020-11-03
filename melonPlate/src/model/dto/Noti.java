package model.dto;

public class Noti {
	private int notiNo;// �������� No
	private int userNo;// ���� No
	private String notiTitle;// �������� ����
	private String notiDate;// �������� �ۼ���¥
	private String notiContent;// �������� ����
	private String notiHits;// �������� ��ȸ��

	
	public Noti() {}
	public Noti(int notiNo, int userNo, String notiTitle, String notiDate, String notiContent, String notiHits) {
		this.notiNo = notiNo;
		this.userNo = userNo;
		this.notiTitle = notiTitle;
		this.notiDate = notiDate;
		this.notiContent = notiContent;
		this.notiHits = notiHits;
	}

	public int getNotiNo() {
		return notiNo;
	}

	public void setNotiNo(int notiNo) {
		this.notiNo = notiNo;
	}

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public String getNotiTitle() {
		return notiTitle;
	}

	public void setNotiTitle(String notiTitle) {
		this.notiTitle = notiTitle;
	}

	public String getNotiDate() {
		return notiDate;
	}

	public void setNotiDate(String notiDate) {
		this.notiDate = notiDate;
	}

	public String getNotiContent() {
		return notiContent;
	}

	public void setNotiContent(String notiContent) {
		this.notiContent = notiContent;
	}

	public String getNotiHits() {
		return notiHits;
	}

	public void setNotiHits(String notiHits) {
		this.notiHits = notiHits;
	}

}