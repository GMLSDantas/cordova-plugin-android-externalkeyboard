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

//e070f3a - working - 3-12-2020 - 10:22 (before).
//89d3da0 - Working

public class ExternalKeyboard extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        Context context = cordova.getActivity().getApplicationContext();
        Configuration config = context.getResources().getConfiguration();
        int keyboard = config.keyboard;
        if (keyboard != Configuration.KEYBOARD_NOKEYS) {
            callbackContext.success();
            return true;
        } else {
            PluginResult pluginResult = new PluginResult(PluginResult.Status.OK);
            callbackContext.error("No keyboard connected");
            return false;
        }
    }
}
