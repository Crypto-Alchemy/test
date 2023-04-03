package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.C4056e;
import com.google.android.gms.internal.clearcut.C4056e.C4057a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.clearcut.e */
public abstract class C4056e<MessageType extends C4056e<MessageType, BuilderType>, BuilderType extends C4057a<MessageType, BuilderType>> extends C4052a<MessageType, BuilderType> {
    private static Map<Object, C4056e<?, ?>> zzjr = new ConcurrentHashMap();
    public jo8 zzjp = jo8.m46688h();
    private int zzjq = -1;

    /* renamed from: com.google.android.gms.internal.clearcut.e$a */
    public static abstract class C4057a<MessageType extends C4056e<MessageType, BuilderType>, BuilderType extends C4057a<MessageType, BuilderType>> extends e98<MessageType, BuilderType> {

        /* renamed from: a */
        public final MessageType f22448a;

        /* renamed from: d */
        public MessageType f22449d;

        /* renamed from: e */
        public boolean f22450e = false;

        public C4057a(MessageType messagetype) {
            this.f22448a = messagetype;
            this.f22449d = (C4056e) messagetype.mo30767e(C4061e.f22457d, (Object) null, (Object) null);
        }

        /* renamed from: f */
        public static void m33868f(MessageType messagetype, MessageType messagetype2) {
            sl8.m51829a().mo47814d(messagetype).mo41961g(messagetype, messagetype2);
        }

        /* renamed from: a */
        public final /* synthetic */ tj8 mo30766a() {
            return this.f22448a;
        }

        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            C4057a aVar = (C4057a) this.f22448a.mo30767e(C4061e.f22458e, (Object) null, (Object) null);
            aVar.mo30776b((C4056e) mo30783s());
            return aVar;
        }

        /* renamed from: d */
        public final BuilderType mo30776b(MessageType messagetype) {
            mo30779g();
            m33868f(this.f22449d, messagetype);
            return this;
        }

        /* renamed from: g */
        public void mo30779g() {
            if (this.f22450e) {
                MessageType messagetype = (C4056e) this.f22449d.mo30767e(C4061e.f22457d, (Object) null, (Object) null);
                m33868f(messagetype, this.f22449d);
                this.f22449d = messagetype;
                this.f22450e = false;
            }
        }

        /* renamed from: h */
        public MessageType mo30783s() {
            if (this.f22450e) {
                return this.f22449d;
            }
            MessageType messagetype = this.f22449d;
            sl8.m51829a().mo47814d(messagetype).mo41955a(messagetype);
            this.f22450e = true;
            return this.f22449d;
        }

