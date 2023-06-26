package kr.co.softcampus.mypractice2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class StartMainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        Button startButton = findViewById(R.id.selectButton);
        StartMainActivity.BtnListener listener2 = new StartMainActivity.BtnListener();
        startButton.setOnClickListener(listener2);
    }

    class BtnListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            Intent intent2 = new Intent(StartMainActivity.this, StartActivity.class);
            startActivity(intent2);
        }
    }
}