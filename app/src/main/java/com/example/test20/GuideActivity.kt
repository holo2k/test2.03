package com.example.test20

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

lateinit var tabLayout : TabLayout
lateinit var vp : ViewPager2
lateinit var btn : Button

class GuideActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guide)
        tabLayout = findViewById(R.id.tabLay)
        vp = findViewById(R.id.vp2)
        btn = findViewById(R.id.btnNext)

        vp.adapter = vpadapter(this,list.list)

        TabLayoutMediator(tabLayout, vp){_,_ ->}.attach()

        vp.registerOnPageChangeCallback(object: ViewPager2.OnPageChangeCallback(){
            override fun onPageSelected(position: Int) {
                if(position == 3){
                    btn.text="Начать"
                }
                else{
                    btn.text="Далее"
                }
            }
        })
    }

    fun guide(view: View) {
        if(vp.currentItem == 3){
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        else
        {
            vp.currentItem++
        }
    }
}