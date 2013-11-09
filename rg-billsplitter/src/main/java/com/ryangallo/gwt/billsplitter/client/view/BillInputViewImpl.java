package com.ryangallo.gwt.billsplitter.client.view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.BlurEvent;
import com.google.gwt.event.dom.client.BlurHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.ryangallo.gwtsafe.shared.Coupler;
import com.ryangallo.gwtsafe.utils.StringUtil;

public class BillInputViewImpl extends Composite implements BillInputView {

	private static BillInputViewImplUiBinder uiBinder = GWT.create(BillInputViewImplUiBinder.class);

	interface BillInputViewImplUiBinder extends UiBinder<Widget, BillInputViewImpl> {
	}

	private Presenter presenter;

	@UiField
	FlowPanel pnlPrices;

	@UiField
	FlowPanel pnlNames;

	private List<Coupler<TextBox, TextBox>> priceNameList = new ArrayList<Coupler<TextBox, TextBox>>();

	public BillInputViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@Override
	public void setPresenter(Presenter presenter) {
		this.presenter = presenter;
		addNewItemSet(); // Add initial first item box
	}
	
	public void addNewItemSet() {
		TextBox newPriceBox = new TextBox();

		TextBox newNameBox = new TextBox();
		for (TextBox t : Arrays.asList(newPriceBox, newNameBox)) {
			t.setWidth("100%");
		}
		pnlPrices.add(newPriceBox);
		pnlNames.add(newNameBox);
		newPriceBox.setFocus(true);
		priceNameList.add(new Coupler<TextBox, TextBox>(newPriceBox, newNameBox));
	}

	private BlurHandler priceVerifyHandler = new BlurHandler() {
		@Override
		public void onBlur(BlurEvent arg0) {
			TextBox t = (TextBox) arg0.getSource();
			String value = t.getValue();
			boolean valid = false;
			if (StringUtil.isNotBlank(value)) {
				boolean hasDecimal = false;
				boolean isValid = true;
				for (char c : value.toCharArray()) {
					if (isValid && !Character.isDigit(c)) {
						if (c == '.' && !hasDecimal) {
							hasDecimal = true;
						} else {
							isValid = false;
						}
					} else {
						isValid = false;
					}
				}
			}
		}
	};

}
