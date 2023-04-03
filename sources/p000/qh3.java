package p000;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, mo44877d2 = {"Lqh3;", "Landroid/content/ComponentCallbacks;", "Landroid/content/res/Configuration;", "newConfig", "Lr37;", "onConfigurationChanged", "onLowMemory", "Lkotlin/Function1;", "a", "Lrc2;", "callback", "<init>", "(Lrc2;)V", "com.yariksoffice.lingver.library"}, mo44878k = 1, mo44879mv = {1, 4, 0})
/* renamed from: qh3 */
/* compiled from: LingverApplicationCallbacks.kt */
public final class qh3 implements ComponentCallbacks {

    /* renamed from: a */
    public final rc2<Configuration, r37> f33097a;

    public qh3(rc2<? super Configuration, r37> rc2) {
        vx2.m53592h(rc2, "callback");
        this.f33097a = rc2;
    }

    public void onConfigurationChanged(Configuration configuration) {
        vx2.m53592h(configuration, "newConfig");
        this.f33097a.invoke(configuration);
    }

    public void onLowMemory() {
    }
}
