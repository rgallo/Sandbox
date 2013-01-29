package com.ryangallo.gwt.billsplitter.client;

import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.event.shared.EventBus;
import com.ryangallo.gwt.billsplitter.client.view.StartView;

public interface ClientFactory {

	EventBus getEventBus();

	PlaceController getPlaceController();

	StartView getStartView();
}
