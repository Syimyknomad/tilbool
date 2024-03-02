package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Создаем объект Handler
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Создаем Intent для перехода на вторую активность
                Intent intent = new Intent(MainActivity.this, secondpg2.class);
                // Запускаем вторую активность
                startActivity(intent);
                // Завершаем текущую активность (если вы хотите, чтобы главная страница не оставалась в стеке)
                finish();
            }
        }, 3000); // Задержка в миллисекундах (в данном случае 2000 миллисекунд или 2 секунды)
    }
}
