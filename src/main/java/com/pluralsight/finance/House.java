package com.pluralsight.finance;

import java.math.BigDecimal;

public class House extends FixedAsset {
    private int yearBuilt;
    private int squareFeet;
    private int bedrooms;

    public House(String name, int yearBuilt, int squareFeet, int bedrooms) {
        super(name);
        this.yearBuilt = yearBuilt;
        this.squareFeet = squareFeet;
        this.bedrooms = bedrooms;
    }

    @Override
    public BigDecimal getValue() {
        BigDecimal value = BigDecimal.ZERO;
        // Plus 25 cents per square foot of lot. add() returns a NEW
        // BigDecimal, so the result has to be assigned back to value
        value = value.add(new BigDecimal("200").multiply(BigDecimal.valueOf(squareFeet)));
        return value;
    }

    @Override
    public String toString() {
        return "House{" +
                "yearBuilt=" + yearBuilt +
                ", squareFeet=" + squareFeet +
                ", bedrooms=" + bedrooms +
                '}';
    }
}
