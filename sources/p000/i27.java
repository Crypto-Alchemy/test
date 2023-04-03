package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import p000.m72;
import p000.s72;

/* renamed from: i27 */
/* compiled from: TypefaceCompatApi24Impl */
public class i27 extends n27 {

    /* renamed from: b */
    public static final Class<?> f13130b;

    /* renamed from: c */
    public static final Constructor<?> f13131c;

    /* renamed from: d */
    public static final Method f13132d;

    /* renamed from: e */
    public static final Method f13133e;

    static {
        Method method;
        Method method2;
        Class<?> cls;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            Class cls2 = Integer.TYPE;
            method = cls.getMethod("addFontWeightStyle", new Class[]{ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE});
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            method2 = null;
            method = null;
        }
        f13131c = constructor;
        f13130b = cls;
        f13132d = method;
        f13133e = method2;
    }

    /* renamed from: h */
    public static boolean m19365h(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f13132d.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: i */
    public static Typeface m19366i(Object obj) {
        try {
            Object newInstance = Array.newInstance(f13130b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f13133e.invoke((Object) null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: j */
    public static boolean m19367j() {
        if (f13132d != null) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public static Object m19368k() {
        try {
            return f13131c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public Typeface mo20927a(Context context, m72.C2808c cVar, Resources resources, int i) {
        Object k = m19368k();
        if (k == null) {
            return null;
        }
        for (m72.C2809d dVar : cVar.mo23051a()) {
            ByteBuffer b = o27.m23621b(context, resources, dVar.mo23053b());
            if (b == null || !m19365h(k, b, dVar.mo23054c(), dVar.mo23056e(), dVar.mo23057f())) {
                return null;
            }
        }
        return m19366i(k);
    }

    /* renamed from: b */
    public Typeface mo20928b(Context context, CancellationSignal cancellationSignal, s72.C3250b[] bVarArr, int i) {
        Object k = m19368k();
        if (k == null) {
            return null;
        }
        y16 y16 = new y16();
        for (s72.C3250b bVar : bVarArr) {
            Uri d = bVar.mo25657d();
            ByteBuffer byteBuffer = (ByteBuffer) y16.get(d);
            if (byteBuffer == null) {
                byteBuffer = o27.m23625f(context, cancellationSignal, d);
                y16.put(d, byteBuffer);
            }
            if (byteBuffer == null || !m19365h(k, byteBuffer, bVar.mo25656c(), bVar.mo25658e(), bVar.mo25659f())) {
                return null;
            }
        }
        Typeface i2 = m19366i(k);
        if (i2 == null) {
            return null;
        }
        return Typeface.create(i2, i);
    }
}
