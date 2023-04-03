package p000;

import kotlin.Metadata;
import kotlin.text.StringsKt__StringsKt;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\b\u0010\u0001\u001a\u00020\u0000H\u0002\"\u0014\u0010\u0004\u001a\u00020\u00028\u0000X\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0003¨\u0006\u0005"}, mo44877d2 = {"", "a", "Lhp4;", "Lhp4;", "IMPLEMENTATIONS", "kotlin-stdlib"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: ip4 */
/* compiled from: PlatformImplementations.kt */
public final class ip4 {

    /* renamed from: a */
    public static final hp4 f30095a;

    static {
        hp4 hp4;
        tz2 newInstance;
        uz2 newInstance2;
        Class<hp4> cls = hp4.class;
        int a = m45891a();
        if (a >= 65544 || a < 65536) {
            try {
                newInstance2 = uz2.class.newInstance();
                vx2.m53590f(newInstance2, "forName(\"kotlin.internal…entations\").newInstance()");
                if (newInstance2 != null) {
                    hp4 = newInstance2;
                    f30095a = hp4;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
            } catch (ClassCastException e) {
                ClassLoader classLoader = newInstance2.getClass().getClassLoader();
                ClassLoader classLoader2 = cls.getClassLoader();
                if (!vx2.m53586b(classLoader, classLoader2)) {
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e);
                }
                throw e;
            } catch (ClassNotFoundException unused) {
                try {
                    Object newInstance3 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
                    vx2.m53590f(newInstance3, "forName(\"kotlin.internal…entations\").newInstance()");
                    if (newInstance3 != null) {
                        try {
                            hp4 = (hp4) newInstance3;
                        } catch (ClassCastException e2) {
                            ClassLoader classLoader3 = newInstance3.getClass().getClassLoader();
                            ClassLoader classLoader4 = cls.getClassLoader();
                            if (!vx2.m53586b(classLoader3, classLoader4)) {
                                throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader3 + ", base type classloader: " + classLoader4, e2);
                            }
                            throw e2;
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                } catch (ClassNotFoundException unused2) {
                }
            }
        }
        if (a >= 65543 || a < 65536) {
            try {
                newInstance = tz2.class.newInstance();
                vx2.m53590f(newInstance, "forName(\"kotlin.internal…entations\").newInstance()");
                if (newInstance != null) {
                    hp4 = newInstance;
                    f30095a = hp4;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
            } catch (ClassCastException e3) {
                ClassLoader classLoader5 = newInstance.getClass().getClassLoader();
                ClassLoader classLoader6 = cls.getClassLoader();
                if (!vx2.m53586b(classLoader5, classLoader6)) {
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader5 + ", base type classloader: " + classLoader6, e3);
                }
                throw e3;
            } catch (ClassNotFoundException unused3) {
                try {
                    Object newInstance4 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                    vx2.m53590f(newInstance4, "forName(\"kotlin.internal…entations\").newInstance()");
                    if (newInstance4 != null) {
                        try {
                            hp4 = (hp4) newInstance4;
                        } catch (ClassCastException e4) {
                            ClassLoader classLoader7 = newInstance4.getClass().getClassLoader();
                            ClassLoader classLoader8 = cls.getClassLoader();
                            if (!vx2.m53586b(classLoader7, classLoader8)) {
                                throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader7 + ", base type classloader: " + classLoader8, e4);
                            }
                            throw e4;
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                } catch (ClassNotFoundException unused4) {
                }
            }
        }
        hp4 = new hp4();
        f30095a = hp4;
    }

    /* renamed from: a */
    public static final int m45891a() {
        String property = System.getProperty("java.specification.version");
        if (property == null) {
            return 65542;
        }
        int d0 = StringsKt__StringsKt.m63099d0(property, '.', 0, false, 6, (Object) null);
        if (d0 < 0) {
            try {
                return Integer.parseInt(property) * 65536;
            } catch (NumberFormatException unused) {
                return 65542;
            }
        } else {
            int i = d0 + 1;
            int d02 = StringsKt__StringsKt.m63099d0(property, '.', i, false, 4, (Object) null);
            if (d02 < 0) {
                d02 = property.length();
            }
            String substring = property.substring(0, d0);
            vx2.m53590f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            String substring2 = property.substring(i, d02);
            vx2.m53590f(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            try {
                return (Integer.parseInt(substring) * 65536) + Integer.parseInt(substring2);
            } catch (NumberFormatException unused2) {
                return 65542;
            }
        }
    }
}
