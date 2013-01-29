package com.ryangallo.gwt.billsplitter.client;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.ryangallo.gwt.billsplitter.client.activity.StartActivity;
import com.ryangallo.gwt.billsplitter.client.place.StartPlace;

public class AppActivityMapper implements ActivityMapper {
    private ClientFactory clientFactory;

    public AppActivityMapper(ClientFactory clientFactory) {
        super();
        this.clientFactory = clientFactory;
    }

    @Override
    public Activity getActivity(Place place) {
        if (place instanceof StartPlace) {
			return new StartActivity((StartPlace) place, clientFactory);
		}
        return null;
    }
}
