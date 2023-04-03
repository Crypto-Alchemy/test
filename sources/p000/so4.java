package p000;

import android.content.Context;
import android.net.Uri;
import com.facebook.common.internal.ImmutableList;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import java.util.Set;

/* renamed from: so4 */
/* compiled from: PipelineDraweeControllerBuilder */
public class so4 extends AbstractDraweeControllerBuilder<so4, ImageRequest, nh0<kh0>, vq2> {

    /* renamed from: u */
    public final lr2 f17764u;

    /* renamed from: v */
    public final uo4 f17765v;

    /* renamed from: w */
    public ImmutableList<lj1> f17766w;

    /* renamed from: x */
    public ar2 f17767x;

    /* renamed from: y */
    public fr2 f17768y;

    /* renamed from: so4$a */
    /* compiled from: PipelineDraweeControllerBuilder */
    public static /* synthetic */ class C3294a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f17769a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.facebook.drawee.controller.AbstractDraweeControllerBuilder$CacheLevel[] r0 = com.facebook.drawee.controller.AbstractDraweeControllerBuilder.CacheLevel.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f17769a = r0
                com.facebook.drawee.controller.AbstractDraweeControllerBuilder$CacheLevel r1 = com.facebook.drawee.controller.AbstractDraweeControllerBuilder.CacheLevel.FULL_FETCH     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f17769a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.drawee.controller.AbstractDraweeControllerBuilder$CacheLevel r1 = com.facebook.drawee.controller.AbstractDraweeControllerBuilder.CacheLevel.DISK_CACHE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f17769a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facebook.drawee.controller.AbstractDraweeControllerBuilder$CacheLevel r1 = com.facebook.drawee.controller.AbstractDraweeControllerBuilder.CacheLevel.BITMAP_MEMORY_CACHE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.so4.C3294a.<clinit>():void");
        }
    }

    public so4(Context context, uo4 uo4, lr2 lr2, Set<mt0> set, Set<lt0> set2) {
        super(context, set, set2);
        this.f17764u = lr2;
        this.f17765v = uo4;
    }

    /* renamed from: E */
    public static ImageRequest.RequestLevel m27052E(AbstractDraweeControllerBuilder.CacheLevel cacheLevel) {
        int i = C3294a.f17769a[cacheLevel.ordinal()];
        if (i == 1) {
            return ImageRequest.RequestLevel.FULL_FETCH;
        }
        if (i == 2) {
            return ImageRequest.RequestLevel.DISK_CACHE;
        }
        if (i == 3) {
            return ImageRequest.RequestLevel.BITMAP_MEMORY_CACHE;
        }
        throw new RuntimeException("Cache level" + cacheLevel + "is not supported. ");
    }

    /* renamed from: F */
    public final f80 mo25923F() {
        ImageRequest imageRequest = (ImageRequest) mo13234n();
        g80 d = this.f17764u.mo22933d();
        if (d == null || imageRequest == null) {
            return null;
        }
        if (imageRequest.mo13447k() != null) {
            return d.mo73c(imageRequest, mo13226f());
        }
        return d.mo71a(imageRequest, mo13226f());
    }

    /* renamed from: G */
    public z11<nh0<kh0>> mo13229i(ak1 ak1, String str, ImageRequest imageRequest, Object obj, AbstractDraweeControllerBuilder.CacheLevel cacheLevel) {
        return this.f17764u.mo22930a(imageRequest, obj, m27052E(cacheLevel), mo25925H(ak1), str);
    }

    /* renamed from: H */
    public je5 mo25925H(ak1 ak1) {
        if (ak1 instanceof ro4) {
            return ((ro4) ak1).mo25481p0();
        }
        return null;
    }

    /* renamed from: I */
    public ro4 mo13243w() {
        ro4 ro4;
        if (lc2.m21369d()) {
            lc2.m21366a("PipelineDraweeControllerBuilder#obtainController");
        }
        try {
            ak1 p = mo13236p();
            String e = AbstractDraweeControllerBuilder.m13354e();
            if (p instanceof ro4) {
                ro4 = (ro4) p;
            } else {
                ro4 = this.f17765v.mo26839c();
            }
            ro4.mo25483r0(mo13244x(ro4, e), e, mo25923F(), mo13226f(), this.f17766w, this.f17767x);
            ro4.mo25484s0(this.f17768y, this, ud6.f18435b);
            return ro4;
        } finally {
            if (lc2.m21369d()) {
                lc2.m21367b();
            }
        }
    }

    /* renamed from: J */
    public so4 mo25927J(fr2 fr2) {
        this.f17768y = fr2;
        return (so4) mo13238r();
    }

    /* renamed from: K */
    public so4 mo20334a(Uri uri) {
        if (uri == null) {
            return (so4) super.mo13219B(null);
        }
        return (so4) super.mo13219B(ImageRequestBuilder.m13667u(uri).mo13473I(xh5.m30105b()).mo13478a());
    }
}
