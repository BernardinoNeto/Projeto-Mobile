package com.neto.appboradezero.adapter;

import android.app.LauncherActivity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.neto.appboradezero.databinding.DrinkItemBinding;
import com.neto.appboradezero.model.Drinks;

import java.util.ArrayList;

public class DrinkAdapter extends RecyclerView.Adapter<DrinkAdapter.DrinkViewHolder> {

    private final ArrayList<Drinks> drinkList;
    private final Context context;

    public DrinkAdapter(ArrayList<Drinks> drinkList, Context context) {
        this.drinkList = drinkList;
        this.context = context;
    }

    @NonNull
    @Override
    public DrinkViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        DrinkItemBinding listItem;
        listItem = DrinkItemBinding.inflate(LayoutInflater.from(context), parent, false);
        return new DrinkViewHolder(listItem);
    }

    @Override
    public void onBindViewHolder(@NonNull DrinkViewHolder holder, int position) {
        holder.binding.imgDrink.setBackgroundResource(drinkList.get(position).getImgBeer());
        holder.binding.txtDrinkName.setText(drinkList.get(position).getDrinkName());
        holder.binding.txtDrinkDescription.setText(drinkList.get(position).getDrinkDescription());
        holder.binding.txtPrice.setText(drinkList.get(position).getPrice());
    }

    @Override
    public int getItemCount() {
        return drinkList.size();
    }

    public static class DrinkViewHolder extends RecyclerView.ViewHolder{

        DrinkItemBinding binding;
        public DrinkViewHolder(DrinkItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
