package com.simulator.pay.amazon.beans;

public class TransactionRequestBean {

	 	private PgParams pgParams;

	    private String bankcode;

	    private TransactionParams transactionParams;

	    public PgParams getPgParams ()
	    {
	        return pgParams;
	    }

	    public void setPgParams (PgParams pgParams)
	    {
	        this.pgParams = pgParams;
	    }

	    public String getBankcode ()
	    {
	        return bankcode;
	    }

	    public void setBankcode (String bankcode)
	    {
	        this.bankcode = bankcode;
	    }

	    public TransactionParams getTransactionParams ()
	    {
	        return transactionParams;
	    }

	    public void setTransactionParams (TransactionParams transactionParams)
	    {
	        this.transactionParams = transactionParams;
	    }

	    @Override
	    public String toString()
	    {
	        return "ClassPojo [pgParams = "+pgParams+", bankcode = "+bankcode+", transactionParams = "+transactionParams+"]";
	    }
}
