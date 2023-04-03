package kotlin.reflect.jvm.internal.impl.name;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: kotlin.reflect.jvm.internal.impl.name.a */
/* compiled from: FqNamesUtil.kt */
public final class C7597a {

    /* renamed from: kotlin.reflect.jvm.internal.impl.name.a$a */
    /* compiled from: FqNamesUtil.kt */
    public /* synthetic */ class C7598a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f39908a;

        static {
            int[] iArr = new int[State.values().length];
            iArr[State.BEGINNING.ordinal()] = 1;
            iArr[State.AFTER_DOT.ordinal()] = 2;
            iArr[State.MIDDLE.ordinal()] = 3;
            f39908a = iArr;
        }
    }

    /* renamed from: a */
    public static final <V> V m61836a(u82 u82, Map<u82, ? extends V> map) {
        Object obj;
        vx2.m53591g(u82, "<this>");
        vx2.m53591g(map, "values");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<u82, ? extends V>> it = map.entrySet().iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry next = it.next();
            u82 u822 = (u82) next.getKey();
            if (!vx2.m53586b(u82, u822) && !m61837b(u82, u822)) {
                z = false;
            }
            if (z) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        if (!(!linkedHashMap.isEmpty())) {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            return null;
        }
        Iterator it2 = linkedHashMap.entrySet().iterator();
        if (!it2.hasNext()) {
            obj = null;
        } else {
            obj = it2.next();
            if (it2.hasNext()) {
                int length = m61842g((u82) ((Map.Entry) obj).getKey(), u82).mo66195b().length();
                do {
                    Object next2 = it2.next();
                    int length2 = m61842g((u82) ((Map.Entry) next2).getKey(), u82).mo66195b().length();
                    if (length > length2) {
                        obj = next2;
                        length = length2;
                    }
                } while (it2.hasNext());
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            return entry.getValue();
        }
        return null;
    }

    /* renamed from: b */
    public static final boolean m61837b(u82 u82, u82 u822) {
        vx2.m53591g(u82, "<this>");
        vx2.m53591g(u822, "packageName");
        return vx2.m53586b(m61841f(u82), u822);
    }

    /* renamed from: c */
    public static final boolean m61838c(u82 u82, u82 u822) {
        vx2.m53591g(u82, "<this>");
        vx2.m53591g(u822, "packageName");
        if (vx2.m53586b(u82, u822) || u822.mo66197d()) {
            return true;
        }
        String b = u82.mo66195b();
        vx2.m53590f(b, "this.asString()");
        String b2 = u822.mo66195b();
        vx2.m53590f(b2, "packageName.asString()");
        return m61839d(b, b2);
    }

    /* renamed from: d */
    public static final boolean m61839d(String str, String str2) {
        if (!yb6.m74336M(str, str2, false, 2, (Object) null) || str.charAt(str2.length()) != '.') {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static final boolean m61840e(String str) {
        if (str == null) {
            return false;
        }
        State state = State.BEGINNING;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            int i2 = C7598a.f39908a[state.ordinal()];
            if (i2 == 1 || i2 == 2) {
                if (!Character.isJavaIdentifierPart(charAt)) {
                    return false;
                }
                state = State.MIDDLE;
            } else if (i2 != 3) {
                continue;
            } else if (charAt == '.') {
                state = State.AFTER_DOT;
            } else if (!Character.isJavaIdentifierPart(charAt)) {
                return false;
            }
        }
        if (state != State.AFTER_DOT) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static final u82 m61841f(u82 u82) {
        vx2.m53591g(u82, "<this>");
        if (u82.mo66197d()) {
            return null;
        }
        return u82.mo66198e();
    }

    /* renamed from: g */
    public static final u82 m61842g(u82 u82, u82 u822) {
        vx2.m53591g(u82, "<this>");
        vx2.m53591g(u822, "prefix");
        if (!m61838c(u82, u822) || u822.mo66197d()) {
            return u82;
        }
        if (vx2.m53586b(u82, u822)) {
            u82 u823 = u82.f44926c;
            vx2.m53590f(u823, "ROOT");
            return u823;
        }
        String b = u82.mo66195b();
        vx2.m53590f(b, "asString()");
        String substring = b.substring(u822.mo66195b().length() + 1);
        vx2.m53590f(substring, "this as java.lang.String).substring(startIndex)");
        return new u82(substring);
    }
}
