package p000;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* renamed from: bd3 */
/* compiled from: KotlinTypeRefiner.kt */
public abstract class bd3 extends C7823l7 {

    /* renamed from: bd3$a */
    /* compiled from: KotlinTypeRefiner.kt */
    public static final class C6859a extends bd3 {

        /* renamed from: a */
        public static final C6859a f36799a = new C6859a();

        /* renamed from: b */
        public if0 mo50556b(nf0 nf0) {
            vx2.m53591g(nf0, "classId");
            return null;
        }

        /* renamed from: c */
        public <S extends MemberScope> S mo50557c(if0 if0, pc2<? extends S> pc2) {
            vx2.m53591g(if0, "classDescriptor");
            vx2.m53591g(pc2, "compute");
            return (MemberScope) pc2.invoke();
        }

        /* renamed from: d */
        public boolean mo50558d(mx3 mx3) {
            vx2.m53591g(mx3, "moduleDescriptor");
            return false;
        }

        /* renamed from: e */
        public boolean mo50559e(yz6 yz6) {
            vx2.m53591g(yz6, "typeConstructor");
            return false;
        }

        /* renamed from: g */
        public Collection<xc3> mo50561g(if0 if0) {
            vx2.m53591g(if0, "classDescriptor");
            Collection<xc3> g = if0.mo50046g().mo51811g();
            vx2.m53590f(g, "classDescriptor.typeConstructor.supertypes");
            return g;
        }

        /* renamed from: h */
        public xc3 mo50563a(ad3 ad3) {
            vx2.m53591g(ad3, "type");
            return (xc3) ad3;
        }

        /* renamed from: i */
        public if0 mo50560f(d31 d31) {
            vx2.m53591g(d31, "descriptor");
            return null;
        }
    }

    /* renamed from: b */
    public abstract if0 mo50556b(nf0 nf0);

    /* renamed from: c */
    public abstract <S extends MemberScope> S mo50557c(if0 if0, pc2<? extends S> pc2);

    /* renamed from: d */
    public abstract boolean mo50558d(mx3 mx3);

    /* renamed from: e */
    public abstract boolean mo50559e(yz6 yz6);

    /* renamed from: f */
    public abstract eg0 mo50560f(d31 d31);

    /* renamed from: g */
    public abstract Collection<xc3> mo50561g(if0 if0);

    /* renamed from: h */
    public abstract xc3 mo50562h(ad3 ad3);
}
