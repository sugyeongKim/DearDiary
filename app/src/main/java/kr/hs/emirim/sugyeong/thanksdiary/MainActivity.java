package kr.hs.emirim.sugyeong.thanksdiary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);

        Button writebutton = findViewById(R.id.write);
        Button listbutton = findViewById((R.id.list));
        writebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,WrtieActivity.class);
                //응답을 받을 경우는 startActivityForResult를 사용한다.
                //아니면 그냥 StartActivity(intent)라 하면된다.
                //즉 둘다 액티비티를 화면에 띄우고  인텐트를 전달해주는 역할
                startActivity(intent);
            }
        });
        listbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ShowListActivty.class);
                //응답을 받을 경우는 startActivityForResult를 사용한다.
                //아니면 그냥 StartActivity(intent)라 하면된다.
                //즉 둘다 액티비티를 화면에 띄우고  인텐트를 전달해주는 역할
                startActivity(intent);
            }
        });
    }

}
