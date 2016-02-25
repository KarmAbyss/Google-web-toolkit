package com.test.GWT.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;

public class Home implements EntryPoint {
	
     private LittleForm form =new LittleForm();
	@Override
	public void onModuleLoad() {
		RootPanel.get().add(form);
		// TODO Auto-generated method stub
    
	}

}
