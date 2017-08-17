package com.directdev.portal.di

import android.app.Application
import com.directdev.portal.Portal
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule

/**
 * Created by chris on 8/17/17.
 */
@Component(modules = arrayOf(
        AndroidInjectionModule::class,
        ActivityModule::class
))
interface ApplicationComponent{
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): ApplicationComponent
    }

    fun inject(application: Portal)
}