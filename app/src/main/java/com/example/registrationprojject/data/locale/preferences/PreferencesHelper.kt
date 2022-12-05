package com.example.registrationprojject.data.locale.preferences

import android.content.Context
import android.content.SharedPreferences

class PreferencesHelper(context: Context) {

    private val preferences : SharedPreferences =
            context.getSharedPreferences("volunteer.preferences", Context.MODE_PRIVATE)

    operator fun invoke() = preferences
}