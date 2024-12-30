package com.example.festonapp_ie;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // FUNCAO ONCLICK NO ICONE HOME
        ImageView btnHome = findViewById(R.id.homeBtn);
        btnHome.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                // Já estamos na Home, talvez exibir uma mensagem ou recarregar
            }
        });

        // BTN SEARCH (FUNCAO ON CLICK NO ICONE SEARCH)
        ImageView btnSearch = findViewById(R.id.searchBtn);
        btnSearch.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, SearchActivity.class);
                startActivity(intent);
            }
        });

        // FuNCAO ONCLICK NO ICONE AGENDA (BTNAGENDA)
        ImageView btnAgenda = findViewById(R.id.agendaBtn);
        btnAgenda.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, AgendaActivity.class);
                startActivity(intent);
            }
        });

        // FUNCAO ONCLICK NO ICONE PROFILE (BTNPROFILE)
        ImageView btnPerfil = findViewById(R.id.profileBtn);
        btnPerfil.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, PerfilActivity.class);
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