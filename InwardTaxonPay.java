package com.bdo.validator.bean;

import java.io.Serializable;
/**
 *	POJO class to store record data of Inward Tax on Pay template
 *  used while reading excel file and run drools engine rule
 *  @author Anka
 */
public class InwardTaxonPay implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer rowId;
	private boolean valid = true;
	private String fileId;
	private String gstinOfRecipient;
	private String docType;
	
	private String gstinOfSupplier;
	private String supplierName;
	private String supplierStateCode;
	
	private String paymentNo;
	private String paymentDate;
	private String paymentAmt;
	private String adjustedPayNo;
	private String adjustedPayDate;
	private String paymentAdjAmt;
	
	private String sgstRate;
	private String sgstAmt;
	
	private String cgstRate;
	private String cgstAmt;
	
	private String igstRate; 	
	private String igstAmt;
	
	private String cessRate;
	private String cessAmt;

	private String totalTaxAmount;
	private String placeOfSupply;
	
	private String debitGlId;
	private String debitGlName;
	
	private String creditGlId;
	private String creditGlName;
	
	private StringBuilder errorCodeList = new StringBuilder();
	
	public String getGstinOfRecipient() {
		return gstinOfRecipient;
	}
	public void setGstinOfRecipient(String gstinOfRecipient) {
		this.gstinOfRecipient = gstinOfRecipient;
	}
	public String getDocType() {
		return docType;
	}
	public void setDocType(String docType) {
		this.docType = docType;
	}
	public String getGstinOfSupplier() {
		return gstinOfSupplier;
	}
	public void setGstinOfSupplier(String gstinOfSupplier) {
		this.gstinOfSupplier = gstinOfSupplier;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public String getSupplierStateCode() {
		return supplierStateCode;
	}
	public void setSupplierStateCode(String supplierStateCode) {
		this.supplierStateCode = supplierStateCode;
	}
	public String getPaymentNo() {
		return paymentNo;
	}
	public void setPaymentNo(String paymentNo) {
		this.paymentNo = paymentNo;
	}
	public String getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}
	public String getPaymentAmt() {
		return paymentAmt;
	}
	public void setPaymentAmt(String paymentAmt) {
		this.paymentAmt = paymentAmt;
	}
	public String getAdjustedPayNo() {
		return adjustedPayNo;
	}
	public void setAdjustedPayNo(String adjustedPayNo) {
		this.adjustedPayNo = adjustedPayNo;
	}
	public String getAdjustedPayDate() {
		return adjustedPayDate;
	}
	public void setAdjustedPayDate(String adjustedPayDate) {
		this.adjustedPayDate = adjustedPayDate;
	}
	public String getPaymentAdjAmt() {
		return paymentAdjAmt;
	}
	public void setPaymentAdjAmt(String paymentAdjAmt) {
		this.paymentAdjAmt = paymentAdjAmt;
	}
	public String getSgstRate() {
		return sgstRate;
	}
	public void setSgstRate(String sgstRate) {
		this.sgstRate = sgstRate;
	}
	public String getSgstAmt() {
		return sgstAmt;
	}
	public void setSgstAmt(String sgstAmt) {
		this.sgstAmt = sgstAmt;
	}
	public String getCgstRate() {
		return cgstRate;
	}
	public void setCgstRate(String cgstRate) {
		this.cgstRate = cgstRate;
	}
	public String getCgstAmt() {
		return cgstAmt;
	}
	public void setCgstAmt(String cgstAmt) {
		this.cgstAmt = cgstAmt;
	}
	public String getIgstRate() {
		return igstRate;
	}
	public void setIgstRate(String igstRate) {
		this.igstRate = igstRate;
	}
	public String getIgstAmt() {
		return igstAmt;
	}
	public void setIgstAmt(String igstAmt) {
		this.igstAmt = igstAmt;
	}
	public String getCessRate() {
		return cessRate;
	}
	public void setCessRate(String cessRate) {
		this.cessRate = cessRate;
	}
	public String getCessAmt() {
		return cessAmt;
	}
	public void setCessAmt(String cessAmt) {
		this.cessAmt = cessAmt;
	}
	public String getTotalTaxAmount() {
		return totalTaxAmount;
	}
	public void setTotalTaxAmount(String totalTaxAmount) {
		this.totalTaxAmount = totalTaxAmount;
	}
	public String getPlaceOfSupply() {
		return placeOfSupply;
	}
	public void setPlaceOfSupply(String placeOfSupply) {
		this.placeOfSupply = placeOfSupply;
	}
	public String getDebitGlId() {
		return debitGlId;
	}
	public void setDebitGlId(String debitGlId) {
		this.debitGlId = debitGlId;
	}
	public String getDebitGlName() {
		return debitGlName;
	}
	public void setDebitGlName(String debitGlName) {
		this.debitGlName = debitGlName;
	}
	public String getCreditGlId() {
		return creditGlId;
	}
	public void setCreditGlId(String creditGlId) {
		this.creditGlId = creditGlId;
	}
	public String getCreditGlName() {
		return creditGlName;
	}
	public void setCreditGlName(String creditGlName) {
		this.creditGlName = creditGlName;
	}
	public Integer getRowId() {
		return rowId;
	}
	public void setRowId(Integer rowId) {
		this.rowId = rowId;
	}
	public boolean isValid() {
		return valid;
	}
	public void setValid(boolean valid) {
		this.valid = valid;
	}
	public String getFileId() {
		return fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}
	public StringBuilder getErrorCodeList() {
		return errorCodeList;
	}
	public void setErrorCodeList(StringBuilder errorCodeList) {
		this.errorCodeList = errorCodeList;
	}
	
	
}
