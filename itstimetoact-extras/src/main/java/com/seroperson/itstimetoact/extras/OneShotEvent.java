package com.seroperson.itstimetoact.extras;

import java.io.Serializable;

public class OneShotEvent extends StepEvent implements Serializable {

    private static final long serialVersionUID = 0L;

    public OneShotEvent(String eventKey) {
        super(1, eventKey);
    }

}
