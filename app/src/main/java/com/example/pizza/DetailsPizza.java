package com.example.pizza;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pizza.classes.Pizza;
import com.example.pizza.service.PizzaService;

public class DetailsPizza extends AppCompatActivity {
    private PizzaService ps = PizzaService.getInstance();
    private ImageView icon;
    private TextView nom, description, ingredients, preparation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_pizza);

        icon = findViewById(R.id.iconD);
        nom = findViewById(R.id.nomD);
        description = findViewById(R.id.descriptionD);
        ingredients = findViewById(R.id.ingredientsD);
        preparation = findViewById(R.id.preparationD);

        Pizza p = ps.findById(Integer.parseInt(getIntent().getStringExtra("idP")));

        icon.setImageResource(p.getPhoto());
        nom.setText(p.getNom());
        description.setText(p.getDescription());
        ingredients.setText(p.getDetailsIngred());
        preparation.setText(p.getPreparation());
    }
}