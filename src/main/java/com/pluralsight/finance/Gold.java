package com.pluralsight.finance;

import java.math.BigDecimal;

public class Gold extends FixedAsset {
    private double Weight;

    public Gold(String name, double weight) {
        super(name);
        Weight = weight;
    }

    @Override
    public BigDecimal getValue() {
        return null;
    }
}
