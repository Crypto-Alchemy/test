package p000;

import android.app.Application;
import android.content.Context;
import kotlin.Metadata;
import org.koin.android.error.MissingAndroidContextException;
import org.koin.core.scope.Scope;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0003*\u00020\u0000¨\u0006\u0005"}, mo44877d2 = {"Lorg/koin/core/scope/Scope;", "Landroid/content/Context;", "b", "Landroid/app/Application;", "a", "koin-android_release"}, mo44878k = 2, mo44879mv = {1, 5, 1})
/* renamed from: nx3 */
/* compiled from: ModuleExt.kt */
public final class nx3 {
    /* renamed from: a */
    public static final Application m70098a(Scope scope) {
        vx2.m53591g(scope, "<this>");
        try {
            return (Application) scope.mo64988f(ua5.m52727b(Application.class), (oz4) null, (pc2<? extends ul4>) null);
        } catch (Exception unused) {
            throw new MissingAndroidContextException("Can't resolve Application instance. Please use androidContext() function in your KoinApplication configuration.");
        }
    }

    /* renamed from: b */
    public static final Context m70099b(Scope scope) {
        vx2.m53591g(scope, "<this>");
        try {
            return (Context) scope.mo64988f(ua5.m52727b(Context.class), (oz4) null, (pc2<? extends ul4>) null);
        } catch (Exception unused) {
            throw new MissingAndroidContextException("Can't resolve Context instance. Please use androidContext() function in your KoinApplication configuration.");
        }
    }
}
