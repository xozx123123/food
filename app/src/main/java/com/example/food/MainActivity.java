package com.example.food;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    String storename[]={"五十嵐","咖拎老師勒","翊芳小館","醬飯屋","長瀨定食","Papa pasta","吃呼義料","弘爺漢堡","欣宏牛肉麵","牛奶皇后","COCO都可","重慶酸辣粉","九嬸婆豆花","文化大學牛肉拌麵","麥味登","晶典水果果汁店","夜巴黎","新和佳快餐","不一樣燒臘店","滄州燒臘快餐"};
    String storephone[]={"02-26265451","0952433101","02-26290063","02-86316029","02-26259384","0984430333","02-26298046","02-26229006","02-26225205","02-26281637","02-26237260","02-86316633","0931269128","02-26238220","02-26225821","02-86318646",
            "02-26200204","02-26250018","02-26215627","02-26233433"};
    int breakfastn[]={7,14};
    int lunchn[]={1,3,5,8,13,17,19};
    int dinnern[]={2,4,6,11,18};
    int drinkn[]={0,9,10,12,15,16};
    boolean[] storechoose;
    CheckBox breakfast;
    CheckBox lunch;
    CheckBox dinner;
    CheckBox drink;
    TextView printout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        breakfast =findViewById(R.id.checkBoxbreak);
        lunch =findViewById(R.id.checkBoxlunch);
        dinner =findViewById(R.id.checkBoxdinner);
        drink =findViewById(R.id.checkBoxdrink);
        printout=findViewById(R.id.textView);
        breakfast.setOnCheckedChangeListener(listeners);
        lunch.setOnCheckedChangeListener(listeners);
        dinner.setOnCheckedChangeListener(listeners);
        drink.setOnCheckedChangeListener(listeners);
        storechoose=new boolean[storename.length];
    }
    public CompoundButton.OnCheckedChangeListener listeners=new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            switch (buttonView.getId()){
                case R.id.checkBoxbreak:
                    if (isChecked){
                        for (int i=0;i<breakfastn.length;i++){
                            storechoose[breakfastn[i]]=true;
                        }
                    }
                    else {
                        for (int i=0;i<breakfastn.length;i++){
                            storechoose[breakfastn[i]]=false;
                        }
                    }
                    break;
                case R.id.checkBoxlunch:
                    if (isChecked){
                        for (int i=0;i<lunchn.length;i++){
                            storechoose[lunchn[i]]=true;
                        }
                    }
                    else {
                        for (int i=0;i<lunchn.length;i++){
                            storechoose[lunchn[i]]=false;
                        }
                    }
                    break;
                case R.id.checkBoxdinner:
                    if (isChecked){
                        for (int i=0;i<dinnern.length;i++){
                            storechoose[dinnern[i]]=true;
                        }
                    }
                    else {
                        for (int i=0;i<dinnern.length;i++){
                            storechoose[dinnern[i]]=false;
                        }
                    }
                    break;
                case R.id.checkBoxdrink:
                    if (isChecked){
                        for (int i=0;i<drinkn.length;i++){
                            storechoose[drinkn[i]]=true;
                        }
                    }
                    else {
                        for (int i=0;i<drinkn.length;i++){
                            storechoose[drinkn[i]]=false;
                        }
                    }
                    break;
            }
        }
    };
    Random r=new Random();
    boolean nullchose=true;
    public void Onclickeat(View v){
        printout.setTextSize(20);
        printout.setTextColor(getResources().getColor(R.color.colorred));
        printout.setTextAlignment(View.TEXT_ALIGNMENT_GRAVITY);
        int rand;
        for (int i=0;i<storechoose.length;i++){
            if (storechoose[i]){
                nullchose=false;
                break;
            }
        }
        while (!nullchose){
            rand=r.nextInt(storechoose.length);
            if (storechoose[rand]){
                printout.setText("storeName:"+storename[rand]+"\n"+"storePhone"+storephone[rand]);
                break;
            }
        }
    }

    public void Onclickmap(View v){
        Intent mapintent=new Intent();
        mapintent.setClass(MainActivity.this,Map.class);
        startActivity(mapintent);
        this.finish();
    }

}
