package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0001\u0002\u0007\b¨\u0006\t"}, mo44877d2 = {"Lhd1;", "T", "", "<init>", "()V", "a", "b", "Lhd1$b;", "Lhd1$a;", "scarlet-core"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* renamed from: hd1 */
/* compiled from: Deserialization.kt */
public abstract class hd1<T> {

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\b\b\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0004\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007HÖ\u0003R\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, mo44877d2 = {"Lhd1$a;", "T", "Lhd1;", "", "toString", "", "hashCode", "", "other", "", "equals", "", "a", "Ljava/lang/Throwable;", "getThrowable", "()Ljava/lang/Throwable;", "throwable", "<init>", "(Ljava/lang/Throwable;)V", "scarlet-core"}, mo44878k = 1, mo44879mv = {1, 5, 1})
    /* renamed from: hd1$a */
    /* compiled from: Deserialization.kt */
    public static final class C5892a<T> extends hd1<T> {

        /* renamed from: a */
        public final Throwable f29538a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5892a(Throwable th) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(th, "throwable");
            this.f29538a = th;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C5892a) && vx2.m53586b(this.f29538a, ((C5892a) obj).f29538a);
        }

        public int hashCode() {
            return this.f29538a.hashCode();
        }

        public String toString() {
            return "Error(throwable=" + this.f29538a + ')';
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u000f\u0012\u0006\u0010\u000e\u001a\u00028\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0004\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007HÖ\u0003R\u0017\u0010\u000e\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, mo44877d2 = {"Lhd1$b;", "T", "Lhd1;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "value", "<init>", "(Ljava/lang/Object;)V", "scarlet-core"}, mo44878k = 1, mo44879mv = {1, 5, 1})
    /* renamed from: hd1$b */
    /* compiled from: Deserialization.kt */
    public static final class C5893b<T> extends hd1<T> {

        /* renamed from: a */
        public final T f29539a;

        public C5893b(T t) {
            super((DefaultConstructorMarker) null);
            this.f29539a = t;
        }

        /* renamed from: a */
        public final T mo43143a() {
            return this.f29539a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C5893b) && vx2.m53586b(this.f29539a, ((C5893b) obj).f29539a);
        }

        public int hashCode() {
            T t = this.f29539a;
            if (t == null) {
                return 0;
            }
            return t.hashCode();
        }

        public String toString() {
            return "Success(value=" + this.f29539a + ')';
        }
    }

    public hd1() {
    }

    public /* synthetic */ hd1(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
