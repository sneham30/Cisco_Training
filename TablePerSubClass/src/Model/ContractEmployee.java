package Model;


public class ContractEmployee extends Employee {

	private float pay_per_hour;
	private float contract_duration;

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
	public float getContract_duration() {
		return contract_duration;
	}

	/**
	 * @param contract_duration
	 */
	public void setContract_duration(float contract_duration) {
		this.contract_duration = contract_duration;
	}
}
