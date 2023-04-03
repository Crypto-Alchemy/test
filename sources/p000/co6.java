package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.common.C0792h;
import androidx.media3.extractor.text.SubtitleDecoderException;
import java.util.Collections;
import java.util.List;

/* renamed from: co6 */
/* compiled from: TextRenderer */
public final class co6 extends C2580iz implements Handler.Callback {

    /* renamed from: I */
    public final Handler f8513I;

    /* renamed from: L */
    public final zn6 f8514L;

    /* renamed from: M */
    public final zc6 f8515M;

    /* renamed from: P */
    public final c82 f8516P;

    /* renamed from: Q */
    public boolean f8517Q;

    /* renamed from: U */
    public boolean f8518U;

    /* renamed from: X */
    public boolean f8519X;

    /* renamed from: Y */
    public int f8520Y;

    /* renamed from: Z */
    public C0792h f8521Z;

    /* renamed from: b1 */
    public cd6 f8522b1;

    /* renamed from: e0 */
    public yc6 f8523e0;

    /* renamed from: e1 */
    public int f8524e1;

    /* renamed from: k0 */
    public bd6 f8525k0;

    /* renamed from: o1 */
    public long f8526o1;

    /* renamed from: v0 */
    public cd6 f8527v0;

    public co6(zn6 zn6, Looper looper) {
        this(zn6, looper, zc6.f20528a);
    }

    /* renamed from: G */
    public void mo7133G() {
        this.f8521Z = null;
        this.f8526o1 = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        mo12144Q();
        mo12150W();
    }

    /* renamed from: I */
    public void mo7135I(long j, boolean z) {
        mo12144Q();
        this.f8517Q = false;
        this.f8518U = false;
        this.f8526o1 = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        if (this.f8520Y != 0) {
            mo12151X();
            return;
        }
        mo12149V();
        ((yc6) C2725kr.m20985e(this.f8523e0)).flush();
    }

    /* renamed from: M */
    public void mo7425M(C0792h[] hVarArr, long j, long j2) {
        this.f8521Z = hVarArr[0];
        if (this.f8523e0 != null) {
            this.f8520Y = 1;
        } else {
            mo12147T();
        }
    }

    /* renamed from: Q */
    public final void mo12144Q() {
        mo12153Z(Collections.emptyList());
    }

    /* renamed from: R */
    public final long mo12145R() {
        if (this.f8524e1 == -1) {
            return Long.MAX_VALUE;
        }
        C2725kr.m20985e(this.f8527v0);
        if (this.f8524e1 >= this.f8527v0.mo11951f()) {
            return Long.MAX_VALUE;
        }
        return this.f8527v0.mo11950e(this.f8524e1);
    }

    /* renamed from: S */
    public final void mo12146S(SubtitleDecoderException subtitleDecoderException) {
        gk3.m18127d("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f8521Z, subtitleDecoderException);
        mo12144Q();
        mo12151X();
    }

    /* renamed from: T */
    public final void mo12147T() {
        this.f8519X = true;
        this.f8523e0 = this.f8515M.mo28420b((C0792h) C2725kr.m20985e(this.f8521Z));
    }

    /* renamed from: U */
    public final void mo12148U(List<dx0> list) {
        this.f8514L.mo24177m(list);
        this.f8514L.mo24188t(new hx0(list));
    }

    /* renamed from: V */
    public final void mo12149V() {
        this.f8525k0 = null;
        this.f8524e1 = -1;
        cd6 cd6 = this.f8527v0;
        if (cd6 != null) {
            cd6.mo19507v();
            this.f8527v0 = null;
        }
        cd6 cd62 = this.f8522b1;
        if (cd62 != null) {
            cd62.mo19507v();
            this.f8522b1 = null;
        }
    }

    /* renamed from: W */
    public final void mo12150W() {
        mo12149V();
        ((yc6) C2725kr.m20985e(this.f8523e0)).mo18654a();
        this.f8523e0 = null;
        this.f8520Y = 0;
    }

    /* renamed from: X */
    public final void mo12151X() {
        mo12150W();
        mo12147T();
    }

    /* renamed from: Y */
    public void mo12152Y(long j) {
        C2725kr.m20987g(mo21691n());
        this.f8526o1 = j;
    }

    /* renamed from: Z */
    public final void mo12153Z(List<dx0> list) {
        Handler handler = this.f8513I;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            mo12148U(list);
        }
    }

