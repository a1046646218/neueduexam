package neueduexam.payapi;

/**
 * 支付回调的参数实体类
 *
 */
public class Paypayzhu {

	/**
	 * paypayzhu生成的订单ID号
	 */
	private String ppz_order_id;

	/**
	 * 您的自定义订单号
	 */
	private String order_id;

	/**
	 * 订单定价
	 */
	private String price;

	/**
	 * 实际支付金额
	 */
	private String real_price;

	/**
	 * 您的自定义订单信息
	 */
	private String order_info;

	private String signature;

	public String getPpz_order_id() {
		return ppz_order_id;
	}

	public void setPpz_order_id(String ppz_order_id) {
		this.ppz_order_id = ppz_order_id;
	}

	public String getOrder_id() {
		return order_id;
	}

	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getReal_price() {
		return real_price;
	}

	public void setReal_price(String real_price) {
		this.real_price = real_price;
	}

	public String getOrder_info() {
		return order_info;
	}

	public void setOrder_info(String order_info) {
		this.order_info = order_info;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

}
