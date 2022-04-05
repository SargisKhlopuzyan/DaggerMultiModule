package com.fastcredit.dynamicfeature_1.ui

import android.content.Context
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fastcredit.core.di.module.DynamicFeatureModule
import com.fastcredit.dynamicfeature_1.R
import com.fastcredit.dynamicfeature_1.di.component.DynamicFeatureComponent
import com.fastcredit.dynamicfeature_1.di.helper.coreComponent

class DF_Fragment_1 : Fragment() {

    companion object {
        fun newInstance() = DF_Fragment_1()
    }

    private lateinit var viewModel: DFFragment1ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_d_f_fragment_1, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)

//        DynamicFeatureComponent
//            .builder()
//            .coreComponent(requireActivity().coreComponent())
//            .dynamicFeatureModule(DynamicFeatureModule(/*this*/))
//            .build()
//            .inject(this)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(DFFragment1ViewModel::class.java)
        // TODO: Use the ViewModel
    }

}