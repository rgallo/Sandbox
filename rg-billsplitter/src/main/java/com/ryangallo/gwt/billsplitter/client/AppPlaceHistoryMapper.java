package com.ryangallo.gwt.billsplitter.client;

import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;
import com.ryangallo.gwt.billsplitter.client.place.StartPlace;

@WithTokenizers({ StartPlace.Tokenizer.class })
public interface AppPlaceHistoryMapper extends PlaceHistoryMapper
{
}