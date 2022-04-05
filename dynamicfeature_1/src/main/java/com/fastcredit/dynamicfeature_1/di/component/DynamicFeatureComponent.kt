package com.fastcredit.dynamicfeature_1.di.component

import com.fastcredit.core.di.component.CoreComponent
import dagger.Component

/**
 * Created by Sargis Khlopuzyan on 4/5/2022.
 */
@Component(
    dependencies = [CoreComponent::class],
//    modules = [/*...*/]
)
interface DynamicFeatureComponent {

    @Component.Builder
    interface Builder {

        fun builder(): Builder

        fun build(): DynamicFeatureComponent

    }

}