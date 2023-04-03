package p000;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.Typeface$Builder;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import p000.m72;
import p000.s72;

/* renamed from: k27 */
/* compiled from: TypefaceCompatApi26Impl */
public class k27 extends h27 {

    /* renamed from: g */
    public final Class<?> f13958g;

    /* renamed from: h */
    public final Constructor<?> f13959h;

    /* renamed from: i */
    public final Method f13960i;

    /* renamed from: j */
    public final Method f13961j;

    /* renamed from: k */
    public final Method f13962k;

    /* renamed from: l */
    public final Method f13963l;

    /* renamed from: m */
    public final Method f13964m;

    public k27() {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Constructor<?> constructor;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> v = mo22175v();
            constructor = mo22176w(v);
            method4 = mo22172s(v);
            method3 = mo22173t(v);
            method2 = mo22177x(v);
            method = mo22171r(v);
            Class<?> cls2 = v;
            method5 = mo22174u(v);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to collect necessary methods for class ");
            sb.append(e.getClass().getName());
            method5 = null;
            constructor = null;
            method4 = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.f13958g = cls;
        this.f13959h = constructor;
        this.f13960i = method4;
        this.f13961j = method3;
        this.f13962k = method2;
        this.f13963l = method;
        this.f13964m = method5;
    }

    /* renamed from: l */
    private Object m20507l() {
        try {
            return this.f13959h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public Typeface mo20927a(Context context, m72.C2808c cVar, Resources resources, int i) {
        if (!mo22170q()) {
            return super.mo20927a(context, cVar, resources, i);
        }
        Object l = m20507l();
        if (l == null) {
            return null;
        }
        for (m72.C2809d dVar : cVar.mo23051a()) {
            if (!mo22167n(context, l, dVar.mo23052a(), dVar.mo23054c(), dVar.mo23056e(), dVar.mo23057f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(dVar.mo23055d()))) {
                mo22166m(l);
                return null;
            }
        }
        if (!mo22169p(l)) {
            return null;
        }
        return mo22165i(l);
    }

    /* renamed from: b */
    public Typeface mo20928b(Context context, CancellationSignal cancellationSignal, s72.C3250b[] bVarArr, int i) {
        Typeface i2;
        ParcelFileDescriptor openFileDescriptor;
        if (bVarArr.length < 1) {
            return null;
        }
        if (!mo22170q()) {
            s72.C3250b g = mo23021g(bVarArr, i);
            try {
                openFileDescriptor = context.getContentResolver().openFileDescriptor(g.mo25657d(), "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface$Builder(openFileDescriptor.getFileDescriptor()).setWeight(g.mo25658e()).setItalic(g.mo25659f()).build();
                openFileDescriptor.close();
                return build;
            } catch (IOException unused) {
                return null;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            Map<Uri, ByteBuffer> h = o27.m23627h(context, bVarArr, cancellationSignal);
            Object l = m20507l();
            if (l == null) {
                return null;
            }
            boolean z = false;
            for (s72.C3250b bVar : bVarArr) {
                ByteBuffer byteBuffer = h.get(bVar.mo25657d());
                if (byteBuffer != null) {
                    if (!mo22168o(l, byteBuffer, bVar.mo25656c(), bVar.mo25658e(), bVar.mo25659f() ? 1 : 0)) {
                        mo22166m(l);
                        return null;
                    }
                    z = true;
                }
            }
            if (!z) {
                mo22166m(l);
                return null;
            } else if (mo22169p(l) && (i2 = mo22165i(l)) != null) {
                return Typeface.create(i2, i);
            } else {
                return null;
            }
        }
        throw th;
    }

    /* renamed from: d */
    public Typeface mo22164d(Context context, Resources resources, int i, String str, int i2) {
        if (!mo22170q()) {
            return super.mo22164d(context, resources, i, str, i2);
        }
        Object l = m20507l();
        if (l == null) {
            return null;
        }
        if (!mo22167n(context, l, str, 0, -1, -1, (FontVariationAxis[]) null)) {
            mo22166m(l);
            return null;
        } else if (!mo22169p(l)) {
            return null;
        } else {
            return mo22165i(l);
        }
    }

    /* renamed from: i */
    public Typeface mo22165i(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f13958g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f13964m.invoke((Object) null, new Object[]{newInstance, -1, -1});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: m */
    public final void mo22166m(Object obj) {
        try {
            this.f13963l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* renamed from: n */
    public final boolean mo22167n(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f13960i.invoke(obj, new Object[]{context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: o */
    public final boolean mo22168o(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) this.f13961j.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: p */
    public final boolean mo22169p(Object obj) {
        try {
            return ((Boolean) this.f13962k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: q */
    public final boolean mo22170q() {
        if (this.f13960i != null) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public Method mo22171r(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    /* renamed from: s */
    public Method mo22172s(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class});
    }

    /* renamed from: t */
    public Method mo22173t(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2});
    }

    /* renamed from: u */
    public Method mo22174u(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), cls2, cls2});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    /* renamed from: v */
    public Class<?> mo22175v() throws ClassNotFoundException {
        return Class.forName("android.graphics.FontFamily");
    }

    /* renamed from: w */
    public Constructor<?> mo22176w(Class<?> cls) throws NoSuchMethodException {
        return cls.getConstructor(new Class[0]);
    }

    /* renamed from: x */
    public Method mo22177x(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod("freeze", new Class[0]);
    }
}
