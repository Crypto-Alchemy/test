package p000;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: lk7 */
/* compiled from: WebvttCssStyle */
public final class lk7 {

    /* renamed from: a */
    public String f14543a = "";

    /* renamed from: b */
    public String f14544b = "";

    /* renamed from: c */
    public Set<String> f14545c = Collections.emptySet();

    /* renamed from: d */
    public String f14546d = "";

    /* renamed from: e */
    public String f14547e = null;

    /* renamed from: f */
    public int f14548f;

    /* renamed from: g */
    public boolean f14549g = false;

    /* renamed from: h */
    public int f14550h;

    /* renamed from: i */
    public boolean f14551i = false;

    /* renamed from: j */
    public int f14552j = -1;

    /* renamed from: k */
    public int f14553k = -1;

    /* renamed from: l */
    public int f14554l = -1;

    /* renamed from: m */
    public int f14555m = -1;

    /* renamed from: n */
    public int f14556n = -1;

    /* renamed from: o */
    public float f14557o;

    /* renamed from: p */
    public int f14558p = -1;

    /* renamed from: q */
    public boolean f14559q = false;

    /* renamed from: B */
    public static int m21494B(int i, String str, String str2, int i2) {
        if (str.isEmpty() || i == -1) {
            return i;
        }
        if (str.equals(str2)) {
            return i + i2;
        }
        return -1;
    }

    /* renamed from: A */
    public lk7 mo22788A(boolean z) {
        this.f14553k = z ? 1 : 0;
        return this;
    }

    /* renamed from: a */
    public int mo22789a() {
        if (this.f14551i) {
            return this.f14550h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    /* renamed from: b */
    public boolean mo22790b() {
        return this.f14559q;
    }

    /* renamed from: c */
    public int mo22791c() {
        if (this.f14549g) {
            return this.f14548f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    /* renamed from: d */
    public String mo22792d() {
        return this.f14547e;
    }

    /* renamed from: e */
    public float mo22793e() {
        return this.f14557o;
    }

    /* renamed from: f */
    public int mo22794f() {
        return this.f14556n;
    }

    /* renamed from: g */
    public int mo22795g() {
        return this.f14558p;
    }

    /* renamed from: h */
    public int mo22796h(String str, String str2, Set<String> set, String str3) {
        if (this.f14543a.isEmpty() && this.f14544b.isEmpty() && this.f14545c.isEmpty() && this.f14546d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int B = m21494B(m21494B(m21494B(0, this.f14543a, str, 1073741824), this.f14544b, str2, 2), this.f14546d, str3, 4);
        if (B == -1 || !set.containsAll(this.f14545c)) {
            return 0;
        }
        return B + (this.f14545c.size() * 4);
    }

    /* renamed from: i */
    public int mo22797i() {
        int i;
        int i2 = this.f14554l;
        if (i2 == -1 && this.f14555m == -1) {
            return -1;
        }
        int i3 = 0;
        if (i2 == 1) {
            i = 1;
        } else {
            i = 0;
        }
        if (this.f14555m == 1) {
            i3 = 2;
        }
        return i | i3;
    }

    /* renamed from: j */
    public boolean mo22798j() {
        return this.f14551i;
    }

    /* renamed from: k */
    public boolean mo22799k() {
        return this.f14549g;
    }

    /* renamed from: l */
    public boolean mo22800l() {
        if (this.f14552j == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public boolean mo22801m() {
        if (this.f14553k == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public lk7 mo22802n(int i) {
        this.f14550h = i;
        this.f14551i = true;
        return this;
    }

    /* renamed from: o */
    public lk7 mo22803o(boolean z) {
        this.f14554l = z ? 1 : 0;
        return this;
    }

    /* renamed from: p */
    public lk7 mo22804p(boolean z) {
        this.f14559q = z;
        return this;
    }

    /* renamed from: q */
    public lk7 mo22805q(int i) {
        this.f14548f = i;
        this.f14549g = true;
        return this;
    }

    /* renamed from: r */
    public lk7 mo22806r(String str) {
        String str2;
        if (str == null) {
            str2 = null;
        } else {
            str2 = C5876gr.m44841e(str);
        }
        this.f14547e = str2;
        return this;
    }

    /* renamed from: s */
    public lk7 mo22807s(float f) {
        this.f14557o = f;
        return this;
    }

    /* renamed from: t */
    public lk7 mo22808t(int i) {
        this.f14556n = i;
        return this;
    }

    /* renamed from: u */
    public lk7 mo22809u(boolean z) {
        this.f14555m = z ? 1 : 0;
        return this;
    }

    /* renamed from: v */
    public lk7 mo22810v(int i) {
        this.f14558p = i;
        return this;
    }

    /* renamed from: w */
    public void mo22811w(String[] strArr) {
        this.f14545c = new HashSet(Arrays.asList(strArr));
    }

    /* renamed from: x */
    public void mo22812x(String str) {
        this.f14543a = str;
    }

    /* renamed from: y */
    public void mo22813y(String str) {
        this.f14544b = str;
    }

    /* renamed from: z */
    public void mo22814z(String str) {
        this.f14546d = str;
    }
}
