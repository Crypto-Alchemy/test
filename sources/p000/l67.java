package p000;

import java.util.concurrent.ThreadFactory;
import okhttp3.internal.Util;

/* renamed from: l67 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class l67 implements ThreadFactory {

    /* renamed from: a */
    public final /* synthetic */ String f40586a;

    /* renamed from: d */
    public final /* synthetic */ boolean f40587d;

    public /* synthetic */ l67(String str, boolean z) {
        this.f40586a = str;
        this.f40587d = z;
    }

    public final Thread newThread(Runnable runnable) {
        return Util.m75781threadFactory$lambda1(this.f40586a, this.f40587d, runnable);
    }
}
