package com.example.registrationprojject.data.locale.preferences

class UserPreferencesData(
    private val preferences: PreferencesHelper
) {

    var isAuthorized: Boolean
        get() = preferences().getBoolean(
            PreferencesConstant.PREF_IS_AUTHORIZED, false
        )
        set(value) = preferences().edit().putBoolean(
            PreferencesConstant.PREF_IS_AUTHORIZED, value
        ).apply()
}