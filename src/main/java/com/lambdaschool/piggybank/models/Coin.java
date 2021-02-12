package com.lambdaschool.piggybank.models;

import javax.persistence.*;
import java.text.DecimalFormat;

@Entity
@Table(name = "coins")

public class Coin
{

    DecimalFormat fp = new DecimalFormat("$###,###.00");

    private int count;

    private double value;

    private String name;

    private String namePlural;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long coinId;


    public Coin()
    {

    }

    public Coin(
        double value,
        String name,
        String namePlural,
        long coinId)
    {
        this.value = value;
        this.name = name;
        this.namePlural = namePlural;
        this.coinId = coinId;
    }

    public int getCount()
    {
        return count;
    }

    public void setCount(int count)
    {
        this.count = count;
    }

    public double getValue()
    {
        return value;
    }

    public void setValue(double value)
    {
        this.value = value;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getNamePlural()
    {
        return namePlural;
    }

    public void setNamePlural(String namePlural)
    {
        this.namePlural = namePlural;
    }

    public long getCoinId()
    {
        return coinId;
    }

    public void setCoinId(long coinId)
    {
        this.coinId = coinId;
    }
}





