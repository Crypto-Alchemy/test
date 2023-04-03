package p000;

import java.util.Arrays;

/* renamed from: p10 */
/* compiled from: BiometricErrorData */
public class p10 {

    /* renamed from: a */
    public final int f16258a;

    /* renamed from: b */
    public final CharSequence f16259b;

    public p10(int i, CharSequence charSequence) {
        this.f16258a = i;
        this.f16259b = charSequence;
    }

    /* renamed from: a */
    public static String m24459a(CharSequence charSequence) {
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* renamed from: b */
    public int mo24314b() {
        return this.f16258a;
    }

    /* renamed from: c */
    public CharSequence mo24315c() {
        return this.f16259b;
    }

    /* renamed from: d */
    public final boolean mo24316d(CharSequence charSequence) {
        String a = m24459a(this.f16259b);
        String a2 = m24459a(charSequence);
        if ((a != null || a2 != null) && (a == null || !a.equals(a2))) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof p10)) {
            return false;
        }
        p10 p10 = (p10) obj;
        if (this.f16258a != p10.f16258a || !mo24316d(p10.f16259b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f16258a), m24459a(this.f16259b)});
    }
}
