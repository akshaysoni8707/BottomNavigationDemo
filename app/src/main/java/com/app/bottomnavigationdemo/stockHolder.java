package com.app.bottomnavigationdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class stockHolder extends RecyclerView.Adapter<stockHolder.stockViewHolder> {
    Context context;
    ArrayList<stock> myStocks;

    public stockHolder(Context context, ArrayList<stock> myStocks) {
        this.context = context;
        this.myStocks = myStocks;
    }

    @NonNull
    @Override
    public stockHolder.stockViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new stockViewHolder(LayoutInflater.from(context).inflate(R.layout.stock_card,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull stockHolder.stockViewHolder holder, int position) {
            stock myStock = myStocks.get(position);
            holder.stockName.setText(myStock.getStockName());
            holder.stockExchange.setText(myStock.getStockExchange());
            holder.stockPrice.setText(myStock.getStockPrice());
            holder.stockPriceChange.setText(myStock.getStockPriceChange());
    }

    @Override
    public int getItemCount() {
        return myStocks.size();
    }

    public static class stockViewHolder extends RecyclerView.ViewHolder {
        TextView stockName;
        TextView stockExchange;
        TextView stockPrice;
        TextView stockPriceChange;

        public stockViewHolder(@NonNull View itemView) {
            super(itemView);
            stockName = itemView.findViewById(R.id.stockName);
            stockExchange = itemView.findViewById(R.id.stockExchange);
            stockPrice = itemView.findViewById(R.id.latestPrice);
            stockPriceChange = itemView.findViewById(R.id.priceChange);
        }
    }
}
