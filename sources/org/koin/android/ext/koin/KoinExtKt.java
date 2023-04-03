package org.koin.android.ext.koin;

import android.app.Application;
import android.content.Context;
import kotlin.Metadata;
import org.koin.core.logger.Level;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0012\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0004"}, mo44877d2 = {"Lgc3;", "Landroid/content/Context;", "androidContext", "a", "koin-android_release"}, mo44878k = 2, mo44879mv = {1, 5, 1})
/* compiled from: KoinExt.kt */
public final class KoinExtKt {
    /* renamed from: a */
    public static final gc3 m70708a(gc3 gc3, Context context) {
        vx2.m53591g(gc3, "<this>");
        vx2.m53591g(context, "androidContext");
        tk3 e = gc3.mo51892b().mo51634e();
        Level level = Level.INFO;
        if (e.mo66081b(level)) {
            tk3 e2 = gc3.mo51892b().mo51634e();
            if (e2.mo66081b(level)) {
                e2.mo66080a(level, "[init] declare Android Context");
            }
        }
        if (context instanceof Application) {
            fc3.m57653i(gc3.mo51892b(), bk0.m32598e(jx3.m59607b(false, new KoinExtKt$androidContext$1(context), 1, (Object) null)), false, 2, (Object) null);
        } else {
            fc3.m57653i(gc3.mo51892b(), bk0.m32598e(jx3.m59607b(false, new KoinExtKt$androidContext$2(context), 1, (Object) null)), false, 2, (Object) null);
        }
        return gc3;
    }
}
