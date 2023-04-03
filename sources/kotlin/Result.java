package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b@\u0018\u0000 !*\u0006\b\u0000\u0010\u0001 \u00012\u00060\u0002j\u0002`\u0003:\u0002\"#B\u0016\b\u0001\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000f\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0015\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00108\u0000X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001c\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001e\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001b\u0001\u0016\u0001\u0004\u0018\u00010\u0010ø\u0001\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, mo44877d2 = {"Lkotlin/Result;", "T", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "exceptionOrNull-impl", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "exceptionOrNull", "", "toString-impl", "(Ljava/lang/Object;)Ljava/lang/String;", "toString", "", "hashCode-impl", "(Ljava/lang/Object;)I", "hashCode", "", "other", "", "equals-impl", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "equals", "value", "Ljava/lang/Object;", "getValue$annotations", "()V", "isSuccess-impl", "(Ljava/lang/Object;)Z", "isSuccess", "isFailure-impl", "isFailure", "constructor-impl", "(Ljava/lang/Object;)Ljava/lang/Object;", "Companion", "a", "Failure", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: Result.kt */
public final class Result<T> implements Serializable {
    public static final C6167a Companion = new C6167a((DefaultConstructorMarker) null);
    private final Object value;

    @Metadata(mo44876d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, mo44877d2 = {"Lkotlin/Result$Failure;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "exception", "", "(Ljava/lang/Throwable;)V", "equals", "", "other", "", "hashCode", "", "toString", "", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* compiled from: Result.kt */
    public static final class Failure implements Serializable {
        public final Throwable exception;

        public Failure(Throwable th) {
            vx2.m53591g(th, "exception");
            this.exception = th;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Failure) || !vx2.m53586b(this.exception, ((Failure) obj).exception)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.exception.hashCode();
        }

        public String toString() {
            return "Failure(" + this.exception + ')';
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo44877d2 = {"Lkotlin/Result$a;", "", "<init>", "()V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: kotlin.Result$a */
    /* compiled from: Result.kt */
    public static final class C6167a {
        public C6167a() {
        }

        public /* synthetic */ C6167a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ Result(Object obj) {
        this.value = obj;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ Result m75634boximpl(Object obj) {
        return new Result(obj);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static <T> Object m75635constructorimpl(Object obj) {
        return obj;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m75636equalsimpl(Object obj, Object obj2) {
        return (obj2 instanceof Result) && vx2.m53586b(obj, ((Result) obj2).m75643unboximpl());
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m75637equalsimpl0(Object obj, Object obj2) {
        return vx2.m53586b(obj, obj2);
    }

    /* renamed from: exceptionOrNull-impl  reason: not valid java name */
    public static final Throwable m75638exceptionOrNullimpl(Object obj) {
        if (obj instanceof Failure) {
            return ((Failure) obj).exception;
        }
        return null;
    }

    public static /* synthetic */ void getValue$annotations() {
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m75639hashCodeimpl(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: isFailure-impl  reason: not valid java name */
    public static final boolean m75640isFailureimpl(Object obj) {
        return obj instanceof Failure;
    }

    /* renamed from: isSuccess-impl  reason: not valid java name */
    public static final boolean m75641isSuccessimpl(Object obj) {
        return !(obj instanceof Failure);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m75642toStringimpl(Object obj) {
        if (obj instanceof Failure) {
            return ((Failure) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m75636equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m75639hashCodeimpl(this.value);
    }

    public String toString() {
        return m75642toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ Object m75643unboximpl() {
        return this.value;
    }
}
