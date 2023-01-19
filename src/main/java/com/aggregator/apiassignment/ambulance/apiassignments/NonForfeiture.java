package com.aggregator.apiassignment.ambulance.apiassignments;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class NonForfeiture {

    private String key;
    private boolean selected;
    private boolean isRiderDisabled;
    private String name;

}
