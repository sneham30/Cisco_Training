package Model;

import java.sql.Date;

/*
 * Plain old Java Object Class for Employee
 * or
 * blue print for employee Object
 */
public class Employee {

	private int EmpId;
	private String EmpName;
	private Date joiningDate;
	private String Designation;


	/**
	 * Parameterised constructor for Employee
	 * 
	 * @param EmpId
	 * @param EmpName
	 * @param joiningDate
	 * @param Designation
	 */
	public Employee(int EmpId, String EmpName, Date joiningDate,
			String Designation) {
		this.EmpId = EmpId;
		this.EmpName = EmpName;
		this.joiningDate = joiningDate;
		this.Designation = Designation;
	}

	/**
	 * getter for EmpId
	 * 
	 * @return the EmpId
	 */
	public int getEmpId() {
		return EmpId;
	}

	/**
	 * setter for EmpId
	 * 
	 * @param EmpId
	 *            the EmpId to set
	 */
	public void setEmpId(int EmpId) {
		this.EmpId = EmpId;
	}

	/**
	 * getter for EmpName
	 * 
	 * @return the EmpName
	 */
	public String getEmpName() {
		return EmpName;
	}

	/**
	 * setter for EmpName
	 * 
	 * @param EmpName
	 *            the EmpName to set
	 */
	public void setEmpName(String EmpName) {
		this.EmpName = EmpName;
	}

	/**
	 * getter for joiningDate
	 * 
	 * @return the joiningDate
	 */
	public Date getJoiningDate() {
		return joiningDate;
	}

	/**
	 * setter for joiningDate
	 *
	 * @param joiningDate
	 *            the joiningDate to set
	 */
	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	/**
	 * getter for Designation
	 * 
	 * @return the Designation
	 */
	public String getDesignation() {
		return Designation;
	}

	/**
	 * setter for Designation
	 * 
	 * @param Designation
	 *            the Designation to set
	 */
	public void setDesignation(String Designation) {
		this.Designation = Designation;
	}

}
