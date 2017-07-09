package dong.lan.labeltextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import dong.lan.labelTextview.LabelTextView;

public class MainActivity extends AppCompatActivity {

    private LabelTextView text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = (LabelTextView) findViewById(R.id.text1);
        text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text1.isLoading()){
                    text1.finishLoading("加载完毕");
                }else
                text1.startLoading();
            }
        });
    }
}
