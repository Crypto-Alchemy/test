package p000;

import android.view.MotionEvent;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B!\b\u0000\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b \u0010!J\u0018\u0010\u0003\u001a\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0000X\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\r\u0010\u000eR \u0010\u0014\u001a\u00020\u00108\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0004R \u0010\u0018\u001a\u00020\u00158\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0004R3\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00028\u0006@@X\u000eø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u0016\u0010\u0004\"\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u001d8@X\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u001e\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\""}, mo44877d2 = {"Lfr4;", "", "Lhr4;", "a", "()I", "", "Lnr4;", "Ljava/util/List;", "b", "()Ljava/util/List;", "changes", "Lox2;", "Lox2;", "getInternalPointerEvent$ui_release", "()Lox2;", "internalPointerEvent", "Ler4;", "c", "I", "getButtons-ry648PA", "buttons", "Lxr4;", "d", "getKeyboardModifiers-k7X9c1A", "keyboardModifiers", "<set-?>", "e", "(I)V", "type", "Landroid/view/MotionEvent;", "()Landroid/view/MotionEvent;", "motionEvent", "<init>", "(Ljava/util/List;Lox2;)V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: fr4 */
/* compiled from: PointerEvent.android.kt */
public final class fr4 {

    /* renamed from: a */
    public final List<nr4> f11971a;

    /* renamed from: b */
    public final ox2 f11972b;

    /* renamed from: c */
    public final int f11973c;

    /* renamed from: d */
    public final int f11974d;

    /* renamed from: e */
    public int f11975e;

    public fr4(List<nr4> list, ox2 ox2) {
        int i;
        vx2.m53591g(list, "changes");
        this.f11971a = list;
        this.f11972b = ox2;
        MotionEvent c = mo20070c();
        int i2 = 0;
        if (c != null) {
            i = c.getButtonState();
        } else {
            i = 0;
        }
        this.f11973c = er4.m16315a(i);
        MotionEvent c2 = mo20070c();
        this.f11974d = xr4.m30288b(c2 != null ? c2.getMetaState() : i2);
        this.f11975e = mo20068a();
    }

    /* renamed from: a */
    public final int mo20068a() {
        MotionEvent c = mo20070c();
        if (c != null) {
            int actionMasked = c.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case 5:
                                break;
                            case 6:
                                break;
                            case 7:
                                break;
                            case 8:
                                return hr4.f13010a.mo21351f();
                            case 9:
                                return hr4.f13010a.mo21346a();
                            case 10:
                                return hr4.f13010a.mo21347b();
                            default:
                                return hr4.f13010a.mo21352g();
                        }
                    }
                    return hr4.f13010a.mo21348c();
                }
                return hr4.f13010a.mo21350e();
            }
            return hr4.f13010a.mo21349d();
        }
        List<nr4> list = this.f11971a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            nr4 nr4 = list.get(i);
            if (gr4.m18368b(nr4)) {
                return hr4.f13010a.mo21350e();
            }
            if (gr4.m18367a(nr4)) {
                return hr4.f13010a.mo21349d();
            }
        }
        return hr4.f13010a.mo21348c();
    }

    /* renamed from: b */
    public final List<nr4> mo20069b() {
        return this.f11971a;
    }

    /* renamed from: c */
    public final MotionEvent mo20070c() {
        ox2 ox2 = this.f11972b;
        if (ox2 != null) {
            return ox2.mo24267b();
        }
        return null;
    }

    /* renamed from: d */
    public final int mo20071d() {
        return this.f11975e;
    }

    /* renamed from: e */
    public final void mo20072e(int i) {
        this.f11975e = i;
    }
}
