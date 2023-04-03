package org.koin.androidx.scope;

import android.content.ComponentCallbacks;
import androidx.activity.ComponentActivity;
import kotlin.C6169a;
import kotlin.Metadata;
import org.koin.core.scope.Scope;
import org.web3j.ens.contracts.generated.ENS;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000\u001a\u0010\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0002*\u00020\u0000\u001a\u0014\u0010\t\u001a\u00020\u0002*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0000\u001a\u0014\u0010\f\u001a\u00020\u000b*\u00020\u00072\u0006\u0010\n\u001a\u00020\u0002H\u0000\u001a\n\u0010\r\u001a\u00020\u0002*\u00020\u0000¨\u0006\u000e"}, mo44877d2 = {"Landroidx/activity/ComponentActivity;", "Lef3;", "Lorg/koin/core/scope/Scope;", "b", "a", "d", "Landroid/content/ComponentCallbacks;", "Lug3;", "owner", "e", "scope", "Lr37;", "f", "c", "koin-android_release"}, mo44878k = 2, mo44879mv = {1, 5, 1})
/* compiled from: ComponentActivityExt.kt */
public final class ComponentActivityExtKt {
    /* renamed from: a */
    public static final ef3<Scope> m70713a(ComponentActivity componentActivity) {
        vx2.m53591g(componentActivity, "<this>");
        return C6169a.m47232a(new ComponentActivityExtKt$activityRetainedScope$1(componentActivity));
    }

    /* renamed from: b */
    public static final ef3<Scope> m70714b(ComponentActivity componentActivity) {
        vx2.m53591g(componentActivity, "<this>");
        return C6169a.m47232a(new ComponentActivityExtKt$activityScope$1(componentActivity));
    }

    /* renamed from: c */
    public static final Scope m70715c(ComponentActivity componentActivity) {
        vx2.m53591g(componentActivity, "<this>");
        if (componentActivity instanceof C7215ij) {
            kn5 kn5 = (kn5) new dd7(ua5.m52727b(kn5.class), new C9073x339829f2(componentActivity), new C9072x339829f1(componentActivity), new C9074x339829f3((pc2) null, componentActivity)).getValue();
            if (kn5.mo52961b() == null) {
                kn5.mo52962c(fc3.m57652c(wm0.m73686a(componentActivity), mc3.m64292a(componentActivity), mc3.m64293b(componentActivity), (Object) null, 4, (Object) null));
            }
            Scope b = kn5.mo52961b();
            vx2.m53588d(b);
            return b;
        }
        throw new IllegalStateException("Activity should implement AndroidScopeComponent".toString());
    }

    /* renamed from: d */
    public static final Scope m70716d(ComponentActivity componentActivity) {
        vx2.m53591g(componentActivity, "<this>");
        if (componentActivity instanceof C7215ij) {
            Scope f = wm0.m73686a(componentActivity).mo51635f(mc3.m64292a(componentActivity));
            if (f == null) {
                return m70717e(componentActivity, componentActivity);
            }
            return f;
        }
        throw new IllegalStateException("Activity should implement AndroidScopeComponent".toString());
    }

    /* renamed from: e */
    public static final Scope m70717e(ComponentCallbacks componentCallbacks, ug3 ug3) {
        vx2.m53591g(componentCallbacks, "<this>");
        vx2.m53591g(ug3, ENS.FUNC_OWNER);
        Scope b = wm0.m73686a(componentCallbacks).mo51632b(mc3.m64292a(componentCallbacks), mc3.m64293b(componentCallbacks), componentCallbacks);
        m70718f(ug3, b);
        return b;
    }

    /* renamed from: f */
    public static final void m70718f(ug3 ug3, Scope scope) {
        vx2.m53591g(ug3, "<this>");
        vx2.m53591g(scope, "scope");
        ug3.getLifecycle().mo6295a(new ComponentActivityExtKt$registerScopeForLifecycle$1(scope));
    }
}
