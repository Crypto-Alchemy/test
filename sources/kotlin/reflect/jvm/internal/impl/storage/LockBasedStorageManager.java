package kotlin.reflect.jvm.internal.impl.storage;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.reflect.jvm.internal.impl.utils.WrappedValues;
import kotlin.text.StringsKt__StringsKt;

public class LockBasedStorageManager implements da6 {

    /* renamed from: d */
    public static final String f40223d = StringsKt__StringsKt.m63086T0(LockBasedStorageManager.class.getCanonicalName(), ".", "");

    /* renamed from: e */
    public static final da6 f40224e = new C7692a("NO_LOCKS", C7698f.f40234a, ap1.f36529b);

    /* renamed from: a */
    public final C7708a f40225a;

    /* renamed from: b */
    public final C7698f f40226b;

    /* renamed from: c */
    public final String f40227c;

    public enum NotValue {
        NOT_COMPUTED,
        COMPUTING,
        RECURSION_WAS_DETECTED
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$a */
    public static class C7692a extends LockBasedStorageManager {
        public C7692a(String str, C7698f fVar, C7708a aVar) {
            super(str, fVar, aVar, (C7692a) null);
        }

        /* renamed from: j */
        public static /* synthetic */ void m62753j(int i) {
            String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i != 1 ? 3 : 2)];
            if (i != 1) {
                objArr[0] = "source";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
            }
            if (i != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
            } else {
                objArr[1] = "recursionDetectedDefault";
            }
            if (i != 1) {
                objArr[2] = "recursionDetectedDefault";
            }
            String format = String.format(str, objArr);
            throw (i != 1 ? new IllegalArgumentException(format) : new IllegalStateException(format));
        }

