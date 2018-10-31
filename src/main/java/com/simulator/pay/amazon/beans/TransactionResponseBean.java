package com.simulator.pay.amazon.beans;

public class TransactionResponseBean {

	    private String status;

	    private String redirectUrl;

	    private PostParams postParams;

	    public String getStatus ()
	    {
	        return status;
	    }

	    public void setStatus (String status)
	    {
	        this.status = status;
	    }

	    public String getRedirectUrl ()
	    {
	        return redirectUrl;
	    }

	    public void setRedirectUrl (String redirectUrl)
	    {
	        this.redirectUrl = redirectUrl;
	    }

	    public PostParams getPostParams ()
	    {
	        return postParams;
	    }

	    public void setPostParams (PostParams postParams)
	    {
	        this.postParams = postParams;
	    }

	    @Override
	    public String toString()
	    {
	        return "ClassPojo [status = "+status+", redirectUrl = "+redirectUrl+", postParams = "+postParams+"]";
	    }
}
