package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.C6177b;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: jz6 */
/* compiled from: TypeAliasExpansion.kt */
public final class jz6 {

    /* renamed from: e */
    public static final C7320a f38818e = new C7320a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final jz6 f38819a;

    /* renamed from: b */
    public final hz6 f38820b;

    /* renamed from: c */
    public final List<f17> f38821c;

    /* renamed from: d */
    public final Map<a17, f17> f38822d;

    /* renamed from: jz6$a */
    /* compiled from: TypeAliasExpansion.kt */
    public static final class C7320a {
        public C7320a() {
        }

        public /* synthetic */ C7320a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final jz6 mo52828a(jz6 jz6, hz6 hz6, List<? extends f17> list) {
            vx2.m53591g(hz6, "typeAliasDescriptor");
            vx2.m53591g(list, "arguments");
            List<a17> parameters = hz6.mo50046g().getParameters();
            vx2.m53590f(parameters, "typeAliasDescriptor.typeConstructor.parameters");
            ArrayList arrayList = new ArrayList(dk0.m43495u(parameters, 10));
            for (a17 a : parameters) {
                arrayList.add(a.mo50045a());
            }
            return new jz6(jz6, hz6, list, C6177b.m47369q(CollectionsKt___CollectionsKt.m47321R0(arrayList, list)), (DefaultConstructorMarker) null);
        }
    }

    public jz6(jz6 jz6, hz6 hz6, List<? extends f17> list, Map<a17, ? extends f17> map) {
        this.f38819a = jz6;
        this.f38820b = hz6;
        this.f38821c = list;
        this.f38822d = map;
    }

    public /* synthetic */ jz6(jz6 jz6, hz6 hz6, List list, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(jz6, hz6, list, map);
    }

    /* renamed from: a */
    public final List<f17> mo52824a() {
        return this.f38821c;
    }

    /* renamed from: b */
    public final hz6 mo52825b() {
        return this.f38820b;
    }

    /* renamed from: c */
    public final f17 mo52826c(yz6 yz6) {
        vx2.m53591g(yz6, "constructor");
        eg0 d = yz6.mo51180d();
        if (d instanceof a17) {
            return this.f38822d.get(d);
        }
        return null;
    }

    /* renamed from: d */
    public final boolean mo52827d(hz6 hz6) {
        boolean z;
        vx2.m53591g(hz6, "descriptor");
        if (!vx2.m53586b(this.f38820b, hz6)) {
            jz6 jz6 = this.f38819a;
            if (jz6 != null) {
                z = jz6.mo52827d(hz6);
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
            return false;
        }
        return true;
    }
}
