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
        Configuration configuration = getResouces().getConfiguration();
        int keyboard = configuration.keybord;
        return true;
    }
}
