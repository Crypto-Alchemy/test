package p000;

import android.media.MediaDrm;
import androidx.media3.exoplayer.drm.C0921g;
import androidx.media3.exoplayer.drm.C0926h;

/* renamed from: zb2 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class zb2 implements MediaDrm.OnEventListener {

    /* renamed from: a */
    public final /* synthetic */ C0926h f20526a;

    /* renamed from: b */
    public final /* synthetic */ C0921g.C0923b f20527b;

    public /* synthetic */ zb2(C0926h hVar, C0921g.C0923b bVar) {
        this.f20526a = hVar;
        this.f20527b = bVar;
    }

    public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
        this.f20526a.m6674z(this.f20527b, mediaDrm, bArr, i, i2, bArr2);
    }
}
