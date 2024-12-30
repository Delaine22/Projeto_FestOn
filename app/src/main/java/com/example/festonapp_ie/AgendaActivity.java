package com.example.festonapp_ie;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class AgendaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_agenda);

        // Referenciar o botão
        Button exploreBtn = findViewById(R.id.exploreBtn);

        // Configurar o clique do botão
        exploreBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                // IR PARA A PAGINA HOME
                Intent intent = new Intent(AgendaActivity.this, MainActivity.class); //pagina home
                startActivity(intent);
            }
        });

        // BTN AGENDA
        ImageView btnAgenda = findViewById(R.id.agendaBtn);
        btnAgenda.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //Pagina AGENDA
            }
        });

        // BTN HOME
        ImageView btnHome = findViewById(R.id.homeBtn);
        btnHome.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(AgendaActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // FuNCAO ONCLICK NO ICONE SEARCH (BTNSEARCH)
        ImageView btnSearch = findViewById(R.id.searchBtn);
        btnSearch.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(AgendaActivity.this, SearchActivity.class);
                startActivity(intent);
            }
        });

        // FUNCAO ONCLICK NO ICONE PROFILE (BTNPROFILE)
        ImageView btnPerfil = findViewById(R.id.profileBtn);
        btnPerfil.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(AgendaActivity.this, PerfilActivity.class);
                startActivity(intent);
            }

        });





        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}