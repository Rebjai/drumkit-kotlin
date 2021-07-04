package com.example.drumkit

import android.media.MediaPlayer
import android.media.MediaPlayer.OnCompletionListener
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private lateinit var s1: MediaPlayer
    private lateinit var s2: MediaPlayer
    private lateinit var s3: MediaPlayer
    private lateinit var s4: MediaPlayer
    private lateinit var s5: MediaPlayer
    private lateinit var s6: MediaPlayer
    private lateinit var s7: MediaPlayer
    private lateinit var s8: MediaPlayer
    private lateinit var s9: MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }


    fun funCaballo(view: View) {
        s1 = MediaPlayer.create(this, R.raw.hihat_closed05)
        s1.start()
        s1.setOnCompletionListener(OnCompletionListener { mp -> mp.release() })
    }
    fun funElefante(view: View) {
        s2 = MediaPlayer.create(this, R.raw.hihat_opened01)
        s2.start()
        s2.setOnCompletionListener(OnCompletionListener { mp -> mp.release() })
    }
    fun funGallo(view: View) {
        s3= MediaPlayer.create(this, R.raw.ride01)
        s3.start()
        s3.setOnCompletionListener(OnCompletionListener { mp -> mp.release() })

    }
    fun funGato(view: View) {
        s4=MediaPlayer.create(this, R.raw.clav02)
        s4.start()
        s4.setOnCompletionListener(OnCompletionListener { mp -> mp.release() })
    }
    fun funMono(view: View) {
        s5 = MediaPlayer.create(this, R.raw.snare04)
        s5.start()
        s5.setOnCompletionListener(OnCompletionListener { mp -> mp.release() })
    }
    fun funPato(view: View) {
        s6 = MediaPlayer.create(this,R.raw.tom03)
        s6.start()
        s6.setOnCompletionListener(OnCompletionListener { mp -> mp.release() })
    }
    fun funPerro(view: View) {
        s7 = MediaPlayer.create(this, R.raw.kick01)
        s7.start()
        s7.setOnCompletionListener(OnCompletionListener { mp -> mp.release() })
    }
    fun funRana( view: View) {
        s8 = MediaPlayer.create(this, R.raw.clap04)
        s8.start()
        s8.setOnCompletionListener(OnCompletionListener { mp -> mp.release() })
    }
    fun funVaca (view: View) {
        s9 = MediaPlayer.create(this, R.raw.tom04)
        s9.start()
        s9.setOnCompletionListener(OnCompletionListener { mp -> mp.release() })
    }

}