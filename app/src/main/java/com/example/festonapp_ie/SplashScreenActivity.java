package com.example.festonapp_ie;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class SplashScreenActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen_activity); // Liga com o layout XML da Splash

        // Aguarda 1.5 segundos antes de redirecionar
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(SplashScreenActivity.this, MainActivity.class);
            startActivity(intent);
            finish(); // Finaliza a SplashScreen para não voltar ao pressionar 'voltar'
        }, 1500); // 1500 milissegundos = 1.5 segundos
    }

}
