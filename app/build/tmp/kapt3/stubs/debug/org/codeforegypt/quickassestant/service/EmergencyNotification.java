package org.codeforegypt.quickassestant.service;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.media.AudioAttributes;
import android.media.RingtoneManager;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationCompat;
import org.codeforegypt.quickassestant.R;
import org.codeforegypt.quickassestant.ui.MainActivity;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0003J\u0010\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nH\u0002J\u0010\u0010\f\u001a\n \u000b*\u0004\u0018\u00010\r0\rH\u0002J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0002J&\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lorg/codeforegypt/quickassestant/service/EmergencyNotification;", "", "()V", "CHANNEL_ID", "", "createNotificationChannel", "", "notificationManager", "Landroid/app/NotificationManager;", "getAudioAttributesInstore", "Landroid/media/AudioAttributes;", "kotlin.jvm.PlatformType", "getNotificationSoundInstore", "Landroid/net/Uri;", "getPendingIntent", "Landroid/app/PendingIntent;", "context", "Landroid/content/Context;", "getVibrationPatternInstore", "", "show", "title", "body", "app_debug"})
public final class EmergencyNotification {
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String CHANNEL_ID = "Single_v1";
    @org.jetbrains.annotations.NotNull
    public static final org.codeforegypt.quickassestant.service.EmergencyNotification INSTANCE = null;
    
    private EmergencyNotification() {
        super();
    }
    
    public final void show(@org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.NotNull
    java.lang.String body, @org.jetbrains.annotations.NotNull
    android.app.NotificationManager notificationManager, @org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    private final long[] getVibrationPatternInstore() {
        return null;
    }
    
    private final android.net.Uri getNotificationSoundInstore() {
        return null;
    }
    
    private final android.media.AudioAttributes getAudioAttributesInstore() {
        return null;
    }
    
    private final android.app.PendingIntent getPendingIntent(android.content.Context context) {
        return null;
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    private final void createNotificationChannel(android.app.NotificationManager notificationManager) {
    }
}