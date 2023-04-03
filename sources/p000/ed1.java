package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.C7424b;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p000.hf7;
import p000.qx3;

/* renamed from: ed1 */
/* compiled from: DescriptorVisibilities */
public class ed1 {

    /* renamed from: a */
    public static final fd1 f37506a;

    /* renamed from: b */
    public static final fd1 f37507b;

    /* renamed from: c */
    public static final fd1 f37508c;

    /* renamed from: d */
    public static final fd1 f37509d;

    /* renamed from: e */
    public static final fd1 f37510e;

    /* renamed from: f */
    public static final fd1 f37511f;

    /* renamed from: g */
    public static final fd1 f37512g;

    /* renamed from: h */
    public static final fd1 f37513h;

    /* renamed from: i */
    public static final fd1 f37514i;

    /* renamed from: j */
    public static final Set<fd1> f37515j;

    /* renamed from: k */
    public static final Map<fd1, Integer> f37516k;

    /* renamed from: l */
    public static final fd1 f37517l;

    /* renamed from: m */
    public static final j85 f37518m = new C7030a();

    /* renamed from: n */
    public static final j85 f37519n = new C7031b();
    @Deprecated

    /* renamed from: o */
    public static final j85 f37520o = new C7032c();

    /* renamed from: p */
    public static final qx3 f37521p;

    /* renamed from: q */
    public static final Map<if7, fd1> f37522q = new HashMap();

    /* renamed from: ed1$a */
    /* compiled from: DescriptorVisibilities */
    public static class C7030a implements j85 {
        public xc3 getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* renamed from: ed1$b */
    /* compiled from: DescriptorVisibilities */
    public static class C7031b implements j85 {
        public xc3 getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* renamed from: ed1$c */
    /* compiled from: DescriptorVisibilities */
    public static class C7032c implements j85 {
        public xc3 getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* renamed from: ed1$d */
    /* compiled from: DescriptorVisibilities */
    public static class C7033d extends pb1 {
        public C7033d(if7 if7) {
            super(if7);
        }

