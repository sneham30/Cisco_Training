package Model;


public class ContractEmployee extends Employee {

	private float pay_per_hour;
	private float contract_duartion;

	/**
	 * @return
	 */
	public float getPay_per_hour() {
		return pay_per_hour;
	}

	/**
	 * @param pay_per_hour
	 */
	public void setPay_per_hour(float pay_per_hour) {
		this.pay_per_hour = pay_per_hour;
	}

	/**
	 * @return
	 */
	public float getContract_duartion() {
		return contract_duartion;
	}

	/**
	 * @param contract_duartion
	 */
	public void setContract_duartion(float contract_duartion) {
		this.contract_duartion = contract_duartion;
	}
}
