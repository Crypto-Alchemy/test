package p000;

import com.squareup.moshi.C5397f;
import com.squareup.moshi.JsonDataException;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: q73 */
/* compiled from: JsonWriter */
public abstract class q73 implements Closeable, Flushable {

    /* renamed from: a */
    public int f32957a = 0;

    /* renamed from: d */
    public int[] f32958d = new int[32];

    /* renamed from: e */
    public String[] f32959e = new String[32];

    /* renamed from: g */
    public int[] f32960g = new int[32];

    /* renamed from: k */
    public String f32961k;

    /* renamed from: r */
    public boolean f32962r;

    /* renamed from: s */
    public boolean f32963s;

    /* renamed from: x */
    public boolean f32964x;

    /* renamed from: y */
    public int f32965y = -1;

    /* renamed from: l */
    public static q73 m50360l(v40 v40) {
        return new i73(v40);
    }

    /* renamed from: A */
    public abstract q73 mo39389A(String str) throws IOException;

    /* renamed from: C */
    public abstract q73 mo39390C(boolean z) throws IOException;

    /* renamed from: G */
    public abstract v40 mo39391G() throws IOException;

    /* renamed from: a */
    public abstract q73 mo39393a() throws IOException;

    /* renamed from: b */
    public final int mo46985b() {
        int m = mo46991m();
        if (m == 5 || m == 3 || m == 2 || m == 1) {
            int i = this.f32965y;
            this.f32965y = this.f32957a;
            return i;
        }
        throw new IllegalStateException("Nesting problem.");
    }

    /* renamed from: c */
    public abstract q73 mo39394c() throws IOException;

    /* renamed from: d */
    public final boolean mo46986d() {
        int i = this.f32957a;
        int[] iArr = this.f32958d;
        if (i != iArr.length) {
            return false;
        }
        if (i != 256) {
            this.f32958d = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f32959e;
            this.f32959e = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f32960g;
            this.f32960g = Arrays.copyOf(iArr2, iArr2.length * 2);
            if (!(this instanceof C5397f)) {
                return true;
            }
            C5397f fVar = (C5397f) this;
            Object[] objArr = fVar.f26724A;
            fVar.f26724A = Arrays.copyOf(objArr, objArr.length * 2);
            return true;
        }
        throw new JsonDataException("Nesting too deep at " + getPath() + ": circular reference?");
    }

    /* renamed from: e */
    public abstract q73 mo39396e() throws IOException;

    /* renamed from: f */
    public final void mo46987f(int i) {
        this.f32965y = i;
    }

    /* renamed from: g */
    public abstract q73 mo39398g() throws IOException;

    public final String getPath() {
        return v63.m53288a(this.f32957a, this.f32958d, this.f32959e, this.f32960g);
    }

    /* renamed from: h */
    public final boolean mo46989h() {
        return this.f32963s;
    }

    /* renamed from: i */
    public final boolean mo46990i() {
        return this.f32962r;
    }

    /* renamed from: j */
    public abstract q73 mo39399j(String str) throws IOException;

    /* renamed from: k */
    public abstract q73 mo39400k() throws IOException;

    /* renamed from: m */
    public final int mo46991m() {
        int i = this.f32957a;
        if (i != 0) {
            return this.f32958d[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: n */
    public final void mo46992n() throws IOException {
        int m = mo46991m();
        if (m == 5 || m == 3) {
            this.f32964x = true;
            return;
        }
        throw new IllegalStateException("Nesting problem.");
    }

    /* renamed from: p */
    public final void mo46993p(int i) {
        int[] iArr = this.f32958d;
        int i2 = this.f32957a;
        this.f32957a = i2 + 1;
        iArr[i2] = i;
    }

    /* renamed from: q */
    public final void mo46994q(int i) {
        this.f32958d[this.f32957a - 1] = i;
    }

    /* renamed from: s */
    public final void mo46995s(boolean z) {
        this.f32962r = z;
    }

    /* renamed from: v */
    public final void mo46996v(boolean z) {
        this.f32963s = z;
    }

    /* renamed from: x */
    public abstract q73 mo39401x(double d) throws IOException;

    /* renamed from: y */
    public abstract q73 mo39402y(long j) throws IOException;

    /* renamed from: z */
    public abstract q73 mo39403z(Number number) throws IOException;
}
