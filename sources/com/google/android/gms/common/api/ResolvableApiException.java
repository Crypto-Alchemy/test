package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class ResolvableApiException extends ApiException {
    public ResolvableApiException(Status status) {
        super(status);
    }

    public PendingIntent getResolution() {
        return getStatus().mo30523s1();
    }

    public void startResolutionForResult(Activity activity, int i) throws IntentSender.SendIntentException {
        getStatus().mo30530x1(activity, i);
    }
}
