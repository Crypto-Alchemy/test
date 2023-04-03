package p000;

import com.fasterxml.jackson.databind.JavaType;
import java.util.HashMap;
import java.util.Map;

/* renamed from: m75 */
/* compiled from: ReadOnlyClassToSerializerMap */
public final class m75 {

    /* renamed from: a */
    public final C2811a[] f14852a;

    /* renamed from: b */
    public final int f14853b;

    /* renamed from: c */
    public final int f14854c;

    /* renamed from: m75$a */
    /* compiled from: ReadOnlyClassToSerializerMap */
    public static final class C2811a {

        /* renamed from: a */
        public final y63<Object> f14855a;

        /* renamed from: b */
        public final C2811a f14856b;

        /* renamed from: c */
        public final Class<?> f14857c;

        /* renamed from: d */
        public final JavaType f14858d;

        /* renamed from: e */
        public final boolean f14859e;

        public C2811a(C2811a aVar, u07 u07, y63<Object> y63) {
            this.f14856b = aVar;
            this.f14855a = y63;
            this.f14859e = u07.mo26620c();
            this.f14857c = u07.mo26618a();
            this.f14858d = u07.mo26619b();
        }

        /* renamed from: a */
        public boolean mo23067a(JavaType javaType) {
            if (!this.f14859e || !javaType.equals(this.f14858d)) {
                return false;
            }
            return true;
        }

        /* renamed from: b */
        public boolean mo23068b(Class<?> cls) {
            if (this.f14857c != cls || !this.f14859e) {
                return false;
            }
            return true;
        }

        /* renamed from: c */
        public boolean mo23069c(JavaType javaType) {
            if (this.f14859e || !javaType.equals(this.f14858d)) {
                return false;
            }
            return true;
        }

        /* renamed from: d */
        public boolean mo23070d(Class<?> cls) {
            if (this.f14857c != cls || this.f14859e) {
                return false;
            }
            return true;
        }
    }

    public m75(Map<u07, y63<Object>> map) {
        int a = m22059a(map.size());
        this.f14853b = a;
        this.f14854c = a - 1;
        C2811a[] aVarArr = new C2811a[a];
        for (Map.Entry next : map.entrySet()) {
            u07 u07 = (u07) next.getKey();
            int hashCode = u07.hashCode() & this.f14854c;
            aVarArr[hashCode] = new C2811a(aVarArr[hashCode], u07, (y63) next.getValue());
        }
        this.f14852a = aVarArr;
    }

    /* renamed from: a */
    public static final int m22059a(int i) {
        int i2 = 8;
        while (i2 < (i <= 64 ? i + i : i + (i >> 2))) {
            i2 += i2;
        }
        return i2;
    }

    /* renamed from: b */
    public static m75 m22060b(HashMap<u07, y63<Object>> hashMap) {
        return new m75(hashMap);
    }

    /* renamed from: c */
    public y63<Object> mo23063c(JavaType javaType) {
        C2811a aVar = this.f14852a[u07.m28014d(javaType) & this.f14854c];
        if (aVar == null) {
            return null;
        }
        if (aVar.mo23067a(javaType)) {
            return aVar.f14855a;
        }
        do {
            aVar = aVar.f14856b;
            if (aVar == null) {
                return null;
            }
        } while (!aVar.mo23067a(javaType));
        return aVar.f14855a;
    }

    /* renamed from: d */
    public y63<Object> mo23064d(Class<?> cls) {
        C2811a aVar = this.f14852a[u07.m28015e(cls) & this.f14854c];
        if (aVar == null) {
            return null;
        }
        if (aVar.mo23068b(cls)) {
            return aVar.f14855a;
        }
        do {
            aVar = aVar.f14856b;
            if (aVar == null) {
                return null;
            }
        } while (!aVar.mo23068b(cls));
        return aVar.f14855a;
    }

    /* renamed from: e */
    public y63<Object> mo23065e(JavaType javaType) {
        C2811a aVar = this.f14852a[u07.m28016f(javaType) & this.f14854c];
        if (aVar == null) {
            return null;
        }
        if (aVar.mo23069c(javaType)) {
            return aVar.f14855a;
        }
        do {
            aVar = aVar.f14856b;
            if (aVar == null) {
                return null;
            }
        } while (!aVar.mo23069c(javaType));
        return aVar.f14855a;
    }

    /* renamed from: f */
    public y63<Object> mo23066f(Class<?> cls) {
        C2811a aVar = this.f14852a[u07.m28017g(cls) & this.f14854c];
        if (aVar == null) {
            return null;
        }
        if (aVar.mo23070d(cls)) {
            return aVar.f14855a;
        }
        do {
            aVar = aVar.f14856b;
            if (aVar == null) {
                return null;
            }
        } while (!aVar.mo23070d(cls));
        return aVar.f14855a;
    }
}
