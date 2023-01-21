package com.ns.cams.base.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="base", name="user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;

	@Column(name = "USER_NAME")
	private String userName;

	@Column(name = "login_id")
	private String loginID;

	@Column(name = "password")
	private String password;

	@Column(name = "email_id")
	private String emailId;

	@Column(name = "phone_no")
	private String phoneno;

	@Column(name = "VALID_From_DT")
	private Date ValidFromDt;

	@Column(name = "VALID_TO_DT")
	private Date ValidToDt;

	@Column(name = "account_locked")
	private String accountLocked;

	@Column(name = "LAST_LOGIN")
	private Date LastLogin;

	@Column(name = "USER_TYPE")
	private String userType;

	@Column(name = "ALLOW_LOGIN")
	private boolean allowLogin;

	@Column(name = "LOGIN_FAILED_COUNT")
	private int loginFailedCount;

	@Column(name = "IS_SUPER_USER")
	private String isSuperUser;

	/**
	 * 
	 */
	public User() {
		super();
	}

	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the loginID
	 */
	public String getLoginID() {
		return loginID;
	}

	/**
	 * @param loginID the loginID to set
	 */
	public void setLoginID(String loginID) {
		this.loginID = loginID;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}

	/**
	 * @param emailId the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	/**
	 * @return the phoneno
	 */
	public String getPhoneno() {
		return phoneno;
	}

	/**
	 * @param phoneno the phoneno to set
	 */
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	/**
	 * @return the validFromDt
	 */
	public Date getValidFromDt() {
		return ValidFromDt;
	}

	/**
	 * @param validFromDt the validFromDt to set
	 */
	public void setValidFromDt(Date validFromDt) {
		ValidFromDt = validFromDt;
	}

	/**
	 * @return the validToDt
	 */
	public Date getValidToDt() {
		return ValidToDt;
	}

	/**
	 * @param validToDt the validToDt to set
	 */
	public void setValidToDt(Date validToDt) {
		ValidToDt = validToDt;
	}

	/**
	 * @return the accountLocked
	 */
	public String getAccountLocked() {
		return accountLocked;
	}

	/**
	 * @param accountLocked the accountLocked to set
	 */
	public void setAccountLocked(String accountLocked) {
		this.accountLocked = accountLocked;
	}

	/**
	 * @return the lastLogin
	 */
	public Date getLastLogin() {
		return LastLogin;
	}

	/**
	 * @param lastLogin the lastLogin to set
	 */
	public void setLastLogin(Date lastLogin) {
		LastLogin = lastLogin;
	}

	/**
	 * @return the userType
	 */
	public String getUserType() {
		return userType;
	}

	/**
	 * @param userType the userType to set
	 */
	public void setUserType(String userType) {
		this.userType = userType;
	}

	/**
	 * @return the allowLogin
	 */
	public boolean isAllowLogin() {
		return allowLogin;
	}

	/**
	 * @param allowLogin the allowLogin to set
	 */
	public void setAllowLogin(boolean allowLogin) {
		this.allowLogin = allowLogin;
	}

	/**
	 * @return the loginFailedCount
	 */
	public int getLoginFailedCount() {
		return loginFailedCount;
	}

	/**
	 * @param loginFailedCount the loginFailedCount to set
	 */
	public void setLoginFailedCount(int loginFailedCount) {
		this.loginFailedCount = loginFailedCount;
	}

	/**
	 * @return the isSuperUser
	 */
	public String getIsSuperUser() {
		return isSuperUser;
	}

	/**
	 * @param isSuperUser the isSuperUser to set
	 */
	public void setIsSuperUser(String isSuperUser) {
		this.isSuperUser = isSuperUser;
	}

}
