package p000;

import java.util.ArrayList;
import java.util.Map;

/* renamed from: oy */
/* compiled from: BaseDataSource */
public abstract class C3009oy implements x11 {

    /* renamed from: a */
    public final boolean f16225a;

    /* renamed from: b */
    public final ArrayList<ov6> f16226b = new ArrayList<>(1);

    /* renamed from: c */
    public int f16227c;

    /* renamed from: d */
    public d21 f16228d;

    public C3009oy(boolean z) {
        this.f16225a = z;
    }

    /* renamed from: d */
    public /* synthetic */ Map mo7616d() {
        return w11.m29231a(this);
    }

    /* renamed from: g */
    public final void mo7617g(ov6 ov6) {
        C2725kr.m20985e(ov6);
        if (!this.f16226b.contains(ov6)) {
            this.f16226b.add(ov6);
            this.f16227c++;
        }
    }

    /* renamed from: o */
    public final void mo24279o(int i) {
        d21 d21 = (d21) w67.m29360j(this.f16228d);
        for (int i2 = 0; i2 < this.f16227c; i2++) {
            this.f16226b.get(i2).mo24124c(this, d21, this.f16225a, i);
        }
    }

    /* renamed from: p */
    public final void mo24280p() {
        d21 d21 = (d21) w67.m29360j(this.f16228d);
        for (int i = 0; i < this.f16227c; i++) {
            this.f16226b.get(i).mo24125f(this, d21, this.f16225a);
        }
        this.f16228d = null;
    }

    /* renamed from: q */
    public final void mo24281q(d21 d21) {
        for (int i = 0; i < this.f16227c; i++) {
            this.f16226b.get(i).mo24123b(this, d21, this.f16225a);
        }
    }

    /* renamed from: r */
    public final void mo24282r(d21 d21) {
        this.f16228d = d21;
        for (int i = 0; i < this.f16227c; i++) {
            this.f16226b.get(i).mo24126g(this, d21, this.f16225a);
        }
    }
}
