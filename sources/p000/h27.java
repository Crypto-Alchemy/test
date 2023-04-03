package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p000.m72;
import p000.s72;

/* renamed from: h27 */
/* compiled from: TypefaceCompatApi21Impl */
public class h27 extends n27 {

    /* renamed from: b */
    public static Class<?> f12692b = null;

    /* renamed from: c */
    public static Constructor<?> f12693c = null;

    /* renamed from: d */
    public static Method f12694d = null;

    /* renamed from: e */
    public static Method f12695e = null;

    /* renamed from: f */
    public static boolean f12696f = false;

    /* renamed from: h */
    public static boolean m18548h(Object obj, String str, int i, boolean z) {
        m18550k();
        try {
            return ((Boolean) f12694d.invoke(obj, new Object[]{str, Integer.valueOf(i), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: i */
    public static Typeface mo22165i(Object obj) {
        m18550k();
        try {
            Object newInstance = Array.newInstance(f12692b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f12695e.invoke((Object) null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: k */
    public static void m18550k() {
        Method method;
        Class<?> cls;
        Method method2;
        if (!f12696f) {
            f12696f = true;
            Constructor<?> constructor = null;
            try {
                cls = Class.forName("android.graphics.FontFamily");
                Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
                method = cls.getMethod("addFontWeightStyle", new Class[]{String.class, Integer.TYPE, Boolean.TYPE});
                method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
                constructor = constructor2;
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                method2 = null;
                cls = null;
                method = null;
            }
            f12693c = constructor;
            f12692b = cls;
            f12694d = method;
            f12695e = method2;
        }
    }

    /* renamed from: l */
    public static Object m18551l() {
        m18550k();
        try {
            return f12693c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public Typeface mo20927a(Context context, m72.C2808c cVar, Resources resources, int i) {
        Object l = m18551l();
        m72.C2809d[] a = cVar.mo23051a();
        int length = a.length;
        int i2 = 0;
        while (i2 < length) {
            m72.C2809d dVar = a[i2];
            File e = o27.m23624e(context);
            if (e == null) {
                return null;
            }
            try {
                if (!o27.m23622c(e, resources, dVar.mo23053b())) {
                    e.delete();
                    return null;
                } else if (!m18548h(l, e.getPath(), dVar.mo23056e(), dVar.mo23057f())) {
                    return null;
                } else {
                    e.delete();
                    i2++;
                }
            } catch (RuntimeException unused) {
                return null;
            } finally {
                e.delete();
            }
        }
        return mo22165i(l);
    }

    /* renamed from: b */
    public Typeface mo20928b(Context context, CancellationSignal cancellationSignal, s72.C3250b[] bVarArr, int i) {
        FileInputStream fileInputStream;
        if (bVarArr.length < 1) {
            return null;
        }
        s72.C3250b g = mo23021g(bVarArr, i);
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(g.mo25657d(), "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                File j = mo20929j(openFileDescriptor);
                if (j != null) {
                    if (j.canRead()) {
                        Typeface createFromFile = Typeface.createFromFile(j);
                        openFileDescriptor.close();
                        return createFromFile;
                    }
                }
                fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                Typeface c = super.mo23481c(context, fileInputStream);
                fileInputStream.close();
                openFileDescriptor.close();
                return c;
            } catch (Throwable th) {
                openFileDescriptor.close();
                throw th;
            }
        } catch (IOException unused) {
            return null;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    /* renamed from: j */
    public final File mo20929j(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }
}
