package com.example.user.billardtrainningapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewSwitcher;

/**
 * Created by user on 2017-04-06.
 */

public class CourseBook_Dwidol_Basic_Wide  extends AppCompatActivity {

    //Y=옆돌리기 F=앞돌리기 H=걸어치기 T=횡단샷 C=빗겨치기 B=뒤돌리기
    int[] B_Image_Array = {
            R.drawable.ba1,R.drawable.ba2,R.drawable.ba3,R.drawable.ba4,
            R.drawable.ba5,R.drawable.ba6,R.drawable.ba7
    };

    Intent CourseBook_Wide_Intent;
    Intent Youtube_Intent;
    String Route_Stage;
    ImageSwitcher CourseBook_Wide_ImageSwitcher;
    ImageSwitcher CourseBook_Wide_Value_ImageSwitcher;

    TextView CourseBook_Wide_Thick_Text;
    TextView CourseBook_Wide_PointnTip_Text;
    TextView CourseBook_Wide_Strock_Text;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coursebook_dwidol_basic_wide);

        Youtube_Intent = new Intent(getApplicationContext(), YouTubeActivity.class);

        CourseBook_Wide_Intent = getIntent();
        Route_Stage = CourseBook_Wide_Intent.getStringExtra("Level");

        CourseBook_Wide_ImageSwitcher = (ImageSwitcher) findViewById(R.id.coursebook_dwidol_basic_wide_imageswitcher);
        CourseBook_Wide_ImageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView = new ImageView(getApplicationContext());
                return imageView;
            }
        });
        CourseBook_Wide_Value_ImageSwitcher = (ImageSwitcher) findViewById(R.id.coursebook_dwidol_basic_wide_value_imageswitcher);
        CourseBook_Wide_Value_ImageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView = new ImageView(getApplicationContext());
                return imageView;
            }
        });

        CourseBook_Wide_Thick_Text = (TextView)findViewById(R.id.coursebook_dwidol_basic_wide_thick_text);
        CourseBook_Wide_PointnTip_Text = (TextView)findViewById(R.id.coursebook_dwidol_basic_wide_pointntip_text);
        CourseBook_Wide_Strock_Text = (TextView)findViewById(R.id.coursebook_dwidol_basic_wide_strock_text);

        switch (Route_Stage){
            case "1":
                CourseBook_Wide_ImageSwitcher.setImageResource(B_Image_Array[0]);
                CourseBook_Wide_ImageSwitcher.invalidate();
                CourseBook_Wide_Value_ImageSwitcher.setImageResource(GlobalVariable.yThreeValueArray[152]);
                CourseBook_Wide_Value_ImageSwitcher.invalidate();
                CourseBook_Wide_Thick_Text.setText("4/8");
                CourseBook_Wide_PointnTip_Text.setText("3시방향 / 1팁");
                CourseBook_Wide_Strock_Text.setText("일반 스트로크");
                Youtube_Intent.putExtra("CourseBook_to_Youtube","dwidol1");
                GlobalVariable.CourseBook_Youtube_Casenum=1;
                break;
            case "2":
                CourseBook_Wide_ImageSwitcher.setImageResource(B_Image_Array[1]);
                CourseBook_Wide_ImageSwitcher.invalidate();
                CourseBook_Wide_Value_ImageSwitcher.setImageResource(GlobalVariable.yThreeValueArray[148]);
                CourseBook_Wide_Value_ImageSwitcher.invalidate();
                CourseBook_Wide_Thick_Text.setText("4/8");
                CourseBook_Wide_PointnTip_Text.setText("2시방향 / 1팁");
                CourseBook_Wide_Strock_Text.setText("일반 스트로크");
                Youtube_Intent.putExtra("CourseBook_to_Youtube","dwidol1");
                GlobalVariable.CourseBook_Youtube_Casenum=2;
                break;
            case "3":
                CourseBook_Wide_ImageSwitcher.setImageResource(B_Image_Array[2]);
                CourseBook_Wide_ImageSwitcher.invalidate();
                CourseBook_Wide_Value_ImageSwitcher.setImageResource(GlobalVariable.yThreeValueArray[149]);
                CourseBook_Wide_Value_ImageSwitcher.invalidate();
                CourseBook_Wide_Thick_Text.setText("4/8");
                CourseBook_Wide_PointnTip_Text.setText("2시방향 / 2팁");
                CourseBook_Wide_Strock_Text.setText("일반 스트로크");
                Youtube_Intent.putExtra("CourseBook_to_Youtube","dwidol1");
                GlobalVariable.CourseBook_Youtube_Casenum=3;
                break;
            case "4":
                CourseBook_Wide_ImageSwitcher.setImageResource(B_Image_Array[3]);
                CourseBook_Wide_ImageSwitcher.invalidate();
                CourseBook_Wide_Value_ImageSwitcher.setImageResource(GlobalVariable.yThreeValueArray[150]);
                CourseBook_Wide_Value_ImageSwitcher.invalidate();
                CourseBook_Wide_Thick_Text.setText("4/8");
                CourseBook_Wide_PointnTip_Text.setText("2시방향 / 3팁");
                CourseBook_Wide_Strock_Text.setText("일반 스트로크");
                Youtube_Intent.putExtra("CourseBook_to_Youtube","dwidol1");
                GlobalVariable.CourseBook_Youtube_Casenum=4;
                break;
            case "5":
                CourseBook_Wide_ImageSwitcher.setImageResource(B_Image_Array[4]);
                CourseBook_Wide_ImageSwitcher.invalidate();
                CourseBook_Wide_Value_ImageSwitcher.setImageResource(GlobalVariable.yThreeValueArray[162]);
                CourseBook_Wide_Value_ImageSwitcher.invalidate();
                CourseBook_Wide_Thick_Text.setText("4/8");
                CourseBook_Wide_PointnTip_Text.setText("5시방향 / 3팁");
                CourseBook_Wide_Strock_Text.setText("일반 스트로크");
                Youtube_Intent.putExtra("CourseBook_to_Youtube","dwidol2");
                GlobalVariable.CourseBook_Youtube_Casenum=1;
                break;
            case "6":
                CourseBook_Wide_ImageSwitcher.setImageResource(B_Image_Array[5]);
                CourseBook_Wide_ImageSwitcher.invalidate();
                CourseBook_Wide_Value_ImageSwitcher.setImageResource(GlobalVariable.yThreeValueArray[161]);
                CourseBook_Wide_Value_ImageSwitcher.invalidate();
                CourseBook_Wide_Thick_Text.setText("4/8");
                CourseBook_Wide_PointnTip_Text.setText("5시방향 / 2팁");
                CourseBook_Wide_Strock_Text.setText("일반 스트로크");
                Youtube_Intent.putExtra("CourseBook_to_Youtube","dwidol2");
                GlobalVariable.CourseBook_Youtube_Casenum=2;
                break;
            case "7":
                CourseBook_Wide_ImageSwitcher.setImageResource(B_Image_Array[6]);
                CourseBook_Wide_ImageSwitcher.invalidate();
                CourseBook_Wide_Value_ImageSwitcher.setImageResource(GlobalVariable.yThreeValueArray[101]);
                CourseBook_Wide_Value_ImageSwitcher.invalidate();
                CourseBook_Wide_Thick_Text.setText("3/8");
                CourseBook_Wide_PointnTip_Text.setText("2시방향 / 2팁");
                CourseBook_Wide_Strock_Text.setText("부드럽게 밀어치는 스트로크");
                Youtube_Intent.putExtra("CourseBook_to_Youtube","dwidol2");
                GlobalVariable.CourseBook_Youtube_Casenum=3;
                break;
        }
    }
    public void coursebook_youtube(View v){
        GlobalVariable.CourseBook_Youtube_Switcher = 1;
        startActivity(Youtube_Intent);
    }
}