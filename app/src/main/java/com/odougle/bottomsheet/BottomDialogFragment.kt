package com.odougle.bottomsheet

import android.app.Dialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.odougle.bottomsheet.databinding.LayoutDialogBinding

class BottomDialogFragment : BottomSheetDialogFragment() {
    private var _binding: LayoutDialogBinding? = null
    private val binding get() = _binding!!

    override fun setupDialog(dialog: Dialog, style: Int) {
        super.setupDialog(dialog, style)
        _binding = LayoutDialogBinding.inflate(layoutInflater)
        val view = binding.root
        binding.btnConfirm.setOnClickListener {
            dialog.dismiss()
        }
        binding.btnCancel.setOnClickListener {
            dialog.dismiss()
        }
        dialog.setContentView(view)

    }
}