        /* renamed from: g */
        public static /* synthetic */ void m57286g(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "what";
            } else if (i != 2) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1";
            if (i == 1 || i == 2) {
                objArr[2] = "isVisible";
            } else {
                objArr[2] = "hasContainingSourceFile";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: e */
        public boolean mo50771e(j85 j85, k31 k31, d31 d31, boolean z) {
            d31 d312;
            if (k31 == null) {
                m57286g(1);
            }
            if (d31 == null) {
                m57286g(2);
            }
            if (dd1.m56805J(k31) && mo51449h(d31)) {
                return ed1.m57281f(k31, d31);
            }
            if (k31 instanceof C7424b) {
                fg0 b = ((C7424b) k31).mo51119b();
                if (z && dd1.m56802G(b) && dd1.m56805J(b) && (d31 instanceof C7424b) && dd1.m56805J(d31.mo51119b()) && ed1.m57281f(k31, d31)) {
                    return true;
                }
            }
            d31 d313 = k31;
            while (d313 != null) {
                d31 b2 = d313.mo51119b();
                if ((b2 instanceof if0) && !dd1.m56832x(b2)) {
                    d312 = b2;
                    break;
                }
                boolean z2 = b2 instanceof fk4;
                d313 = b2;
                if (z2) {
                    d312 = b2;
                    break;
                }
            }
            d312 = d313;
            if (d312 == null) {
                return false;
            }
            while (d31 != null) {
                if (d312 == d31) {
                    return true;
                }
                if (!(d31 instanceof fk4)) {
                    d31 = d31.mo51119b();
                } else if (!(d312 instanceof fk4) || !((fk4) d312).mo51711e().equals(((fk4) d31).mo51711e()) || !dd1.m56810b(d31, d312)) {
                    return false;
                } else {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: h */
        public final boolean mo51449h(d31 d31) {
            if (d31 == null) {
                m57286g(0);
            }
            if (dd1.m56818j(d31) != b66.f36690a) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: ed1$e */
    /* compiled from: DescriptorVisibilities */
    public static class C7034e extends pb1 {
        public C7034e(if7 if7) {
            super(if7);
        }

        /* renamed from: g */
        public static /* synthetic */ void m57289g(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: e */
        public boolean mo50771e(j85 j85, k31 k31, d31 d31, boolean z) {
            d31 q;
            if (k31 == null) {
                m57289g(0);
            }
            if (d31 == null) {
                m57289g(1);
            }
            if (ed1.f37506a.mo50771e(j85, k31, d31, z)) {
                if (j85 == ed1.f37519n) {
                    return true;
                }
                if (!(j85 == ed1.f37518m || (q = dd1.m56825q(k31, if0.class)) == null || !(j85 instanceof cp6))) {
                    return ((cp6) j85).mo50936r().mo50045a().equals(q.mo50045a());
                }
            }
            return false;
        }
    }

    /* renamed from: ed1$f */
    /* compiled from: DescriptorVisibilities */
    public static class C7035f extends pb1 {
        public C7035f(if7 if7) {
            super(if7);
        }

        /* renamed from: g */
        public static /* synthetic */ void m57291g(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "from";
            } else if (i == 2) {
                objArr[0] = "whatDeclaration";
            } else if (i != 3) {
                objArr[0] = "what";
            } else {
                objArr[0] = "fromClass";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3";
            if (i == 2 || i == 3) {
                objArr[2] = "doesReceiverFitForProtectedVisibility";
            } else {
                objArr[2] = "isVisible";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: e */
        public boolean mo50771e(j85 j85, k31 k31, d31 d31, boolean z) {
            if0 if0;
            Class<if0> cls = if0.class;
            if (k31 == null) {
                m57291g(0);
            }
            if (d31 == null) {
                m57291g(1);
            }
            if0 if02 = (if0) dd1.m56825q(k31, cls);
            if0 if03 = (if0) dd1.m56826r(d31, cls, false);
            if (if03 == null) {
                return false;
            }
            if (if02 != null && dd1.m56832x(if02) && (if0 = (if0) dd1.m56825q(if02, cls)) != null && dd1.m56803H(if03, if0)) {
                return true;
            }
            k31 M = dd1.m56808M(k31);
            if0 if04 = (if0) dd1.m56825q(M, cls);
            if (if04 == null) {
                return false;
            }
            if (!dd1.m56803H(if03, if04) || !mo51450h(j85, M, if03)) {
                return mo50771e(j85, k31, if03.mo51119b(), z);
            }
            return true;
        }

        /* renamed from: h */
        public final boolean mo51450h(j85 j85, k31 k31, if0 if0) {
            xc3 xc3;
            if (k31 == null) {
                m57291g(2);
            }
            if (if0 == null) {
                m57291g(3);
            }
            if (j85 == ed1.f37520o) {
                return false;
            }
            if (!(k31 instanceof CallableMemberDescriptor) || (k31 instanceof C7424b) || j85 == ed1.f37519n) {
                return true;
            }
            if (j85 == ed1.f37518m || j85 == null) {
                return false;
            }
            if (j85 instanceof md6) {
                xc3 = ((md6) j85).mo56240a();
            } else {
                xc3 = j85.getType();
            }
            if (dd1.m56804I(xc3, if0) || ql1.m71288a(xc3)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: ed1$g */
    /* compiled from: DescriptorVisibilities */
    public static class C7036g extends pb1 {
        public C7036g(if7 if7) {
            super(if7);
        }

        /* renamed from: g */
        public static /* synthetic */ void m57294g(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: e */
        public boolean mo50771e(j85 j85, k31 k31, d31 d31, boolean z) {
            if (k31 == null) {
                m57294g(0);
            }
            if (d31 == null) {
                m57294g(1);
            }
            if (!dd1.m56815g(d31).mo51539v(dd1.m56815g(k31))) {
                return false;
            }
            return ed1.f37521p.mo65543a(k31, d31);
        }
    }

    /* renamed from: ed1$h */
    /* compiled from: DescriptorVisibilities */
    public static class C7037h extends pb1 {
        public C7037h(if7 if7) {
            super(if7);
        }

        /* renamed from: g */
        public static /* synthetic */ void m57296g(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$5";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: e */
        public boolean mo50771e(j85 j85, k31 k31, d31 d31, boolean z) {
            if (k31 == null) {
                m57296g(0);
            }
            if (d31 == null) {
                m57296g(1);
            }
            return true;
        }
    }

    /* renamed from: ed1$i */
    /* compiled from: DescriptorVisibilities */
    public static class C7038i extends pb1 {
        public C7038i(if7 if7) {
            super(if7);
        }

        /* renamed from: g */
        public static /* synthetic */ void m57298g(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$6";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: e */
        public boolean mo50771e(j85 j85, k31 k31, d31 d31, boolean z) {
            if (k31 == null) {
                m57298g(0);
            }
            if (d31 == null) {
                m57298g(1);
            }
            throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
        }
    }

    /* renamed from: ed1$j */
    /* compiled from: DescriptorVisibilities */
    public static class C7039j extends pb1 {
        public C7039j(if7 if7) {
            super(if7);
        }

        /* renamed from: g */
        public static /* synthetic */ void m57300g(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$7";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: e */
        public boolean mo50771e(j85 j85, k31 k31, d31 d31, boolean z) {
            if (k31 == null) {
                m57300g(0);
            }
            if (d31 == null) {
                m57300g(1);
            }
            throw new IllegalStateException("Visibility is unknown yet");
        }
    }

    /* renamed from: ed1$k */
    /* compiled from: DescriptorVisibilities */
    public static class C7040k extends pb1 {
        public C7040k(if7 if7) {
            super(if7);
        }

        /* renamed from: g */
        public static /* synthetic */ void m57302g(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$8";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: e */
        public boolean mo50771e(j85 j85, k31 k31, d31 d31, boolean z) {
            if (k31 == null) {
                m57302g(0);
            }
            if (d31 == null) {
                m57302g(1);
            }
            return false;
        }
    }

    /* renamed from: ed1$l */
    /* compiled from: DescriptorVisibilities */
    public static class C7041l extends pb1 {
        public C7041l(if7 if7) {
            super(if7);
        }

        /* renamed from: g */
        public static /* synthetic */ void m57304g(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$9";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: e */
        public boolean mo50771e(j85 j85, k31 k31, d31 d31, boolean z) {
            if (k31 == null) {
                m57304g(0);
            }
            if (d31 == null) {
                m57304g(1);
            }
            return false;
        }
    }

    static {
        qx3 qx3;
        Class<qx3> cls = qx3.class;
        C7033d dVar = new C7033d(hf7.C7177e.f38212c);
        f37506a = dVar;
        C7034e eVar = new C7034e(hf7.C7178f.f38213c);
        f37507b = eVar;
        C7035f fVar = new C7035f(hf7.C7179g.f38214c);
        f37508c = fVar;
        C7036g gVar = new C7036g(hf7.C7174b.f38209c);
        f37509d = gVar;
        C7037h hVar = new C7037h(hf7.C7180h.f38215c);
        f37510e = hVar;
        C7038i iVar = new C7038i(hf7.C7176d.f38211c);
        f37511f = iVar;
        C7039j jVar = new C7039j(hf7.C7173a.f38208c);
        f37512g = jVar;
        C7040k kVar = new C7040k(hf7.C7175c.f38210c);
        f37513h = kVar;
        C7041l lVar = new C7041l(hf7.C7181i.f38216c);
        f37514i = lVar;
        f37515j = Collections.unmodifiableSet(ny5.m49098h(dVar, eVar, gVar, iVar));
        HashMap e = ak0.m55535e(4);
        e.put(eVar, 0);
        e.put(dVar, 0);
        e.put(gVar, 1);
        e.put(fVar, 1);
        e.put(hVar, 2);
        f37516k = Collections.unmodifiableMap(e);
        f37517l = hVar;
        Iterator<S> it = ServiceLoader.load(cls, cls.getClassLoader()).iterator();
        if (it.hasNext()) {
            qx3 = (qx3) it.next();
        } else {
            qx3 = qx3.C9225a.f44261a;
        }
        f37521p = qx3;
        m57284i(dVar);
        m57284i(eVar);
        m57284i(fVar);
        m57284i(gVar);
        m57284i(hVar);
        m57284i(iVar);
        m57284i(jVar);
        m57284i(kVar);
        m57284i(lVar);
    }

    /* renamed from: a */
    public static /* synthetic */ void m57276a(int i) {
        String str = i != 16 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i != 16 ? 3 : 2)];
        if (!(i == 1 || i == 3 || i == 5 || i == 7)) {
            switch (i) {
                case 9:
                    break;
                case 10:
                case 12:
                    objArr[0] = "first";
                    break;
                case 11:
                case 13:
                    objArr[0] = "second";
                    break;
                case 14:
                case 15:
                    objArr[0] = "visibility";
                    break;
                case 16:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
                    break;
                default:
                    objArr[0] = "what";
                    break;
            }
        }
        objArr[0] = "from";
        if (i != 16) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
        } else {
            objArr[1] = "toDescriptorVisibility";
        }
        switch (i) {
            case 2:
            case 3:
                objArr[2] = "isVisibleIgnoringReceiver";
                break;
            case 4:
            case 5:
                objArr[2] = "isVisibleWithAnyReceiver";
                break;
            case 6:
            case 7:
                objArr[2] = "inSameFile";
                break;
            case 8:
            case 9:
                objArr[2] = "findInvisibleMember";
                break;
            case 10:
            case 11:
                objArr[2] = "compareLocal";
                break;
            case 12:
            case 13:
                objArr[2] = "compare";
                break;
            case 14:
                objArr[2] = "isPrivate";
                break;
            case 15:
                objArr[2] = "toDescriptorVisibility";
                break;
            case 16:
                break;
            default:
                objArr[2] = "isVisible";
                break;
        }
        String format = String.format(str, objArr);
        throw (i != 16 ? new IllegalArgumentException(format) : new IllegalStateException(format));
    }

    /* renamed from: d */
    public static Integer m57279d(fd1 fd1, fd1 fd12) {
        if (fd1 == null) {
            m57276a(12);
        }
        if (fd12 == null) {
            m57276a(13);
        }
        Integer a = fd1.mo51640a(fd12);
        if (a != null) {
            return a;
        }
        Integer a2 = fd12.mo51640a(fd1);
        if (a2 != null) {
            return Integer.valueOf(-a2.intValue());
        }
        return null;
    }

    /* renamed from: e */
    public static k31 m57280e(j85 j85, k31 k31, d31 d31, boolean z) {
        k31 e;
        if (k31 == null) {
            m57276a(8);
        }
        if (d31 == null) {
            m57276a(9);
        }
        k31 k312 = (k31) k31.mo50045a();
        while (k312 != null && k312.getVisibility() != f37511f) {
            if (!k312.getVisibility().mo50771e(j85, k312, d31, z)) {
                return k312;
            }
            k312 = (k31) dd1.m56825q(k312, k31.class);
        }
        if (!(k31 instanceof gz6) || (e = m57280e(j85, ((gz6) k31).mo52084M(), d31, z)) == null) {
            return null;
        }
        return e;
    }

    /* renamed from: f */
    public static boolean m57281f(d31 d31, d31 d312) {
        if (d31 == null) {
            m57276a(6);
        }
        if (d312 == null) {
            m57276a(7);
        }
        b66 j = dd1.m56818j(d312);
        if (j != b66.f36690a) {
            return j.equals(dd1.m56818j(d31));
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m57282g(fd1 fd1) {
        if (fd1 == null) {
            m57276a(14);
        }
        if (fd1 == f37506a || fd1 == f37507b) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public static boolean m57283h(k31 k31, d31 d31, boolean z) {
        if (k31 == null) {
            m57276a(2);
        }
        if (d31 == null) {
            m57276a(3);
        }
        if (m57280e(f37519n, k31, d31, z) == null) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public static void m57284i(fd1 fd1) {
        f37522q.put(fd1.mo51641b(), fd1);
    }

    /* renamed from: j */
    public static fd1 m57285j(if7 if7) {
        if (if7 == null) {
            m57276a(15);
        }
        fd1 fd1 = f37522q.get(if7);
        if (fd1 != null) {
            return fd1;
        }
        throw new IllegalArgumentException("Inapplicable visibility: " + if7);
    }
}
