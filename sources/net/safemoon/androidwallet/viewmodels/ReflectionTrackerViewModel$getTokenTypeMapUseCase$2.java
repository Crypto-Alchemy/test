package net.safemoon.androidwallet.viewmodels;

import android.app.Application;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo44877d2 = {"Lbg2;", "invoke", "()Lbg2;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: ReflectionTrackerViewModel.kt */
public final class ReflectionTrackerViewModel$getTokenTypeMapUseCase$2 extends Lambda implements pc2<bg2> {
    public final /* synthetic */ Application $application;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReflectionTrackerViewModel$getTokenTypeMapUseCase$2(Application application) {
        super(0);
        this.$application = application;
    }

    public final bg2 invoke() {
        Context applicationContext = this.$application.getApplicationContext();
        vx2.m53590f(applicationContext, "application.applicationContext");
        return new bg2(applicationContext);
    }
}
