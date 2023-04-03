package p000;

import android.content.res.Resources;
import android.os.Build;
import android.util.LongSparseArray;
import java.lang.reflect.Field;

/* renamed from: yf5 */
/* compiled from: ResourcesFlusher */
public class yf5 {

    /* renamed from: a */
    public static Field f20199a;

    /* renamed from: b */
    public static boolean f20200b;

    /* renamed from: c */
    public static Class<?> f20201c;

    /* renamed from: d */
    public static boolean f20202d;

    /* renamed from: e */
    public static Field f20203e;

    /* renamed from: f */
    public static boolean f20204f;

    /* renamed from: g */
    public static Field f20205g;

    /* renamed from: h */
    public static boolean f20206h;

    /* renamed from: yf5$a */
    /* compiled from: ResourcesFlusher */
    public static class C3674a {
        /* renamed from: a */
        public static void m30572a(LongSparseArray longSparseArray) {
            longSparseArray.clear();
        }
    }

    /* renamed from: a */
    public static void m30568a(Resources resources) {
        int i = Build.VERSION.SDK_INT;
        if (i < 28) {
            if (i >= 24) {
                m30570c(resources);
            } else {
                m30569b(resources);
            }
        }
    }

    /* renamed from: b */
    public static void m30569b(Resources resources) {
        if (!f20200b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f20199a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f20200b = true;
        }
        Object obj = null;
        Field field = f20199a;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException unused2) {
            }
        }
        if (obj != null) {
            m30571d(obj);
        }
    }

    /* renamed from: c */
    public static void m30570c(Resources resources) {
        Object obj;
        if (!f20206h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f20205g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f20206h = true;
        }
        Field field = f20205g;
        if (field != null) {
            Object obj2 = null;
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException unused2) {
                obj = null;
            }
            if (obj != null) {
                if (!f20200b) {
                    try {
                        Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                        f20199a = declaredField2;
                        declaredField2.setAccessible(true);
                    } catch (NoSuchFieldException unused3) {
                    }
                    f20200b = true;
                }
                Field field2 = f20199a;
                if (field2 != null) {
                    try {
                        obj2 = field2.get(obj);
                    } catch (IllegalAccessException unused4) {
                    }
                }
                if (obj2 != null) {
                    m30571d(obj2);
                }
            }
        }
    }

    /* renamed from: d */
    public static void m30571d(Object obj) {
        if (!f20202d) {
            try {
                f20201c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException unused) {
            }
            f20202d = true;
        }
        Class<?> cls = f20201c;
        if (cls != null) {
            if (!f20204f) {
                try {
                    Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                    f20203e = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException unused2) {
                }
                f20204f = true;
            }
            Field field = f20203e;
            if (field != null) {
                LongSparseArray longSparseArray = null;
                try {
                    longSparseArray = (LongSparseArray) field.get(obj);
                } catch (IllegalAccessException unused3) {
                }
                if (longSparseArray != null) {
                    C3674a.m30572a(longSparseArray);
                }
            }
        }
    }
}
