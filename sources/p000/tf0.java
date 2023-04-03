package p000;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.ResolvedRecursiveType;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: tf0 */
/* compiled from: ClassStack */
public final class tf0 {

    /* renamed from: a */
    public final tf0 f18142a;

    /* renamed from: b */
    public final Class<?> f18143b;

    /* renamed from: c */
    public ArrayList<ResolvedRecursiveType> f18144c;

    public tf0(Class<?> cls) {
        this((tf0) null, cls);
    }

    /* renamed from: a */
    public void mo26435a(ResolvedRecursiveType resolvedRecursiveType) {
        if (this.f18144c == null) {
            this.f18144c = new ArrayList<>();
        }
        this.f18144c.add(resolvedRecursiveType);
    }

    /* renamed from: b */
    public tf0 mo26436b(Class<?> cls) {
        return new tf0(this, cls);
    }

    /* renamed from: c */
    public tf0 mo26437c(Class<?> cls) {
        if (this.f18143b == cls) {
            return this;
        }
        for (tf0 tf0 = this.f18142a; tf0 != null; tf0 = tf0.f18142a) {
            if (tf0.f18143b == cls) {
                return tf0;
            }
        }
        return null;
    }

    /* renamed from: d */
    public void mo26438d(JavaType javaType) {
        ArrayList<ResolvedRecursiveType> arrayList = this.f18144c;
        if (arrayList != null) {
            Iterator<ResolvedRecursiveType> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().setReference(javaType);
            }
        }
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("[ClassStack (self-refs: ");
        ArrayList<ResolvedRecursiveType> arrayList = this.f18144c;
        if (arrayList == null) {
            str = "0";
        } else {
            str = String.valueOf(arrayList.size());
        }
        sb.append(str);
        sb.append(')');
        for (tf0 tf0 = this; tf0 != null; tf0 = tf0.f18142a) {
            sb.append(' ');
            sb.append(tf0.f18143b.getName());
        }
        sb.append(']');
        return sb.toString();
    }

    public tf0(tf0 tf0, Class<?> cls) {
        this.f18142a = tf0;
        this.f18143b = cls;
    }
}
