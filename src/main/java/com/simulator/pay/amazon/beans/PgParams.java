package com.simulator.pay.amazon.beans;

public class PgParams {
	    private String blazePayBankCode;

	    private String paymentEncryptionKey;

	    private String payee_id;

	    private String sandbox;

	    private String dvEncryptionKey;

	    private String post_uri;

	    private String base_url;

	    private String CRN;

	    private String ret_url;

	    public String getBlazePayBankCode ()
	    {
	        return blazePayBankCode;
	    }

	    public void setBlazePayBankCode (String blazePayBankCode)
	    {
	        this.blazePayBankCode = blazePayBankCode;
	    }

	    public String getPaymentEncryptionKey ()
	    {
	        return paymentEncryptionKey;
	    }

	    public void setPaymentEncryptionKey (String paymentEncryptionKey)
	    {
	        this.paymentEncryptionKey = paymentEncryptionKey;
	    }

	    public String getPayee_id ()
	    {
	        return payee_id;
	    }

	    public void setPayee_id (String payee_id)
	    {
	        this.payee_id = payee_id;
	    }

	    public String getSandbox ()
	    {
	        return sandbox;
	    }

	    public void setSandbox (String sandbox)
	    {
	        this.sandbox = sandbox;
	    }

	    public String getDvEncryptionKey ()
	    {
	        return dvEncryptionKey;
	    }

	    public void setDvEncryptionKey (String dvEncryptionKey)
	    {
	        this.dvEncryptionKey = dvEncryptionKey;
	    }

	    public String getPost_uri ()
	    {
	        return post_uri;
	    }

	    public void setPost_uri (String post_uri)
	    {
	        this.post_uri = post_uri;
	    }

	    public String getBase_url ()
	    {
	        return base_url;
	    }

	    public void setBase_url (String base_url)
	    {
	        this.base_url = base_url;
	    }

	    public String getCRN ()
	    {
	        return CRN;
	    }

	    public void setCRN (String CRN)
	    {
	        this.CRN = CRN;
	    }

	    public String getRet_url ()
	    {
	        return ret_url;
	    }

	    public void setRet_url (String ret_url)
	    {
	        this.ret_url = ret_url;
	    }

	    @Override
	    public String toString()
	    {
	        return "ClassPojo [blazePayBankCode = "+blazePayBankCode+", paymentEncryptionKey = "+paymentEncryptionKey+", payee_id = "+payee_id+", sandbox = "+sandbox+", dvEncryptionKey = "+dvEncryptionKey+", post_uri = "+post_uri+", base_url = "+base_url+", CRN = "+CRN+", ret_url = "+ret_url+"]";
	    }
}
