package com.simulator.pay.amazon.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.simulator.pay.amazon.beans.TransactionRequestBean;
import com.simulator.pay.amazon.beans.TransactionResponseBean;

@RestController
public class AmazonPayListenerController {

	private static final String welcomemsg = "Welcome to Amazon pay simulator!";


	@RequestMapping(value = "/")
	public String dashboard() {
		return "welcome to dashboard";
	}

	@GetMapping(value = "/home")
	public String home() {
		return "home";
	}
	
	@PostMapping(path = "/sendTransactionDetails")
	public TransactionResponseBean customerInformation(@RequestBody TransactionRequestBean transactionDetails) {

		/*
		 * You can write authentication logic here. 
		 * then send the response string.
		 * For time being I am just sending the response string.
		 */

		String sampleResponse = "{\"status\":\"success\",\"redirectUrl\":\"https://amazonpay.amazon.in/initiatePayment\",\"postParams\":{\"payload\":\"K5OGloGy3nEgJiJGUhHwh46d33tIhhm0T5TlH6EIQhD6e/lEwyo9mbNawb4MmbutZGPmnXQDIzRP7iU1obI33JPC3MZRiAW+SyFSFAU9F6xA0QYMZekRFho+RtKyTLxQX6m8kvZ9nnAIn/xSgDfWW3bv1iehIuHQd66jN3rF/9NiKx2ryDOyRzu8Bg3R3jet4qv0lYGQcj1MxUv5Ydl9BpJNoJofMdtK50mPSJsL1ixpfJSdgpDwl4mAUr1dHj/FgGzj7pZRKXNvzqk/I8TKaMtCEJIEyVef6nSxQ/tf7kM0kCmL/bLCCpF7zBEo1n+cXutKCuR76IIZYQiVK0F6/qZ5RNmL8hsN4gA08HXEBHE9WqEu8Yy133CjeSjsm8s4WA3eF97Q8gC7Wly5vi2CzDgpeH9EQkLYxxPpn4c6dUdfZm7UnckqqTC8JnRDjzV7/qmF0PwqEFP+71mW0Q==\",\"key\":\"JHawPgpcsgFMo4gEMSsgZMsP8R0u4RZUhCk3TwptVolDblpd5eLvN2XJIv60oYJbAroas1g7GEv96vJGe+JbBHBR1ddM8blFswDEe1WgC6r0e4sYj0kak121HsslhP7myiUXJxNIgm1iqIs2oVKp0Bzl2ujRB1255n8K29Y5SWjqy7rz0TASZGK5cacvF4eFhLAaZBuM/7sjK6sZ6r0w/7Y8mcMsBU4PRQGjbiQct2VqzAOp+GW5T43kBnKO+6fWPkSKTqB1sMlAf0IRIFYELq3EVEFDvdtIxkjixMt7qT02pw9Ll5nnIL0X5rbjtPXUxBt6dwovIdVjhMspzlRXlg==\",\"iv\":\"dvAwNBO5i/4eoTl3\",\"redirectUrl\":\"https://pp34secure.payu.in/CommonPgResponseHandler\"}}";
		
		/* Note : here we suppose that we get sample response from some logic.
		 * it may be by 
		 * 1) explicitly setting the values to TransactionResponseBean OR
		 * 2) fetching the data from the database and the setting to TransactionResponseBean
		 * 3) or any other medium
		 * 
		 * I will convert sampleResponse json string to json object and map to the response bean.
		 * and the send the generated json response. 
		 */

		Gson gson = new Gson();
		JsonElement element = gson.fromJson (sampleResponse, JsonElement.class);
		JsonObject jsonObj = element.getAsJsonObject();
		
		
		TransactionResponseBean transactionResponseBean = gson.fromJson(jsonObj, TransactionResponseBean.class);
		return transactionResponseBean;
	}
}
