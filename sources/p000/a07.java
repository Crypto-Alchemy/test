package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.C6177b;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: a07 */
/* compiled from: TypeSubstitution.kt */
public abstract class a07 extends p17 {

    /* renamed from: c */
    public static final C6787a f36338c = new C6787a((DefaultConstructorMarker) null);

    /* renamed from: a07$a */
    /* compiled from: TypeSubstitution.kt */
    public static final class C6787a {

        /* renamed from: a07$a$a */
        /* compiled from: TypeSubstitution.kt */
        public static final class C6788a extends a07 {

            /* renamed from: d */
            public final /* synthetic */ Map<yz6, f17> f36339d;

            /* renamed from: e */
            public final /* synthetic */ boolean f36340e;

            public C6788a(Map<yz6, ? extends f17> map, boolean z) {
                this.f36339d = map;
                this.f36340e = z;
            }

            /* renamed from: a */
            public boolean mo50030a() {
                return this.f36340e;
            }

            /* renamed from: f */
            public boolean mo50031f() {
                return this.f36339d.isEmpty();
            }

            /* renamed from: k */
            public f17 mo50025k(yz6 yz6) {
                vx2.m53591g(yz6, "key");
                return this.f36339d.get(yz6);
            }
        }

        public C6787a() {
        }

        public /* synthetic */ C6787a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: e */
        public static /* synthetic */ a07 m55340e(C6787a aVar, Map map, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return aVar.mo50029d(map, z);
        }

        /* renamed from: a */
        public final p17 mo50026a(xc3 xc3) {
            vx2.m53591g(xc3, "kotlinType");
            return mo50027b(xc3.mo51134H0(), xc3.mo51132F0());
        }

        /* renamed from: b */
        public final p17 mo50027b(yz6 yz6, List<? extends f17> list) {
            vx2.m53591g(yz6, "typeConstructor");
            vx2.m53591g(list, "arguments");
            List<a17> parameters = yz6.getParameters();
            vx2.m53590f(parameters, "typeConstructor.parameters");
            a17 a17 = (a17) CollectionsKt___CollectionsKt.m47342m0(parameters);
            boolean z = true;
            if (a17 == null || !a17.mo50044L()) {
                z = false;
            }
            if (!z) {
                return new vt2(parameters, list);
            }
            List<a17> parameters2 = yz6.getParameters();
            vx2.m53590f(parameters2, "typeConstructor.parameters");
            ArrayList arrayList = new ArrayList(dk0.m43495u(parameters2, 10));
            for (a17 g : parameters2) {
                arrayList.add(g.mo50046g());
            }
            return m55340e(this, C6177b.m47369q(CollectionsKt___CollectionsKt.m47321R0(arrayList, list)), false, 2, (Object) null);
        }

        /* renamed from: c */
        public final a07 mo50028c(Map<yz6, ? extends f17> map) {
            vx2.m53591g(map, "map");
            return m55340e(this, map, false, 2, (Object) null);
        }

        /* renamed from: d */
        public final a07 mo50029d(Map<yz6, ? extends f17> map, boolean z) {
            vx2.m53591g(map, "map");
            return new C6788a(map, z);
        }
    }

    /* renamed from: i */
    public static final p17 m55336i(yz6 yz6, List<? extends f17> list) {
        return f36338c.mo50027b(yz6, list);
    }

    /* renamed from: j */
    public static final a07 m55337j(Map<yz6, ? extends f17> map) {
        return f36338c.mo50028c(map);
    }

    /* renamed from: e */
    public f17 mo50024e(xc3 xc3) {
        vx2.m53591g(xc3, "key");
        return mo50025k(xc3.mo51134H0());
    }

    /* renamed from: k */
    public abstract f17 mo50025k(yz6 yz6);
}
