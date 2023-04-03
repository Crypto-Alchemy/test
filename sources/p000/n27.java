package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;
import p000.m72;
import p000.s72;

/* renamed from: n27 */
/* compiled from: TypefaceCompatBaseImpl */
public class n27 {
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: a */
    public ConcurrentHashMap<Long, m72.C2808c> f15304a = new ConcurrentHashMap<>();

    /* renamed from: n27$a */
    /* compiled from: TypefaceCompatBaseImpl */
    public class C2860a implements C2861b<s72.C3250b> {
        public C2860a() {
        }

        /* renamed from: c */
        public int mo23483b(s72.C3250b bVar) {
            return bVar.mo25658e();
        }

        /* renamed from: d */
        public boolean mo23482a(s72.C3250b bVar) {
            return bVar.mo25659f();
        }
    }

    /* renamed from: n27$b */
    /* compiled from: TypefaceCompatBaseImpl */
    public interface C2861b<T> {
        /* renamed from: a */
        boolean mo23482a(T t);

        /* renamed from: b */
        int mo23483b(T t);
    }

    /* renamed from: e */
    public static <T> T m22762e(T[] tArr, int i, C2861b<T> bVar) {
        int i2;
        boolean z;
        if ((i & 1) == 0) {
            i2 = 400;
        } else {
            i2 = 700;
        }
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        return m22763f(tArr, i2, z, bVar);
    }

    /* renamed from: f */
    public static <T> T m22763f(T[] tArr, int i, boolean z, C2861b<T> bVar) {
        int i2;
        T t = null;
        int i3 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int abs = Math.abs(bVar.mo23483b(t2) - i) * 2;
            if (bVar.mo23482a(t2) == z) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            int i4 = abs + i2;
            if (t == null || i3 > i4) {
                t = t2;
                i3 = i4;
            }
        }
        return t;
    }

    /* renamed from: a */
    public Typeface mo20927a(Context context, m72.C2808c cVar, Resources resources, int i) {
        throw null;
    }

    /* renamed from: b */
    public Typeface mo20928b(Context context, CancellationSignal cancellationSignal, s72.C3250b[] bVarArr, int i) {
        throw null;
    }

    /* renamed from: c */
    public Typeface mo23481c(Context context, InputStream inputStream) {
        File e = o27.m23624e(context);
        if (e == null) {
            return null;
        }
        try {
            if (!o27.m23623d(e, inputStream)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(e.getPath());
            e.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e.delete();
        }
    }

    /* renamed from: d */
    public Typeface mo22164d(Context context, Resources resources, int i, String str, int i2) {
        File e = o27.m23624e(context);
        if (e == null) {
            return null;
        }
        try {
            if (!o27.m23622c(e, resources, i)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(e.getPath());
            e.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e.delete();
        }
    }

    /* renamed from: g */
    public s72.C3250b mo23021g(s72.C3250b[] bVarArr, int i) {
        return (s72.C3250b) m22762e(bVarArr, i, new C2860a());
    }
}