        /* renamed from: k */
        public final /* synthetic */ tj8 mo30781k() {
            C4056e eVar = (C4056e) mo30783s();
            byte byteValue = ((Byte) eVar.mo30767e(C4061e.f22454a, (Object) null, (Object) null)).byteValue();
            boolean z = true;
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z = false;
                } else {
                    z = sl8.m51829a().mo47814d(eVar).mo41960f(eVar);
                    eVar.mo30767e(C4061e.f22455b, z ? eVar : null, (Object) null);
                }
            }
            if (z) {
                return eVar;
            }
            throw new zzew(eVar);
        }

        /* renamed from: p */
        public final MessageType mo30782p() {
            MessageType messagetype = (C4056e) mo30783s();
            byte byteValue = ((Byte) messagetype.mo30767e(C4061e.f22454a, (Object) null, (Object) null)).byteValue();
            boolean z = true;
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z = false;
                } else {
                    z = sl8.m51829a().mo47814d(messagetype).mo41960f(messagetype);
                    messagetype.mo30767e(C4061e.f22455b, z ? messagetype : null, (Object) null);
                }
            }
            if (z) {
                return messagetype;
            }
            throw new zzew(messagetype);
        }
    }

    /* renamed from: com.google.android.gms.internal.clearcut.e$b */
    public static class C4058b<T extends C4056e<T, ?>> extends h98<T> {

        /* renamed from: b */
        public T f22451b;

        public C4058b(T t) {
            this.f22451b = t;
        }
    }

    /* renamed from: com.google.android.gms.internal.clearcut.e$c */
    public static abstract class C4059c<MessageType extends C4059c<MessageType, BuilderType>, BuilderType> extends C4056e<MessageType, BuilderType> implements yj8 {
        public td8<C4060d> zzjv = td8.m52243k();
    }

    /* renamed from: com.google.android.gms.internal.clearcut.e$d */
    public static final class C4060d implements af8<C4060d> {

        /* renamed from: a */
        public final int f22452a;

        /* renamed from: d */
        public final zzfl f22453d;

        /* renamed from: A */
        public final zzfl mo28957A() {
            return this.f22453d;
        }

        /* renamed from: W */
        public final wj8 mo28958W(wj8 wj8, tj8 tj8) {
            return ((C4057a) wj8).mo30776b((C4056e) tj8);
        }

        /* renamed from: b0 */
        public final boolean mo28959b0() {
            return false;
        }

        public final /* synthetic */ int compareTo(Object obj) {
            return this.f22452a - ((C4060d) obj).f22452a;
        }

        /* renamed from: q */
        public final boolean mo28960q() {
            return false;
        }

        /* renamed from: q1 */
        public final kk8 mo28961q1(kk8 kk8, kk8 kk82) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: s */
        public final zzfq mo28962s() {
            return this.f22453d.zzek();
        }

        public final int zzc() {
            return this.f22452a;
        }
    }

    /* 'enum' modifier removed */
    /* renamed from: com.google.android.gms.internal.clearcut.e$e */
    public static final class C4061e {

        /* renamed from: a */
        public static final int f22454a = 1;

        /* renamed from: b */
        public static final int f22455b = 2;

        /* renamed from: c */
        public static final int f22456c = 3;

        /* renamed from: d */
        public static final int f22457d = 4;

        /* renamed from: e */
        public static final int f22458e = 5;

        /* renamed from: f */
        public static final int f22459f = 6;

        /* renamed from: g */
        public static final int f22460g = 7;

        /* renamed from: h */
        public static final /* synthetic */ int[] f22461h = {1, 2, 3, 4, 5, 6, 7};

        /* renamed from: i */
        public static final int f22462i = 1;

        /* renamed from: j */
        public static final int f22463j = 2;

        /* renamed from: k */
        public static final /* synthetic */ int[] f22464k = {1, 2};

        /* renamed from: l */
        public static final int f22465l = 1;

        /* renamed from: m */
        public static final int f22466m = 2;

        /* renamed from: n */
        public static final /* synthetic */ int[] f22467n = {1, 2};

        /* renamed from: a */
        public static int[] m33883a() {
            return (int[]) f22461h.clone();
        }
    }

    /* renamed from: d */
    public static <T extends C4056e<T, ?>> T m33853d(T t, byte[] bArr) throws zzco {
        T t2 = (C4056e) t.mo30767e(C4061e.f22457d, (Object) null, (Object) null);
        try {
            sl8.m51829a().mo47814d(t2).mo41959e(t2, bArr, 0, bArr.length, new t98());
            sl8.m51829a().mo47814d(t2).mo41955a(t2);
            if (t2.zzex == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (IOException e) {
            if (e.getCause() instanceof zzco) {
                throw ((zzco) e.getCause());
            }
            throw new zzco(e.getMessage()).zzg(t2);
        } catch (IndexOutOfBoundsException unused) {
            throw zzco.zzbl().zzg(t2);
        }
    }

    /* renamed from: f */
    static Object m33854f(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    /* renamed from: g */
    public static Object m33855g(tj8 tj8, String str, Object[] objArr) {
        return new yl8(tj8, str, objArr);
    }

    /* renamed from: h */
    public static <T extends C4056e<?, ?>> void m33856h(Class<T> cls, T t) {
        zzjr.put(cls, t);
    }

    /* renamed from: n */
    public static <T extends C4056e<T, ?>> T m33857n(T t, byte[] bArr) throws zzco {
        T d = m33853d(t, bArr);
        if (d != null) {
            byte byteValue = ((Byte) d.mo30767e(C4061e.f22454a, (Object) null, (Object) null)).byteValue();
            boolean z = true;
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z = false;
                } else {
                    z = sl8.m51829a().mo47814d(d).mo41960f(d);
                    d.mo30767e(C4061e.f22455b, z ? d : null, (Object) null);
                }
            }
            if (!z) {
                throw new zzco(new zzew(d).getMessage()).zzg(d);
            }
        }
        return d;
    }

    /* renamed from: p */
    public static <E> hg8<E> m33858p() {
        return vl8.m53425j();
    }

    /* renamed from: q */
    public static <T extends C4056e<?, ?>> T m33859q(Class<T> cls) {
        T t = (C4056e) zzjr.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (C4056e) zzjr.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t != null) {
            return t;
        }
        String name = cls.getName();
        throw new IllegalStateException(name.length() != 0 ? "Unable to get default instance for: ".concat(name) : new String("Unable to get default instance for: "));
    }

    /* renamed from: a */
    public final /* synthetic */ tj8 mo30766a() {
        return (C4056e) mo30767e(C4061e.f22459f, (Object) null, (Object) null);
    }

    /* renamed from: b */
    public final void mo30754b(int i) {
        this.zzjq = i;
    }

    /* renamed from: c */
    public final int mo30755c() {
        return this.zzjq;
    }

    /* renamed from: e */
    public abstract Object mo30767e(int i, Object obj, Object obj2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((C4056e) mo30767e(C4061e.f22459f, (Object) null, (Object) null)).getClass().isInstance(obj)) {
            return false;
        }
        return sl8.m51829a().mo47814d(this).mo41958d(this, (C4056e) obj);
    }

    public int hashCode() {
        int i = this.zzex;
        if (i != 0) {
            return i;
        }
        int c = sl8.m51829a().mo47814d(this).mo41957c(this);
        this.zzex = c;
        return c;
    }

    public final boolean isInitialized() {
        byte byteValue = ((Byte) mo30767e(C4061e.f22454a, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean f = sl8.m51829a().mo47814d(this).mo41960f(this);
        mo30767e(C4061e.f22455b, f ? this : null, (Object) null);
        return f;
    }

    /* renamed from: j */
    public final /* synthetic */ wj8 mo30771j() {
        C4057a aVar = (C4057a) mo30767e(C4061e.f22458e, (Object) null, (Object) null);
        aVar.mo30776b(this);
        return aVar;
    }

    /* renamed from: l */
    public final void mo30772l(zzbn zzbn) throws IOException {
        sl8.m51829a().mo47813b(getClass()).mo41963i(this, uc8.m52744d(zzbn));
    }

    /* renamed from: m */
    public final /* synthetic */ wj8 mo30773m() {
        return (C4057a) mo30767e(C4061e.f22458e, (Object) null, (Object) null);
    }

    /* renamed from: o */
    public final int mo30774o() {
        if (this.zzjq == -1) {
            this.zzjq = sl8.m51829a().mo47814d(this).mo41962h(this);
        }
        return this.zzjq;
    }

    public String toString() {
        return C4062f.m33884a(this, super.toString());
    }
}
