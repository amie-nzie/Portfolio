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

        image3.setOnClickListener{
            val intent = Intent(
                Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps?hl=en")
            )
            val chooser = Intent.createChooser(intent, "Open with :")
            if (intent.resolveActivity(packageManager) !=null)
                startActivity(chooser)
        }

        image4.setOnClickListener{
            intent =
                Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps?hl=en"))
            val chooser = Intent.createChooser(intent, "Open with :")
            if (intent.resolveActivity(packageManager) !=null)
                startActivity(chooser)
        }

        image5.setOnClickListener{
            intent=
                Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps?hl=en"))
            val chooser= Intent.createChooser(intent, "Open with :")
            if (intent.resolveActivity(packageManager) !=null)
                startActivity(chooser)
        }

        image6.setOnClickListener{
            intent=
                Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps?hl=en"))
            val chooser = Intent.createChooser(intent, "Open with :")
            if (intent.resolveActivity(packageManager)!=null)
                startActivity(chooser)
        }

        image7.setOnClickListener{
            intent=
                Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps?hl=en"))
            val chooser = Intent.createChooser(intent, "Open with :")
            if (intent.resolveActivity(packageManager)!=null)
                startActivity(chooser)
        }

        image8.setOnClickListener{
            intent=
                Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps?hl=en"))
            val chooser= Intent.createChooser(intent, "Open with :")
            if (intent.resolveActivity(packageManager)!=null)
                startActivity(chooser)
        }

        image9.setOnClickListener{
            intent=
                Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps?hl=en"))
            val chooser= Intent.createChooser( intent, "Open with :")
            if (intent.resolveActivity(packageManager)!=null)
                startActivity(chooser)
        }

        image10.setOnClickListener{
            intent=
                Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps?hl=en"))
            val chooser= Intent.createChooser(intent, "Open with :")
            if (intent.resolveActivity(packageManager)!=null)
                startActivity(chooser)
        }

        image11.setOnClickListener{
            intent=
                Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps?hl=en"))
            val chooser= Intent.createChooser(intent, "Open with :")
            if (intent.resolveActivity(packageManager)!=null)
                startActivity(chooser)
        }

        image12.setOnClickListener{
            intent=
                Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps?hl=en"))
            val choooser= Intent.createChooser(intent, "Open with : ")
            if (intent.resolveActivity(packageManager)!=null)
                startActivity(choooser)
        }
        image13.setOnClickListener{
            Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps?hl=en"))
            val chooser=Intent.createChooser(intent, "Open with :")
            if (intent.resolveActivity(packageManager)!=null)
                startActivity(chooser)
        }
        image14.setOnClickListener{
            Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps?hl=en"))
            val chooser=Intent.createChooser(intent, "Open with :")
            if (intent.resolveActivity(packageManager)!=null)
                startActivity(chooser)
        }
        image15.setOnClickListener{
            Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps?hl=en"))
            val chooser=Intent.createChooser(intent, "Open with :")
            if (intent.resolveActivity(packageManager)!=null)
                startActivity(chooser)
        }

        image16.setOnClickListener{
            Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps?hl=en"))
            val chooser=Intent.createChooser(intent, "Open with :")
            if (intent.resolveActivity(packageManager)!=null)
                startActivity(chooser)
        }

        image17.setOnClickListener{
            Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps?hl=en"))
            val chooser=Intent.createChooser(intent, "Open with :")
            if (intent.resolveActivity(packageManager)!=null)
                startActivity(chooser)
        }

        image18.setOnClickListener{
            Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps?hl=en"))
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
