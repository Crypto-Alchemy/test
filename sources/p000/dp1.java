package p000;

import android.util.Pair;
import com.facebook.imagepipeline.request.ImageRequest;

/* renamed from: dp1 */
/* compiled from: EncodedCacheKeyMultiplexProducer */
public class dp1 extends g04<Pair<f80, ImageRequest.RequestLevel>, gp1> {

    /* renamed from: f */
    public final g80 f10806f;

    public dp1(g80 g80, boolean z, vv4 vv4) {
        super(vv4, "EncodedCacheKeyMultiplexProducer", "multiplex_enc_cnt", z);
        this.f10806f = g80;
    }

    /* renamed from: k */
    public gp1 mo18868f(gp1 gp1) {
        return gp1.m18284b(gp1);
    }

    /* renamed from: l */
    public Pair<f80, ImageRequest.RequestLevel> mo18869i(wv4 wv4) {
        return Pair.create(this.f10806f.mo74d(wv4.mo20286i(), wv4.mo20275a()), wv4.mo20291n());
    }
}
