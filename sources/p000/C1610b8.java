package p000;

import kotlin.Metadata;
import org.web3j.ens.contracts.generated.PublicResolver;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\r\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0004R\"\u0010\u0003\u001a\u00020\u00028\u0004@\u0004X.¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, mo44877d2 = {"Lb8;", "Lg8;", "", "text", "Lr37;", "e", "", "start", "end", "", "c", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "f", "(Ljava/lang/String;)V", "b", "[I", "segment", "<init>", "()V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: b8 */
/* compiled from: AccessibilityIterators.android.kt */
public abstract class C1610b8 implements C2345g8 {

    /* renamed from: a */
    public String f7987a;

    /* renamed from: b */
    public final int[] f7988b = new int[2];

    /* renamed from: c */
    public final int[] mo11429c(int i, int i2) {
        if (i < 0 || i2 < 0 || i == i2) {
            return null;
        }
        int[] iArr = this.f7988b;
        iArr[0] = i;
        iArr[1] = i2;
        return iArr;
    }

    /* renamed from: d */
    public final String mo11430d() {
        String str = this.f7987a;
        if (str != null) {
            return str;
        }
        vx2.m53605u(PublicResolver.FUNC_TEXT);
        return null;
    }

    /* renamed from: e */
    public void mo11431e(String str) {
        vx2.m53591g(str, PublicResolver.FUNC_TEXT);
        mo11432f(str);
    }

    /* renamed from: f */
    public final void mo11432f(String str) {
        vx2.m53591g(str, "<set-?>");
        this.f7987a = str;
    }
}
