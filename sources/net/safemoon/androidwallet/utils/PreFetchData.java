package net.safemoon.androidwallet.utils;

import android.app.Application;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import p000.y23;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R'\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000bR$\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, mo44877d2 = {"Lnet/safemoon/androidwallet/utils/PreFetchData;", "", "Landroid/app/Application;", "application", "Lr37;", "b", "Ljava/util/ArrayList;", "Lw70;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "a", "()Ljava/util/ArrayList;", "swapListMap", "Ly23;", "c", "Ly23;", "getJob", "()Ly23;", "setJob", "(Ly23;)V", "job", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: PreFetchData.kt */
public final class PreFetchData {

    /* renamed from: a */
    public static final PreFetchData f42593a = new PreFetchData();

    /* renamed from: b */
    public static final ArrayList<w70> f42594b = new ArrayList<>();

    /* renamed from: c */
    public static y23 f42595c;

    /* renamed from: a */
    public final ArrayList<w70> mo60932a() {
        return f42594b;
    }

    /* renamed from: b */
    public final void mo60933b(Application application) {
        vx2.m53591g(application, "application");
        y23 y23 = f42595c;
        if (y23 != null) {
            y23.C9621a.m74226a(y23, (CancellationException) null, 1, (Object) null);
        }
        f42594b.clear();
        f42595c = d50.m56748b(ih2.f38385a, (CoroutineContext) null, (CoroutineStart) null, new PreFetchData$loadPreFetchData$1(application, (ns0<? super PreFetchData$loadPreFetchData$1>) null), 3, (Object) null);
    }
}
