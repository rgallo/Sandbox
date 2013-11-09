package com.ryangallo.gwt.billsplitter.client;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.event.shared.EventBus;
import com.ryangallo.gwt.billsplitter.client.view.BillInputView;
import com.ryangallo.gwt.billsplitter.client.view.StartView;

public interface ClientFactory {

	EventBus getEventBus();

	PlaceController getPlaceController();

	StartView getStartView();

	void goTo(Place place);

	BillInputView getBillInputView();
}
