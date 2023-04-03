package p000;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* renamed from: os3 */
/* compiled from: MemberKey */
public final class os3 {

    /* renamed from: c */
    public static final Class<?>[] f16058c = new Class[0];

    /* renamed from: a */
    public final String f16059a;

    /* renamed from: b */
    public final Class<?>[] f16060b;

    public os3(Method method) {
        this(method.getName(), method.getParameterTypes());
    }

    /* renamed from: a */
    public int mo24096a() {
        return this.f16060b.length;
    }

    /* renamed from: b */
    public String mo24097b() {
        return this.f16059a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != os3.class) {
            return false;
        }
        os3 os3 = (os3) obj;
        if (!this.f16059a.equals(os3.f16059a)) {
            return false;
        }
        Class<?>[] clsArr = os3.f16060b;
        int length = this.f16060b.length;
        if (clsArr.length != length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (clsArr[i] != this.f16060b[i]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return this.f16059a.hashCode() + this.f16060b.length;
    }

    public String toString() {
        return this.f16059a + "(" + this.f16060b.length + "-args)";
    }

    public os3(Constructor<?> constructor) {
        this("", constructor.getParameterTypes());
    }

    public os3(String str, Class<?>[] clsArr) {
        this.f16059a = str;
        this.f16060b = clsArr == null ? f16058c : clsArr;
    }
}
