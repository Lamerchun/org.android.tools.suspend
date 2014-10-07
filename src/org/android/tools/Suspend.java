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
			Intent i = new Intent(Intent.ACTION_MAIN);
			i.addCategory(Intent.CATEGORY_HOME);
			this.cordova.getActivity().startActivity(i);
			
			result = true;
		}
		
		return result;
	}
}
