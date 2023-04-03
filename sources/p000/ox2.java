package p000;

import android.view.MotionEvent;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B&\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u0012\u001a\u00020\rø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006R&\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u00078\u0006ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0018\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001b\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u001a\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001e"}, mo44877d2 = {"Lox2;", "", "Lmr4;", "pointerId", "", "d", "(J)Z", "", "Lnr4;", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "changes", "Lpr4;", "b", "Lpr4;", "getPointerInputEvent", "()Lpr4;", "pointerInputEvent", "c", "Z", "()Z", "setSuppressMovementConsumption", "(Z)V", "suppressMovementConsumption", "Landroid/view/MotionEvent;", "()Landroid/view/MotionEvent;", "motionEvent", "<init>", "(Ljava/util/Map;Lpr4;)V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: ox2 */
/* compiled from: InternalPointerEvent.android.kt */
public final class ox2 {

    /* renamed from: a */
    public final Map<mr4, nr4> f16213a;

    /* renamed from: b */
    public final pr4 f16214b;

    /* renamed from: c */
    public boolean f16215c;

    public ox2(Map<mr4, nr4> map, pr4 pr4) {
        vx2.m53591g(map, "changes");
        vx2.m53591g(pr4, "pointerInputEvent");
        this.f16213a = map;
        this.f16214b = pr4;
    }

    /* renamed from: a */
    public final Map<mr4, nr4> mo24266a() {
        return this.f16213a;
    }

    /* renamed from: b */
    public final MotionEvent mo24267b() {
        return this.f16214b.mo24781a();
    }

    /* renamed from: c */
    public final boolean mo24268c() {
        return this.f16215c;
    }

    /* renamed from: d */
    public final boolean mo24269d(long j) {
        qr4 qr4;
        List<qr4> b = this.f16214b.mo24782b();
        int size = b.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                qr4 = null;
                break;
            }
            qr4 = b.get(i);
            if (mr4.m22623d(qr4.mo25252c(), j)) {
                break;
            }
            i++;
        }
        qr4 qr42 = qr4;
        if (qr42 != null) {
            return qr42.mo25253d();
        }
        return false;
    }
}
