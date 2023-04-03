package p000;

import android.graphics.drawable.Animatable;

/* renamed from: wq2 */
/* compiled from: ImageLoadingTimeControllerListener */
public class wq2 extends C2931ny {

    /* renamed from: b */
    public long f19216b = -1;

    /* renamed from: c */
    public long f19217c = -1;

    /* renamed from: d */
    public xq2 f19218d;

    public wq2(xq2 xq2) {
        this.f19218d = xq2;
    }

    /* renamed from: d */
    public void mo13247d(String str, Object obj, Animatable animatable) {
        long currentTimeMillis = System.currentTimeMillis();
        this.f19217c = currentTimeMillis;
        xq2 xq2 = this.f19218d;
        if (xq2 != null) {
            xq2.mo26624a(currentTimeMillis - this.f19216b);
        }
    }

    /* renamed from: e */
    public void mo20420e(String str, Object obj) {
        this.f19216b = System.currentTimeMillis();
    }
}
