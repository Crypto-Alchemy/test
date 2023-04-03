package p000;

import com.github.mikephil.charting.utils.Utils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.web3j.ens.contracts.generated.PublicResolver;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00052\u00020\u0001:\u0001\nB\u0017\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\u0010"}, mo44877d2 = {"Ltd3;", "Lcl0;", "", "component", "", "e", "d", "", "v", "i", "a", "", "name", "id", "<init>", "(Ljava/lang/String;I)V", "ui-graphics_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: td3 */
/* compiled from: Lab.kt */
public final class td3 extends cl0 {

    /* renamed from: e */
    public static final C3354a f18113e = new C3354a((DefaultConstructorMarker) null);

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\n"}, mo44877d2 = {"Ltd3$a;", "", "", "A", "F", "B", "C", "D", "<init>", "()V", "ui-graphics_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: td3$a */
    /* compiled from: Lab.kt */
    public static final class C3354a {
        public C3354a() {
        }

        public /* synthetic */ C3354a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public td3(String str, int i) {
        super(str, al0.f181a.mo357a(), i, (DefaultConstructorMarker) null);
        vx2.m53591g(str, PublicResolver.FUNC_NAME);
    }

    /* renamed from: a */
    public float[] mo3284a(float[] fArr) {
        float f;
        float f2;
        float f3;
        float[] fArr2 = fArr;
        vx2.m53591g(fArr2, "v");
        float f4 = fArr2[0];
        jq2 jq2 = jq2.f13799a;
        float f5 = f4 / jq2.mo22044c()[0];
        float f6 = fArr2[1] / jq2.mo22044c()[1];
        float f7 = fArr2[2] / jq2.mo22044c()[2];
        if (f5 > 0.008856452f) {
            f = (float) Math.pow((double) f5, (double) 0.33333334f);
        } else {
            f = (f5 * 7.787037f) + 0.13793103f;
        }
        if (f6 > 0.008856452f) {
            f2 = (float) Math.pow((double) f6, (double) 0.33333334f);
        } else {
            f2 = (f6 * 7.787037f) + 0.13793103f;
        }
        if (f7 > 0.008856452f) {
            f3 = (float) Math.pow((double) f7, (double) 0.33333334f);
        } else {
            f3 = (f7 * 7.787037f) + 0.13793103f;
        }
        fArr2[0] = d75.m43388j((116.0f * f2) - 16.0f, Utils.FLOAT_EPSILON, 100.0f);
        fArr2[1] = d75.m43388j((f - f2) * 500.0f, -128.0f, 128.0f);
        fArr2[2] = d75.m43388j((f2 - f3) * 200.0f, -128.0f, 128.0f);
        return fArr2;
    }

    /* renamed from: d */
    public float mo3285d(int i) {
        return i == 0 ? 100.0f : 128.0f;
    }

    /* renamed from: e */
    public float mo3286e(int i) {
        if (i == 0) {
            return Utils.FLOAT_EPSILON;
        }
        return -128.0f;
    }

    /* renamed from: i */
    public float[] mo3290i(float[] fArr) {
        float f;
        float f2;
        float f3;
        vx2.m53591g(fArr, "v");
        fArr[0] = d75.m43388j(fArr[0], Utils.FLOAT_EPSILON, 100.0f);
        fArr[1] = d75.m43388j(fArr[1], -128.0f, 128.0f);
        float j = d75.m43388j(fArr[2], -128.0f, 128.0f);
        fArr[2] = j;
        float f4 = (fArr[0] + 16.0f) / 116.0f;
        float f5 = (fArr[1] * 0.002f) + f4;
        float f6 = f4 - (j * 0.005f);
        if (f5 > 0.20689656f) {
            f = f5 * f5 * f5;
        } else {
            f = (f5 - 0.13793103f) * 0.12841855f;
        }
        if (f4 > 0.20689656f) {
            f2 = f4 * f4 * f4;
        } else {
            f2 = (f4 - 0.13793103f) * 0.12841855f;
        }
        if (f6 > 0.20689656f) {
            f3 = f6 * f6 * f6;
        } else {
            f3 = (f6 - 0.13793103f) * 0.12841855f;
        }
        jq2 jq2 = jq2.f13799a;
        fArr[0] = f * jq2.mo22044c()[0];
        fArr[1] = f2 * jq2.mo22044c()[1];
        fArr[2] = f3 * jq2.mo22044c()[2];
        return fArr;
    }
}
