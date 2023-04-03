package p000;

import com.google.android.gms.common.api.C4013a;
import java.util.ArrayList;

/* renamed from: oy7 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class oy7 extends uy7 {

    /* renamed from: d */
    public final ArrayList f32499d;

    /* renamed from: e */
    public final /* synthetic */ vy7 f32500e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public oy7(vy7 vy7, ArrayList arrayList) {
        super(vy7, (ty7) null);
        this.f32500e = vy7;
        this.f32499d = arrayList;
    }

    /* renamed from: a */
    public final void mo46266a() {
        vy7 vy7 = this.f32500e;
        vy7.f35193a.f31924n.f30187p = vy7.m53637x(vy7);
        ArrayList arrayList = this.f32499d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            vy7 vy72 = this.f32500e;
            ((C4013a.C4021f) arrayList.get(i)).mo30553m(vy72.f35207o, vy72.f35193a.f31924n.f30187p);
        }
    }
}
