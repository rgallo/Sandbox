package com.ryangallo.gwt.billsplitter.client.place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class StartPlace extends Place {
	private String token;

	public StartPlace(String token) {
		this.token = token;
	}

	public String getToken() {
		return token;
	}

	public static class Tokenizer implements PlaceTokenizer<StartPlace> {
		@Override
		public String getToken(StartPlace place) {
			return place.getToken();
		}

		@Override
		public StartPlace getPlace(String token) {
			return new StartPlace(token);
		}
	}
}