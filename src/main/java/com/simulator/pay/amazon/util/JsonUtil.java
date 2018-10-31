package com.simulator.pay.amazon.util;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class JsonUtil {

	/**
	 * this method converts a valid json string to json object 
	 * using org.gson 
	 * 
	 * @param str
	 * @return
	 */
	@Deprecated
	public JsonObject jsonStringToJsonObjectConvertor(String str) {
		Gson gson = new Gson();
		JsonElement element = gson.fromJson (str, JsonElement.class);
		JsonObject jsonObj = element.getAsJsonObject();
		return jsonObj;
	}
}
