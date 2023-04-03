package p000;

import com.github.mikephil.charting.utils.Utils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.web3j.ens.contracts.generated.PublicResolver;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00052\u00020\u0001:\u0001\nB\u0017\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\u0010"}, mo44877d2 = {"Lvg4;", "Lcl0;", "", "component", "", "e", "d", "", "v", "i", "a", "", "name", "id", "<init>", "(Ljava/lang/String;I)V", "ui-graphics_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: vg4 */
/* compiled from: Oklab.kt */
public final class vg4 extends cl0 {

    /* renamed from: e */
    public static final C3486a f18785e = new C3486a((DefaultConstructorMarker) null);

    /* renamed from: f */
    public static final float[] f18786f;

    /* renamed from: g */
    public static final float[] f18787g;

    /* renamed from: h */
    public static final float[] f18788h;

    /* renamed from: i */
    public static final float[] f18789i;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\n"}, mo44877d2 = {"Lvg4$a;", "", "", "InverseM1", "[F", "InverseM2", "M1", "M2", "<init>", "()V", "ui-graphics_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: vg4$a */
    /* compiled from: Oklab.kt */
    public static final class C3486a {
        public C3486a() {
        }

        public /* synthetic */ C3486a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        float[] b = C2651kb.f14024b.mo22242a().mo22238b();
        jq2 jq2 = jq2.f13799a;
        float[] k = dl0.m15160k(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, dl0.m15154e(b, jq2.mo22043b().mo26501c(), jq2.mo22046e().mo26501c()));
        f18786f = k;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f18787g = fArr;
        f18788h = dl0.m15159j(k);
        f18789i = dl0.m15159j(fArr);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vg4(String str, int i) {
        super(str, al0.f181a.mo357a(), i, (DefaultConstructorMarker) null);
        vx2.m53591g(str, PublicResolver.FUNC_NAME);
    }

    /* renamed from: a */
    public float[] mo3284a(float[] fArr) {
        vx2.m53591g(fArr, "v");
        dl0.m15162m(f18786f, fArr);
        double d = (double) 0.33333334f;
        fArr[0] = Math.signum(fArr[0]) * ((float) Math.pow((double) Math.abs(fArr[0]), d));
        fArr[1] = Math.signum(fArr[1]) * ((float) Math.pow((double) Math.abs(fArr[1]), d));
        fArr[2] = Math.signum(fArr[2]) * ((float) Math.pow((double) Math.abs(fArr[2]), d));
        dl0.m15162m(f18787g, fArr);
        return fArr;
    }

    /* renamed from: d */
    public float mo3285d(int i) {
        return i == 0 ? 1.0f : 0.5f;
    }

    /* renamed from: e */
    public float mo3286e(int i) {
        if (i == 0) {
            return Utils.FLOAT_EPSILON;
        }
        return -0.5f;
    }

    /* renamed from: i */
    public float[] mo3290i(float[] fArr) {
        vx2.m53591g(fArr, "v");
        fArr[0] = d75.m43388j(fArr[0], Utils.FLOAT_EPSILON, 1.0f);
        fArr[1] = d75.m43388j(fArr[1], -0.5f, 0.5f);
        fArr[2] = d75.m43388j(fArr[2], -0.5f, 0.5f);
        dl0.m15162m(f18789i, fArr);
        float f = fArr[0];
        fArr[0] = f * f * f;
        float f2 = fArr[1];
        fArr[1] = f2 * f2 * f2;
        float f3 = fArr[2];
        fArr[2] = f3 * f3 * f3;
        dl0.m15162m(f18788h, fArr);
        return fArr;
    }
}
