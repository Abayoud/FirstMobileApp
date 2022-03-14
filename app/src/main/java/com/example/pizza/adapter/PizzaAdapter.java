package com.example.pizza.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.pizza.R;
import com.example.pizza.classes.Pizza;
import com.example.pizza.service.PizzaService;

import java.util.List;

public class PizzaAdapter extends BaseAdapter {
    private List<Pizza> pizzas;
    private LayoutInflater inflater;

    public PizzaAdapter(Activity activity, List<Pizza> pizzas) {
        this.pizzas = pizzas;
        inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return pizzas.size();
    }

    @Override
    public Object getItem(int position) {
        return pizzas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position + 1;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null)
            convertView = inflater.inflate(R.layout.pizza_item, null);

        TextView idf = convertView.findViewById(R.id.idP);
        TextView nom = convertView.findViewById(R.id.nom);
        TextView ingredientsNb = convertView.findViewById(R.id.ingredientsNb);
        ImageView icon = convertView.findViewById(R.id.icon);
        TextView temps = convertView.findViewById(R.id.tempsText);

        idf.setText(pizzas.get(position).getId()+"");
        nom.setText(pizzas.get(position).getNom());
        ingredientsNb.setText(pizzas.get(position).getNbIngredients()+"");
        icon.setImageResource(pizzas.get(position).getPhoto());
        temps.setText(pizzas.get(position).getDuree());

        return convertView;
    }
}
