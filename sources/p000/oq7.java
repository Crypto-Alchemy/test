package p000;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.assetpacks.AssetPackException;
import com.google.android.play.core.assetpacks.C4468a;
import java.util.List;

/* renamed from: oq7 */
public class oq7<T> extends bx7 {

    /* renamed from: a */
    public final nv7<T> f32423a;

    /* renamed from: b */
    public final /* synthetic */ C4468a f32424b;

    public oq7(C4468a aVar, nv7<T> nv7) {
        this.f32424b = aVar;
        this.f32423a = nv7;
    }

    public oq7(C4468a aVar, nv7 nv7, byte[] bArr) {
        this(aVar, nv7);
    }

    public oq7(C4468a aVar, nv7 nv7, char[] cArr) {
        this(aVar, nv7);
    }

    public oq7(C4468a aVar, nv7 nv7, int[] iArr) {
        this(aVar, nv7);
    }

    /* renamed from: H */
    public final void mo43025H(int i) {
        this.f32424b.f24705c.mo42953b();
        C4468a.f24701f.mo46855d("onGetSession(%d)", Integer.valueOf(i));
    }

    /* renamed from: I */
    public void mo43026I(Bundle bundle) {
        this.f32424b.f24705c.mo42953b();
        C4468a.f24701f.mo46855d("onNotifySessionFailed(%d)", Integer.valueOf(bundle.getInt("session_id")));
    }

    /* renamed from: M */
    public void mo43027M() {
        this.f32424b.f24705c.mo42953b();
        C4468a.f24701f.mo46855d("onRemoveModule()", new Object[0]);
    }

    /* renamed from: N0 */
    public void mo43028N0(int i, Bundle bundle) {
        this.f32424b.f24705c.mo42953b();
        C4468a.f24701f.mo46855d("onStartDownload(%d)", Integer.valueOf(i));
    }

    /* renamed from: P */
    public void mo43029P(Bundle bundle) {
        this.f32424b.f24705c.mo42953b();
        C4468a.f24701f.mo46855d("onNotifyModuleCompleted(%s, sessionId=%d)", bundle.getString("module_name"), Integer.valueOf(bundle.getInt("session_id")));
    }

    /* renamed from: Z0 */
    public void mo43030Z0(Bundle bundle, Bundle bundle2) {
        this.f32424b.f24706d.mo42953b();
        C4468a.f24701f.mo46855d("onKeepAlive(%b)", Boolean.valueOf(bundle.getBoolean("keep_alive")));
    }

    /* renamed from: e1 */
    public void mo43031e1(Bundle bundle) {
        this.f32424b.f24705c.mo42953b();
        int i = bundle.getInt("error_code");
        C4468a.f24701f.mo46853b("onError(%d)", Integer.valueOf(i));
        this.f32423a.mo46238d(new AssetPackException(i));
    }

    /* renamed from: f1 */
    public void mo43032f1(Bundle bundle, Bundle bundle2) throws RemoteException {
        this.f32424b.f24705c.mo42953b();
        C4468a.f24701f.mo46855d("onGetChunkFileDescriptor", new Object[0]);
    }

    /* renamed from: h1 */
    public void mo43033h1(List<Bundle> list) {
        this.f32424b.f24705c.mo42953b();
        C4468a.f24701f.mo46855d("onGetSessionStates", new Object[0]);
    }

    /* renamed from: k1 */
    public void mo43034k1(Bundle bundle, Bundle bundle2) {
        this.f32424b.f24705c.mo42953b();
        C4468a.f24701f.mo46855d("onRequestDownloadInfo()", new Object[0]);
    }

    /* renamed from: o1 */
    public void mo43035o1() {
        this.f32424b.f24705c.mo42953b();
        C4468a.f24701f.mo46855d("onCancelDownloads()", new Object[0]);
    }

    /* renamed from: p */
    public final void mo43036p(int i) {
        this.f32424b.f24705c.mo42953b();
        C4468a.f24701f.mo46855d("onCancelDownload(%d)", Integer.valueOf(i));
    }

    /* renamed from: t0 */
    public void mo43037t0(Bundle bundle) {
        this.f32424b.f24705c.mo42953b();
        C4468a.f24701f.mo46855d("onNotifyChunkTransferred(%s, %s, %d, session=%d)", bundle.getString("module_name"), bundle.getString("slice_id"), Integer.valueOf(bundle.getInt("chunk_number")), Integer.valueOf(bundle.getInt("session_id")));
    }
}
