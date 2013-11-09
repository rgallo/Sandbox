package com.ryangallo.gwt.billsplitter.client;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.SimpleEventBus;
import com.ryangallo.gwt.billsplitter.client.view.BillInputView;
import com.ryangallo.gwt.billsplitter.client.view.BillInputViewImpl;
import com.ryangallo.gwt.billsplitter.client.view.StartView;
import com.ryangallo.gwt.billsplitter.client.view.StartViewImpl;

public class ClientFactoryImpl implements ClientFactory {

	private static final EventBus eventBus = new SimpleEventBus();
	private static final PlaceController placeController = new PlaceController(eventBus);
	private static StartView mainView = null;
	private static BillInputView billInputView = null;

	@Override
	public EventBus getEventBus() {
		return eventBus;
	}

	@Override
	public PlaceController getPlaceController() {
		return placeController;
	}

	@Override
	public StartView getStartView() {
		if (mainView == null) {
			mainView = new StartViewImpl();
		}
		return mainView;
	}

	@Override
	public void goTo(Place place) {
		placeController.goTo(place);
	}

	@Override
	public BillInputView getBillInputView() {
		if (billInputView == null) {
			billInputView = new BillInputViewImpl();
		}
		return billInputView;
	}


}
