package com.ryangallo.gwt.billsplitter.client.view;

import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.ryangallo.gwtsafe.utils.StringUtil;

public class StartViewImpl extends Composite implements StartView {

	private Presenter presenter;

	public StartViewImpl() {
		initWidget(new Label("Hello World!"));
		Window.alert("" + StringUtil.isNotBlank("this"));
	}

	@Override
	public void setPresenter(Presenter presenter) {
		this.presenter = presenter;
	}

}
