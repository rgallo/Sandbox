package com.ryangallo.gwt.billsplitter.client.activity;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.ryangallo.gwt.billsplitter.client.ClientFactory;
import com.ryangallo.gwt.billsplitter.client.place.StartPlace;
import com.ryangallo.gwt.billsplitter.client.view.StartView;

public class StartActivity extends AbstractActivity implements StartView.Presenter {

	private ClientFactory factory;
	private String token;

	public StartActivity(StartPlace place, ClientFactory factory) {
		this.token = place.getToken();
		this.factory = factory;
	}

	@Override
	public void start(AcceptsOneWidget container, EventBus eventBus) {
		StartView startView = factory.getStartView();
		startView.setPresenter(this);
		container.setWidget(startView);
	}

}
