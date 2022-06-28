package com.app.bottomnavigationdemo;

public class stock {
    private String stockName;
    private String stockExchange;
    private String stockPrice;
    private String stockPriceChange;

    public stock(String stockName, String stockExchange, String stockPrice, String stockPriceChange) {
        this.stockName = stockName;
        this.stockExchange = stockExchange;
        this.stockPrice = stockPrice;
        this.stockPriceChange = stockPriceChange;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public String getStockExchange() {
        return stockExchange;
    }

    public void setStockExchange(String stockExchange) {
        this.stockExchange = stockExchange;
    }

    public String getStockPrice() {
        return stockPrice;
    }

    public void setStockPrice(String stockPrice) {
        this.stockPrice = stockPrice;
    }

    public String getStockPriceChange() {
        return stockPriceChange;
    }

    public void setStockPriceChange(String stockPriceChange) {
        this.stockPriceChange = stockPriceChange;
    }
}
