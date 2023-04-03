package p000;

import com.google.android.gms.internal.measurement.C4085b;
import com.google.android.gms.internal.measurement.C4087d;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p000.s49;
import p000.w39;

/* renamed from: s49 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
public abstract class s49<MessageType extends s49<MessageType, BuilderType>, BuilderType extends w39<MessageType, BuilderType>> extends C4085b<MessageType, BuilderType> {
    private static final Map<Object, s49<?, ?>> zza = new ConcurrentHashMap();
    public ca9 zzc = ca9.m32878a();
    public int zzd = -1;

    /* renamed from: k */
    public static Object m51524k(Method method, Object obj, Object... objArr) {
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

    /* renamed from: l */
    public static g59 m51525l() {
        return u49.m52619j();
    }

    /* renamed from: m */
    public static j59 m51526m() {
        return m69.m48099j();
    }

    /* renamed from: n */
    public static j59 m51527n(j59 j59) {
        int i;
        int size = j59.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size + size;
        }
        return j59.mo44056C(i);
    }

    /* renamed from: o */
    public static <E> m59<E> m51528o() {
        return j89.m46175j();
    }

    /* renamed from: p */
    public static <E> m59<E> m51529p(m59<E> m59) {
        int i;
        int size = m59.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size + size;
        }
        return m59.mo43048I(i);
    }

    /* renamed from: t */
    public static <T extends s49> T m51530t(Class<T> cls) {
        Map<Object, s49<?, ?>> map = zza;
        T t = (s49) map.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (s49) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t == null) {
            t = (s49) ((s49) ta9.m52168h(cls)).mo29044w(6, (Object) null, (Object) null);
            if (t != null) {
                map.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    /* renamed from: u */
    public static <T extends s49> void m51531u(Class<T> cls, T t) {
        zza.put(cls, t);
    }

    /* renamed from: v */
    public static Object m51532v(r79 r79, String str, Object[] objArr) {
        return new l89(r79, str, objArr);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ p79 mo47344a() {
        return (w39) mo29044w(5, (Object) null, (Object) null);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ p79 mo47345b() {
        w39 w39 = (w39) mo29044w(5, (Object) null, (Object) null);
        w39.mo48886p(this);
        return w39;
    }

    /* renamed from: e */
    public final int mo30881e() {
        return this.zzd;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return h89.m45067a().mo43106b(getClass()).mo46036c(this, (s49) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ r79 mo47631f() {
        return (s49) mo29044w(6, (Object) null, (Object) null);
    }

    /* renamed from: g */
    public final int mo47346g() {
        int i = this.zzd;
        if (i != -1) {
            return i;
        }
        int d = h89.m45067a().mo43106b(getClass()).mo46037d(this);
        this.zzd = d;
        return d;
    }

    /* renamed from: h */
    public final void mo47347h(C4087d dVar) throws IOException {
        h89.m45067a().mo43106b(getClass()).mo46035b(this, j29.m46108l(dVar));
    }

    public final int hashCode() {
        int i = this.zzb;
        if (i != 0) {
            return i;
        }
        int a = h89.m45067a().mo43106b(getClass()).mo46034a(this);
        this.zzb = a;
        return a;
    }

    /* renamed from: i */
    public final void mo30882i(int i) {
        this.zzd = i;
    }

    /* renamed from: r */
    public final <MessageType extends s49<MessageType, BuilderType>, BuilderType extends w39<MessageType, BuilderType>> BuilderType mo47633r() {
        return (w39) mo29044w(5, (Object) null, (Object) null);
    }

    /* renamed from: s */
    public final BuilderType mo47634s() {
        BuilderType buildertype = (w39) mo29044w(5, (Object) null, (Object) null);
        buildertype.mo48886p(this);
        return buildertype;
    }

    public final String toString() {
        return v79.m53295a(this, super.toString());
    }

    /* renamed from: w */
    public abstract Object mo29044w(int i, Object obj, Object obj2);
}
