package com.simulator.pay.amazon.beans;

public class TransactionParams {
	    private String amount;

	    private String lastName;

	    private String payuId;

	    private String addedon;

	    private String mihpayid;

	    private String merchantName;

	    private String merchantTxnId;

	    private String productInfo;

	    private String deviceInfo;

	    private String firstName;

	    private String merchantKey;

	    public String getAmount ()
	    {
	        return amount;
	    }

	    public void setAmount (String amount)
	    {
	        this.amount = amount;
	    }

	    public String getLastName ()
	    {
	        return lastName;
	    }

	    public void setLastName (String lastName)
	    {
	        this.lastName = lastName;
	    }

	    public String getPayuId ()
	    {
	        return payuId;
	    }

	    public void setPayuId (String payuId)
	    {
	        this.payuId = payuId;
	    }

	    public String getAddedon ()
	    {
	        return addedon;
	    }

	    public void setAddedon (String addedon)
	    {
	        this.addedon = addedon;
	    }

	    public String getMihpayid ()
	    {
	        return mihpayid;
	    }

	    public void setMihpayid (String mihpayid)
	    {
	        this.mihpayid = mihpayid;
	    }

	    public String getMerchantName ()
	    {
	        return merchantName;
	    }

	    public void setMerchantName (String merchantName)
	    {
	        this.merchantName = merchantName;
	    }

	    public String getMerchantTxnId ()
	    {
	        return merchantTxnId;
	    }

	    public void setMerchantTxnId (String merchantTxnId)
	    {
	        this.merchantTxnId = merchantTxnId;
	    }

	    public String getProductInfo ()
	    {
	        return productInfo;
	    }

	    public void setProductInfo (String productInfo)
	    {
	        this.productInfo = productInfo;
	    }

	    public String getDeviceInfo ()
	    {
	        return deviceInfo;
	    }

	    public void setDeviceInfo (String deviceInfo)
	    {
	        this.deviceInfo = deviceInfo;
	    }

	    public String getFirstName ()
	    {
	        return firstName;
	    }

	    public void setFirstName (String firstName)
	    {
	        this.firstName = firstName;
	    }

	    public String getMerchantKey ()
	    {
	        return merchantKey;
	    }

	    public void setMerchantKey (String merchantKey)
	    {
	        this.merchantKey = merchantKey;
	    }

	    @Override
	    public String toString()
	    {
	        return "ClassPojo [amount = "+amount+", lastName = "+lastName+", payuId = "+payuId+", addedon = "+addedon+", mihpayid = "+mihpayid+", merchantName = "+merchantName+", merchantTxnId = "+merchantTxnId+", productInfo = "+productInfo+", deviceInfo = "+deviceInfo+", firstName = "+firstName+", merchantKey = "+merchantKey+"]";
	    }
}
