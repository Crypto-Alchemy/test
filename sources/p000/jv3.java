package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.common.C0792h;
import androidx.media3.common.Metadata;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: jv3 */
/* compiled from: MetadataRenderer */
public final class jv3 extends C2580iz implements Handler.Callback {

    /* renamed from: I */
    public final dv3 f13878I;

    /* renamed from: L */
    public final iv3 f13879L;

    /* renamed from: M */
    public final Handler f13880M;

    /* renamed from: P */
    public final ev3 f13881P;

    /* renamed from: Q */
    public cv3 f13882Q;

    /* renamed from: U */
    public boolean f13883U;

    /* renamed from: X */
    public boolean f13884X;

    /* renamed from: Y */
    public long f13885Y;

    /* renamed from: Z */
    public long f13886Z;

    /* renamed from: e0 */
    public Metadata f13887e0;

    public jv3(iv3 iv3, Looper looper) {
        this(iv3, looper, dv3.f10900a);
    }

    /* renamed from: G */
    public void mo7133G() {
        this.f13887e0 = null;
        this.f13886Z = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        this.f13882Q = null;
    }

    /* renamed from: I */
    public void mo7135I(long j, boolean z) {
        this.f13887e0 = null;
        this.f13886Z = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        this.f13883U = false;
        this.f13884X = false;
    }

    /* renamed from: M */
    public void mo7425M(C0792h[] hVarArr, long j, long j2) {
        this.f13882Q = this.f13878I.mo18951b(hVarArr[0]);
    }

    /* renamed from: Q */
    public final void mo22090Q(Metadata metadata, List<Metadata.Entry> list) {
        for (int i = 0; i < metadata.mo6545d(); i++) {
            C0792h O = metadata.mo6544c(i).mo6552O();
            if (O == null || !this.f13878I.mo18950a(O)) {
                list.add(metadata.mo6544c(i));
            } else {
                cv3 b = this.f13878I.mo18951b(O);
                byte[] bArr = (byte[]) C2725kr.m20985e(metadata.mo6544c(i).mo6553k1());
                this.f13881P.mo6968h();
                this.f13881P.mo6970w(bArr.length);
                ((ByteBuffer) w67.m29360j(this.f13881P.f4592e)).put(bArr);
                this.f13881P.mo6971x();
                Metadata a = b.mo18362a(this.f13881P);
                if (a != null) {
                    mo22090Q(a, list);
                }
            }
        }
    }

    /* renamed from: R */
    public final void mo22091R(Metadata metadata) {
        Handler handler = this.f13880M;
        if (handler != null) {
            handler.obtainMessage(0, metadata).sendToTarget();
        } else {
            mo22092S(metadata);
        }
    }

    /* renamed from: S */
    public final void mo22092S(Metadata metadata) {
        this.f13879L.mo21641x(metadata);
    }

    /* renamed from: T */
    public final boolean mo22093T(long j) {
        boolean z;
        Metadata metadata = this.f13887e0;
        if (metadata == null || this.f13886Z > j) {
            z = false;
        } else {
            mo22091R(metadata);
            this.f13887e0 = null;
            this.f13886Z = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
            z = true;
        }
        if (this.f13883U && this.f13887e0 == null) {
            this.f13884X = true;
        }
        return z;
    }

    /* renamed from: U */
    public final void mo22094U() {
        if (!this.f13883U && this.f13887e0 == null) {
            this.f13881P.mo6968h();
            c82 B = mo21675B();
            int N = mo21680N(B, this.f13881P, 0);
            if (N == -4) {
                if (this.f13881P.mo23893p()) {
                    this.f13883U = true;
                    return;
                }
                ev3 ev3 = this.f13881P;
                ev3.f11367y = this.f13885Y;
                ev3.mo6971x();
                Metadata a = ((cv3) w67.m29360j(this.f13882Q)).mo18362a(this.f13881P);
                if (a != null) {
                    ArrayList arrayList = new ArrayList(a.mo6545d());
                    mo22090Q(a, arrayList);
                    if (!arrayList.isEmpty()) {
                        this.f13887e0 = new Metadata((List<? extends Metadata.Entry>) arrayList);
                        this.f13886Z = this.f13881P.f4594k;
                    }
                }
            } else if (N == -5) {
                this.f13885Y = ((C0792h) C2725kr.m20985e(B.f8368b)).f4179M;
            }
        }
    }

    /* renamed from: a */
    public int mo7438a(C0792h hVar) {
        int i;
        if (!this.f13878I.mo18950a(hVar)) {
            return nd5.m23113a(0);
        }
        if (hVar.f4199r1 == 0) {
            i = 4;
        } else {
            i = 2;
        }
        return nd5.m23113a(i);
    }

    /* renamed from: e */
    public boolean mo7149e() {
        return this.f13884X;
    }

    /* renamed from: g */
    public boolean mo7150g() {
        return true;
    }

    public String getName() {
        return "MetadataRenderer";
    }

    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            mo22092S((Metadata) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    /* renamed from: u */
    public void mo7468u(long j, long j2) {
        boolean z = true;
        while (z) {
            mo22094U();
            z = mo22093T(j);
        }
    }

    public jv3(iv3 iv3, Looper looper, dv3 dv3) {
        super(5);
        Handler handler;
        this.f13879L = (iv3) C2725kr.m20985e(iv3);
        if (looper == null) {
            handler = null;
        } else {
            handler = w67.m29382u(looper, this);
        }
        this.f13880M = handler;
        this.f13878I = (dv3) C2725kr.m20985e(dv3);
        this.f13881P = new ev3();
        this.f13886Z = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
    }
}
