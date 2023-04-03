package p000;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: if4 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class if4 {

    /* renamed from: if4$a */
    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public static final class C5959a {

        /* renamed from: a */
        public final List f29922a = new ArrayList();

        /* renamed from: b */
        public final Object f29923b;

        public /* synthetic */ C5959a(Object obj, h78 h78) {
            cu4.m43221k(obj);
            this.f29923b = obj;
        }

        @CanIgnoreReturnValue
        /* renamed from: a */
        public C5959a mo43587a(String str, Object obj) {
            List list = this.f29922a;
            cu4.m43221k(str);
            String valueOf = String.valueOf(obj);
            list.add(str + "=" + valueOf);
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f29923b.getClass().getSimpleName());
            sb.append('{');
            int size = this.f29922a.size();
            for (int i = 0; i < size; i++) {
                sb.append((String) this.f29922a.get(i));
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: a */
    public static boolean m45709a(Object obj, Object obj2) {
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static int m45710b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    /* renamed from: c */
    public static C5959a m45711c(Object obj) {
        return new C5959a(obj, (h78) null);
    }
}
