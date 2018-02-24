package com.gizscanqrcode;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

import com.gizwits.scanlibrary.zxing.activity.ScanQrcodeActivity;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class gizdownloadtool extends CordovaPlugin {
	private CallbackContext callbackContext;
    private JSONArray requestArgs;
    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("download")) {
              this.requestArgs = args;
			  this.callbackContext = callbackContext;
              this.scan(args);
            return true;
        }
        return false;
    }

	/**
     * Starts an intent to scan and decode a barcode.
     */
    public void scan(final JSONArray args) {

        final CordovaPlugin that = this;
        cordova.getThreadPool().execute(new Runnable() {
            public void run() {
               	Log.e("startdown","+++++++++++++");
            }
        });
    }

 

}
