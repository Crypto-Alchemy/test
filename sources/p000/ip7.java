package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.web3j.ens.contracts.generated.PublicResolver;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¨\u0006\u0012"}, mo44877d2 = {"Lip7;", "Lcl0;", "", "component", "", "e", "d", "", "v", "i", "a", "x", "j", "", "name", "id", "<init>", "(Ljava/lang/String;I)V", "ui-graphics_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: ip7 */
/* compiled from: Xyz.kt */
public final class ip7 extends cl0 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ip7(String str, int i) {
        super(str, al0.f181a.mo359c(), i, (DefaultConstructorMarker) null);
        vx2.m53591g(str, PublicResolver.FUNC_NAME);
    }

    /* renamed from: a */
    public float[] mo3284a(float[] fArr) {
        vx2.m53591g(fArr, "v");
        fArr[0] = mo21608j(fArr[0]);
        fArr[1] = mo21608j(fArr[1]);
        fArr[2] = mo21608j(fArr[2]);
        return fArr;
    }

    /* renamed from: d */
    public float mo3285d(int i) {
        return 2.0f;
    }

    /* renamed from: e */
    public float mo3286e(int i) {
        return -2.0f;
    }

    /* renamed from: i */
    public float[] mo3290i(float[] fArr) {
        vx2.m53591g(fArr, "v");
        fArr[0] = mo21608j(fArr[0]);
        fArr[1] = mo21608j(fArr[1]);
        fArr[2] = mo21608j(fArr[2]);
        return fArr;
    }

    /* renamed from: j */
    public final float mo21608j(float f) {
        return d75.m43388j(f, -2.0f, 2.0f);
    }
}
