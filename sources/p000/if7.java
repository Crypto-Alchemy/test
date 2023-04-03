package p000;

import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: if7 */
/* compiled from: Visibility.kt */
public abstract class if7 {

    /* renamed from: a */
    public final String f38382a;

    /* renamed from: b */
    public final boolean f38383b;

    public if7(String str, boolean z) {
        vx2.m53591g(str, PublicResolver.FUNC_NAME);
        this.f38382a = str;
        this.f38383b = z;
    }

    /* renamed from: a */
    public Integer mo52468a(if7 if7) {
        vx2.m53591g(if7, "visibility");
        return hf7.f38205a.mo52196a(this, if7);
    }

    /* renamed from: b */
    public String mo52198b() {
        return this.f38382a;
    }

    /* renamed from: c */
    public final boolean mo52469c() {
        return this.f38383b;
    }

    /* renamed from: d */
    public if7 mo52470d() {
        return this;
    }

    public final String toString() {
        return mo52198b();
    }
}
