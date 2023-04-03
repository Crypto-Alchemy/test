package org.koin.android.scope;

import android.app.Service;
import kotlin.C6169a;
import kotlin.Metadata;
import org.koin.core.scope.Scope;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0003*\u00020\u0000\u001a\u0010\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005*\u00020\u0000¨\u0006\u0007"}, mo44877d2 = {"Landroid/app/Service;", "Lorg/koin/core/scope/Scope;", "a", "Lr37;", "b", "Lef3;", "c", "koin-android_release"}, mo44878k = 2, mo44879mv = {1, 5, 1})
/* compiled from: ServiceExt.kt */
public final class ServiceExtKt {
    /* renamed from: a */
    public static final Scope m70710a(Service service) {
        vx2.m53591g(service, "<this>");
        if (service instanceof C7215ij) {
            fc3 a = wm0.m73686a(service);
            Scope f = a.mo51635f(mc3.m64292a(service));
            if (f == null) {
                return a.mo51632b(mc3.m64292a(service), mc3.m64293b(service), service);
            }
            return f;
        }
        throw new IllegalStateException("Service should implement AndroidScopeComponent".toString());
    }

    /* renamed from: b */
    public static final void m70711b(Service service) {
        vx2.m53591g(service, "<this>");
        if (service instanceof C7215ij) {
            ((C7215ij) service).mo52489n().mo64985d();
            return;
        }
        throw new IllegalStateException("Service should implement AndroidScopeComponent".toString());
    }

    /* renamed from: c */
    public static final ef3<Scope> m70712c(Service service) {
        vx2.m53591g(service, "<this>");
        return C6169a.m47232a(new ServiceExtKt$serviceScope$1(service));
    }
}