        /* renamed from: p */
        public <K, V> C7707n<V> mo55240p(String str, K k) {
            if (str == null) {
                m62753j(0);
            }
            C7707n<V> a = C7707n.m62783a();
            if (a == null) {
                m62753j(1);
            }
            return a;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$b */
    public class C7693b extends C7703j<T> {

        /* renamed from: g */
        public final /* synthetic */ Object f40229g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7693b(LockBasedStorageManager lockBasedStorageManager, pc2 pc2, Object obj) {
            super(lockBasedStorageManager, pc2);
            this.f40229g = obj;
        }

        /* renamed from: a */
        public static /* synthetic */ void m62755a(int i) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", new Object[]{"kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$4", "recursionDetected"}));
        }

        /* renamed from: c */
        public C7707n<T> mo55242c(boolean z) {
            C7707n<T> d = C7707n.m62784d(this.f40229g);
            if (d == null) {
                m62755a(0);
            }
            return d;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$c */
    public class C7694c extends C7704k<T> {

        /* renamed from: k */
        public final /* synthetic */ rc2 f40231k;

        /* renamed from: r */
        public final /* synthetic */ rc2 f40232r;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7694c(LockBasedStorageManager lockBasedStorageManager, pc2 pc2, rc2 rc2, rc2 rc22) {
            super(lockBasedStorageManager, pc2);
            this.f40231k = rc2;
            this.f40232r = rc22;
        }

        /* renamed from: a */
        public static /* synthetic */ void m62757a(int i) {
            String str = i != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i != 2 ? 2 : 3)];
            if (i != 2) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
            } else {
                objArr[0] = "value";
            }
            if (i != 2) {
                objArr[1] = "recursionDetected";
            } else {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
            }
            if (i == 2) {
                objArr[2] = "doPostCompute";
            }
            String format = String.format(str, objArr);
            throw (i != 2 ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        /* renamed from: c */
        public C7707n<T> mo55242c(boolean z) {
            rc2 rc2 = this.f40231k;
            if (rc2 == null) {
                C7707n<T> c = super.mo55242c(z);
                if (c == null) {
                    m62757a(0);
                }
                return c;
            }
            C7707n<T> d = C7707n.m62784d(rc2.invoke(Boolean.valueOf(z)));
            if (d == null) {
                m62757a(1);
            }
            return d;
        }

        /* renamed from: d */
        public void mo55243d(T t) {
            if (t == null) {
                m62757a(2);
            }
            this.f40232r.invoke(t);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$d */
    public static class C7695d<K, V> extends C7696e<K, V> implements i80<K, V> {
        public /* synthetic */ C7695d(LockBasedStorageManager lockBasedStorageManager, ConcurrentMap concurrentMap, C7692a aVar) {
            this(lockBasedStorageManager, concurrentMap);
        }

        /* renamed from: b */
        public static /* synthetic */ void m62760b(int i) {
            String str = i != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i != 3 ? 3 : 2)];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i == 2) {
                objArr[0] = "computation";
            } else if (i != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            }
            if (i != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            } else {
                objArr[1] = "computeIfAbsent";
            }
            if (i == 2) {
                objArr[2] = "computeIfAbsent";
            } else if (i != 3) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            throw (i != 3 ? new IllegalArgumentException(format) : new IllegalStateException(format));
        }

        /* renamed from: a */
        public V mo52416a(K k, pc2<? extends V> pc2) {
            if (pc2 == null) {
                m62760b(2);
            }
            V a = super.mo52416a(k, pc2);
            if (a == null) {
                m62760b(3);
            }
            return a;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7695d(LockBasedStorageManager lockBasedStorageManager, ConcurrentMap<C7700g<K, V>, Object> concurrentMap) {
            super(lockBasedStorageManager, concurrentMap, (C7692a) null);
            if (lockBasedStorageManager == null) {
                m62760b(0);
            }
            if (concurrentMap == null) {
                m62760b(1);
            }
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$e */
    public static class C7696e<K, V> extends C7705l<C7700g<K, V>, V> implements j80<K, V> {

        /* renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$e$a */
        public class C7697a implements rc2<C7700g<K, V>, V> {
            /* renamed from: a */
            public V invoke(C7700g<K, V> gVar) {
                return gVar.f40236b.invoke();
            }
        }

        public /* synthetic */ C7696e(LockBasedStorageManager lockBasedStorageManager, ConcurrentMap concurrentMap, C7692a aVar) {
            this(lockBasedStorageManager, concurrentMap);
        }

        /* renamed from: b */
        public static /* synthetic */ void m62762b(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computation";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNullableValuesBasedOnMemoizedFunction";
            if (i != 2) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "computeIfAbsent";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: a */
        public V mo52416a(K k, pc2<? extends V> pc2) {
            if (pc2 == null) {
                m62762b(2);
            }
            return invoke(new C7700g(k, pc2));
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7696e(LockBasedStorageManager lockBasedStorageManager, ConcurrentMap<C7700g<K, V>, Object> concurrentMap) {
            super(lockBasedStorageManager, concurrentMap, new C7697a());
            if (lockBasedStorageManager == null) {
                m62762b(0);
            }
            if (concurrentMap == null) {
                m62762b(1);
            }
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$f */
    public interface C7698f {

        /* renamed from: a */
        public static final C7698f f40234a = new C7699a();

        /* renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$f$a */
        public static class C7699a implements C7698f {
            /* renamed from: b */
            public static /* synthetic */ void m62766b(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"throwable", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$ExceptionHandlingStrategy$1", "handleException"}));
            }

            /* renamed from: a */
            public RuntimeException mo55245a(Throwable th) {
                if (th == null) {
                    m62766b(0);
                }
                throw nu1.m70088b(th);
            }
        }

        /* renamed from: a */
        RuntimeException mo55245a(Throwable th);
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$g */
    public static class C7700g<K, V> {

        /* renamed from: a */
        public final K f40235a;

        /* renamed from: b */
        public final pc2<? extends V> f40236b;

        public C7700g(K k, pc2<? extends V> pc2) {
            this.f40235a = k;
            this.f40236b = pc2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass() || !this.f40235a.equals(((C7700g) obj).f40235a)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f40235a.hashCode();
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$h */
    public static class C7701h<T> implements gc4<T> {

        /* renamed from: a */
        public final LockBasedStorageManager f40237a;

        /* renamed from: d */
        public final pc2<? extends T> f40238d;

        /* renamed from: e */
        public volatile Object f40239e;

        public C7701h(LockBasedStorageManager lockBasedStorageManager, pc2<? extends T> pc2) {
            if (lockBasedStorageManager == null) {
                m62769a(0);
            }
            if (pc2 == null) {
                m62769a(1);
            }
            this.f40239e = NotValue.NOT_COMPUTED;
            this.f40237a = lockBasedStorageManager;
            this.f40238d = pc2;
        }

        /* renamed from: a */
        public static /* synthetic */ void m62769a(int i) {
            String str = (i == 2 || i == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i == 2 || i == 3) ? 2 : 3)];
            if (i == 1) {
                objArr[0] = "computable";
            } else if (i == 2 || i == 3) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[0] = "storageManager";
            }
            if (i == 2) {
                objArr[1] = "recursionDetected";
            } else if (i != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[1] = "renderDebugInformation";
            }
            if (!(i == 2 || i == 3)) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            throw ((i == 2 || i == 3) ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        /* renamed from: b */
        public void mo55248b(T t) {
        }

        /* renamed from: c */
        public C7707n<T> mo55242c(boolean z) {
            C7707n<T> p = this.f40237a.mo55240p("in a lazy value", null);
            if (p == null) {
                m62769a(2);
            }
            return p;
        }

        public T invoke() {
            T invoke;
            Object obj = this.f40239e;
            if (!(obj instanceof NotValue)) {
                return WrappedValues.m62999f(obj);
            }
            this.f40237a.f40225a.lock();
            try {
                Object obj2 = this.f40239e;
                if (!(obj2 instanceof NotValue)) {
                    invoke = WrappedValues.m62999f(obj2);
                } else {
                    NotValue notValue = NotValue.COMPUTING;
                    if (obj2 == notValue) {
                        this.f40239e = NotValue.RECURSION_WAS_DETECTED;
                        C7707n c = mo55242c(true);
                        if (!c.mo55254c()) {
                            invoke = c.mo55253b();
                        }
                    }
                    if (obj2 == NotValue.RECURSION_WAS_DETECTED) {
                        C7707n c2 = mo55242c(false);
                        if (!c2.mo55254c()) {
                            invoke = c2.mo55253b();
                        }
                    }
                    this.f40239e = notValue;
                    invoke = this.f40238d.invoke();
                    mo55248b(invoke);
                    this.f40239e = invoke;
                }
                this.f40237a.f40225a.unlock();
                return invoke;
            } catch (Throwable th) {
                this.f40237a.f40225a.unlock();
                throw th;
            }
        }

        /* renamed from: r */
        public boolean mo55249r() {
            if (this.f40239e == NotValue.NOT_COMPUTED || this.f40239e == NotValue.COMPUTING) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$i */
    public static abstract class C7702i<T> extends C7701h<T> {

        /* renamed from: g */
        public volatile p36<T> f40240g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7702i(LockBasedStorageManager lockBasedStorageManager, pc2<? extends T> pc2) {
            super(lockBasedStorageManager, pc2);
            if (lockBasedStorageManager == null) {
                m62773a(0);
            }
            if (pc2 == null) {
                m62773a(1);
            }
            this.f40240g = null;
        }

        /* renamed from: a */
        public static /* synthetic */ void m62773a(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computable";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValueWithPostCompute";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: b */
        public final void mo55248b(T t) {
            this.f40240g = new p36<>(t);
            try {
                mo55243d(t);
            } finally {
                this.f40240g = null;
            }
        }

        /* renamed from: d */
        public abstract void mo55243d(T t);

        public T invoke() {
            p36<T> p36 = this.f40240g;
            if (p36 == null || !p36.mo65216b()) {
                return super.invoke();
            }
            return p36.mo65215a();
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$j */
    public static class C7703j<T> extends C7701h<T> implements q84<T> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7703j(LockBasedStorageManager lockBasedStorageManager, pc2<? extends T> pc2) {
            super(lockBasedStorageManager, pc2);
            if (lockBasedStorageManager == null) {
                m62776a(0);
            }
            if (pc2 == null) {
                m62776a(1);
            }
        }

        /* renamed from: a */
        public static /* synthetic */ void m62776a(int i) {
            String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i != 2 ? 3 : 2)];
            if (i == 1) {
                objArr[0] = "computable";
            } else if (i != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            }
            if (i != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            } else {
                objArr[1] = "invoke";
            }
            if (i != 2) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            throw (i != 2 ? new IllegalArgumentException(format) : new IllegalStateException(format));
        }

        public T invoke() {
            T invoke = super.invoke();
            if (invoke == null) {
                m62776a(2);
            }
            return invoke;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$k */
    public static abstract class C7704k<T> extends C7702i<T> implements q84<T> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7704k(LockBasedStorageManager lockBasedStorageManager, pc2<? extends T> pc2) {
            super(lockBasedStorageManager, pc2);
            if (lockBasedStorageManager == null) {
                m62777a(0);
            }
            if (pc2 == null) {
                m62777a(1);
            }
        }

        /* renamed from: a */
        public static /* synthetic */ void m62777a(int i) {
            String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i != 2 ? 3 : 2)];
            if (i == 1) {
                objArr[0] = "computable";
            } else if (i != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            }
            if (i != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            } else {
                objArr[1] = "invoke";
            }
            if (i != 2) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            throw (i != 2 ? new IllegalArgumentException(format) : new IllegalStateException(format));
        }

        public T invoke() {
            T invoke = super.invoke();
            if (invoke == null) {
                m62777a(2);
            }
            return invoke;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$l */
    public static class C7705l<K, V> implements ws3<K, V> {

        /* renamed from: a */
        public final LockBasedStorageManager f40241a;

        /* renamed from: d */
        public final ConcurrentMap<K, Object> f40242d;

        /* renamed from: e */
        public final rc2<? super K, ? extends V> f40243e;

        public C7705l(LockBasedStorageManager lockBasedStorageManager, ConcurrentMap<K, Object> concurrentMap, rc2<? super K, ? extends V> rc2) {
            if (lockBasedStorageManager == null) {
                m62778b(0);
            }
            if (concurrentMap == null) {
                m62778b(1);
            }
            if (rc2 == null) {
                m62778b(2);
            }
            this.f40241a = lockBasedStorageManager;
            this.f40242d = concurrentMap;
            this.f40243e = rc2;
        }

        /* renamed from: b */
        public static /* synthetic */ void m62778b(int i) {
            String str = (i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i == 3 || i == 4) ? 2 : 3)];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i == 2) {
                objArr[0] = "compute";
            } else if (i == 3 || i == 4) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[0] = "storageManager";
            }
            if (i == 3) {
                objArr[1] = "recursionDetected";
            } else if (i != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[1] = "raceCondition";
            }
            if (!(i == 3 || i == 4)) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            throw ((i == 3 || i == 4) ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        /* renamed from: c */
        public final AssertionError mo55250c(K k, Object obj) {
            AssertionError assertionError = (AssertionError) LockBasedStorageManager.m62740q(new AssertionError("Race condition detected on input " + k + ". Old value is " + obj + " under " + this.f40241a));
            if (assertionError == null) {
                m62778b(4);
            }
            return assertionError;
        }

        /* renamed from: d */
        public C7707n<V> mo55251d(K k, boolean z) {
            C7707n<V> p = this.f40241a.mo55240p("", k);
            if (p == null) {
                m62778b(3);
            }
            return p;
        }

        public V invoke(K k) {
            V d;
            Object obj = this.f40242d.get(k);
            if (obj != null && obj != NotValue.COMPUTING) {
                return WrappedValues.m62997d(obj);
            }
            this.f40241a.f40225a.lock();
            try {
                Object obj2 = this.f40242d.get(k);
                NotValue notValue = NotValue.COMPUTING;
                if (obj2 == notValue) {
                    obj2 = NotValue.RECURSION_WAS_DETECTED;
                    C7707n d2 = mo55251d(k, true);
                    if (!d2.mo55254c()) {
                        d = d2.mo55253b();
                        this.f40241a.f40225a.unlock();
                        return d;
                    }
                }
                if (obj2 == NotValue.RECURSION_WAS_DETECTED) {
                    C7707n d3 = mo55251d(k, false);
                    if (!d3.mo55254c()) {
                        d = d3.mo55253b();
                        this.f40241a.f40225a.unlock();
                        return d;
                    }
                }
                if (obj2 != null) {
                    d = WrappedValues.m62997d(obj2);
                    this.f40241a.f40225a.unlock();
                    return d;
                }
                this.f40242d.put(k, notValue);
                V invoke = this.f40243e.invoke(k);
                Object put = this.f40242d.put(k, WrappedValues.m62995b(invoke));
                if (put == notValue) {
                    this.f40241a.f40225a.unlock();
                    return invoke;
                }
                throw mo55250c(k, put);
            } catch (Throwable th) {
                this.f40241a.f40225a.unlock();
                throw th;
            }
        }

        /* renamed from: u */
        public boolean mo55252u(K k) {
            Object obj = this.f40242d.get(k);
            if (obj == null || obj == NotValue.COMPUTING) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$m */
    public static class C7706m<K, V> extends C7705l<K, V> implements vs3<K, V> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7706m(LockBasedStorageManager lockBasedStorageManager, ConcurrentMap<K, Object> concurrentMap, rc2<? super K, ? extends V> rc2) {
            super(lockBasedStorageManager, concurrentMap, rc2);
            if (lockBasedStorageManager == null) {
                m62782b(0);
            }
            if (concurrentMap == null) {
                m62782b(1);
            }
            if (rc2 == null) {
                m62782b(2);
            }
        }

        /* renamed from: b */
        public static /* synthetic */ void m62782b(int i) {
            String str = i != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i != 3 ? 3 : 2)];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i == 2) {
                objArr[0] = "compute";
            } else if (i != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            }
            if (i != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            } else {
                objArr[1] = "invoke";
            }
            if (i != 3) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            throw (i != 3 ? new IllegalArgumentException(format) : new IllegalStateException(format));
        }

        public V invoke(K k) {
            V invoke = super.invoke(k);
            if (invoke == null) {
                m62782b(3);
            }
            return invoke;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$n */
    public static class C7707n<T> {

        /* renamed from: a */
        public final T f40244a;

        /* renamed from: b */
        public final boolean f40245b;

        public C7707n(T t, boolean z) {
            this.f40244a = t;
            this.f40245b = z;
        }

        /* renamed from: a */
        public static <T> C7707n<T> m62783a() {
            return new C7707n<>((Object) null, true);
        }

        /* renamed from: d */
        public static <T> C7707n<T> m62784d(T t) {
            return new C7707n<>(t, false);
        }

        /* renamed from: b */
        public T mo55253b() {
            return this.f40244a;
        }

        /* renamed from: c */
        public boolean mo55254c() {
            return this.f40245b;
        }

        public String toString() {
            if (mo55254c()) {
                return "FALL_THROUGH";
            }
            return String.valueOf(this.f40244a);
        }
    }

    public /* synthetic */ LockBasedStorageManager(String str, C7698f fVar, C7708a aVar, C7692a aVar2) {
        this(str, fVar, aVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00be  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void m62736j(int r13) {
        /*
            r0 = 37
            r1 = 20
            r2 = 13
            r3 = 10
            if (r13 == r3) goto L_0x0013
            if (r13 == r2) goto L_0x0013
            if (r13 == r1) goto L_0x0013
            if (r13 == r0) goto L_0x0013
            java.lang.String r4 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L_0x0015
        L_0x0013:
            java.lang.String r4 = "@NotNull method %s.%s must not return null"
        L_0x0015:
            r5 = 3
            r6 = 2
            if (r13 == r3) goto L_0x0021
            if (r13 == r2) goto L_0x0021
            if (r13 == r1) goto L_0x0021
            if (r13 == r0) goto L_0x0021
            r7 = r5
            goto L_0x0022
        L_0x0021:
            r7 = r6
        L_0x0022:
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.String r8 = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager"
            java.lang.String r9 = "compute"
            r10 = 1
            r11 = 0
            if (r13 == r10) goto L_0x0065
            if (r13 == r5) goto L_0x0065
            r5 = 5
            if (r13 == r5) goto L_0x0065
            r5 = 6
            if (r13 == r5) goto L_0x0060
            switch(r13) {
                case 8: goto L_0x0065;
                case 9: goto L_0x005d;
                case 10: goto L_0x005a;
                case 11: goto L_0x005d;
                case 12: goto L_0x0055;
                case 13: goto L_0x005a;
                case 14: goto L_0x005d;
                case 15: goto L_0x0050;
                case 16: goto L_0x005d;
                case 17: goto L_0x0055;
                case 18: goto L_0x0050;
                case 19: goto L_0x005d;
                case 20: goto L_0x005a;
                case 21: goto L_0x005d;
                case 22: goto L_0x0050;
                case 23: goto L_0x004b;
                case 24: goto L_0x004b;
                case 25: goto L_0x0055;
                case 26: goto L_0x004b;
                case 27: goto L_0x0055;
                case 28: goto L_0x004b;
                case 29: goto L_0x0046;
                case 30: goto L_0x004b;
                case 31: goto L_0x004b;
                case 32: goto L_0x004b;
                case 33: goto L_0x0046;
                case 34: goto L_0x004b;
                case 35: goto L_0x0041;
                case 36: goto L_0x003c;
                case 37: goto L_0x005a;
                default: goto L_0x0037;
            }
        L_0x0037:
            java.lang.String r5 = "debugText"
            r7[r11] = r5
            goto L_0x0069
        L_0x003c:
            java.lang.String r5 = "throwable"
            r7[r11] = r5
            goto L_0x0069
        L_0x0041:
            java.lang.String r5 = "source"
            r7[r11] = r5
            goto L_0x0069
        L_0x0046:
            java.lang.String r5 = "postCompute"
            r7[r11] = r5
            goto L_0x0069
        L_0x004b:
            java.lang.String r5 = "computable"
            r7[r11] = r5
            goto L_0x0069
        L_0x0050:
            java.lang.String r5 = "map"
            r7[r11] = r5
            goto L_0x0069
        L_0x0055:
            java.lang.String r5 = "onRecursiveCall"
            r7[r11] = r5
            goto L_0x0069
        L_0x005a:
            r7[r11] = r8
            goto L_0x0069
        L_0x005d:
            r7[r11] = r9
            goto L_0x0069
        L_0x0060:
            java.lang.String r5 = "lock"
            r7[r11] = r5
            goto L_0x0069
        L_0x0065:
            java.lang.String r5 = "exceptionHandlingStrategy"
            r7[r11] = r5
        L_0x0069:
            java.lang.String r5 = "sanitizeStackTrace"
            java.lang.String r11 = "createMemoizedFunctionWithNullableValues"
            java.lang.String r12 = "createMemoizedFunction"
            if (r13 == r3) goto L_0x0080
            if (r13 == r2) goto L_0x0080
            if (r13 == r1) goto L_0x007d
            if (r13 == r0) goto L_0x007a
            r7[r10] = r8
            goto L_0x0082
        L_0x007a:
            r7[r10] = r5
            goto L_0x0082
        L_0x007d:
            r7[r10] = r11
            goto L_0x0082
        L_0x0080:
            r7[r10] = r12
        L_0x0082:
            switch(r13) {
                case 4: goto L_0x00be;
                case 5: goto L_0x00be;
                case 6: goto L_0x00be;
                case 7: goto L_0x00b9;
                case 8: goto L_0x00b9;
                case 9: goto L_0x00b6;
                case 10: goto L_0x00c2;
                case 11: goto L_0x00b6;
                case 12: goto L_0x00b6;
                case 13: goto L_0x00c2;
                case 14: goto L_0x00b6;
                case 15: goto L_0x00b6;
                case 16: goto L_0x00b6;
                case 17: goto L_0x00b6;
                case 18: goto L_0x00b6;
                case 19: goto L_0x00b3;
                case 20: goto L_0x00c2;
                case 21: goto L_0x00b3;
                case 22: goto L_0x00b3;
                case 23: goto L_0x00ae;
                case 24: goto L_0x00ae;
                case 25: goto L_0x00ae;
                case 26: goto L_0x00a9;
                case 27: goto L_0x00a9;
                case 28: goto L_0x00a4;
                case 29: goto L_0x00a4;
                case 30: goto L_0x009f;
                case 31: goto L_0x009a;
                case 32: goto L_0x0095;
                case 33: goto L_0x0095;
                case 34: goto L_0x0092;
                case 35: goto L_0x008d;
                case 36: goto L_0x008a;
                case 37: goto L_0x00c2;
                default: goto L_0x0085;
            }
        L_0x0085:
            java.lang.String r5 = "createWithExceptionHandling"
            r7[r6] = r5
            goto L_0x00c2
        L_0x008a:
            r7[r6] = r5
            goto L_0x00c2
        L_0x008d:
            java.lang.String r5 = "recursionDetectedDefault"
            r7[r6] = r5
            goto L_0x00c2
        L_0x0092:
            r7[r6] = r9
            goto L_0x00c2
        L_0x0095:
            java.lang.String r5 = "createNullableLazyValueWithPostCompute"
            r7[r6] = r5
            goto L_0x00c2
        L_0x009a:
            java.lang.String r5 = "createRecursionTolerantNullableLazyValue"
            r7[r6] = r5
            goto L_0x00c2
        L_0x009f:
            java.lang.String r5 = "createNullableLazyValue"
            r7[r6] = r5
            goto L_0x00c2
        L_0x00a4:
            java.lang.String r5 = "createLazyValueWithPostCompute"
            r7[r6] = r5
            goto L_0x00c2
        L_0x00a9:
            java.lang.String r5 = "createRecursionTolerantLazyValue"
            r7[r6] = r5
            goto L_0x00c2
        L_0x00ae:
            java.lang.String r5 = "createLazyValue"
            r7[r6] = r5
            goto L_0x00c2
        L_0x00b3:
            r7[r6] = r11
            goto L_0x00c2
        L_0x00b6:
            r7[r6] = r12
            goto L_0x00c2
        L_0x00b9:
            java.lang.String r5 = "replaceExceptionHandling"
            r7[r6] = r5
            goto L_0x00c2
        L_0x00be:
            java.lang.String r5 = "<init>"
            r7[r6] = r5
        L_0x00c2:
            java.lang.String r4 = java.lang.String.format(r4, r7)
            if (r13 == r3) goto L_0x00d4
            if (r13 == r2) goto L_0x00d4
            if (r13 == r1) goto L_0x00d4
            if (r13 == r0) goto L_0x00d4
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>(r4)
            goto L_0x00d9
        L_0x00d4:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            r13.<init>(r4)
        L_0x00d9:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.m62736j(int):void");
    }

    /* renamed from: m */
    public static <K> ConcurrentMap<K, Object> m62739m() {
        return new ConcurrentHashMap(3, 1.0f, 2);
    }

    /* renamed from: q */
    public static <T extends Throwable> T m62740q(T t) {
        if (t == null) {
            m62736j(36);
        }
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            } else if (!stackTrace[i2].getClassName().startsWith(f40223d)) {
                i = i2;
                break;
            } else {
                i2++;
            }
        }
        List subList = Arrays.asList(stackTrace).subList(i, length);
        t.setStackTrace((StackTraceElement[]) subList.toArray(new StackTraceElement[subList.size()]));
        return t;
    }

    /* renamed from: a */
    public <T> q84<T> mo51156a(pc2<? extends T> pc2, rc2<? super Boolean, ? extends T> rc2, rc2<? super T, r37> rc22) {
        if (pc2 == null) {
            m62736j(28);
        }
        if (rc22 == null) {
            m62736j(29);
        }
        return new C7694c(this, pc2, rc2, rc22);
    }

    /* renamed from: b */
    public <K, V> i80<K, V> mo51157b() {
        return new C7695d(this, m62739m(), (C7692a) null);
    }

    /* renamed from: c */
    public <K, V> j80<K, V> mo51158c() {
        return new C7696e(this, m62739m(), (C7692a) null);
    }

    /* renamed from: d */
    public <K, V> ws3<K, V> mo51159d(rc2<? super K, ? extends V> rc2) {
        if (rc2 == null) {
            m62736j(19);
        }
        ws3<K, V> o = mo55239o(rc2, m62739m());
        if (o == null) {
            m62736j(20);
        }
        return o;
    }

    /* renamed from: e */
    public <T> T mo51160e(pc2<? extends T> pc2) {
        if (pc2 == null) {
            m62736j(34);
        }
        this.f40225a.lock();
        try {
            T invoke = pc2.invoke();
            this.f40225a.unlock();
            return invoke;
        } catch (Throwable th) {
            this.f40225a.unlock();
            throw th;
        }
    }

    /* renamed from: f */
    public <T> q84<T> mo51161f(pc2<? extends T> pc2, T t) {
        if (pc2 == null) {
            m62736j(26);
        }
        if (t == null) {
            m62736j(27);
        }
        return new C7693b(this, pc2, t);
    }

    /* renamed from: g */
    public <T> gc4<T> mo51162g(pc2<? extends T> pc2) {
        if (pc2 == null) {
            m62736j(30);
        }
        return new C7701h(this, pc2);
    }

    /* renamed from: h */
    public <K, V> vs3<K, V> mo51163h(rc2<? super K, ? extends V> rc2) {
        if (rc2 == null) {
            m62736j(9);
        }
        vs3<K, V> n = mo55238n(rc2, m62739m());
        if (n == null) {
            m62736j(10);
        }
        return n;
    }

    /* renamed from: i */
    public <T> q84<T> mo51164i(pc2<? extends T> pc2) {
        if (pc2 == null) {
            m62736j(23);
        }
        return new C7703j(this, pc2);
    }

    /* renamed from: n */
    public <K, V> vs3<K, V> mo55238n(rc2<? super K, ? extends V> rc2, ConcurrentMap<K, Object> concurrentMap) {
        if (rc2 == null) {
            m62736j(14);
        }
        if (concurrentMap == null) {
            m62736j(15);
        }
        return new C7706m(this, concurrentMap, rc2);
    }

    /* renamed from: o */
    public <K, V> ws3<K, V> mo55239o(rc2<? super K, ? extends V> rc2, ConcurrentMap<K, Object> concurrentMap) {
        if (rc2 == null) {
            m62736j(21);
        }
        if (concurrentMap == null) {
            m62736j(22);
        }
        return new C7705l(this, concurrentMap, rc2);
    }

    /* renamed from: p */
    public <K, V> C7707n<V> mo55240p(String str, K k) {
        String str2;
        if (str == null) {
            m62736j(35);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Recursion detected ");
        sb.append(str);
        if (k == null) {
            str2 = "";
        } else {
            str2 = "on input: " + k;
        }
        sb.append(str2);
        sb.append(" under ");
        sb.append(this);
        throw ((AssertionError) m62740q(new AssertionError(sb.toString())));
    }

    public String toString() {
        return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + " (" + this.f40227c + ")";
    }

    public LockBasedStorageManager(String str, C7698f fVar, C7708a aVar) {
        if (str == null) {
            m62736j(4);
        }
        if (fVar == null) {
            m62736j(5);
        }
        if (aVar == null) {
            m62736j(6);
        }
        this.f40225a = aVar;
        this.f40226b = fVar;
        this.f40227c = str;
    }

    public LockBasedStorageManager(String str) {
        this(str, (Runnable) null, (rc2<InterruptedException, r37>) null);
    }

    public LockBasedStorageManager(String str, Runnable runnable, rc2<InterruptedException, r37> rc2) {
        this(str, C7698f.f40234a, (C7708a) C7708a.f40246a.mo55256a(runnable, rc2));
    }
}
