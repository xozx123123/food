package com.example.food;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Map extends Activity {
    ImageButton fifty;ImageButton curry;ImageButton EF;ImageButton JF;ImageButton PP;
    ImageButton CL;ImageButton HO;ImageButton CH;ImageButton Milk;ImageButton Coco;
    ImageButton Sort;ImageButton Nine;ImageButton Culture;ImageButton MD;ImageButton JD;
    ImageButton LB;ImageButton New;ImageButton Di;ImageButton CJ;
    AlertDialog.Builder build ;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map);
        fifty=findViewById(R.id.imageButton50);
        curry =findViewById(R.id.imageButtonCurry);
        EF=findViewById(R.id.imageButtonEF);
        JF=findViewById(R.id.imageButtonJF);
        PP=findViewById(R.id.imageButtoncPP);
        CL=findViewById(R.id.imageButtonCL);
        CH=findViewById(R.id.imageButtonCH);
        Milk=findViewById(R.id.imageButtonMilk);
        Coco=findViewById(R.id.imageButtonCoco);
        Sort=findViewById(R.id.imageButtonSort);
        Culture=findViewById(R.id.imageButtonCulture);
        Nine=findViewById(R.id.imageButtonNine);
        MD=findViewById(R.id.imageButtonMD);
        JD=findViewById(R.id.imageButtonJD);
        LB=findViewById(R.id.imageButtonLB);
        New=findViewById(R.id.imageButtonNew);
        Di=findViewById(R.id.imageButtonDi);
        CJ=findViewById(R.id.imageButtonCJ);
        HO=findViewById(R.id.imageButtonHO);
        build=new AlertDialog.Builder(this);

    }
    public void BackOnclick(View v){
        Intent back=new Intent();
        back.setClass(Map.this,MainActivity.class);
        startActivity(back);
        this.finish();
    }
    public void curryOnclick(View v){
        build.setTitle("咖拎老師勒");
        build.setMessage("0952433101");
        build.setPositiveButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        build.create();
        build.show();
    }
    public void fiftyOnclick(View v){
        build.setTitle("五十嵐");
        build.setMessage("02-26265451");
        build.setPositiveButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        build.show();
    }
    public void EFOnclick(View v){
        build.setTitle("翊芳小館");
        build.setMessage("02-26290063");
        build.setPositiveButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        build.show();
    }
    public void JFOnclick(View v){
        build.setTitle("醬飯屋");
        build.setMessage("02-86316029");
        build.setPositiveButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        build.show();
    }public void PPOnclick(View v){
        build.setTitle("Papa pasta");
        build.setMessage("02-26259384");
        build.setPositiveButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        build.show();
    }
    public void CLOnclick(View v){
        build.setTitle("吃呼義料");
        build.setMessage("0984430333");
        build.setPositiveButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        build.show();
    }
    public void HOOnclick(View v){
        build.setTitle("弘爺漢堡");
        build.setMessage("02-26229006");
        build.setPositiveButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        build.show();
    }
    public void CHOnclick(View v){
        build.setTitle("欣宏牛肉麵");
        build.setMessage("02-26225205");
        build.setPositiveButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        build.show();
    }
    public void MilkOnclick(View v){
        build.setTitle("牛奶皇后");
        build.setMessage("02-26281637");
        build.setPositiveButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        build.show();
    }
    public void CocoOnclick(View v){
        build.setTitle("COCO都可");
        build.setMessage("02-26237260");
        build.setPositiveButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        build.show();
    }
    public void SortOnclick(View v){
        build.setTitle("重慶酸辣粉");
        build.setMessage("02-86316633");
        build.setPositiveButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        build.show();
    }
    public void NineOnclick(View v){
        build.setTitle("九嬸婆豆花");
        build.setMessage("0931269128");
        build.setPositiveButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        build.show();
    }
    public void cultureOnclick(View v){
        build.setTitle("文化大學牛肉拌麵");
        build.setMessage("02-26238220");
        build.setPositiveButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        build.show();
    }
    public void MDOnclick(View v){
        build.setTitle("麥味登");
        build.setMessage("02-26225821");
        build.setPositiveButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        build.show();
    }
    public void JDOnclick(View v){
        build.setTitle("晶典水果果汁店");
        build.setMessage("02-86318646");
        build.setPositiveButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        build.show();
    }
    public void LBOnclick(View v){
        build.setTitle("夜巴黎");
        build.setMessage("02-26200204");
        build.setPositiveButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        build.show();
    }
    public void NewOnclick(View v){
        build.setTitle("新和佳快餐");
        build.setMessage("02-26250018");
        build.setPositiveButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        build.show();
    }
    public void DiOnclick(View v){
        build.setTitle("不一樣燒臘店");
        build.setMessage("02-26215627");
        build.setPositiveButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        build.show();
    }
    public void CJOnclick(View v){
        build.setTitle("滄州燒臘快餐");
        build.setMessage("02-26233433");
        build.setPositiveButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        build.show();
    }
    public void CDOnclick(View v){
        build.setTitle("長瀨定食");
        build.setMessage("02-26259384");
        build.setPositiveButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        build.show();
    }


}
