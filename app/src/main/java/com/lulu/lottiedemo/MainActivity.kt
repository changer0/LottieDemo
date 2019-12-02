package com.lulu.lottiedemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.airbnb.lottie.LottieCompositionFactory
import com.airbnb.lottie.LottieListener
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    private val tag = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lottie_anim.imageAssetsFolder = "images/"
        lottie_anim.setAnimation("data.json")
//        LottieCompositionFactory.fromAsset(this, "data.json")
//            .addListener {
//                lottie_anim.setComposition(it)
//            }
//            .addFailureListener {
//                Log.e(tag, "Lottie 加载失败", it)
//            }

        start.setOnClickListener{
            lottie_anim.playAnimation()
        }
        pause.setOnClickListener {
            lottie_anim.pauseAnimation()
        }
        resume.setOnClickListener {
            lottie_anim.resumeAnimation()
        }

    }
}
