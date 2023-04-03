package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.text.StringsKt__StringsKt;
import org.slf4j.Marker;

/* compiled from: RawType.kt */
public final class RawTypeImpl extends i42 implements j75 {
    public RawTypeImpl(d36 d36, d36 d362, boolean z) {
        super(d36, d362);
        if (!z) {
            yc3.f46193a.mo55823c(d36, d362);
        }
    }

    /* renamed from: U0 */
    public static final boolean m61010U0(String str, String str2) {
        if (vx2.m53586b(str, StringsKt__StringsKt.m63114s0(str2, "out ")) || vx2.m53586b(str2, Marker.ANY_MARKER)) {
            return true;
        }
        return false;
    }

    /* renamed from: V0 */
    public static final List<String> m61011V0(DescriptorRenderer descriptorRenderer, xc3 xc3) {
        List<f17> F0 = xc3.mo51132F0();
        ArrayList arrayList = new ArrayList(dk0.m43495u(F0, 10));
        for (f17 x : F0) {
            arrayList.add(descriptorRenderer.mo54816x(x));
        }
        return arrayList;
    }

    /* renamed from: W0 */
    public static final String m61012W0(String str, String str2) {
        if (!StringsKt__StringsKt.m63079Q(str, '<', false, 2, (Object) null)) {
            return str;
        }
        return StringsKt__StringsKt.m63082R0(str, '<', (String) null, 2, (Object) null) + '<' + str2 + '>' + StringsKt__StringsKt.m63076O0(str, '>', (String) null, 2, (Object) null);
    }

    /* renamed from: O0 */
    public d36 mo52398O0() {
        return mo52399P0();
    }

    /* renamed from: R0 */
    public String mo52401R0(DescriptorRenderer descriptorRenderer, zc1 zc1) {
        vx2.m53591g(descriptorRenderer, "renderer");
        vx2.m53591g(zc1, "options");
        String w = descriptorRenderer.mo54815w(mo52399P0());
        String w2 = descriptorRenderer.mo54815w(mo52400Q0());
        if (zc1.mo54926j()) {
            return "raw (" + w + ".." + w2 + ')';
        } else if (mo52400Q0().mo51132F0().isEmpty()) {
            return descriptorRenderer.mo54812t(w, w2, TypeUtilsKt.m62952h(this));
        } else {
            List<String> V0 = m61011V0(descriptorRenderer, mo52399P0());
            List<String> V02 = m61011V0(descriptorRenderer, mo52400Q0());
            String i0 = CollectionsKt___CollectionsKt.m47338i0(V0, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, RawTypeImpl$render$newArgs$1.INSTANCE, 30, (Object) null);
            List<Pair<T, R>> R0 = CollectionsKt___CollectionsKt.m47321R0(V0, V02);
            boolean z = true;
            if (!(R0 instanceof Collection) || !R0.isEmpty()) {
                Iterator<T> it = R0.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Pair pair = (Pair) it.next();
                    if (!m61010U0((String) pair.getFirst(), (String) pair.getSecond())) {
                        z = false;
                        break;
                    }
                }
            }
            if (z) {
                w2 = m61012W0(w2, i0);
            }
            String W0 = m61012W0(w, i0);
            if (vx2.m53586b(W0, w2)) {
                return W0;
            }
            return descriptorRenderer.mo54812t(W0, w2, TypeUtilsKt.m62952h(this));
        }
    }

    /* renamed from: S0 */
    public RawTypeImpl mo51137L0(boolean z) {
        return new RawTypeImpl(mo52399P0().mo51121O0(z), mo52400Q0().mo51121O0(z));
    }

    /* renamed from: T0 */
    public i42 mo51138M0(bd3 bd3) {
        vx2.m53591g(bd3, "kotlinTypeRefiner");
        xc3 h = bd3.mo50562h(mo52399P0());
        vx2.m53589e(h, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        xc3 h2 = bd3.mo50562h(mo52400Q0());
        vx2.m53589e(h2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new RawTypeImpl((d36) h, (d36) h2, true);
    }

    /* renamed from: X0 */
    public RawTypeImpl mo51139N0(rz6 rz6) {
        vx2.m53591g(rz6, "newAttributes");
        return new RawTypeImpl(mo52399P0().mo51122P0(rz6), mo52400Q0().mo51122P0(rz6));
    }

    /* renamed from: m */
    public MemberScope mo51146m() {
        if0 if0;
        eg0 d = mo51134H0().mo51180d();
        if (d instanceof if0) {
            if0 = (if0) d;
        } else {
            if0 = null;
        }
        if (if0 != null) {
            MemberScope D = if0.mo52459D(new RawSubstitution((TypeParameterUpperBoundEraser) null, 1, (DefaultConstructorMarker) null));
            vx2.m53590f(D, "classDescriptor.getMemberScope(RawSubstitution())");
            return D;
        }
        throw new IllegalStateException(("Incorrect classifier: " + mo51134H0().mo51180d()).toString());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public RawTypeImpl(d36 d36, d36 d362) {
        this(d36, d362, false);
        vx2.m53591g(d36, "lowerBound");
        vx2.m53591g(d362, "upperBound");
    }
}
