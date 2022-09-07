package com.june.workoutrecordkeeper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import androidx.fragment.app.commit
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.june.workoutrecordkeeper.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //Transacte the fragment on this main activity, one set the FragmentContainerView and gave the name of the Fragment
        // this supportFragementManager.commit can be deleted
//        supportFragmentManager.commit {
//            replace(R.id.frame_content, RunningFragment())
//
//        }

        binding.buttonCycling.setOnClickListener { onCyclingClicked() }
        binding.buttonRunning.setOnClickListener { onRunningClicked() }


    }

    private fun onRunningClicked() {
        supportFragmentManager.commit {
            //replace = swap the fragment
            replace(R.id.frame_content, RunningFragment())

        }

    }

    private fun onCyclingClicked() {
        supportFragmentManager.commit {
            //replace = swap the fragment
            replace(R.id.frame_content, CyclingFragment())

        }

    }


}