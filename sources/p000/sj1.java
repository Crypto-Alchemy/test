package p000;

import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: sj1 */
/* compiled from: DrawableUtils */
public class sj1 {

    /* renamed from: a */
    public static final int[] f17668a = {16842912};

    /* renamed from: b */
    public static final int[] f17669b = new int[0];

    /* renamed from: c */
    public static final Rect f17670c = new Rect();

    /* renamed from: sj1$a */
    /* compiled from: DrawableUtils */
    public static class C3270a {

        /* renamed from: a */
        public static final boolean f17671a;

        /* renamed from: b */
        public static final Method f17672b;

        /* renamed from: c */
        public static final Field f17673c;

        /* renamed from: d */
        public static final Field f17674d;

        /* renamed from: e */
        public static final Field f17675e;

        /* renamed from: f */
        public static final Field f17676f;

        /* JADX WARNING: Removed duplicated region for block: B:43:0x004b  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x0058  */
        static {
            /*
                r0 = 1
                r1 = 0
                r2 = 0
                java.lang.String r3 = "android.graphics.Insets"
                java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ NoSuchMethodException -> 0x0043, ClassNotFoundException -> 0x003f, NoSuchFieldException -> 0x003b }
                java.lang.Class<android.graphics.drawable.Drawable> r4 = android.graphics.drawable.Drawable.class
                java.lang.String r5 = "getOpticalInsets"
                java.lang.Class[] r6 = new java.lang.Class[r1]     // Catch:{ NoSuchMethodException -> 0x0043, ClassNotFoundException -> 0x003f, NoSuchFieldException -> 0x003b }
                java.lang.reflect.Method r4 = r4.getMethod(r5, r6)     // Catch:{ NoSuchMethodException -> 0x0043, ClassNotFoundException -> 0x003f, NoSuchFieldException -> 0x003b }
                java.lang.String r5 = "left"
                java.lang.reflect.Field r5 = r3.getField(r5)     // Catch:{ NoSuchMethodException -> 0x0039, ClassNotFoundException -> 0x0037, NoSuchFieldException -> 0x0035 }
                java.lang.String r6 = "top"
                java.lang.reflect.Field r6 = r3.getField(r6)     // Catch:{ NoSuchMethodException -> 0x0033, ClassNotFoundException -> 0x0031, NoSuchFieldException -> 0x002f }
                java.lang.String r7 = "right"
                java.lang.reflect.Field r7 = r3.getField(r7)     // Catch:{ ClassNotFoundException | NoSuchFieldException | NoSuchMethodException -> 0x002d }
                java.lang.String r8 = "bottom"
                java.lang.reflect.Field r3 = r3.getField(r8)     // Catch:{ ClassNotFoundException | NoSuchFieldException | NoSuchMethodException -> 0x0047 }
                r8 = r0
                goto L_0x0049
            L_0x002d:
                r7 = r2
                goto L_0x0047
            L_0x002f:
                r6 = r2
                goto L_0x0046
            L_0x0031:
                r6 = r2
                goto L_0x0046
            L_0x0033:
                r6 = r2
                goto L_0x0046
            L_0x0035:
                r5 = r2
                goto L_0x003d
            L_0x0037:
                r5 = r2
                goto L_0x0041
            L_0x0039:
                r5 = r2
                goto L_0x0045
            L_0x003b:
                r4 = r2
                r5 = r4
            L_0x003d:
                r6 = r5
                goto L_0x0046
            L_0x003f:
                r4 = r2
                r5 = r4
            L_0x0041:
                r6 = r5
                goto L_0x0046
            L_0x0043:
                r4 = r2
                r5 = r4
            L_0x0045:
                r6 = r5
            L_0x0046:
                r7 = r6
            L_0x0047:
                r8 = r1
                r3 = r2
            L_0x0049:
                if (r8 == 0) goto L_0x0058
                f17672b = r4
                f17673c = r5
                f17674d = r6
                f17675e = r7
                f17676f = r3
                f17671a = r0
                goto L_0x0064
            L_0x0058:
                f17672b = r2
                f17673c = r2
                f17674d = r2
                f17675e = r2
                f17676f = r2
                f17671a = r1
            L_0x0064:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.sj1.C3270a.<clinit>():void");
        }

        /* renamed from: a */
        public static Rect m26924a(Drawable drawable) {
            if (Build.VERSION.SDK_INT < 29 && f17671a) {
                try {
                    Object invoke = f17672b.invoke(drawable, new Object[0]);
                    if (invoke != null) {
                        return new Rect(f17673c.getInt(invoke), f17674d.getInt(invoke), f17675e.getInt(invoke), f17676f.getInt(invoke));
                    }
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
            return sj1.f17670c;
        }
    }

    /* renamed from: sj1$b */
    /* compiled from: DrawableUtils */
    public static class C3271b {
        /* renamed from: a */
        public static Insets m26925a(Drawable drawable) {
            return drawable.getOpticalInsets();
        }
    }

    /* renamed from: a */
    public static boolean m26919a(Drawable drawable) {
        return true;
    }

    /* renamed from: b */
    public static void m26920b(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i = Build.VERSION.SDK_INT;
        if (i >= 29 && i < 31 && "android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            m26921c(drawable);
        }
    }

    /* renamed from: c */
    public static void m26921c(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f17668a);
        } else {
            drawable.setState(f17669b);
        }
        drawable.setState(state);
    }

    /* renamed from: d */
    public static Rect m26922d(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 29) {
            return C3270a.m26924a(ij1.m19658q(drawable));
        }
        Insets a = C3271b.m26925a(drawable);
        return new Rect(a.left, a.top, a.right, a.bottom);
    }

    /* renamed from: e */
    public static PorterDuff.Mode m26923e(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
