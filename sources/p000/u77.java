package p000;

import kotlin.reflect.jvm.internal.impl.incremental.components.Position;
import kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind;
import org.web3j.ens.contracts.generated.PublicResolver;
import p000.wl3;

/* renamed from: u77 */
/* compiled from: utils.kt */
public final class u77 {
    /* renamed from: a */
    public static final void m72644a(wl3 wl3, ul3 ul3, if0 if0, r24 r24) {
        ak3 location;
        Position position;
        vx2.m53591g(wl3, "<this>");
        vx2.m53591g(ul3, "from");
        vx2.m53591g(if0, "scopeOwner");
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        if (wl3 != wl3.C9555a.f45737a && (location = ul3.getLocation()) != null) {
            if (wl3.mo66734a()) {
                position = location.getPosition();
            } else {
                position = Position.Companion.mo53408a();
            }
            String a = location.mo50218a();
            String b = dd1.m56821m(if0).mo66442b();
            vx2.m53590f(b, "getFqName(scopeOwner).asString()");
            ScopeKind scopeKind = ScopeKind.CLASSIFIER;
            String d = r24.mo65594d();
            vx2.m53590f(d, "name.asString()");
            wl3.mo66735b(a, position, b, scopeKind, d);
        }
    }

    /* renamed from: b */
    public static final void m72645b(wl3 wl3, ul3 ul3, fk4 fk4, r24 r24) {
        vx2.m53591g(wl3, "<this>");
        vx2.m53591g(ul3, "from");
        vx2.m53591g(fk4, "scopeOwner");
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        String b = fk4.mo51711e().mo66195b();
        vx2.m53590f(b, "scopeOwner.fqName.asString()");
        String d = r24.mo65594d();
        vx2.m53590f(d, "name.asString()");
        m72646c(wl3, ul3, b, d);
    }

    /* renamed from: c */
    public static final void m72646c(wl3 wl3, ul3 ul3, String str, String str2) {
        ak3 location;
        Position position;
        vx2.m53591g(wl3, "<this>");
        vx2.m53591g(ul3, "from");
        vx2.m53591g(str, "packageFqName");
        vx2.m53591g(str2, PublicResolver.FUNC_NAME);
        if (wl3 != wl3.C9555a.f45737a && (location = ul3.getLocation()) != null) {
            if (wl3.mo66734a()) {
                position = location.getPosition();
            } else {
                position = Position.Companion.mo53408a();
            }
            wl3 wl32 = wl3;
            wl32.mo66735b(location.mo50218a(), position, str, ScopeKind.PACKAGE, str2);
        }
    }
}
