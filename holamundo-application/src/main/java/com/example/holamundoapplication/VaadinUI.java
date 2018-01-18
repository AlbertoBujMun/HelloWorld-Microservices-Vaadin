package com.example.holamundoapplication;

import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;

/**
 
 */
@SpringUI(path = "/")
public class VaadinUI extends UI {

    @Override
    protected void init(VaadinRequest request) {
        getReconnectDialogConfiguration().setDialogText("Please wait...");
        getReconnectDialogConfiguration().setReconnectInterval(1000);

        HorizontalLayout horizontalLayout = new HorizontalLayout();
        horizontalLayout.setWidth("100%");
        horizontalLayout.setSpacing(false);
        setContent(horizontalLayout);
        
        horizontalLayout.addComponent(new Label("Hola mundo!"));
       
    }

}
