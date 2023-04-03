package p000;

import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.utils.Utils;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001B^\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0004\u0012\u0006\u0010\u001f\u001a\u00020\u0006\u0012\u0006\u0010#\u001a\u00020\b\u0012\u0006\u0010%\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010C\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0006ø\u0001\u0001¢\u0006\u0004\bD\u0010EBr\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0004\u0012\u0006\u0010\u001f\u001a\u00020\u0006\u0012\u0006\u0010#\u001a\u00020\b\u0012\u0006\u0010>\u001a\u00020-\u0012\u0006\u0010%\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010C\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0006ø\u0001\u0001¢\u0006\u0004\bD\u0010FBh\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0004\u0012\u0006\u0010\u001f\u001a\u00020\u0006\u0012\u0006\u0010#\u001a\u00020\b\u0012\u0006\u0010>\u001a\u00020-\u0012\u0006\u0010%\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010C\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0006ø\u0001\u0001¢\u0006\u0004\bD\u0010GJ}\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0016\u001a\u00020\u0015H\u0016R \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001c\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R \u0010\u001f\u001a\u00020\u00068\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019R\u0017\u0010#\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010%\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b$\u0010\u0019R \u0010\u000b\u001a\u00020\u00068\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b!\u0010\u0017\u001a\u0004\b&\u0010\u0019R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b'\u0010 \u001a\u0004\b(\u0010\"R \u0010\u000e\u001a\u00020\r8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b&\u0010)\u001a\u0004\b*\u0010+R \u0010\u0012\u001a\u00020\u00068\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b(\u0010\u0017\u001a\u0004\b,\u0010\u0019R\u0018\u0010/\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b*\u0010.R\u001e\u00102\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b0\u00101R*\u0010;\u001a\u0002032\u0006\u00104\u001a\u0002038\u0006@BX\u000e¢\u0006\u0012\n\u0004\b5\u00106\u0012\u0004\b9\u0010:\u001a\u0004\b7\u00108R\u001a\u0010>\u001a\u00020-8GX\u0004¢\u0006\f\u0012\u0004\b=\u0010:\u001a\u0004\b'\u0010<R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8GX\u0004¢\u0006\f\u0012\u0004\b@\u0010:\u001a\u0004\b\u001d\u0010?R\u0017\u0010B\u001a\u00020\b8F¢\u0006\f\u0012\u0004\bA\u0010:\u001a\u0004\b0\u0010\"\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006H"}, mo44877d2 = {"Lnr4;", "", "Lmr4;", "id", "", "currentTime", "Ltf4;", "currentPosition", "", "currentPressed", "previousTime", "previousPosition", "previousPressed", "Lyr4;", "type", "", "Lcm2;", "historical", "scrollDelta", "a", "(JJJZJJZILjava/util/List;J)Lnr4;", "", "toString", "J", "d", "()J", "b", "getUptimeMillis", "uptimeMillis", "c", "e", "position", "Z", "f", "()Z", "pressed", "getPreviousUptimeMillis", "previousUptimeMillis", "h", "g", "i", "I", "j", "()I", "getScrollDelta-F1C5BW0", "", "Ljava/lang/Float;", "_pressure", "k", "Ljava/util/List;", "_historical", "Ltq0;", "<set-?>", "l", "Ltq0;", "getConsumed", "()Ltq0;", "getConsumed$annotations", "()V", "consumed", "()F", "getPressure$annotations", "pressure", "()Ljava/util/List;", "getHistorical$annotations", "isConsumed$annotations", "isConsumed", "isInitiallyConsumed", "<init>", "(JJJZJJZZIJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "(JJJZFJJZZILjava/util/List;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "(JJJZFJJZZIJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: nr4 */
/* compiled from: PointerEvent.kt */
public final class nr4 {

    /* renamed from: a */
    public final long f15664a;

    /* renamed from: b */
    public final long f15665b;

    /* renamed from: c */
    public final long f15666c;

    /* renamed from: d */
    public final boolean f15667d;

    /* renamed from: e */
    public final long f15668e;

    /* renamed from: f */
    public final long f15669f;

    /* renamed from: g */
    public final boolean f15670g;

    /* renamed from: h */
    public final int f15671h;

    /* renamed from: i */
    public final long f15672i;

    /* renamed from: j */
    public Float f15673j;

    /* renamed from: k */
    public List<cm2> f15674k;

    /* renamed from: l */
    public tq0 f15675l;

