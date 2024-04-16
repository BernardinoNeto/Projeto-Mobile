package com.neto.appboradezero;

import android.app.Activity;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.neto.appboradezero.R;
import com.neto.appboradezero.adapter.DrinkAdapter;
import com.neto.appboradezero.databinding.ActivityMainBinding;
import com.neto.appboradezero.model.Drinks;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private DrinkAdapter drinkAdapter;
    private ArrayList<Drinks> drinkList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        RecyclerView recyclerViewDrink = binding.RecycleViewDrink;
        recyclerViewDrink.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewDrink.setHasFixedSize(true);
        drinkAdapter = new DrinkAdapter(drinkList, this);
        recyclerViewDrink.setAdapter(drinkAdapter);
        getDrink();
    }

    private void getDrink(){
        Drinks drink1 = new Drinks(
                R.drawable.budweiser_zero,
                "Budweiser Zero",
                "Possui sabor suave e refrescante, com notas de malte e lúpulo. Possui 350ml e é ideal para quem deseja desfrutar de um sabor único sem comprometer a saúde.",
                "R$ 6,99"
        );
        drinkList.add(drink1);

        Drinks drink2 = new Drinks(
                R.drawable.heineken_zero,
                "Heineken Zero",
                "A Heineken® 0.0 é duplamente fermentado com ingredientes naturais, que são os mesmos usados para a Heineken® Original (Água, Malte de Cevada, Extrato de Lúpulo e levedura A).",
                "R$ 7,99"
        );
        drinkList.add(drink2);

        Drinks drink3 = new Drinks(
                R.drawable.freixenet_zero,
                "Freixenet Zero",
                "O Espumante Freixenet Alcohol Free 750 ml é uma inovação lançada na Europa em 2011. Utilizando uma destilação a vácuo em baixa temperatura na fermentação, minimiza a perda de componentes aromáticos.",
                "R$ 59,90"
        );
        drinkList.add(drink3);

        Drinks drink4 = new Drinks(
                R.drawable.garibaldi_ice_zero,
                "Garibaldi Ice Zero",
                "O ICE Zero álcool, elaborado com suco de uva das variedades Moscato Branco e Niágara, é adocicado com boa acidez e refrescância, podendo ou não ser adicionado de gelo no momento do consumo.",
                "R$ 35,90"
        );
        drinkList.add(drink4);

        Drinks drink5 = new Drinks(
                R.drawable.casa_navaronne,
                "Vinho Casa Navaronne La Dorni",
                "O Casa Navaronne é um vinho sem álcool meio seco, produzido com uvas bordô, de corpo e paladar fino. Sua estrutura se apresenta de maneira delicada, equilibrada. Em boca é macio, agradável, com taninos equilibrados e retrogosto leve de mascavo.",
                "R$ 39,90"
        );
        drinkList.add(drink5);
    }

}