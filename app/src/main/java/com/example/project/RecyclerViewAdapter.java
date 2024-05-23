package com.example.project;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private  List<Buildings> buildingsList;
    private final LayoutInflater layoutInflater;
    private final OnClickListener onClickListener;

    RecyclerViewAdapter(Context context, List<Buildings> buildingsList, OnClickListener onClickListener) {
        this.layoutInflater = LayoutInflater.from(context);
        this.buildingsList = buildingsList;
        this.onClickListener = onClickListener;
    }

    @Override
    @NonNull
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.my_new_layout, parent, false);
        return new ViewHolder(view);


    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Buildings building = buildingsList.get(position);
        holder.countryTextView.setText("<b>Country:<b/> " + building.getCountry() + ".");
        holder.cityTextView.setText("<b>City:<b/> " + building.getCity() + ".");
        holder.floorsTextView.setText("<b>Floors:<b/> " + building.getFloors() + ".");
        holder.buildYearTextView.setText("<b>Build Year:<b/> " + building.getBuildYear() + ".");
        holder.heightTextView.setText("<b>Height:<b/> " + building.getHeight() + ".");
        

    }

    @Override
    public int getItemCount() {
        return buildingsList.size();
    }

    public void updateBuildings(List<Buildings> buildings) {
        buildingsList.addAll(buildings);
        this.notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView countryTextView;
        TextView cityTextView;
        TextView floorsTextView;
        TextView buildYearTextView;

        TextView heightTextView;
        ViewHolder(View itemView) {
            super(itemView);

            countryTextView = itemView.findViewById(R.id.countryTextView);
            cityTextView = itemView.findViewById(R.id.cityTextView);
            floorsTextView = itemView.findViewById(R.id.floorsTextView);
            buildYearTextView = itemView.findViewById(R.id.buildYearTextView);
            heightTextView = itemView.findViewById(R.id.heightTextView);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            onClickListener.onClick(buildingsList.get(getAdapterPosition()));
        }
    }

    public interface OnClickListener {

        void onClick(Buildings building);
    }

}
