package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.kg3;
import p000.yj7;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0004\b\t\n\u000b¨\u0006\f"}, mo44877d2 = {"Let1;", "", "<init>", "()V", "a", "b", "c", "d", "Let1$a;", "Let1$d;", "Let1$c;", "Let1$b;", "scarlet"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* renamed from: et1 */
/* compiled from: Event.kt */
public abstract class et1 {

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, mo44877d2 = {"Let1$a;", "Let1;", "<init>", "()V", "a", "b", "Let1$a$a;", "Let1$a$b;", "scarlet"}, mo44878k = 1, mo44879mv = {1, 5, 1})
    /* renamed from: et1$a */
    /* compiled from: Event.kt */
    public static abstract class C5810a extends et1 {

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0003B\u0011\b\u0000\u0012\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0017\u0010\u000f\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u0012"}, mo44877d2 = {"Let1$a$a;", "Lkg3$a;", "T", "Let1$a;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Lkg3$a;", "()Lkg3$a;", "state", "<init>", "(Lkg3$a;)V", "scarlet"}, mo44878k = 1, mo44879mv = {1, 5, 1})
        /* renamed from: et1$a$a */
        /* compiled from: Event.kt */
        public static final class C5811a<T extends kg3.C6147a> extends C5810a {

            /* renamed from: a */
            public final T f28654a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5811a(T t) {
                super((DefaultConstructorMarker) null);
                vx2.m53591g(t, "state");
                this.f28654a = t;
            }

            /* renamed from: a */
            public final T mo42400a() {
                return this.f28654a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C5811a) && vx2.m53586b(this.f28654a, ((C5811a) obj).f28654a);
            }

            public int hashCode() {
                return this.f28654a.hashCode();
            }

            public String toString() {
                return "StateChange(state=" + this.f28654a + ')';
            }
        }

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo44877d2 = {"Let1$a$b;", "Let1$a;", "<init>", "()V", "scarlet"}, mo44878k = 1, mo44879mv = {1, 5, 1})
        /* renamed from: et1$a$b */
        /* compiled from: Event.kt */
        public static final class C5812b extends C5810a {

            /* renamed from: a */
            public static final C5812b f28655a = new C5812b();

            public C5812b() {
                super((DefaultConstructorMarker) null);
            }
        }

        public C5810a() {
            super((DefaultConstructorMarker) null);
        }

        public /* synthetic */ C5810a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo44877d2 = {"Let1$b;", "Let1;", "<init>", "()V", "scarlet"}, mo44878k = 1, mo44879mv = {1, 5, 1})
    /* renamed from: et1$b */
    /* compiled from: Event.kt */
    public static final class C5813b extends et1 {

        /* renamed from: a */
        public static final C5813b f28656a = new C5813b();

        public C5813b() {
            super((DefaultConstructorMarker) null);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0003B\u0011\b\u0000\u0012\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0017\u0010\u000f\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u0012"}, mo44877d2 = {"Let1$c;", "Lq86;", "T", "Let1;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Lq86;", "()Lq86;", "state", "<init>", "(Lq86;)V", "scarlet"}, mo44878k = 1, mo44879mv = {1, 5, 1})
    /* renamed from: et1$c */
    /* compiled from: Event.kt */
    public static final class C5814c<T extends q86> extends et1 {

        /* renamed from: a */
        public final T f28657a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5814c(T t) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(t, "state");
            this.f28657a = t;
        }

        /* renamed from: a */
        public final T mo42404a() {
            return this.f28657a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C5814c) && vx2.m53586b(this.f28657a, ((C5814c) obj).f28657a);
        }

        public int hashCode() {
            return this.f28657a.hashCode();
        }

        public String toString() {
            return "OnStateChange(state=" + this.f28657a + ')';
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, mo44877d2 = {"Let1$d;", "Let1;", "<init>", "()V", "a", "b", "Let1$d$a;", "Let1$d$b;", "scarlet"}, mo44878k = 1, mo44879mv = {1, 5, 1})
    /* renamed from: et1$d */
    /* compiled from: Event.kt */
    public static abstract class C5815d extends et1 {

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0003B\u0011\b\u0000\u0012\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0017\u0010\u000f\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u0012"}, mo44877d2 = {"Let1$d$a;", "Lyj7$a;", "T", "Let1$d;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Lyj7$a;", "()Lyj7$a;", "event", "<init>", "(Lyj7$a;)V", "scarlet"}, mo44878k = 1, mo44879mv = {1, 5, 1})
        /* renamed from: et1$d$a */
        /* compiled from: Event.kt */
        public static final class C5816a<T extends yj7.C6739a> extends C5815d {

            /* renamed from: a */
            public final T f28658a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5816a(T t) {
                super((DefaultConstructorMarker) null);
                vx2.m53591g(t, "event");
                this.f28658a = t;
            }

            /* renamed from: a */
            public final T mo42408a() {
                return this.f28658a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C5816a) && vx2.m53586b(this.f28658a, ((C5816a) obj).f28658a);
            }

            public int hashCode() {
                return this.f28658a.hashCode();
            }

            public String toString() {
                return "Event(event=" + this.f28658a + ')';
            }
        }

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo44877d2 = {"Let1$d$b;", "Let1$d;", "<init>", "()V", "scarlet"}, mo44878k = 1, mo44879mv = {1, 5, 1})
        /* renamed from: et1$d$b */
        /* compiled from: Event.kt */
        public static final class C5817b extends C5815d {

            /* renamed from: a */
            public static final C5817b f28659a = new C5817b();

            public C5817b() {
                super((DefaultConstructorMarker) null);
            }
        }

        public C5815d() {
            super((DefaultConstructorMarker) null);
        }

        public /* synthetic */ C5815d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public et1() {
    }

    public /* synthetic */ et1(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
