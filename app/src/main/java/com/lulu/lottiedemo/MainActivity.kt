package com.lulu.lottiedemo

import android.animation.Animator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.airbnb.lottie.LottieCompositionFactory
import com.airbnb.lottie.LottieListener
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    private val tag = "MainActivity"
    var count = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lottie_anim.playAnimation()
//        LottieCompositionFactory.fromUrl(this, "https://ptcoopresource-1252317822.file.myqcloud.com/cooperate/operationsmanagement/43a2dfd19c982be1929c8167e778cf6fcad67c1869c2f67d452c2b90536a1b632019121011.zip")
//            .addListener {
//                lottie_anim.setComposition(it)
//            }
//            .addFailureListener {
//                Log.e(tag, "Lottie 加载失败", it)
//            }
        lottie_anim.imageAssetsFolder = "move/images/"
        lottie_anim.setAnimation("move/data.json")
        start.setOnClickListener{
            lottie_anim.playAnimation()
        }
        pause.setOnClickListener {
            lottie_anim.pauseAnimation()
        }
        resume.setOnClickListener {
            lottie_anim.resumeAnimation()
        }

        lottie_anim.addAnimatorUpdateListener {
            Log.d(tag, "value: " + it.animatedValue)
            count++
            Log.d(tag, "value: count: $count")
        }

    }
}
