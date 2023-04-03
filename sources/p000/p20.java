package p000;

import android.util.Pair;
import com.facebook.imagepipeline.request.ImageRequest;

/* renamed from: p20 */
/* compiled from: BitmapMemoryCacheKeyMultiplexProducer */
public class p20 extends g04<Pair<f80, ImageRequest.RequestLevel>, nh0<kh0>> {

    /* renamed from: f */
    public final g80 f16260f;

    public p20(g80 g80, vv4 vv4) {
        super(vv4, "BitmapMemoryCacheKeyMultiplexProducer", "multiplex_bmp_cnt");
        this.f16260f = g80;
    }

    /* renamed from: k */
    public nh0<kh0> mo18868f(nh0<kh0> nh0) {
        return nh0.m23176f(nh0);
    }

    /* renamed from: l */
    public Pair<f80, ImageRequest.RequestLevel> mo18869i(wv4 wv4) {
        return Pair.create(this.f16260f.mo71a(wv4.mo20286i(), wv4.mo20275a()), wv4.mo20291n());
    }
}
