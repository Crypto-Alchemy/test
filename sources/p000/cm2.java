package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001a\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\u000b\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\b\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000e"}, mo44877d2 = {"Lcm2;", "", "", "toString", "", "a", "J", "b", "()J", "uptimeMillis", "Ltf4;", "position", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: cm2 */
/* compiled from: PointerEvent.kt */
public final class cm2 {

    /* renamed from: a */
    public final long f8468a;

    /* renamed from: b */
    public final long f8469b;

    public cm2(long j, long j2) {
        this.f8468a = j;
        this.f8469b = j2;
    }

    public /* synthetic */ cm2(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }

    /* renamed from: a */
    public final long mo12110a() {
        return this.f8469b;
    }

    /* renamed from: b */
    public final long mo12111b() {
        return this.f8468a;
    }

    public String toString() {
        return "HistoricalChange(uptimeMillis=" + this.f8468a + ", position=" + tf4.m27740q(this.f8469b) + ')';
    }
}
