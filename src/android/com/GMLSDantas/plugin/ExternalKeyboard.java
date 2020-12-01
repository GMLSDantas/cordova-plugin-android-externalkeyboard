package com.GMLSDantas.plugin;

import android.content.Intent;
import android.content.Context;
// Cordova-required packages
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class calls a specific template from the zebra keyboard.
	https://developer.android.com/reference/android/content/Intent
	https://www.javatpoint.com/android-intent-tutorial
	https://techdocs.zebra.com/enterprise-keyboard/latest/guide/apis/
	https://stackoverflow.com/questions/40375555/start-android-activity-from-cordova-plugin
	38f60f3  - works
 */
public class ExternalKeyboard extends CordovaPlugin {
        
	@Override
	public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
		isKeyboardPlugged(callbackContext,context);
		return true;
	}
	
	private void isKeyboardPlugged(CallbackContext callbackContext,Context context) { 
		callbackContext.success();
	}
}
