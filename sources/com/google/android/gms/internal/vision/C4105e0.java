package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.C4105e0;
import com.google.android.gms.internal.vision.C4105e0.C4107b;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.vision.e0 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public abstract class C4105e0<MessageType extends C4105e0<MessageType, BuilderType>, BuilderType extends C4107b<MessageType, BuilderType>> extends C4143y<MessageType, BuilderType> {
    private static Map<Object, C4105e0<?, ?>> zzd = new ConcurrentHashMap();
    public t89 zzb = t89.m52128a();
    private int zzc = -1;

    /* renamed from: com.google.android.gms.internal.vision.e0$a */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
    public static class C4106a<T extends C4105e0<T, ?>> extends bw8<T> {

        /* renamed from: b */
        public final T f22861b;

        public C4106a(T t) {
            this.f22861b = t;
        }
    }

    /* renamed from: com.google.android.gms.internal.vision.e0$b */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
    public static abstract class C4107b<MessageType extends C4105e0<MessageType, BuilderType>, BuilderType extends C4107b<MessageType, BuilderType>> extends xv8<MessageType, BuilderType> {

        /* renamed from: a */
        public final MessageType f22862a;

        /* renamed from: d */
        public MessageType f22863d;

        /* renamed from: e */
        public boolean f22864e = false;

        public C4107b(MessageType messagetype) {
            this.f22862a = messagetype;
            this.f22863d = (C4105e0) messagetype.mo31153o(C4111f.f22873d, (Object) null, (Object) null);
        }

        /* renamed from: o */
        public static void m34237o(MessageType messagetype, MessageType messagetype2) {
            n69.m48643a().mo46003c(messagetype).mo31207c(messagetype, messagetype2);
        }

        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            C4107b bVar = (C4107b) this.f22862a.mo31153o(C4111f.f22874e, (Object) null, (Object) null);
            bVar.mo31181b((C4105e0) mo31182c());
            return bVar;
        }

        /* renamed from: f */
        public final /* synthetic */ xv8 mo31185f(byte[] bArr, int i, int i2, C4095b0 b0Var) throws zzjk {
            return mo31187p(bArr, 0, i2, b0Var);
        }

        /* renamed from: g */
        public final BuilderType mo31181b(MessageType messagetype) {
            if (this.f22864e) {
                mo31188r();
                this.f22864e = false;
            }
            m34237o(this.f22863d, messagetype);
            return this;
        }

        /* renamed from: i */
        public final /* synthetic */ k59 mo31174i() {
            return this.f22862a;
        }

        /* renamed from: p */
        public final BuilderType mo31187p(byte[] bArr, int i, int i2, C4095b0 b0Var) throws zzjk {
            if (this.f22864e) {
                mo31188r();
                this.f22864e = false;
            }
            try {
                n69.m48643a().mo46003c(this.f22863d).mo31208d(this.f22863d, bArr, 0, i2, new uw8(b0Var));
                return this;
            } catch (zzjk e) {
                throw e;
            } catch (IndexOutOfBoundsException unused) {
                throw zzjk.zza();
            } catch (IOException e2) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
            }
        }

        /* renamed from: r */
        public void mo31188r() {
            MessageType messagetype = (C4105e0) this.f22863d.mo31153o(C4111f.f22873d, (Object) null, (Object) null);
            m34237o(messagetype, this.f22863d);
            this.f22863d = messagetype;
        }

        /* renamed from: t */
        public MessageType mo31182c() {
            if (this.f22864e) {
                return this.f22863d;
            }
            MessageType messagetype = this.f22863d;
            n69.m48643a().mo46003c(messagetype).mo31205a(messagetype);
            this.f22864e = true;
            return this.f22863d;
        }

        /* renamed from: u */
        public final MessageType mo31184e() {
            MessageType messagetype = (C4105e0) mo31182c();
            if (messagetype.mo31169a()) {
                return messagetype;
            }
            throw new zzlv(messagetype);
        }
    }

    /* renamed from: com.google.android.gms.internal.vision.e0$c */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
    public static abstract class C4108c<MessageType extends C4108c<MessageType, BuilderType>, BuilderType> extends C4105e0<MessageType, BuilderType> implements r59 {
        public i09<C4110e> zzc = i09.m45429e();

        /* renamed from: x */
        public final i09<C4110e> mo31191x() {
            if (this.zzc.mo43444n()) {
                this.zzc = (i09) this.zzc.clone();
            }
            return this.zzc;
        }
    }

    /* renamed from: com.google.android.gms.internal.vision.e0$d */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
    public static class C4109d<ContainingType extends k59, Type> extends oz8<ContainingType, Type> {

        /* renamed from: a */
        public final k59 f22865a;

        /* renamed from: b */
        public final C4110e f22866b;
    }

    /* renamed from: com.google.android.gms.internal.vision.e0$e */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
    public static final class C4110e implements n09<C4110e> {

        /* renamed from: a */
        public final int f22867a;

        /* renamed from: d */
        public final zzml f22868d;

        /* renamed from: e */
        public final boolean f22869e;

        /* renamed from: E0 */
        public final t59 mo31192E0(t59 t59, k59 k59) {
            return ((C4107b) t59).mo31181b((C4105e0) k59);
        }

        /* renamed from: Y0 */
        public final c69 mo31193Y0(c69 c69, c69 c692) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: b */
        public final boolean mo31194b() {
            return this.f22869e;
        }

        /* renamed from: c */
        public final boolean mo31195c() {
            return false;
        }

        public final /* synthetic */ int compareTo(Object obj) {
            return this.f22867a - ((C4110e) obj).f22867a;
        }

        public final int zza() {
            return this.f22867a;
        }

        public final zzml zzb() {
            return this.f22868d;
        }

        public final zzmo zzc() {
            return this.f22868d.zza();
        }
    }

    /* 'enum' modifier removed */
    /* renamed from: com.google.android.gms.internal.vision.e0$f */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
    public static final class C4111f {

        /* renamed from: a */
        public static final int f22870a = 1;

        /* renamed from: b */
        public static final int f22871b = 2;

        /* renamed from: c */
        public static final int f22872c = 3;

        /* renamed from: d */
        public static final int f22873d = 4;

        /* renamed from: e */
        public static final int f22874e = 5;

        /* renamed from: f */
        public static final int f22875f = 6;

        /* renamed from: g */
        public static final int f22876g = 7;

        /* renamed from: h */
        public static final /* synthetic */ int[] f22877h = {1, 2, 3, 4, 5, 6, 7};

        /* renamed from: a */
        public static int[] m34253a() {
            return (int[]) f22877h.clone();
        }
    }

    /* renamed from: n */
    public static <T extends C4105e0<?, ?>> T m34219n(Class<T> cls) {
        T t = (C4105e0) zzd.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (C4105e0) zzd.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t == null) {
            t = (C4105e0) ((C4105e0) l99.m47685c(cls)).mo31153o(C4111f.f22875f, (Object) null, (Object) null);
            if (t != null) {
                zzd.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    /* renamed from: p */
    static Object m34220p(Method method, Object obj, Object... objArr) {
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

    /* renamed from: q */
    public static Object m34221q(k59 k59, String str, Object[] objArr) {
        return new c79(k59, str, objArr);
    }

    /* renamed from: r */
    public static <E> h29<E> m34222r(h29<E> h29) {
        int i;
        int size = h29.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size << 1;
        }
        return h29.mo28813d(i);
    }

    /* renamed from: s */
    public static <T extends C4105e0<?, ?>> void m34223s(Class<T> cls, T t) {
        zzd.put(cls, t);
    }

    /* renamed from: t */
    public static final <T extends C4105e0<T, ?>> boolean m34224t(T t, boolean z) {
        T t2;
        byte byteValue = ((Byte) t.mo31153o(C4111f.f22870a, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean e = n69.m48643a().mo46003c(t).mo31209e(t);
        if (z) {
            int i = C4111f.f22871b;
            if (e) {
                t2 = t;
            } else {
                t2 = null;
            }
            t.mo31153o(i, t2, (Object) null);
        }
        return e;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [p19, f29] */
    /* renamed from: v */
    public static f29 m34225v() {
        return p19.m49668n();
    }

    /* renamed from: w */
    public static <E> h29<E> m34226w() {
        return e79.m43815n();
    }

    /* renamed from: a */
    public final boolean mo31169a() {
        return m34224t(this, true);
    }

    /* renamed from: d */
    public final /* synthetic */ t59 mo31170d() {
        C4107b bVar = (C4107b) mo31153o(C4111f.f22874e, (Object) null, (Object) null);
        bVar.mo31181b(this);
        return bVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return n69.m48643a().mo46003c(this).mo31211g(this, (C4105e0) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final void mo31172f(int i) {
        this.zzc = i;
    }

    public int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int b = n69.m48643a().mo46003c(this).mo31206b(this);
        this.zza = b;
        return b;
    }

    /* renamed from: i */
    public final /* synthetic */ k59 mo31174i() {
        return (C4105e0) mo31153o(C4111f.f22875f, (Object) null, (Object) null);
    }

    /* renamed from: j */
    public final int mo31175j() {
        if (this.zzc == -1) {
            this.zzc = n69.m48643a().mo46003c(this).mo31210f(this);
        }
        return this.zzc;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final int mo31176k() {
        return this.zzc;
    }

    /* renamed from: l */
    public final /* synthetic */ t59 mo31177l() {
        return (C4107b) mo31153o(C4111f.f22874e, (Object) null, (Object) null);
    }

    /* renamed from: m */
    public final void mo31178m(zzii zzii) throws IOException {
        n69.m48643a().mo46003c(this).mo31212h(this, lz8.m47981O(zzii));
    }

    /* renamed from: o */
    public abstract Object mo31153o(int i, Object obj, Object obj2);

    public String toString() {
        return C4114f0.m34265b(this, super.toString());
    }

    /* renamed from: u */
    public final <MessageType extends C4105e0<MessageType, BuilderType>, BuilderType extends C4107b<MessageType, BuilderType>> BuilderType mo31180u() {
        return (C4107b) mo31153o(C4111f.f22874e, (Object) null, (Object) null);
    }
}
