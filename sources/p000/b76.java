package p000;

import androidx.recyclerview.widget.RecyclerView;
import build.IgnoreJava8API;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.AbstractList;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedSet;
import java.util.Vector;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java8.util.C6034a;
import okhttp3.internal.http2.Http2;
import p000.z66;

/* renamed from: b76 */
/* compiled from: Spliterators */
public final class b76 {

    /* renamed from: a */
    public static final String f21134a;

    /* renamed from: b */
    public static final String f21135b;

    /* renamed from: c */
    public static final String f21136c;

    /* renamed from: d */
    public static final boolean f21137d;

    /* renamed from: e */
    public static final boolean f21138e;

    /* renamed from: f */
    public static final boolean f21139f;

    /* renamed from: g */
    public static final boolean f21140g = m32384p();

    /* renamed from: h */
    public static final boolean f21141h;

    /* renamed from: i */
    public static final boolean f21142i;

    /* renamed from: j */
    public static final boolean f21143j;

    /* renamed from: k */
    public static final boolean f21144k;

    /* renamed from: l */
    public static final boolean f21145l = m32385q();

    /* renamed from: m */
    public static final boolean f21146m = m32381m("java.lang.StackWalker$Option");

    /* renamed from: n */
    public static final z66<Object> f21147n = new C3878d.C3882d();

    /* renamed from: o */
    public static final z66.C6756b f21148o = new C3878d.C3880b();

    /* renamed from: p */
    public static final z66.C6757c f21149p = new C3878d.C3881c();

    /* renamed from: q */
    public static final z66.C6755a f21150q = new C3878d.C3879a();

    /* renamed from: b76$a */
    /* compiled from: Spliterators */
    public static class C3875a extends C3883e<T> {

        /* renamed from: f */
        public final /* synthetic */ Set f21151f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3875a(Collection collection, int i, Set set) {
            super(collection, i);
            this.f21151f = set;
        }

        public Comparator<? super T> getComparator() {
            return ((SortedSet) this.f21151f).comparator();
        }
    }

    /* renamed from: b76$b */
    /* compiled from: Spliterators */
    public static class C3876b implements PrivilegedAction<Boolean> {

        /* renamed from: a */
        public final /* synthetic */ boolean f21152a;

        /* renamed from: b */
        public final /* synthetic */ String f21153b;

        public C3876b(boolean z, String str) {
            this.f21152a = z;
            this.f21153b = str;
        }

