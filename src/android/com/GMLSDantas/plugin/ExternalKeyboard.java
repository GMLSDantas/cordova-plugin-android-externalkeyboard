package com.GMLSDantas.plugin;

import android.content.Intent;
import android.content.Context;
import android.content.res.*;
// Cordova-required packages
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import android.content.res.Resources;
import android.util.Log;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ExternalKeyboard extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
           
            try {
			 
             GetIsKeyboardPlugged(callbackContext,context);
		     return true;
		  } catch (JSONException e) {
			callbackContext.error("Error encountered: " + e.getMessage());
			return false;
		  } 
	    
        
    }
    
    private void GetIsKeyboardPlugged(CallbackContext callbackContext) {
            Context context = cordova.getActivity().getApplicationContext();
            Configuration config = context.getResources().getConfiguration();
            int keyboard = config.keyboard;
        if (keyboard != Configuration.KEYBOARD_NOKEYS) {
                Log.d("WT6000_keypadapp","HARDWARE KEYBOARD: CONNECTED");
            } else {
                Log.d("WT6000_keypadapp","HARDWARE KEYBOARD: NOT CONNECTED"); 
            }
			callbackContext.success();
	}
}
