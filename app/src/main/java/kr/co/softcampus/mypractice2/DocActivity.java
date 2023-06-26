package kr.co.softcampus.mypractice2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class DocActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doc);

        Button sealClick = findViewById(R.id.click1);
        DocActivity.BtnListener btnListener = new DocActivity.BtnListener();
        sealClick.setOnClickListener(btnListener);

        Button sealClick2 = findViewById(R.id.click2);
        DocActivity.BtnListener btnListener2 = new DocActivity.BtnListener();
        sealClick2.setOnClickListener(btnListener2);

        Button sealClick3 = findViewById(R.id.click3);
        DocActivity.BtnListener btnListener3 = new DocActivity.BtnListener();
        sealClick3.setOnClickListener(btnListener3);

        Button sealClick4 = findViewById(R.id.click4);
        DocActivity.BtnListener btnListener4 = new DocActivity.BtnListener();
        sealClick4.setOnClickListener(btnListener4);

    }



    class BtnListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(DocActivity.this, ScanStartActivity.class);
            startActivity(intent);
        }
    }


}
