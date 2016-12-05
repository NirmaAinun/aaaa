package id.sch.smktelkom_mlg.exam.ujianpraktekexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    EditText etBil1;
    EditText etBil2;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Pengurangan");

        etBil1 = (EditText) findViewById(R.id.editTextPertama);
        etBil2 = (EditText) findViewById(R.id.editTextKedua);
        tvHasil = (TextView) findViewById(R.id.textViewHasil);

        findViewById(R.id.buttonHitung).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                doHitung();
            }
        });
    }

    private void doHitung()
    {
        int a = etBil1.getText().toString().isEmpty()?0:Integer.parseInt(etBil1.getText().toString());
        int b = etBil2.getText().toString().isEmpty()?0:Integer.parseInt(etBil2.getText().toString());

        tvHasil.setText(a+"-"+b+"="+(a-b));
    }
}
