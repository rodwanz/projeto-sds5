package com.devsuperior.dsvendas4.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas4.entities.Seller;

public class SaleSuccessDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String sellerName;
	private Long vivited;
	private Long deals;
	
	public SaleSuccessDTO() {	
	}

	public SaleSuccessDTO(Seller seller, Long vivited, Long deals) {
		sellerName = seller.getName();
		this.vivited = vivited;
		this.deals = deals;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Long getVivited() {
		return vivited;
	}

	public void setVivited(Long vivited) {
		this.vivited = vivited;
	}

	public Long getDeals() {
		return deals;
	}

	public void setDeals(Long deals) {
		this.deals = deals;
	}

}
