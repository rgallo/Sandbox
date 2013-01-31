package com.ryangallo.gwt.billsplitter.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class StartViewImpl extends Composite implements StartView {

	private static StartViewImplUiBinder uiBinder = GWT.create(StartViewImplUiBinder.class);

	interface StartViewImplUiBinder extends UiBinder<Widget, StartViewImpl> {
	}

	private Presenter presenter;

	public StartViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@Override
	public void setPresenter(Presenter presenter) {
		this.presenter = presenter;
	}

}
