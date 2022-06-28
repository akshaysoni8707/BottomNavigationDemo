package com.app.bottomnavigationdemo.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.app.bottomnavigationdemo.databinding.FragmentHomeBinding;
import com.app.bottomnavigationdemo.stock;
import com.app.bottomnavigationdemo.stockHolder;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        ArrayList<stock> myStocks = new ArrayList<>();

        myStocks.add(new stock("TCS","NSE","3318.15","+3.45(+0.10%)"));
        myStocks.add(new stock("HCL","NSE","1001.95","+9.60(+0.97%)"));
        myStocks.add(new stock("TECHM","NSE","1020.70","+3.45(+0.10%)"));
        myStocks.add(new stock("INFY","NSE","1480.15","+13.50(+1.34%)"));
        myStocks.add(new stock("WIPRO","NSE","427.25","+5.55(+0.38%)"));
        myStocks.add(new stock("LTI","NSE","4222.60","+59.30(+1.42%)"));
        myStocks.add(new stock("MINDTREE","NSE","3027.05","+68.50(+2.32%)"));

        RecyclerView stockRecycler = binding.stocklist;
        stockHolder stockAdapter = new stockHolder(container.getContext(),myStocks);
        stockRecycler.setLayoutManager(new LinearLayoutManager(container.getContext(),LinearLayoutManager.VERTICAL,false));
        stockRecycler.setAdapter(stockAdapter);


        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}