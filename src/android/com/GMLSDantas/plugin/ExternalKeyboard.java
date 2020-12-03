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
    public boolean execute(CallbackContext callbackContext) throws JSONException {
            
	   return isKeyboardPlugged();
            
	}
	
	
private boolean isKeyboardPlugged(){
     Context context = cordova.getActivity().getApplicationContext();
     Configuration config = context.getResources().getConfiguration();
     int keyboard = config.keyboard;

     if (keyboard != Configuration.KEYBOARD_NOKEYS) {
		return true;
        } else {
		return false;
        }

    }
				
}
