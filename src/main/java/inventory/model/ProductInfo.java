package inventory.model;
// Generated Jan 15, 2020 3:54:22 PM by Hibernate Tools 5.4.7.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * ProductInfo generated by hbm2java
 */
public class ProductInfo implements java.io.Serializable {

	private Integer id;
	private Category category;
	private String code;
	private String name;
	private String decription;
	private String imgUrl;
	private int activeFlag;
	private Date createDate;
	private Date updateDate;
	private Set productInStocks = new HashSet(0);
	private Set histories = new HashSet(0);
	private Set invoices = new HashSet(0);

	public ProductInfo() {
	}

	public ProductInfo(Category category, String code, String name, String imgUrl, int activeFlag, Date createDate,
			Date updateDate) {
		this.category = category;
		this.code = code;
		this.name = name;
		this.imgUrl = imgUrl;
		this.activeFlag = activeFlag;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}

	public ProductInfo(Category category, String code, String name, String decription, String imgUrl, int activeFlag,
			Date createDate, Date updateDate, Set productInStocks, Set histories, Set invoices) {
		this.category = category;
		this.code = code;
		this.name = name;
		this.decription = decription;
		this.imgUrl = imgUrl;
		this.activeFlag = activeFlag;
		this.createDate = createDate;
		this.updateDate = updateDate;
		this.productInStocks = productInStocks;
		this.histories = histories;
		this.invoices = invoices;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDecription() {
		return this.decription;
	}

	public void setDecription(String decription) {
		this.decription = decription;
	}

	public String getImgUrl() {
		return this.imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public int getActiveFlag() {
		return this.activeFlag;
	}

	public void setActiveFlag(int activeFlag) {
		this.activeFlag = activeFlag;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public Set getProductInStocks() {
		return this.productInStocks;
	}

	public void setProductInStocks(Set productInStocks) {
		this.productInStocks = productInStocks;
	}

	public Set getHistories() {
		return this.histories;
	}

	public void setHistories(Set histories) {
		this.histories = histories;
	}

	public Set getInvoices() {
		return this.invoices;
	}

	public void setInvoices(Set invoices) {
		this.invoices = invoices;
	}

}
