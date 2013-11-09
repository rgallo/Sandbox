package com.ryangallo.gwt.billsplitter.client.place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class BillInputPlace extends Place {
	private String token;

	public BillInputPlace(String token) {
		this.token = token;
	}

	public String getToken() {
		return token;
	}

	public static class Tokenizer implements PlaceTokenizer<BillInputPlace> {
		@Override
		public String getToken(BillInputPlace place) {
			return place.getToken();
		}

		@Override
		public BillInputPlace getPlace(String token) {
			return new BillInputPlace(token);
		}
	}
}