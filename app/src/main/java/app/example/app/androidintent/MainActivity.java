package app.example.app.androidintent;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Implicit
    public void openGmail(View v){
        Intent mail = new Intent();
        mail.setAction(Intent.ACTION_SEND);
        mail.setType("message/xxx");
        mail.putExtra(Intent.EXTRA_EMAIL, new String[]{"info@besant.com"});
        mail.putExtra(Intent.EXTRA_CC, new String[]{"hr@besant.com"});
        mail.putExtra(Intent.EXTRA_BCC, new String[]{"mydad@gmail.com"});
        mail.putExtra(Intent.EXTRA_SUBJECT, "Android Course");
        mail.putExtra(Intent.EXTRA_TEXT, "I am writing this mail to know about fees structure of...");
        startActivity(Intent.createChooser(mail, "Send Email Using: "));
    }

    //Implicit
    public  void openCamera(View v){
        Intent camera = new Intent(MediaStore.ACTION_VIDEO_CAPTURE);
        startActivity(camera);
    }

    //Implicit
    public  void openDialScreen(View v){
        Intent dial = new Intent(Intent.ACTION_DIAL);
        dial.setData(Uri.parse("tel:9032743279"));
        startActivity(dial);
    }

    //Implicit
    public void openBrowser(View v){
        Intent browser = new Intent(Intent.ACTION_VIEW);
        browser.setData(Uri.parse("https://about.me"));
        startActivity(browser);
    }

    //Implicit
    public  void openContacts(View v){
        Intent contact = new Intent(Intent.ACTION_VIEW);
        contact.setData(Uri.parse("content://contacts/people"));
        startActivity(contact);
    }

    //Implicit
    public  void openCallLog(View v){
        Intent logs = new Intent(Intent.ACTION_VIEW);
        logs.setData(Uri.parse("content://call_log/calls"));
        startActivity(logs);
    }

    //Implicit
    public  void openGallery(View v){
        Intent gallery = new Intent(Intent.ACTION_VIEW);
        gallery.setData(Uri.parse("content://media/external/images/media/"));
        startActivity(gallery);
    }

    //Explicit
    public  void goNextActivity(View v){
       /*Intent intent = new Intent(MainActivity.this, SecondActivity.class);
       startActivity(intent);*/

       /*Intent intent = new Intent();
       intent.setClass(MainActivity.this, SecondActivity.class);
       startActivity(intent);*/

      /*  startActivity(new Intent(MainActivity.this, SecondActivity.class));*/

        Intent intent = new Intent();
        ComponentName comp = new ComponentName(MainActivity.this, SecondActivity.class);
        intent.setComponent(comp);
        startActivity(intent);
    }

    //Explicit
    public  void goNextActivityParams(View v){
        Intent i=new Intent(MainActivity.this, SecondActivity.class);
        i.putExtra("name","Steve");
        i.putExtra("id",11);
        startActivity(i);
    }

}
