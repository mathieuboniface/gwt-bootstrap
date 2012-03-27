package com.github.gwtbootstrap.showcase.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class Setup extends Composite {

    private static GetStartedUiBinder uiBinder = GWT.create(GetStartedUiBinder.class);

    interface GetStartedUiBinder extends UiBinder<Widget, Setup> {
    }

    public Setup() {
        initWidget(uiBinder.createAndBindUi(this));
    }

}