    public /* synthetic */ nr4(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, z, f, j4, j5, z2, z3, i, j6);
    }

    public /* synthetic */ nr4(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, List list, long j6, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, z, f, j4, j5, z2, z3, i, (List<cm2>) list, j6);
    }

    public nr4(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, boolean z3, int i, long j6) {
        this.f15664a = j;
        this.f15665b = j2;
        this.f15666c = j3;
        this.f15667d = z;
        this.f15668e = j4;
        this.f15669f = j5;
        this.f15670g = z2;
        this.f15671h = i;
        this.f15672i = j6;
        boolean z4 = z3;
        this.f15675l = new tq0(z4, z4);
    }

    public /* synthetic */ nr4(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, boolean z3, int i, long j6, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, z, j4, j5, z2, z3, i, j6);
    }

    /* renamed from: b */
    public static /* synthetic */ nr4 m23438b(nr4 nr4, long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, int i, List list, long j6, int i2, Object obj) {
        long j7;
        long j8;
        long j9;
        boolean z3;
        long j10;
        long j11;
        boolean z4;
        int i3;
        long j12;
        nr4 nr42 = nr4;
        int i4 = i2;
        if ((i4 & 1) != 0) {
            j7 = nr42.f15664a;
        } else {
            j7 = j;
        }
        if ((i4 & 2) != 0) {
            j8 = nr42.f15665b;
        } else {
            j8 = j2;
        }
        if ((i4 & 4) != 0) {
            j9 = nr42.f15666c;
        } else {
            j9 = j3;
        }
        if ((i4 & 8) != 0) {
            z3 = nr42.f15667d;
        } else {
            z3 = z;
        }
        if ((i4 & 16) != 0) {
            j10 = nr42.f15668e;
        } else {
            j10 = j4;
        }
        if ((i4 & 32) != 0) {
            j11 = nr42.f15669f;
        } else {
            j11 = j5;
        }
        if ((i4 & 64) != 0) {
            z4 = nr42.f15670g;
        } else {
            z4 = z2;
        }
        if ((i4 & 128) != 0) {
            i3 = nr42.f15671h;
        } else {
            i3 = i;
        }
        int i5 = i3;
        if ((i4 & RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0) {
            j12 = nr42.f15672i;
        } else {
            j12 = j6;
        }
        return nr4.mo23784a(j7, j8, j9, z3, j10, j11, z4, i5, list, j12);
    }

    /* renamed from: a */
    public final nr4 mo23784a(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, int i, List<cm2> list, long j6) {
        vx2.m53591g(list, "historical");
        nr4 nr4 = r0;
        nr4 nr42 = new nr4(j, j2, j3, z, mo23789g(), j4, j5, z2, false, i, list, j6, (DefaultConstructorMarker) null);
        nr4 nr43 = nr4;
        nr43.f15675l = this.f15675l;
        return nr43;
    }

    /* renamed from: c */
    public final List<cm2> mo23785c() {
        List<cm2> list = this.f15674k;
        if (list == null) {
            return ck0.m33062j();
        }
        return list;
    }

    /* renamed from: d */
    public final long mo23786d() {
        return this.f15664a;
    }

    /* renamed from: e */
    public final long mo23787e() {
        return this.f15666c;
    }

    /* renamed from: f */
    public final boolean mo23788f() {
        return this.f15667d;
    }

    /* renamed from: g */
    public final float mo23789g() {
        Float f = this.f15673j;
        if (f != null) {
            return f.floatValue();
        }
        return Utils.FLOAT_EPSILON;
    }

    /* renamed from: h */
    public final long mo23790h() {
        return this.f15669f;
    }

    /* renamed from: i */
    public final boolean mo23791i() {
        return this.f15670g;
    }

    /* renamed from: j */
    public final int mo23792j() {
        return this.f15671h;
    }

    /* renamed from: k */
    public final boolean mo23793k() {
        if (this.f15675l.mo26530a() || this.f15675l.mo26531b()) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "PointerInputChange(id=" + mr4.m22625f(this.f15664a) + ", uptimeMillis=" + this.f15665b + ", position=" + tf4.m27740q(this.f15666c) + ", pressed=" + this.f15667d + ", pressure=" + mo23789g() + ", previousUptimeMillis=" + this.f15668e + ", previousPosition=" + tf4.m27740q(this.f15669f) + ", previousPressed=" + this.f15670g + ", isConsumed=" + mo23793k() + ", type=" + yr4.m30766i(this.f15671h) + ", historical=" + mo23785c() + ",scrollDelta=" + tf4.m27740q(this.f15672i) + ')';
    }

    public nr4(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, List<cm2> list, long j6) {
        this(j, j2, j3, z, f, j4, j5, z2, z3, i, j6, (DefaultConstructorMarker) null);
        this.f15674k = list;
    }

    public nr4(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6) {
        this(j, j2, j3, z, j4, j5, z2, z3, i, j6, (DefaultConstructorMarker) null);
        this.f15673j = Float.valueOf(f);
    }
}
