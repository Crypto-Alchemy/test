package p000;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.p009io.ContentReference;

/* renamed from: po2 */
/* compiled from: IOContext */
public class po2 {

    /* renamed from: a */
    public final ContentReference f16587a;
    @Deprecated

    /* renamed from: b */
    public final Object f16588b;

    /* renamed from: c */
    public JsonEncoding f16589c;

    /* renamed from: d */
    public final boolean f16590d;

    /* renamed from: e */
    public final r40 f16591e;

    /* renamed from: f */
    public byte[] f16592f;

    /* renamed from: g */
    public byte[] f16593g;

    /* renamed from: h */
    public byte[] f16594h;

    /* renamed from: i */
    public char[] f16595i;

    /* renamed from: j */
    public char[] f16596j;

    /* renamed from: k */
    public char[] f16597k;

    public po2(r40 r40, ContentReference contentReference, boolean z) {
        this.f16591e = r40;
        this.f16587a = contentReference;
        this.f16588b = contentReference.getRawContent();
        this.f16590d = z;
    }

    /* renamed from: a */
    public final void mo24731a(Object obj) {
        if (obj != null) {
            throw new IllegalStateException("Trying to call same allocXxx() method second time");
        }
    }

    /* renamed from: b */
    public final void mo24732b(byte[] bArr, byte[] bArr2) {
        if (bArr != bArr2 && bArr.length < bArr2.length) {
            throw mo24752v();
        }
    }

    /* renamed from: c */
    public final void mo24733c(char[] cArr, char[] cArr2) {
        if (cArr != cArr2 && cArr.length < cArr2.length) {
            throw mo24752v();
        }
    }

    /* renamed from: d */
    public byte[] mo24734d() {
        mo24731a(this.f16594h);
        byte[] a = this.f16591e.mo25316a(3);
        this.f16594h = a;
        return a;
    }

    /* renamed from: e */
    public char[] mo24735e() {
        mo24731a(this.f16596j);
        char[] c = this.f16591e.mo25318c(1);
        this.f16596j = c;
        return c;
    }

    /* renamed from: f */
    public char[] mo24736f(int i) {
        mo24731a(this.f16597k);
        char[] d = this.f16591e.mo25319d(3, i);
        this.f16597k = d;
        return d;
    }

    /* renamed from: g */
    public byte[] mo24737g() {
        mo24731a(this.f16592f);
        byte[] a = this.f16591e.mo25316a(0);
        this.f16592f = a;
        return a;
    }

    /* renamed from: h */
    public char[] mo24738h() {
        mo24731a(this.f16595i);
        char[] c = this.f16591e.mo25318c(0);
        this.f16595i = c;
        return c;
    }

    /* renamed from: i */
    public char[] mo24739i(int i) {
        mo24731a(this.f16595i);
        char[] d = this.f16591e.mo25319d(0, i);
        this.f16595i = d;
        return d;
    }

    /* renamed from: j */
    public byte[] mo24740j() {
        mo24731a(this.f16593g);
        byte[] a = this.f16591e.mo25316a(1);
        this.f16593g = a;
        return a;
    }

    /* renamed from: k */
    public en6 mo24741k() {
        return new en6(this.f16591e);
    }

    /* renamed from: l */
    public ContentReference mo24742l() {
        return this.f16587a;
    }

    /* renamed from: m */
    public JsonEncoding mo24743m() {
        return this.f16589c;
    }

    /* renamed from: n */
    public boolean mo24744n() {
        return this.f16590d;
    }

    /* renamed from: o */
    public void mo24745o(byte[] bArr) {
        if (bArr != null) {
            mo24732b(bArr, this.f16594h);
            this.f16594h = null;
            this.f16591e.mo25324i(3, bArr);
        }
    }

    /* renamed from: p */
    public void mo24746p(char[] cArr) {
        if (cArr != null) {
            mo24733c(cArr, this.f16596j);
            this.f16596j = null;
            this.f16591e.mo25325j(1, cArr);
        }
    }

    /* renamed from: q */
    public void mo24747q(char[] cArr) {
        if (cArr != null) {
            mo24733c(cArr, this.f16597k);
            this.f16597k = null;
            this.f16591e.mo25325j(3, cArr);
        }
    }

    /* renamed from: r */
    public void mo24748r(byte[] bArr) {
        if (bArr != null) {
            mo24732b(bArr, this.f16592f);
            this.f16592f = null;
            this.f16591e.mo25324i(0, bArr);
        }
    }

    /* renamed from: s */
    public void mo24749s(char[] cArr) {
        if (cArr != null) {
            mo24733c(cArr, this.f16595i);
            this.f16595i = null;
            this.f16591e.mo25325j(0, cArr);
        }
    }

    /* renamed from: t */
    public void mo24750t(byte[] bArr) {
        if (bArr != null) {
            mo24732b(bArr, this.f16593g);
            this.f16593g = null;
            this.f16591e.mo25324i(1, bArr);
        }
    }

    /* renamed from: u */
    public void mo24751u(JsonEncoding jsonEncoding) {
        this.f16589c = jsonEncoding;
    }

    /* renamed from: v */
    public final IllegalArgumentException mo24752v() {
        return new IllegalArgumentException("Trying to release buffer smaller than original");
    }
}
