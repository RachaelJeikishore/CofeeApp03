package com.example.cofeeapp01;

public class Order {
    //attributes of Order
    private int _id;
    private String _custName;
    private int _saleAmount;
    //default constructor
    public Order() {
        _id = 0;
        _custName = null;
        _saleAmount = 0;
    }
    //2nd constuctor
    public Order(String _custName, int _saleAmount) {
        this._custName = _custName;
        this._saleAmount = _saleAmount;
    }

    //get methods

    public int get_id() {
        return _id;
    }

    public String get_custName() {
        return _custName;
    }

    public int get_saleAmount() {
        return _saleAmount;
    }
    //set methods
    public void set_id(int _id) {
        this._id = _id;
    }

    public void set_custName(String _custName) {
        this._custName = _custName;
    }

    public void set_saleAmount(int _saleAmount) {
        this._saleAmount = _saleAmount;
    }
}
