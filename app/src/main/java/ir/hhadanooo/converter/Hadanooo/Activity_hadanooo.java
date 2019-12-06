package ir.hhadanooo.converter.Hadanooo;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import ir.hhadanooo.converter.R;

public class Activity_hadanooo extends AppCompatActivity {

    Button btn_submit;
    ImageView img;
    DisplayMetrics dm;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hadanooo);


        btn_submit = findViewById(R.id.btn_submit);
        img = findViewById(R.id.img);

        if (checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE) !=
                PackageManager.PERMISSION_GRANTED){
            requestPermissions(new String[] {Manifest.permission.WRITE_EXTERNAL_STORAGE} , 123);
        }

        dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);


        final Bitmap bitmap = BitmapFactory.decodeResource(getResources() , R.drawable.whait , null);
        final Bitmap mBitmap = bitmap.copy(Bitmap.Config.ARGB_8888, true);
        final Bitmap myBitmap = Bitmap.createScaledBitmap(mBitmap, 300, 300, false);



        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                /*myBitmap.setHeight((int) (dm.widthPixels/3.60));
                myBitmap.setWidth((int) (dm.widthPixels/3.60));*/



                //method 1
                /*int[] pixels = new int[myBitmap.getHeight()*myBitmap.getWidth()];
                myBitmap.getPixels(pixels, 0, myBitmap.getWidth(), 0, 0, myBitmap.getWidth(), myBitmap.getHeight());
                for (int i=0; i<myBitmap.getWidth()*150; i++)
                    pixels[i] = Color.rgb(15,200 ,150);
                myBitmap.setPixels(pixels, 0, myBitmap.getWidth(), 0, 0, myBitmap.getWidth(), myBitmap.getHeight());


                for (int i=myBitmap.getWidth()*150; i<myBitmap.getWidth()*300; i++)
                    pixels[i] = Color.rgb(155,140 ,10);
                myBitmap.setPixels(pixels, 0, myBitmap.getWidth(), 0, 0, myBitmap.getWidth(), myBitmap.getHeight());*/

                Toast.makeText(Activity_hadanooo.this, ""+myBitmap.getHeight()+"\n"+myBitmap.getWidth(), Toast.LENGTH_SHORT).show();






                //method 2

                myBitmap.setPixel(0 , 4 , Color.rgb(30,93,135));
                myBitmap.setPixel(1 , 4 , Color.rgb(30,93,135));
                myBitmap.setPixel(0 , 5 , Color.rgb(35,50,40));
                myBitmap.setPixel(1 , 5 , Color.rgb(35,50,40));
                myBitmap.setPixel(2 , 4 , Color.rgb(146,149,158));
                myBitmap.setPixel(3 , 4 , Color.rgb(146,149,158));
                myBitmap.setPixel(2 , 5 , Color.rgb(200,10,80));
                myBitmap.setPixel(3 , 5 , Color.rgb(200,10,80));
                myBitmap.setPixel(4 , 4 , Color.rgb(71,65,206));
                myBitmap.setPixel(5 , 4 , Color.rgb(71,65,206));
                myBitmap.setPixel(4 , 5 , Color.rgb(180,18,19));
                myBitmap.setPixel(5 , 5 , Color.rgb(180,18,19));
                myBitmap.setPixel(6 , 4 , Color.rgb(12,15,13));
                myBitmap.setPixel(7 , 4 , Color.rgb(12,15,13));
                myBitmap.setPixel(6 , 5 , Color.rgb(228,29,87));
                myBitmap.setPixel(7 , 5 , Color.rgb(228,29,87));
                myBitmap.setPixel(8 , 4 , Color.rgb(138,163,179));
                myBitmap.setPixel(9 , 4 , Color.rgb(138,163,179));
                myBitmap.setPixel(8 , 5 , Color.rgb(215,100,11));
                myBitmap.setPixel(9 , 5 , Color.rgb(215,100,11));
                myBitmap.setPixel(10 , 4 , Color.rgb(12,8,9));
                myBitmap.setPixel(11 , 4 , Color.rgb(12,8,9));
                myBitmap.setPixel(10 , 5 , Color.rgb(254,8,212));
                myBitmap.setPixel(11 , 5 , Color.rgb(254,8,212));
                myBitmap.setPixel(12 , 4 , Color.rgb(1,1,1));
                myBitmap.setPixel(13 , 4 , Color.rgb(1,1,1));
                myBitmap.setPixel(12 , 5 , Color.rgb(56,200,140));
                myBitmap.setPixel(13 , 5 , Color.rgb(56,200,14));
                myBitmap.setPixel(14 , 4 , Color.rgb(252,230,3));
                myBitmap.setPixel(15 , 4 , Color.rgb(252,230,3));
                myBitmap.setPixel(14 , 5 , Color.rgb(52,30,3));
                myBitmap.setPixel(15 , 5 , Color.rgb(52,30,3));
                myBitmap.setPixel(16 , 4 , Color.rgb(98,105,91));
                myBitmap.setPixel(17 , 4 , Color.rgb(98,105,91));
                myBitmap.setPixel(16 , 5 , Color.rgb(201,201,201));
                myBitmap.setPixel(17 , 5 , Color.rgb(201,201,201));
                myBitmap.setPixel(18 , 4 , Color.rgb(186,108,198));
                myBitmap.setPixel(19 , 4 , Color.rgb(186,108,198));
                myBitmap.setPixel(18 , 5 , Color.rgb(52,255,255));
                myBitmap.setPixel(19 , 5 , Color.rgb(52,255,255));
                myBitmap.setPixel(20 , 4 , Color.rgb(36,37,35));
                myBitmap.setPixel(21 , 4 , Color.rgb(36,37,35));
                myBitmap.setPixel(20 , 5 , Color.rgb(63,73,53));
                myBitmap.setPixel(21 , 5 , Color.rgb(63,73,53));



                img.setImageBitmap(myBitmap);

                String file_path = Environment.getExternalStorageDirectory().getAbsolutePath() +
                        "/raminhacker";
                File dir = new File(file_path);
                if(!dir.exists())
                    dir.mkdirs();
                File file = new File(dir, "hhdanooo"+ ".png");
                try {
                    FileOutputStream fOut = new FileOutputStream(file);
                    myBitmap.compress(Bitmap.CompressFormat.PNG, 100, fOut);
                    fOut.flush();
                    fOut.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }


            }
        });

    }
}
