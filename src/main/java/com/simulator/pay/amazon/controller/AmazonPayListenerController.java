package com.simulator.pay.amazon.controller;

import java.io.IOException;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.simulator.pay.amazon.beans.TransactionRequestBean;
import com.simulator.pay.amazon.beans.TransactionResponseBean;

@Controller
public class AmazonPayListenerController {

	private static final String welcomemsg = "Welcome to Amazon pay simulator!";

	@RequestMapping(value = "/")
	public String dashboard(HttpServletResponse response) {
		// return "home";

		try {
			response.sendRedirect("https://www.facebook.com");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(Map<String, Object> model) {
		model.put("message", "All come home when they need");
		return "home";
	}

	@RequestMapping(value = "/redirect", method = RequestMethod.GET)
	public ModelAndView method() {
		// return new ModelAndView("redirect:" + "https://admin.payu.in/test_response");

		// TODO: get redirect url from transaction response bean
		return new ModelAndView("redirect:" + "https://www.google.com");

	}

	// @RequestMapping("/home")
	// public ModelAndView homePage(Map<String, Object> model) {
	// model.put("message", "All come home when they need to come");
	// return new ModelAndView("home");
	// }
	//

	@RequestMapping(value = "/sendTransactionDetailsBlazenet", method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public TransactionResponseBean customerInformation(@RequestBody TransactionRequestBean transactionDetails,
			HttpServletRequest request, HttpServletResponse response) {

		/*
		 * You can write authentication logic here. then send the response string. For
		 * time being I am just sending the response string.
		 */

/*		try {
			RequestDispatcher rd = request.getRequestDispatcher("/home"); // S2 is the alias name of second Servlet, Billing

			// send the client data available with req of S1 (Accounts) to req of S2
			// (Billing) with include()
			try {
				rd.include(request, response);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			//response.sendRedirect(transactionDetails.getPgParams().getRet_url());
			//return new TransactionResponseBean();
		} catch (IOException e) {
			e.printStackTrace();
		}
*/
/*		
		try {
			response.sendRedirect("/home");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		String sampleResponse = "{\"status\":\"success\",\"redirectUrl\":\"https://localhost:8443/home\",\"postParams\":{\"payload\":\"K5OGloGy3nEgJiJGUhHwh46d33tIhhm0T5TlH6EIQhD6e/lEwyo9mbNawb4MmbutZGPmnXQDIzRP7iU1obI33JPC3MZRiAW+SyFSFAU9F6xA0QYMZekRFho+RtKyTLxQX6m8kvZ9nnAIn/xSgDfWW3bv1iehIuHQd66jN3rF/9NiKx2ryDOyRzu8Bg3R3jet4qv0lYGQcj1MxUv5Ydl9BpJNoJofMdtK50mPSJsL1ixpfJSdgpDwl4mAUr1dHj/FgGzj7pZRKXNvzqk/I8TKaMtCEJIEyVef6nSxQ/tf7kM0kCmL/bLCCpF7zBEo1n+cXutKCuR76IIZYQiVK0F6/qZ5RNmL8hsN4gA08HXEBHE9WqEu8Yy133CjeSjsm8s4WA3eF97Q8gC7Wly5vi2CzDgpeH9EQkLYxxPpn4c6dUdfZm7UnckqqTC8JnRDjzV7/qmF0PwqEFP+71mW0Q==\",\"key\":\"JHawPgpcsgFMo4gEMSsgZMsP8R0u4RZUhCk3TwptVolDblpd5eLvN2XJIv60oYJbAroas1g7GEv96vJGe+JbBHBR1ddM8blFswDEe1WgC6r0e4sYj0kak121HsslhP7myiUXJxNIgm1iqIs2oVKp0Bzl2ujRB1255n8K29Y5SWjqy7rz0TASZGK5cacvF4eFhLAaZBuM/7sjK6sZ6r0w/7Y8mcMsBU4PRQGjbiQct2VqzAOp+GW5T43kBnKO+6fWPkSKTqB1sMlAf0IRIFYELq3EVEFDvdtIxkjixMt7qT02pw9Ll5nnIL0X5rbjtPXUxBt6dwovIdVjhMspzlRXlg==\",\"iv\":\"dvAwNBO5i/4eoTl3\",\"redirectUrl\":\"https://pp34secure.payu.in/CommonPgResponseHandler\"}}";

		/*
		 * Note : here we suppose that we get sample response from some logic. it may be
		 * by 1) explicitly setting the values to TransactionResponseBean OR 2) fetching
		 * the data from the database and the setting to TransactionResponseBean 3) or
		 * any other medium
		 * 
		 * I will convert sampleResponse json string to json object and map to the
		 * response bean. and the send the generated json response.
		 */

		Gson gson = new Gson();
		JsonElement element = gson.fromJson(sampleResponse, JsonElement.class);
		JsonObject jsonObj = element.getAsJsonObject();

		TransactionResponseBean transactionResponseBean = gson.fromJson(jsonObj, TransactionResponseBean.class);
		return transactionResponseBean;
	}
}
