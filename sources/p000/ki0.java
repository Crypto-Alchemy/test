package p000;

import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* renamed from: ki0 */
/* compiled from: CollectPreconditions */
public final class ki0 {
    /* renamed from: a */
    public static void m47099a(Object obj, Object obj2) {
        if (obj == null) {
            String valueOf = String.valueOf(obj2);
            StringBuilder sb = new StringBuilder(valueOf.length() + 24);
            sb.append("null key in entry: null=");
            sb.append(valueOf);
            throw new NullPointerException(sb.toString());
        } else if (obj2 == null) {
            String valueOf2 = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 26);
            sb2.append("null value in entry: ");
            sb2.append(valueOf2);
            sb2.append("=null");
            throw new NullPointerException(sb2.toString());
        }
    }

    @CanIgnoreReturnValue
    /* renamed from: b */
    public static int m47100b(int i, String str) {
        if (i >= 0) {
            return i;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40);
        sb.append(str);
        sb.append(" cannot be negative but was: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: c */
    public static void m47101c(int i, String str) {
        if (i <= 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 38);
            sb.append(str);
            sb.append(" must be positive but was: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: d */
    public static void m47102d(boolean z) {
        du4.m43697q(z, "no calls to next() since the last call to remove()");
    }
}
