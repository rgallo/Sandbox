package com.ryangallo.gwt.billsplitter.client.activity;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.ryangallo.gwt.billsplitter.client.ClientFactory;
import com.ryangallo.gwt.billsplitter.client.place.BillInputPlace;
import com.ryangallo.gwt.billsplitter.client.view.BillInputView;

public class BillInputActivity extends AbstractActivity implements BillInputView.Presenter {

	private ClientFactory factory;
	private String token;

	public BillInputActivity(BillInputPlace place, ClientFactory factory) {
		this.token = place.getToken();
		this.factory = factory;
	}

	@Override
	public void start(AcceptsOneWidget container, EventBus eventBus) {
		BillInputView billInputView = factory.getBillInputView();
		billInputView.setPresenter(this);
		container.setWidget(billInputView);
	}

}
