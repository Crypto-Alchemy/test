package p000;

import java.lang.annotation.Annotation;
import java.util.List;

/* renamed from: ma5 */
/* compiled from: ReflectJavaValueParameter.kt */
public final class ma5 extends aa5 implements p23 {

    /* renamed from: a */
    public final ka5 f40818a;

    /* renamed from: b */
    public final Annotation[] f40819b;

    /* renamed from: c */
    public final String f40820c;

    /* renamed from: d */
    public final boolean f40821d;

    public ma5(ka5 ka5, Annotation[] annotationArr, String str, boolean z) {
        vx2.m53591g(ka5, "type");
        vx2.m53591g(annotationArr, "reflectAnnotations");
        this.f40818a = ka5;
        this.f40819b = annotationArr;
        this.f40820c = str;
        this.f40821d = z;
    }

    /* renamed from: D */
    public boolean mo51412D() {
        return false;
    }

    /* renamed from: P */
    public o95 mo51429x(u82 u82) {
        vx2.m53591g(u82, "fqName");
        return s95.m71899a(this.f40819b, u82);
    }

    /* renamed from: Q */
    public List<o95> getAnnotations() {
        return s95.m71900b(this.f40819b);
    }

    /* renamed from: R */
    public ka5 getType() {
        return this.f40818a;
    }

    /* renamed from: a */
    public boolean mo56172a() {
        return this.f40821d;
    }

    public r24 getName() {
        String str = this.f40820c;
        if (str != null) {
            return r24.m71444g(str);
        }
        return null;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(ma5.class.getName());
        sb.append(": ");
        if (mo56172a()) {
            str = "vararg ";
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(getName());
        sb.append(": ");
        sb.append(getType());
        return sb.toString();
    }
}
