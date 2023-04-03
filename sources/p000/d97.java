package p000;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: d97 */
/* compiled from: VersionedParcel */
public abstract class d97 {

    /* renamed from: a */
    public final C2781lq<String, Method> f10578a;

    /* renamed from: b */
    public final C2781lq<String, Method> f10579b;

    /* renamed from: c */
    public final C2781lq<String, Class> f10580c;

    public d97(C2781lq<String, Method> lqVar, C2781lq<String, Method> lqVar2, C2781lq<String, Class> lqVar3) {
        this.f10578a = lqVar;
        this.f10579b = lqVar2;
        this.f10580c = lqVar3;
    }

    /* renamed from: A */
    public abstract void mo18595A(byte[] bArr);

    /* renamed from: B */
    public void mo18596B(byte[] bArr, int i) {
        mo18631w(i);
        mo18595A(bArr);
    }

    /* renamed from: C */
    public abstract void mo18597C(CharSequence charSequence);

    /* renamed from: D */
    public void mo18598D(CharSequence charSequence, int i) {
        mo18631w(i);
        mo18597C(charSequence);
    }

    /* renamed from: E */
    public abstract void mo18599E(int i);

    /* renamed from: F */
    public void mo18600F(int i, int i2) {
        mo18631w(i2);
        mo18599E(i);
    }

    /* renamed from: G */
    public abstract void mo18601G(Parcelable parcelable);

    /* renamed from: H */
    public void mo18602H(Parcelable parcelable, int i) {
        mo18631w(i);
        mo18601G(parcelable);
    }

    /* renamed from: I */
    public abstract void mo18603I(String str);

    /* renamed from: J */
    public void mo18604J(String str, int i) {
        mo18631w(i);
        mo18603I(str);
    }

    /* renamed from: K */
    public <T extends f97> void mo18605K(T t, d97 d97) {
        try {
            mo18613e(t.getClass()).invoke((Object) null, new Object[]{t, d97});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    /* renamed from: L */
    public void mo18606L(f97 f97) {
        if (f97 == null) {
            mo18603I((String) null);
            return;
        }
        mo18608N(f97);
        d97 b = mo18610b();
        mo18605K(f97, b);
        b.mo18609a();
    }

    /* renamed from: M */
    public void mo18607M(f97 f97, int i) {
        mo18631w(i);
        mo18606L(f97);
    }

    /* renamed from: N */
    public final void mo18608N(f97 f97) {
        try {
            mo18603I(mo18611c(f97.getClass()).getName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(f97.getClass().getSimpleName() + " does not have a Parcelizer", e);
        }
    }

    /* renamed from: a */
    public abstract void mo18609a();

    /* renamed from: b */
    public abstract d97 mo18610b();

    /* renamed from: c */
    public final Class mo18611c(Class<? extends f97> cls) throws ClassNotFoundException {
        Class cls2 = this.f10580c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", new Object[]{cls.getPackage().getName(), cls.getSimpleName()}), false, cls.getClassLoader());
        this.f10580c.put(cls.getName(), cls3);
        return cls3;
    }

    /* renamed from: d */
    public final Method mo18612d(String str) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Class<d97> cls = d97.class;
        Method method = this.f10578a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, cls.getClassLoader()).getDeclaredMethod("read", new Class[]{cls});
        this.f10578a.put(str, declaredMethod);
        return declaredMethod;
    }

    /* renamed from: e */
    public final Method mo18613e(Class cls) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method = this.f10579b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class c = mo18611c(cls);
        System.currentTimeMillis();
        Method declaredMethod = c.getDeclaredMethod("write", new Class[]{cls, d97.class});
        this.f10579b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* renamed from: f */
    public boolean mo18614f() {
        return false;
    }

    /* renamed from: g */
    public abstract boolean mo18615g();

    /* renamed from: h */
    public boolean mo18616h(boolean z, int i) {
        if (!mo18621m(i)) {
            return z;
        }
        return mo18615g();
    }

    /* renamed from: i */
    public abstract byte[] mo18617i();

    /* renamed from: j */
    public byte[] mo18618j(byte[] bArr, int i) {
        if (!mo18621m(i)) {
            return bArr;
        }
        return mo18617i();
    }

    /* renamed from: k */
    public abstract CharSequence mo18619k();

    /* renamed from: l */
    public CharSequence mo18620l(CharSequence charSequence, int i) {
        if (!mo18621m(i)) {
            return charSequence;
        }
        return mo18619k();
    }

    /* renamed from: m */
    public abstract boolean mo18621m(int i);

    /* renamed from: n */
    public <T extends f97> T mo18622n(String str, d97 d97) {
        try {
            return (f97) mo18612d(str).invoke((Object) null, new Object[]{d97});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    /* renamed from: o */
    public abstract int mo18623o();

    /* renamed from: p */
    public int mo18624p(int i, int i2) {
        if (!mo18621m(i2)) {
            return i;
        }
        return mo18623o();
    }

    /* renamed from: q */
    public abstract <T extends Parcelable> T mo18625q();

    /* renamed from: r */
    public <T extends Parcelable> T mo18626r(T t, int i) {
        if (!mo18621m(i)) {
            return t;
        }
        return mo18625q();
    }

    /* renamed from: s */
    public abstract String mo18627s();

    /* renamed from: t */
    public String mo18628t(String str, int i) {
        if (!mo18621m(i)) {
            return str;
        }
        return mo18627s();
    }

    /* renamed from: u */
    public <T extends f97> T mo18629u() {
        String s = mo18627s();
        if (s == null) {
            return null;
        }
        return mo18622n(s, mo18610b());
    }

    /* renamed from: v */
    public <T extends f97> T mo18630v(T t, int i) {
        if (!mo18621m(i)) {
            return t;
        }
        return mo18629u();
    }

    /* renamed from: w */
    public abstract void mo18631w(int i);

    /* renamed from: x */
    public void mo18632x(boolean z, boolean z2) {
    }

    /* renamed from: y */
    public abstract void mo18633y(boolean z);

    /* renamed from: z */
    public void mo18634z(boolean z, int i) {
        mo18631w(i);
        mo18633y(z);
    }
}
