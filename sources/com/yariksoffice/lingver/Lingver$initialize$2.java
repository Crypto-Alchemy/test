package com.yariksoffice.lingver;

import android.app.Application;
import android.content.res.Configuration;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Landroid/content/res/Configuration;", "it", "Lr37;", "invoke", "(Landroid/content/res/Configuration;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 4, 0})
/* compiled from: Lingver.kt */
public final class Lingver$initialize$2 extends Lambda implements rc2<Configuration, r37> {
    public final /* synthetic */ Application $application;
    public final /* synthetic */ Lingver this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Lingver$initialize$2(Lingver lingver, Application application) {
        super(1);
        this.this$0 = lingver;
        this.$application = application;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Configuration) obj);
        return r37.f33317a;
    }

    public final void invoke(Configuration configuration) {
        vx2.m53592h(configuration, "it");
        this.this$0.mo41594j(this.$application, configuration);
    }
}
