package com.pluralsight.finance;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Portfolio {
    private String name;
    private String owner;
    private List<Valuable> assets = new ArrayList<Valuable>();

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    public void add(Valuable asset) {
        assets.add(asset);
    }
    public double getValue() {
        double value = 0;
        for (Valuable asset : assets) {
            value += Double.parseDouble(String.valueOf(asset.getValue()));
        }
        return value;
    }
    public Valuable getMostValuable() {
        assets.sort(Comparator.comparing(Valuable::getValue).reversed());
        Valuable value = assets.get(0);
        return value;
    }
    public Valuable getLeastValuable() {
        assets.sort(Comparator.comparing(Valuable::getValue));
        Valuable value = assets.get(0);
        return value;
    }

    @Override
    public String toString() {
        return "Portfolio{" +
                "name='" + name + '\'' +
                ", owner='" + owner + '\'' +
                ", assets=" + assets +
                '}';
    }
}
