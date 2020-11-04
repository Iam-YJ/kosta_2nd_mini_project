package model.dto;

public class Reply {
	private int reviewNo; // ����No
	private int resNo; // �Ĵ�No
	private int userNo; // ����No
	private int repHits; // ���� ��ȸ��
	private int repGrade; // ���� ����
	private String repPhoto; // ���� ����
	private String repContent; // ���� ����
	private String repDate; // ���� ��¥
	private int repAgree; // ���� ������

	public Reply(int reviewNo, int resNo, int userNo, int repHits, int repGrade, String repPhoto, String repContent,
			String repDate, int repAgree) {
		super();
		this.reviewNo = reviewNo;
		this.resNo = resNo;
		this.userNo = userNo;
		this.repHits = repHits;
		this.repGrade = repGrade;
		this.repPhoto = repPhoto;
		this.repContent = repContent;
		this.repDate = repDate;
		this.repAgree = repAgree;
	}

	public int getReviewNo() {
		return reviewNo;
	}

	public void setReviewNo(int reviewNo) {
		this.reviewNo = reviewNo;
	}

	public int getResNo() {
		return resNo;
	}

	public void setResNo(int resNo) {
		this.resNo = resNo;
	}

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public int getRepHits() {
		return repHits;
	}

	public void setRepHits(int repHits) {
		this.repHits = repHits;
	}

	public int getRepGrade() {
		return repGrade;
	}

	public void setRepGrade(int repGrade) {
		this.repGrade = repGrade;
	}

	public String getRepPhoto() {
		return repPhoto;
	}

	public void setRepPhoto(String repPhoto) {
		this.repPhoto = repPhoto;
	}

	public String getRepContent() {
		return repContent;
	}

	public void setRepContent(String repContent) {
		this.repContent = repContent;
	}

	public String getRepDate() {
		return repDate;
	}

	public void setRepDate(String repDate) {
		this.repDate = repDate;
	}

	public int getRepAgree() {
		return repAgree;
	}

	public void setRepAgree(int repAgree) {
		this.repAgree = repAgree;
	}

}
