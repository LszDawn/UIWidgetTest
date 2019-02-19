package com.example.lsz.uiwidgettest;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editText;

    private ImageView imageView;

    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        editText = findViewById(R.id.edit_text);
        imageView = findViewById(R.id.luosizhi);
        progressBar = findViewById(R.id.progress_bar);
        button.setOnClickListener(this);
    }

    //不用匿名内部类的方式来监听click事件，而使用实现接口的方式
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                //String inputText = editText.getText().toString();
                //Toast.makeText(MainActivity.this, inputText, Toast.LENGTH_LONG).show();
                //imageView.setImageResource(R.drawable.haopengjie);
                /*if (progressBar.getVisibility() == View.VISIBLE){
                    progressBar.setVisibility(View.GONE);
                }else {
                    progressBar.setVisibility(View.VISIBLE);
                }*/
                /*int progress = progressBar.getProgress();
                progress += 10;
                progressBar.setProgress(progress);*/

                //警告框AlertDialog
                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                dialog.setTitle("警告你！");
                dialog.setMessage("这个很重要");
                dialog.setCancelable(false);
                dialog.setPositiveButton("好吧", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                dialog.setNegativeButton("拒绝", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                dialog.show();
        }
    }
}
