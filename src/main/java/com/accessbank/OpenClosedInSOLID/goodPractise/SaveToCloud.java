package com.accessbank.OpenClosedInSOLID.goodPractise;

import com.accessbank.OpenClosedInSOLID.Order;
import com.accessbank.OpenClosedInSOLID.Save;

public class SaveToCloud implements Save {
    @Override
    public void save(Order order) {
        System.out.println("save to cloud");
    }
}
