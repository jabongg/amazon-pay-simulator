package com.simulator.pay.amazon.beans;

public class PostParams {
	private String iv;

    private String payload;

    private String redirectUrl;

    private String key;

    public String getIv ()
    {
        return iv;
    }

    public void setIv (String iv)
    {
        this.iv = iv;
    }

    public String getPayload ()
    {
        return payload;
    }

    public void setPayload (String payload)
    {
        this.payload = payload;
    }

    public String getRedirectUrl ()
    {
        return redirectUrl;
    }

    public void setRedirectUrl (String redirectUrl)
    {
        this.redirectUrl = redirectUrl;
    }

    public String getKey ()
    {
        return key;
    }

    public void setKey (String key)
    {
        this.key = key;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [iv = "+iv+", payload = "+payload+", redirectUrl = "+redirectUrl+", key = "+key+"]";
    }
}
