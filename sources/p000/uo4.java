package p000;

import android.content.res.Resources;
import com.facebook.common.internal.ImmutableList;
import java.util.concurrent.Executor;

/* renamed from: uo4 */
/* compiled from: PipelineDraweeControllerFactory */
public class uo4 {

    /* renamed from: a */
    public Resources f18548a;

    /* renamed from: b */
    public ab1 f18549b;

    /* renamed from: c */
    public lj1 f18550c;

    /* renamed from: d */
    public Executor f18551d;

    /* renamed from: e */
    public ys3<f80, kh0> f18552e;

    /* renamed from: f */
    public ImmutableList<lj1> f18553f;

    /* renamed from: g */
    public td6<Boolean> f18554g;

    /* renamed from: a */
    public void mo26837a(Resources resources, ab1 ab1, lj1 lj1, Executor executor, ys3<f80, kh0> ys3, ImmutableList<lj1> immutableList, td6<Boolean> td6) {
        this.f18548a = resources;
        this.f18549b = ab1;
        this.f18550c = lj1;
        this.f18551d = executor;
        this.f18552e = ys3;
        this.f18553f = immutableList;
        this.f18554g = td6;
    }

    /* renamed from: b */
    public ro4 mo26838b(Resources resources, ab1 ab1, lj1 lj1, Executor executor, ys3<f80, kh0> ys3, ImmutableList<lj1> immutableList) {
        return new ro4(resources, ab1, lj1, executor, ys3, immutableList);
    }

    /* renamed from: c */
    public ro4 mo26839c() {
        ro4 b = mo26838b(this.f18548a, this.f18549b, this.f18550c, this.f18551d, this.f18552e, this.f18553f);
        td6<Boolean> td6 = this.f18554g;
        if (td6 != null) {
            b.mo25472B0(td6.get().booleanValue());
        }
        return b;
    }
}
