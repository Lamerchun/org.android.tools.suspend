package org.android.tools;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;

import android.content.Intent;

public class Suspend extends CordovaPlugin {
	public static final String SUSPEND = "suspendApp";
	
	@Override
	public boolean execute(String action, JSONArray data, CallbackContext callbackContext) {
		boolean result = false;
		
		if (action.equals(SUSPEND)) {
			this.cordova.getActivity().finish();
			
			result = true;
		}
		
		return result;
	}
}
