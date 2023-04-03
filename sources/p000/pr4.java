package p000;

import android.view.MotionEvent;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0003\u0010\u0011¨\u0006\u0015"}, mo44877d2 = {"Lpr4;", "", "", "a", "J", "getUptime", "()J", "uptime", "", "Lqr4;", "b", "Ljava/util/List;", "()Ljava/util/List;", "pointers", "Landroid/view/MotionEvent;", "c", "Landroid/view/MotionEvent;", "()Landroid/view/MotionEvent;", "motionEvent", "<init>", "(JLjava/util/List;Landroid/view/MotionEvent;)V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: pr4 */
/* compiled from: PointerInputEvent.android.kt */
public final class pr4 {

    /* renamed from: a */
    public final long f16642a;

    /* renamed from: b */
    public final List<qr4> f16643b;

    /* renamed from: c */
    public final MotionEvent f16644c;

    public pr4(long j, List<qr4> list, MotionEvent motionEvent) {
        vx2.m53591g(list, "pointers");
        vx2.m53591g(motionEvent, "motionEvent");
        this.f16642a = j;
        this.f16643b = list;
        this.f16644c = motionEvent;
    }

    /* renamed from: a */
    public final MotionEvent mo24781a() {
        return this.f16644c;
    }

    /* renamed from: b */
    public final List<qr4> mo24782b() {
        return this.f16643b;
    }
}
