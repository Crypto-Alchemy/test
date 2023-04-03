package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b@\u0018\u0000 \u001e*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0003\u0013\u001e\u001dB\u0016\b\u0001\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0004J\u000f\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0000X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0015\u0010\u0016R\u0011\u0010\u001a\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001c\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019\u0001\u0017\u0001\u0004\u0018\u00010\u0002ø\u0001\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, mo44877d2 = {"Lqd0;", "T", "", "f", "(Ljava/lang/Object;)Ljava/lang/Object;", "g", "", "e", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "", "k", "(Ljava/lang/Object;)Ljava/lang/String;", "", "h", "(Ljava/lang/Object;)I", "other", "", "d", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "getHolder$annotations", "()V", "holder", "j", "(Ljava/lang/Object;)Z", "isSuccess", "i", "isClosed", "c", "b", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: qd0 */
/* compiled from: Channel.kt */
public final class qd0<T> {

    /* renamed from: b */
    public static final C9211b f44172b = new C9211b((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final C9212c f44173c = new C9212c();

    /* renamed from: a */
    public final Object f44174a;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0016\u0010\r\u001a\u0004\u0018\u00010\n8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, mo44877d2 = {"Lqd0$a;", "Lqd0$c;", "", "other", "", "equals", "", "hashCode", "", "toString", "", "a", "Ljava/lang/Throwable;", "cause", "<init>", "(Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: qd0$a */
    /* compiled from: Channel.kt */
    public static final class C9210a extends C9212c {

        /* renamed from: a */
        public final Throwable f44175a;

        public C9210a(Throwable th) {
            this.f44175a = th;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C9210a) || !vx2.m53586b(this.f44175a, ((C9210a) obj).f44175a)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            Throwable th = this.f44175a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "Closed(" + this.f44175a + ')';
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J,\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0001\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0001\u0010\u0002H\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0001\u0010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, mo44877d2 = {"Lqd0$b;", "", "E", "value", "Lqd0;", "c", "(Ljava/lang/Object;)Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "", "cause", "a", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "Lqd0$c;", "failed", "Lqd0$c;", "<init>", "()V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: qd0$b */
    /* compiled from: Channel.kt */
    public static final class C9211b {
        public C9211b() {
        }

        public /* synthetic */ C9211b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final <E> Object mo65450a(Throwable th) {
            return qd0.m71224c(new C9210a(th));
        }

        /* renamed from: b */
        public final <E> Object mo65451b() {
            return qd0.m71224c(qd0.f44173c);
        }

        /* renamed from: c */
        public final <E> Object mo65452c(E e) {
            return qd0.m71224c(e);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo44877d2 = {"Lqd0$c;", "", "", "toString", "<init>", "()V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: qd0$c */
    /* compiled from: Channel.kt */
    public static class C9212c {
        public String toString() {
            return "Failed";
        }
    }

    public /* synthetic */ qd0(Object obj) {
        this.f44174a = obj;
    }

    /* renamed from: b */
    public static final /* synthetic */ qd0 m71223b(Object obj) {
        return new qd0(obj);
    }

    /* renamed from: c */
    public static <T> Object m71224c(Object obj) {
        return obj;
    }

    /* renamed from: d */
    public static boolean m71225d(Object obj, Object obj2) {
        return (obj2 instanceof qd0) && vx2.m53586b(obj, ((qd0) obj2).mo65445l());
    }

    /* renamed from: e */
    public static final Throwable m71226e(Object obj) {
        C9210a aVar;
        if (obj instanceof C9210a) {
            aVar = (C9210a) obj;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            return aVar.f44175a;
        }
        return null;
    }

    /* renamed from: f */
    public static final T m71227f(Object obj) {
        if (!(obj instanceof C9212c)) {
            return obj;
        }
        return null;
    }

    /* renamed from: g */
    public static final T m71228g(Object obj) {
        Throwable th;
        if (!(obj instanceof C9212c)) {
            return obj;
        }
        if (!(obj instanceof C9210a) || (th = ((C9210a) obj).f44175a) == null) {
            throw new IllegalStateException(("Trying to call 'getOrThrow' on a failed channel result: " + obj).toString());
        }
        throw th;
    }

    /* renamed from: h */
    public static int m71229h(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: i */
    public static final boolean m71230i(Object obj) {
        return obj instanceof C9210a;
    }

    /* renamed from: j */
    public static final boolean m71231j(Object obj) {
        return !(obj instanceof C9212c);
    }

    /* renamed from: k */
    public static String m71232k(Object obj) {
        if (obj instanceof C9210a) {
            return ((C9210a) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m71225d(this.f44174a, obj);
    }

    public int hashCode() {
        return m71229h(this.f44174a);
    }

    /* renamed from: l */
    public final /* synthetic */ Object mo65445l() {
        return this.f44174a;
    }

    public String toString() {
        return m71232k(this.f44174a);
    }
}
