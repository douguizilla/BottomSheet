package com.odougle.bottomsheet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.odougle.bottomsheet.databinding.ActivityMainBinding
import com.odougle.bottomsheet.databinding.LayoutBottomSheetBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    private val layoutBottomSheetBinding: LayoutBottomSheetBinding by lazy {
        LayoutBottomSheetBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnBottomSheet.setOnClickListener {
            val behavior = BottomSheetBehavior.from(layoutBottomSheetBinding.layoutBottomSheet)
            if(behavior.state == BottomSheetBehavior.STATE_HIDDEN ||
                behavior.state == BottomSheetBehavior.STATE_EXPANDED){
                behavior.state = BottomSheetBehavior.STATE_COLLAPSED
            }else if(behavior.state == BottomSheetBehavior.STATE_COLLAPSED){
                behavior.state = BottomSheetBehavior.STATE_EXPANDED
            }
        }
    }
}