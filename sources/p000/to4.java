package p000;

import android.content.Context;
import com.facebook.common.internal.ImmutableList;
import java.util.Set;

/* renamed from: to4 */
/* compiled from: PipelineDraweeControllerBuilderSupplier */
public class to4 implements td6<so4> {

    /* renamed from: a */
    public final Context f18200a;

    /* renamed from: b */
    public final lr2 f18201b;

    /* renamed from: c */
    public final uo4 f18202c;

    /* renamed from: d */
    public final Set<mt0> f18203d;

    /* renamed from: e */
    public final Set<lt0> f18204e;

    /* renamed from: f */
    public final fr2 f18205f;

    public to4(Context context, zj1 zj1) {
        this(context, pr2.m25146l(), zj1);
    }

    /* renamed from: a */
    public so4 get() {
        return new so4(this.f18200a, this.f18202c, this.f18201b, this.f18203d, this.f18204e).mo25927J(this.f18205f);
    }

    public to4(Context context, pr2 pr2, zj1 zj1) {
        this(context, pr2, (Set<mt0>) null, (Set<lt0>) null, zj1);
    }

    public to4(Context context, pr2 pr2, Set<mt0> set, Set<lt0> set2, zj1 zj1) {
        this.f18200a = context;
        lr2 j = pr2.mo24770j();
        this.f18201b = j;
        uo4 uo4 = new uo4();
        this.f18202c = uo4;
        uo4.mo26837a(context.getResources(), ab1.m175b(), pr2.mo24762b(context), j37.m19948g(), j.mo22932c(), (ImmutableList<lj1>) null, (td6<Boolean>) null);
        this.f18203d = set;
        this.f18204e = set2;
        this.f18205f = null;
    }
}
