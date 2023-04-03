package p000;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Ref$BooleanRef;
import p000.tc3;

/* renamed from: m66 */
/* compiled from: SpecialJvmAnnotations.kt */
public final class m66 {

    /* renamed from: a */
    public static final m66 f40792a = new m66();

    /* renamed from: b */
    public static final Set<nf0> f40793b;

    /* renamed from: c */
    public static final nf0 f40794c;

    /* renamed from: m66$a */
    /* compiled from: SpecialJvmAnnotations.kt */
    public static final class C7865a implements tc3.C9343c {

        /* renamed from: a */
        public final /* synthetic */ Ref$BooleanRef f40795a;

        public C7865a(Ref$BooleanRef ref$BooleanRef) {
            this.f40795a = ref$BooleanRef;
        }

        /* renamed from: a */
        public void mo53770a() {
        }

        /* renamed from: b */
        public tc3.C9341a mo53771b(nf0 nf0, a66 a66) {
            vx2.m53591g(nf0, "classId");
            vx2.m53591g(a66, "source");
            if (!vx2.m53586b(nf0, r73.f44294a.mo65615a())) {
                return null;
            }
            this.f40795a.element = true;
            return null;
        }
    }

    static {
        List<u82> m = ck0.m33065m(t73.f44653a, t73.f44663k, t73.f44664l, t73.f44656d, t73.f44658f, t73.f44661i);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (u82 m2 : m) {
            linkedHashSet.add(nf0.m69751m(m2));
        }
        f40793b = linkedHashSet;
        nf0 m3 = nf0.m69751m(t73.f44662j);
        vx2.m53590f(m3, "topLevel(JvmAnnotationNames.REPEATABLE_ANNOTATION)");
        f40794c = m3;
    }

    /* renamed from: a */
    public final nf0 mo56144a() {
        return f40794c;
    }

    /* renamed from: b */
    public final Set<nf0> mo56145b() {
        return f40793b;
    }

    /* renamed from: c */
    public final boolean mo56146c(tc3 tc3) {
        vx2.m53591g(tc3, "klass");
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        tc3.mo65262b(new C7865a(ref$BooleanRef), (byte[]) null);
        return ref$BooleanRef.element;
    }
}
