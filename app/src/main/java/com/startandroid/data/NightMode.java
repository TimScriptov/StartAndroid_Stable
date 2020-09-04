package com.startandroid.data;

import androidx.appcompat.app.AppCompatDelegate;

import org.jetbrains.annotations.NotNull;

public final class NightMode {

    public static Mode getCurrentMode() {
        return com.startandroid.data.Preferences.isInNightMode() ? Mode.NIGHT : Mode.DAY;
    }

    public static void setMode(@NotNull Mode mode) {
        if (mode.equals(Mode.NIGHT)) {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        } else AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
    }

    public enum Mode {
        NIGHT, DAY
    }
}