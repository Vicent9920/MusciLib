package com.lzx.musiclib

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.lzx.musiclib.home.MainActivity
import com.lzx.musiclib.home.TestActivity
import com.lzx.starrysky.StarrySky
import com.lzx.starrysky.decrypt.FilePlaylistParser
import kotlinx.android.synthetic.main.activity_home.btn1
import kotlinx.android.synthetic.main.activity_home.btn2
import java.io.File

private const val TAG = "HomeActivity"
class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        btn1.setOnClickListener { navigationTo<TestActivity>() }
        btn2.setOnClickListener { navigationTo<MainActivity>() }
        File(this.filesDir,"enc.key").writeBytes(byteArrayOf(-108,1,121,41,-36,-54,-110,-107,67,-61,70,-88,64,101,-72,92))

        Log.e(TAG,"密钥填充完毕")
    }
}