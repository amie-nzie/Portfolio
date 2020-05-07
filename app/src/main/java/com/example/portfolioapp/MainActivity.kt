package com.example.portfolioapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import java.net.URI

class MainActivity : AppCompatActivity() {

    val TAG= "Main Activity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "This activity is in onCreate")

        val intent =getIntent()
        val editText =intent.getStringExtra("Nickname")
        val editText2 = intent.getStringExtra("Password")
        val textView22 = intent.getStringExtra("Register here")

//        resultEt.text ="Details: \n\nNickname: "+editText+"\nPassword: "+editText2+""

        image3.setOnClickListener{
            val intent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://play.google.com/store/apps?hl=en")
            )
            val chooser = Intent.createChooser(intent, "Open with :")
            if (intent.resolveActivity(packageManager) !=null)
                startActivity(chooser)
        }

        image4.setOnClickListener{
           val intent =
                Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://play.google.com/store/apps?hl=en"))
            val chooser = Intent.createChooser(intent, "Open with :")
            if (intent.resolveActivity(packageManager) !=null)
                startActivity(chooser)
        }

        image5.setOnClickListener{
           val intent=
                Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://play.google.com/store/apps?hl=en"))
            val chooser= Intent.createChooser(intent, "Open with :")
            if (intent.resolveActivity(packageManager) !=null)
                startActivity(chooser)
        }

        image6.setOnClickListener{
           val intent=
                Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://play.google.com/store/apps?hl=en"))
            val chooser = Intent.createChooser(intent, "Open with :")
            if (intent.resolveActivity(packageManager)!=null)
                startActivity(chooser)
        }

        image7.setOnClickListener{
           val intent=
                Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.google.com/url?sa=t&source=web&rct=j&url=https://twitter.com/%3Flang%3Den&ved=2ahUKEwissuej0vjoAhVTAGMBHadDAp0QjjgwAXoECAMQAQ&usg=AOvVaw1Sd3B-_cNZOLSmhw9z2lOm"))
            val chooser = Intent.createChooser(intent, "Open with :")
            if (intent.resolveActivity(packageManager)!=null)
                startActivity(chooser)
        }

        image8.setOnClickListener{
           val intent=
                Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.google.com/url?sa=t&source=web&rct=j&url=https://www.instagram.com/accounts/login/&ved=2ahUKEwiS4onb0vjoAhUw4YUKHY_kB9cQFjAAegQIAxAB&usg=AOvVaw0BRCgcMCVNSSLcNcVjPzsz&cshid=1587442168713"))
            val chooser= Intent.createChooser(intent, "Open with :")
            if (intent.resolveActivity(packageManager)!=null)
                startActivity(chooser)
        }

        image9.setOnClickListener{
           val intent=
                Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://play.google.com/store/apps?hl=en"))
            val chooser= Intent.createChooser( intent, "Open with :")
            if (intent.resolveActivity(packageManager)!=null)
                startActivity(chooser)
        }

        image10.setOnClickListener{
           val intent=
                Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.google.com/url?sa=t&source=web&rct=j&url=https://m.youtube.com/&ved=2ahUKEwjP0oGx1fjoAhVqzoUKHdI6DNYQjjgwAHoECAsQAw&usg=AOvVaw1gjD0qA2OtrsxdcaNbwsxk"))
            val chooser= Intent.createChooser(intent, "Open with :")
            if (intent.resolveActivity(packageManager)!=null)
                startActivity(chooser)
        }

        image11.setOnClickListener{
          val intent=
                Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://dribbble.com/tags/mobile"
                    ))
            val chooser= Intent.createChooser(intent, "Open with :")
            if (intent.resolveActivity(packageManager)!=null)
                startActivity(chooser)
        }

        image12.setOnClickListener{
            val intent=
                Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://mobile.linkedin.com/"))
            val choooser= Intent.createChooser(intent, "Open with : ")
            if (intent.resolveActivity(packageManager)!=null)
                startActivity(choooser)
        }
        image13.setOnClickListener{
           val intent=
               Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.google.com/?gws_rd=ssl"))
            val chooser=Intent.createChooser(intent, "Open with :")
            if (intent.resolveActivity(packageManager)!=null)
                startActivity(chooser)
        }
        image14.setOnClickListener{
          val intent=
              Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.whatsapp.com/"))
            val chooser=Intent.createChooser(intent, "Open with :")
            if (intent.resolveActivity(packageManager)!=null)
                startActivity(chooser)
        }
        image15.setOnClickListener{
           val intent=
               Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.skype.com/en/get-skype/skype-for-mobile/"))
            val chooser=Intent.createChooser(intent, "Open with :")
            if (intent.resolveActivity(packageManager)!=null)
                startActivity(chooser)
        }

        image16.setOnClickListener{
           val intent=
               Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.google.com/?gws_rd=ssl"))
            val chooser=Intent.createChooser(intent, "Open with :")
            if (intent.resolveActivity(packageManager)!=null)
                startActivity(chooser)
        }

        image17.setOnClickListener{
           val intent=
               Intent(Intent.ACTION_VIEW,
                Uri.parse("https://play.google.com/store/apps?hl=en"))
            val chooser=Intent.createChooser(intent, "Open with :")
            if (intent.resolveActivity(packageManager)!=null)
                startActivity(chooser)
        }

        image18.setOnClickListener{
          val intent=
              Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.google.com/?gws_rd=ssl"))
            val chooser=Intent.createChooser(intent, "Open with :")
            if (intent.resolveActivity(packageManager)!=null)
                startActivity(chooser)
        }
    }

    override fun onStart(){
        super.onStart();
        Log.d(TAG, "This activity is in onStart")
    }

    override fun onResume() {
        super.onResume();
        Log.d(TAG, "THis activity is in onResume")
    }

    override fun onPause() {
        super.onPause();
        Log.d(TAG, "This activity is in onPause")
    }

    override fun onStop() {
        super.onStop();
        Log.d(TAG, "This activity is in onStop")
    }

    override fun onDestroy() {
        super.onDestroy();
        Log.d(TAG, "This activity is in onDestroy")
    }
}