        /* renamed from: a */
        public Boolean run() {
            boolean z = this.f21152a;
            try {
                z = Boolean.parseBoolean(System.getProperty(this.f21153b, Boolean.toString(z)).trim());
            } catch (IllegalArgumentException | NullPointerException unused) {
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: b76$c */
    /* compiled from: Spliterators */
    public static final class C3877c<T> implements z66<T> {

        /* renamed from: a */
        public final Object[] f21154a;

        /* renamed from: b */
        public int f21155b;

        /* renamed from: c */
        public final int f21156c;

        /* renamed from: d */
        public final int f21157d;

        public C3877c(Object[] objArr, int i) {
            this(objArr, 0, objArr.length, i);
        }

        /* renamed from: a */
        public void mo29473a(xq0<? super T> xq0) {
            int i;
            kf4.m47057e(xq0);
            Object[] objArr = this.f21154a;
            int length = objArr.length;
            int i2 = this.f21156c;
            if (length >= i2 && (i = this.f21155b) >= 0) {
                this.f21155b = i2;
                if (i < i2) {
                    do {
                        xq0.accept(objArr[i]);
                        i++;
                    } while (i < i2);
                }
            }
        }

        /* renamed from: c */
        public boolean mo29474c(xq0<? super T> xq0) {
            kf4.m47057e(xq0);
            int i = this.f21155b;
            if (i < 0 || i >= this.f21156c) {
                return false;
            }
            Object[] objArr = this.f21154a;
            this.f21155b = i + 1;
            xq0.accept(objArr[i]);
            return true;
        }

        public int characteristics() {
            return this.f21157d;
        }

        public long estimateSize() {
            return (long) (this.f21156c - this.f21155b);
        }

        public Comparator<? super T> getComparator() {
            if (hasCharacteristics(4)) {
                return null;
            }
            throw new IllegalStateException();
        }

        public long getExactSizeIfKnown() {
            return b76.m32377i(this);
        }

        public boolean hasCharacteristics(int i) {
            return b76.m32379k(this, i);
        }

        public z66<T> trySplit() {
            int i = this.f21155b;
            int i2 = (this.f21156c + i) >>> 1;
            if (i >= i2) {
                return null;
            }
            Object[] objArr = this.f21154a;
            this.f21155b = i2;
            return new C3877c(objArr, i, i2, this.f21157d);
        }

        public C3877c(Object[] objArr, int i, int i2, int i3) {
            this.f21154a = objArr;
            this.f21155b = i;
            this.f21156c = i2;
            this.f21157d = i3 | 64 | Http2.INITIAL_MAX_FRAME_SIZE;
        }
    }

    /* renamed from: b76$d */
    /* compiled from: Spliterators */
    public static abstract class C3878d<T, S extends z66<T>, C> {

        /* renamed from: b76$d$a */
        /* compiled from: Spliterators */
        public static final class C3879a extends C3878d<Double, z66.C6755a, ni1> implements z66.C6755a {
            /* renamed from: a */
            public void mo29473a(xq0<? super Double> xq0) {
                C3884f.m32415a(this, xq0);
            }

            /* renamed from: c */
            public boolean mo29474c(xq0<? super Double> xq0) {
                return C3884f.m32417c(this, xq0);
            }

            /* renamed from: f */
            public /* bridge */ /* synthetic */ void mo29485f(ni1 ni1) {
                super.mo29482i(ni1);
            }

            /* renamed from: g */
            public /* bridge */ /* synthetic */ boolean mo29486g(ni1 ni1) {
                return super.mo29483j(ni1);
            }

            public Comparator<? super Double> getComparator() {
                throw new IllegalStateException();
            }

            public long getExactSizeIfKnown() {
                return b76.m32377i(this);
            }

            public boolean hasCharacteristics(int i) {
                return b76.m32379k(this, i);
            }
        }

        /* renamed from: b76$d$b */
        /* compiled from: Spliterators */
        public static final class C3880b extends C3878d<Integer, z66.C6756b, jw2> implements z66.C6756b {
            /* renamed from: a */
            public void mo29473a(xq0<? super Integer> xq0) {
                C3885g.m32418a(this, xq0);
            }

            /* renamed from: c */
            public boolean mo29474c(xq0<? super Integer> xq0) {
                return C3885g.m32420c(this, xq0);
            }

            /* renamed from: d */
            public /* bridge */ /* synthetic */ boolean mo29487d(jw2 jw2) {
                return super.mo29483j(jw2);
            }

            /* renamed from: e */
            public /* bridge */ /* synthetic */ void mo29488e(jw2 jw2) {
                super.mo29482i(jw2);
            }

            public Comparator<? super Integer> getComparator() {
                throw new IllegalStateException();
            }

            public long getExactSizeIfKnown() {
                return b76.m32377i(this);
            }

            public boolean hasCharacteristics(int i) {
                return b76.m32379k(this, i);
            }
        }

        /* renamed from: b76$d$c */
        /* compiled from: Spliterators */
        public static final class C3881c extends C3878d<Long, z66.C6757c, dl3> implements z66.C6757c {
            /* renamed from: a */
            public void mo29473a(xq0<? super Long> xq0) {
                C3886h.m32421a(this, xq0);
            }

            /* renamed from: b */
            public /* bridge */ /* synthetic */ void mo29489b(dl3 dl3) {
                super.mo29482i(dl3);
            }

            /* renamed from: c */
            public boolean mo29474c(xq0<? super Long> xq0) {
                return C3886h.m32423c(this, xq0);
            }

            public Comparator<? super Long> getComparator() {
                throw new IllegalStateException();
            }

            public long getExactSizeIfKnown() {
                return b76.m32377i(this);
            }

            /* renamed from: h */
            public /* bridge */ /* synthetic */ boolean mo29490h(dl3 dl3) {
                return super.mo29483j(dl3);
            }

            public boolean hasCharacteristics(int i) {
                return b76.m32379k(this, i);
            }
        }

        /* renamed from: b76$d$d */
        /* compiled from: Spliterators */
        public static final class C3882d<T> extends C3878d<T, z66<T>, xq0<? super T>> implements z66<T> {
            /* renamed from: a */
            public /* bridge */ /* synthetic */ void mo29473a(xq0 xq0) {
                super.mo29482i(xq0);
            }

            /* renamed from: c */
            public /* bridge */ /* synthetic */ boolean mo29474c(xq0 xq0) {
                return super.mo29483j(xq0);
            }

            public Comparator<? super T> getComparator() {
                throw new IllegalStateException();
            }

            public long getExactSizeIfKnown() {
                return b76.m32377i(this);
            }

            public boolean hasCharacteristics(int i) {
                return b76.m32379k(this, i);
            }
        }

        public int characteristics() {
            return 16448;
        }

        public long estimateSize() {
            return 0;
        }

        /* renamed from: i */
        public void mo29482i(C c) {
            kf4.m47057e(c);
        }

        /* renamed from: j */
        public boolean mo29483j(C c) {
            kf4.m47057e(c);
            return false;
        }

        public S trySplit() {
            return null;
        }
    }

    /* renamed from: b76$e */
    /* compiled from: Spliterators */
    public static class C3883e<T> implements z66<T> {

        /* renamed from: a */
        public final Collection<? extends T> f21158a;

        /* renamed from: b */
        public Iterator<? extends T> f21159b = null;

        /* renamed from: c */
        public final int f21160c;

        /* renamed from: d */
        public long f21161d;

        /* renamed from: e */
        public int f21162e;

        public C3883e(Collection<? extends T> collection, int i) {
            this.f21158a = collection;
            this.f21160c = (i & 4096) == 0 ? i | 64 | Http2.INITIAL_MAX_FRAME_SIZE : i;
        }

        /* renamed from: a */
        public void mo29473a(xq0<? super T> xq0) {
            kf4.m47057e(xq0);
            Iterator<? extends T> it = this.f21159b;
            if (it == null) {
                it = this.f21158a.iterator();
                this.f21159b = it;
                this.f21161d = (long) this.f21158a.size();
            }
            C6034a.m46204a(it, xq0);
        }

        /* renamed from: c */
        public boolean mo29474c(xq0<? super T> xq0) {
            kf4.m47057e(xq0);
            if (this.f21159b == null) {
                this.f21159b = this.f21158a.iterator();
                this.f21161d = (long) this.f21158a.size();
            }
            if (!this.f21159b.hasNext()) {
                return false;
            }
            xq0.accept(this.f21159b.next());
            return true;
        }

        public int characteristics() {
            return this.f21160c;
        }

        public long estimateSize() {
            if (this.f21159b != null) {
                return this.f21161d;
            }
            this.f21159b = this.f21158a.iterator();
            long size = (long) this.f21158a.size();
            this.f21161d = size;
            return size;
        }

        public Comparator<? super T> getComparator() {
            if (hasCharacteristics(4)) {
                return null;
            }
            throw new IllegalStateException();
        }

        public long getExactSizeIfKnown() {
            return b76.m32377i(this);
        }

        public boolean hasCharacteristics(int i) {
            return b76.m32379k(this, i);
        }

        public z66<T> trySplit() {
            long j;
            Iterator<? extends T> it = this.f21159b;
            if (it == null) {
                it = this.f21158a.iterator();
                this.f21159b = it;
                j = (long) this.f21158a.size();
                this.f21161d = j;
            } else {
                j = this.f21161d;
            }
            if (j <= 1 || !it.hasNext()) {
                return null;
            }
            int i = this.f21162e + RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE;
            if (((long) i) > j) {
                i = (int) j;
            }
            if (i > 33554432) {
                i = 33554432;
            }
            Object[] objArr = new Object[i];
            int i2 = 0;
            do {
                objArr[i2] = it.next();
                i2++;
                if (i2 >= i || !it.hasNext()) {
                    this.f21162e = i2;
                    long j2 = this.f21161d;
                }
                objArr[i2] = it.next();
                i2++;
                break;
            } while (!it.hasNext());
            this.f21162e = i2;
            long j22 = this.f21161d;
            if (j22 != Long.MAX_VALUE) {
                this.f21161d = j22 - ((long) i2);
            }
            return new C3877c(objArr, 0, i2, this.f21160c);
        }
    }

    /* renamed from: b76$f */
    /* compiled from: Spliterators */
    public static final class C3884f {
        /* renamed from: a */
        public static void m32415a(z66.C6755a aVar, xq0<? super Double> xq0) {
            if (xq0 instanceof ni1) {
                aVar.mo29485f((ni1) xq0);
            } else {
                aVar.mo29485f(m32416b(xq0));
            }
        }

        /* renamed from: b */
        public static ni1 m32416b(xq0<? super Double> xq0) {
            xq0.getClass();
            return c76.m32862a(xq0);
        }

        /* renamed from: c */
        public static boolean m32417c(z66.C6755a aVar, xq0<? super Double> xq0) {
            if (xq0 instanceof ni1) {
                return aVar.mo29486g((ni1) xq0);
            }
            return aVar.mo29486g(m32416b(xq0));
        }
    }

    /* renamed from: b76$g */
    /* compiled from: Spliterators */
    public static final class C3885g {
        /* renamed from: a */
        public static void m32418a(z66.C6756b bVar, xq0<? super Integer> xq0) {
            if (xq0 instanceof jw2) {
                bVar.mo29488e((jw2) xq0);
            } else {
                bVar.mo29488e(m32419b(xq0));
            }
        }

        /* renamed from: b */
        public static jw2 m32419b(xq0<? super Integer> xq0) {
            xq0.getClass();
            return d76.m43396a(xq0);
        }

        /* renamed from: c */
        public static boolean m32420c(z66.C6756b bVar, xq0<? super Integer> xq0) {
            if (xq0 instanceof jw2) {
                return bVar.mo29487d((jw2) xq0);
            }
            return bVar.mo29487d(m32419b(xq0));
        }
    }

    /* renamed from: b76$h */
    /* compiled from: Spliterators */
    public static final class C3886h {
        /* renamed from: a */
        public static void m32421a(z66.C6757c cVar, xq0<? super Long> xq0) {
            if (xq0 instanceof dl3) {
                cVar.mo29489b((dl3) xq0);
            } else {
                cVar.mo29489b(m32422b(xq0));
            }
        }

        /* renamed from: b */
        public static dl3 m32422b(xq0<? super Long> xq0) {
            xq0.getClass();
            return e76.m43809a(xq0);
        }

        /* renamed from: c */
        public static boolean m32423c(z66.C6757c cVar, xq0<? super Long> xq0) {
            if (xq0 instanceof dl3) {
                return cVar.mo29490h((dl3) xq0);
            }
            return cVar.mo29490h(m32422b(xq0));
        }
    }

    static {
        boolean z;
        boolean z2;
        Class<b76> cls = b76.class;
        String str = cls.getName() + ".assume.oracle.collections.impl";
        f21134a = str;
        String str2 = cls.getName() + ".jre.delegation.enabled";
        f21135b = str2;
        String str3 = cls.getName() + ".randomaccess.spliterator.enabled";
        f21136c = str3;
        boolean z3 = true;
        f21137d = m32375g(str, true);
        f21138e = m32375g(str2, true);
        f21139f = m32375g(str3, true);
        boolean l = m32380l();
        f21141h = l;
        if (!l || m32381m("android.opengl.GLES32$DebugProc")) {
            z = false;
        } else {
            z = true;
        }
        f21142i = z;
        if (!l || !m32381m("java.time.DateTimeException")) {
            z2 = false;
        } else {
            z2 = true;
        }
        f21143j = z2;
        if (l || !m32383o()) {
            z3 = false;
        }
        f21144k = z3;
    }

    /* renamed from: a */
    public static void m32369a(int i, int i2, int i3) {
        if (i2 > i3) {
            throw new ArrayIndexOutOfBoundsException("origin(" + i2 + ") > fence(" + i3 + ")");
        } else if (i2 < 0) {
            throw new ArrayIndexOutOfBoundsException(i2);
        } else if (i3 > i) {
            throw new ArrayIndexOutOfBoundsException(i3);
        }
    }

    @IgnoreJava8API
    /* renamed from: b */
    public static <T> z66<T> m32370b(Collection<? extends T> collection) {
        return new wb1(collection.spliterator());
    }

    /* renamed from: c */
    public static z66.C6755a m32371c() {
        return f21150q;
    }

    /* renamed from: d */
    public static z66.C6756b m32372d() {
        return f21148o;
    }

    /* renamed from: e */
    public static z66.C6757c m32373e() {
        return f21149p;
    }

    /* renamed from: f */
    public static <T> z66<T> m32374f() {
        return f21147n;
    }

    /* renamed from: g */
    public static boolean m32375g(String str, boolean z) {
        return ((Boolean) AccessController.doPrivileged(new C3876b(z, str))).booleanValue();
    }

    /* renamed from: h */
    public static <T> Comparator<? super T> m32376h(z66<T> z66) {
        throw new IllegalStateException();
    }

    /* renamed from: i */
    public static <T> long m32377i(z66<T> z66) {
        if ((z66.characteristics() & 64) == 0) {
            return -1;
        }
        return z66.estimateSize();
    }

    @IgnoreJava8API
    /* renamed from: j */
    public static boolean m32378j(Collection<?> collection) {
        if (!f21141h || f21142i || f21143j || !collection.getClass().getName().startsWith("java.util.HashMap$")) {
            return false;
        }
        return collection.spliterator().hasCharacteristics(16);
    }

    /* renamed from: k */
    public static <T> boolean m32379k(z66<T> z66, int i) {
        if ((z66.characteristics() & i) == i) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public static boolean m32380l() {
        if (m32381m("android.util.DisplayMetrics") || f21140g) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public static boolean m32381m(String str) {
        Class<?> cls;
        try {
            cls = Class.forName(str, false, b76.class.getClassLoader());
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public static boolean m32382n(String str) {
        if (!str.startsWith("java.util.Collections$", 0) || !str.endsWith("RandomAccessList")) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    public static boolean m32383o() {
        return m32386r("java.class.version", 51.0d);
    }

    /* renamed from: p */
    public static boolean m32384p() {
        return m32381m("org.robovm.rt.bro.Bro");
    }

    /* renamed from: q */
    public static boolean m32385q() {
        if (!m32380l() && m32386r("java.class.version", 52.0d)) {
            return false;
        }
        String[] strArr = {"java.util.function.Consumer", "java.util.Spliterator"};
        Method method = null;
        int i = 0;
        Class<?> cls = null;
        while (i < 2) {
            try {
                cls = Class.forName(strArr[i]);
                i++;
            } catch (Exception unused) {
                return false;
            }
        }
        if (cls != null) {
            try {
                method = Collection.class.getDeclaredMethod("spliterator", new Class[0]);
            } catch (Exception unused2) {
                return false;
            }
        }
        if (method != null) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public static boolean m32386r(String str, double d) {
        try {
            String property = System.getProperty(str);
            if (property == null || Double.parseDouble(property) >= d) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: s */
    public static <T> z66<T> m32387s(List<? extends T> list, String str) {
        if (f21137d || f21141h) {
            if (list instanceof ArrayList) {
                return C6196kq.m47458m((ArrayList) list);
            }
            if ("java.util.Arrays$ArrayList".equals(str)) {
                return C6574uq.m52962b(list);
            }
            if (list instanceof CopyOnWriteArrayList) {
                return y70.m54648c((CopyOnWriteArrayList) list);
            }
            if (list instanceof LinkedList) {
                return sh3.m51790p((LinkedList) list);
            }
            if (list instanceof Vector) {
                return v87.m53303m((Vector) list);
            }
        }
        if (f21139f && (list instanceof RandomAccess)) {
            if (!(list instanceof AbstractList) && m32382n(str)) {
                return m32391w(list, 16);
            }
            if (!(list instanceof CopyOnWriteArrayList)) {
                return k65.m46879l(list);
            }
        }
        return m32391w(list, 16);
    }

    /* renamed from: t */
    public static <T> z66<T> m32388t(Queue<? extends T> queue) {
        int i;
        if (queue instanceof ArrayBlockingQueue) {
            return m32391w(queue, 4368);
        }
        if (f21137d || f21141h) {
            if (queue instanceof LinkedBlockingQueue) {
                return hd3.m45145q((LinkedBlockingQueue) queue);
            }
            if (queue instanceof ArrayDeque) {
                return C5846fq.m44364m((ArrayDeque) queue);
            }
            if (queue instanceof LinkedBlockingDeque) {
                return gd3.m44686n((LinkedBlockingDeque) queue);
            }
            if (queue instanceof PriorityBlockingQueue) {
                return tj4.m52322j((PriorityBlockingQueue) queue);
            }
            if (queue instanceof PriorityQueue) {
                return ck4.m33076m((PriorityQueue) queue);
            }
        }
        if (!(queue instanceof Deque) && (!queue.getClass().getName().startsWith("java.util") || (queue instanceof PriorityBlockingQueue) || (queue instanceof PriorityQueue) || (queue instanceof DelayQueue) || (queue instanceof SynchronousQueue))) {
            return m32391w(queue, 0);
        }
        if (queue instanceof ArrayDeque) {
            i = 272;
        } else {
            i = 16;
        }
        return m32391w(queue, i);
    }

    /* renamed from: u */
    public static <T> z66<T> m32389u(Set<? extends T> set, String str) {
        boolean z = f21142i;
        if (!z && f21137d) {
            if ("java.util.HashMap$EntrySet".equals(str)) {
                return kk2.m47130a(set);
            }
            if ("java.util.HashMap$KeySet".equals(str)) {
                return kk2.m47136g(set);
            }
        }
        if (set instanceof LinkedHashSet) {
            return m32391w(set, 17);
        }
        if (!z && f21137d && (set instanceof HashSet)) {
            return kk2.m47135f((HashSet) set);
        }
        if (set instanceof SortedSet) {
            return new C3875a(set, 21, set);
        }
        if ((f21137d || f21141h) && (set instanceof CopyOnWriteArraySet)) {
            return z70.m55008b((CopyOnWriteArraySet) set);
        }
        return m32391w(set, 1);
    }

    /* renamed from: v */
    public static <T> z66<T> m32390v(Collection<? extends T> collection) {
        kf4.m47057e(collection);
        if (f21145l && ((f21138e || f21146m) && !m32378j(collection))) {
            return m32370b(collection);
        }
        String name = collection.getClass().getName();
        if (collection instanceof List) {
            return m32387s((List) collection, name);
        }
        if (collection instanceof Set) {
            return m32389u((Set) collection, name);
        }
        if (collection instanceof Queue) {
            return m32388t((Queue) collection);
        }
        if (f21142i || !f21137d || !"java.util.HashMap$Values".equals(name)) {
            return m32391w(collection, 0);
        }
        return kk2.m47137h(collection);
    }

    /* renamed from: w */
    public static <T> z66<T> m32391w(Collection<? extends T> collection, int i) {
        return new C3883e((Collection) kf4.m47057e(collection), i);
    }

    /* renamed from: x */
    public static <T> z66<T> m32392x(Object[] objArr, int i) {
        return new C3877c((Object[]) kf4.m47057e(objArr), i);
    }

    /* renamed from: y */
    public static <T> z66<T> m32393y(Object[] objArr, int i, int i2, int i3) {
        m32369a(((Object[]) kf4.m47057e(objArr)).length, i, i2);
        return new C3877c(objArr, i, i2, i3);
    }
}
