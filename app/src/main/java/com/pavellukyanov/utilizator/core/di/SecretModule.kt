package com.pavellukyanov.utilizator.core.di

import android.content.Context
import com.pavellukyanov.utilizator.utils.SecretValues
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class SecretModule {
    @Provides
    fun provideSecretValues(@ApplicationContext context: Context): SecretValues = SecretValues(context)
}