    /* renamed from: a */
    public int mo7438a(C0792h hVar) {
        int i;
        if (this.f8515M.mo28419a(hVar)) {
            if (hVar.f4199r1 == 0) {
                i = 4;
            } else {
                i = 2;
            }
            return nd5.m23113a(i);
        } else if (vv3.m29142p(hVar.f4175C)) {
            return nd5.m23113a(1);
        } else {
            return nd5.m23113a(0);
        }
    }

    /* renamed from: e */
    public boolean mo7149e() {
        return this.f8518U;
    }

    /* renamed from: g */
    public boolean mo7150g() {
        return true;
    }

    public String getName() {
        return "TextRenderer";
    }

    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            mo12148U((List) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    /* renamed from: u */
    public void mo7468u(long j, long j2) {
        boolean z;
        boolean z2;
        if (mo21691n()) {
            long j3 = this.f8526o1;
            if (j3 != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED && j >= j3) {
                mo12149V();
                this.f8518U = true;
            }
        }
        if (!this.f8518U) {
            if (this.f8522b1 == null) {
                ((yc6) C2725kr.m20985e(this.f8523e0)).mo18655b(j);
                try {
                    this.f8522b1 = (cd6) ((yc6) C2725kr.m20985e(this.f8523e0)).mo18656c();
                } catch (SubtitleDecoderException e) {
                    mo12146S(e);
                    return;
                }
            }
            if (getState() == 2) {
                if (this.f8527v0 != null) {
                    long R = mo12145R();
                    z = false;
                    while (R <= j) {
                        this.f8524e1++;
                        R = mo12145R();
                        z = true;
                    }
                } else {
                    z = false;
                }
                cd6 cd6 = this.f8522b1;
                if (cd6 != null) {
                    if (cd6.mo23893p()) {
                        if (!z && mo12145R() == Long.MAX_VALUE) {
                            if (this.f8520Y == 2) {
                                mo12151X();
                            } else {
                                mo12149V();
                                this.f8518U = true;
                            }
                        }
                    } else if (cd6.f15781d <= j) {
                        cd6 cd62 = this.f8527v0;
                        if (cd62 != null) {
                            cd62.mo19507v();
                        }
                        this.f8524e1 = cd6.mo11948a(j);
                        this.f8527v0 = cd6;
                        this.f8522b1 = null;
                        z = true;
                    }
                }
                if (z) {
                    C2725kr.m20985e(this.f8527v0);
                    mo12153Z(this.f8527v0.mo11949d(j));
                }
                if (this.f8520Y != 2) {
                    while (!this.f8517Q) {
                        try {
                            bd6 bd6 = this.f8525k0;
                            if (bd6 == null) {
                                bd6 = (bd6) ((yc6) C2725kr.m20985e(this.f8523e0)).mo19502e();
                                if (bd6 != null) {
                                    this.f8525k0 = bd6;
                                } else {
                                    return;
                                }
                            }
                            if (this.f8520Y == 1) {
                                bd6.mo23896u(4);
                                ((yc6) C2725kr.m20985e(this.f8523e0)).mo19501d(bd6);
                                this.f8525k0 = null;
                                this.f8520Y = 2;
                                return;
                            }
                            int N = mo21680N(this.f8516P, bd6, 0);
                            if (N == -4) {
                                if (bd6.mo23893p()) {
                                    this.f8517Q = true;
                                    this.f8519X = false;
                                } else {
                                    C0792h hVar = this.f8516P.f8368b;
                                    if (hVar != null) {
                                        bd6.f8069y = hVar.f4179M;
                                        bd6.mo6971x();
                                        boolean z3 = this.f8519X;
                                        if (!bd6.mo23895t()) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        this.f8519X = z3 & z2;
                                    } else {
                                        return;
                                    }
                                }
                                if (!this.f8519X) {
                                    ((yc6) C2725kr.m20985e(this.f8523e0)).mo19501d(bd6);
                                    this.f8525k0 = null;
                                }
                            } else if (N == -3) {
                                return;
                            }
                        } catch (SubtitleDecoderException e2) {
                            mo12146S(e2);
                            return;
                        }
                    }
                }
            }
        }
    }

    public co6(zn6 zn6, Looper looper, zc6 zc6) {
        super(3);
        Handler handler;
        this.f8514L = (zn6) C2725kr.m20985e(zn6);
        if (looper == null) {
            handler = null;
        } else {
            handler = w67.m29382u(looper, this);
        }
        this.f8513I = handler;
        this.f8515M = zc6;
        this.f8516P = new c82();
        this.f8526o1 = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
    }
}
