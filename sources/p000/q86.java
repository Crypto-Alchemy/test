package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, mo44877d2 = {"Lq86;", "", "<init>", "()V", "a", "b", "c", "d", "e", "f", "Lq86$f;", "Lq86$b;", "Lq86$a;", "Lq86$e;", "Lq86$d;", "Lq86$c;", "scarlet"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* renamed from: q86 */
/* compiled from: State.kt */
public abstract class q86 {

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u001a\u0010\u000e\u001a\u00020\n8\u0000X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, mo44877d2 = {"Lq86$a;", "Lq86;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lox5;", "a", "Lox5;", "()Lox5;", "session", "<init>", "(Lox5;)V", "scarlet"}, mo44878k = 1, mo44879mv = {1, 5, 1})
    /* renamed from: q86$a */
    /* compiled from: State.kt */
    public static final class C6389a extends q86 {

        /* renamed from: a */
        public final ox5 f32968a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6389a(ox5 ox5) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(ox5, "session");
            this.f32968a = ox5;
        }

        /* renamed from: a */
        public final ox5 mo47004a() {
            return this.f32968a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C6389a) && vx2.m53586b(this.f32968a, ((C6389a) obj).f32968a);
        }

        public int hashCode() {
            return this.f32968a.hashCode();
        }

        public String toString() {
            return "Connected(session=" + this.f32968a + ')';
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u001a\u0010\u000f\u001a\u00020\n8\u0000X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0010\u001a\u0004\b\u000b\u0010\u0011¨\u0006\u0015"}, mo44877d2 = {"Lq86$b;", "Lq86;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lox5;", "a", "Lox5;", "b", "()Lox5;", "session", "I", "()I", "retryCount", "<init>", "(Lox5;I)V", "scarlet"}, mo44878k = 1, mo44879mv = {1, 5, 1})
    /* renamed from: q86$b */
    /* compiled from: State.kt */
    public static final class C6390b extends q86 {

        /* renamed from: a */
        public final ox5 f32969a;

        /* renamed from: b */
        public final int f32970b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6390b(ox5 ox5, int i) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(ox5, "session");
            this.f32969a = ox5;
            this.f32970b = i;
        }

        /* renamed from: a */
        public final int mo47008a() {
            return this.f32970b;
        }

        /* renamed from: b */
        public final ox5 mo47009b() {
            return this.f32969a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6390b)) {
                return false;
            }
            C6390b bVar = (C6390b) obj;
            return vx2.m53586b(this.f32969a, bVar.f32969a) && this.f32970b == bVar.f32970b;
        }

        public int hashCode() {
            return (this.f32969a.hashCode() * 31) + this.f32970b;
        }

        public String toString() {
            return "Connecting(session=" + this.f32969a + ", retryCount=" + this.f32970b + ')';
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo44877d2 = {"Lq86$c;", "Lq86;", "<init>", "()V", "scarlet"}, mo44878k = 1, mo44879mv = {1, 5, 1})
    /* renamed from: q86$c */
    /* compiled from: State.kt */
    public static final class C6391c extends q86 {

        /* renamed from: a */
        public static final C6391c f32971a = new C6391c();

        public C6391c() {
            super((DefaultConstructorMarker) null);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo44877d2 = {"Lq86$d;", "Lq86;", "<init>", "()V", "scarlet"}, mo44878k = 1, mo44879mv = {1, 5, 1})
    /* renamed from: q86$d */
    /* compiled from: State.kt */
    public static final class C6392d extends q86 {

        /* renamed from: a */
        public static final C6392d f32972a = new C6392d();

        public C6392d() {
            super((DefaultConstructorMarker) null);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo44877d2 = {"Lq86$e;", "Lq86;", "<init>", "()V", "scarlet"}, mo44878k = 1, mo44879mv = {1, 5, 1})
    /* renamed from: q86$e */
    /* compiled from: State.kt */
    public static final class C6393e extends q86 {

        /* renamed from: a */
        public static final C6393e f32973a = new C6393e();

        public C6393e() {
            super((DefaultConstructorMarker) null);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u001a\u0010\u000f\u001a\u00020\n8\u0000X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0010\u001a\u0004\b\u000b\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, mo44877d2 = {"Lq86$f;", "Lq86;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lth1;", "a", "Lth1;", "b", "()Lth1;", "timerDisposable", "I", "()I", "retryCount", "", "c", "J", "getRetryInMillis", "()J", "retryInMillis", "<init>", "(Lth1;IJ)V", "scarlet"}, mo44878k = 1, mo44879mv = {1, 5, 1})
    /* renamed from: q86$f */
    /* compiled from: State.kt */
    public static final class C6394f extends q86 {

        /* renamed from: a */
        public final th1 f32974a;

        /* renamed from: b */
        public final int f32975b;

        /* renamed from: c */
        public final long f32976c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6394f(th1 th1, int i, long j) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(th1, "timerDisposable");
            this.f32974a = th1;
            this.f32975b = i;
            this.f32976c = j;
        }

        /* renamed from: a */
        public final int mo47013a() {
            return this.f32975b;
        }

        /* renamed from: b */
        public final th1 mo47014b() {
            return this.f32974a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6394f)) {
                return false;
            }
            C6394f fVar = (C6394f) obj;
            return vx2.m53586b(this.f32974a, fVar.f32974a) && this.f32975b == fVar.f32975b && this.f32976c == fVar.f32976c;
        }

        public int hashCode() {
            return (((this.f32974a.hashCode() * 31) + this.f32975b) * 31) + au0.m10781a(this.f32976c);
        }

        public String toString() {
            return "WaitingToRetry(timerDisposable=" + this.f32974a + ", retryCount=" + this.f32975b + ", retryInMillis=" + this.f32976c + ')';
        }
    }

    public q86() {
    }

    public /* synthetic */ q86(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
