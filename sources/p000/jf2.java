package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.web3j.ens.contracts.generated.PublicResolver;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0005¨\u0006\r"}, mo44877d2 = {"Ljf2;", "Lkk6;", "", "toString", "x", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "name", "y", "fontFamilyName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "ui-text_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: jf2 */
/* compiled from: FontFamily.kt */
public final class jf2 extends kk6 {

    /* renamed from: x */
    public final String f13597x;

    /* renamed from: y */
    public final String f13598y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jf2(String str, String str2) {
        super((DefaultConstructorMarker) null);
        vx2.m53591g(str, PublicResolver.FUNC_NAME);
        vx2.m53591g(str2, "fontFamilyName");
        this.f13597x = str;
        this.f13598y = str2;
    }

    /* renamed from: e */
    public final String mo21821e() {
        return this.f13597x;
    }

    public String toString() {
        return this.f13598y;
    }
}
