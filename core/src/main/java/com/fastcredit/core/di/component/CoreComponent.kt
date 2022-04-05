package com.fastcredit.core.di.component

import android.app.Application
import android.content.Context
import com.fastcredit.core.di.module.AppContextModule
import dagger.BindsInstance
import dagger.Component
import dagger.Provides

/**
 * Created by Sargis Khlopuzyan on 4/5/2022.
 */
@Component(modules = [])
interface CoreComponent {

//    fun context(): Context

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        @BindsInstance
        fun contextModule(contextModule: AppContextModule): Builder

//        @BindsInstance
//        fun apkKey(/*@NewsApiQualifier*/ apiKey: String): Builder


        fun build(): CoreComponent

//        @BindsInstance
//        fun loansRepository(loansRepository: LoansRepository): Builder

    }

}