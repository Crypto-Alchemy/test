package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.C6121jt;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0003\u0007\b\t¨\u0006\n"}, mo44877d2 = {"Lht;", "", "<init>", "()V", "a", "b", "c", "Lht$a;", "Lht$b;", "Lht$c;", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: ht */
/* compiled from: Auth.kt */
public abstract class C5931ht {

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0016"}, mo44877d2 = {"Lht$a;", "Lht;", "", "toString", "", "hashCode", "", "other", "", "equals", "", "a", "J", "()J", "id", "Ljt$c;", "b", "Ljt$c;", "()Ljt$c;", "payloadParams", "<init>", "(JLjt$c;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: ht$a */
    /* compiled from: Auth.kt */
    public static final class C5932a extends C5931ht {

        /* renamed from: a */
        public final long f29714a;

        /* renamed from: b */
        public final C6121jt.C6124c f29715b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5932a(long j, C6121jt.C6124c cVar) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(cVar, "payloadParams");
            this.f29714a = j;
            this.f29715b = cVar;
        }

        /* renamed from: a */
        public final long mo43378a() {
            return this.f29714a;
        }

        /* renamed from: b */
        public final C6121jt.C6124c mo43379b() {
            return this.f29715b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5932a)) {
                return false;
            }
            C5932a aVar = (C5932a) obj;
            return this.f29714a == aVar.f29714a && vx2.m53586b(this.f29715b, aVar.f29715b);
        }

        public int hashCode() {
            return (au0.m10781a(this.f29714a) * 31) + this.f29715b.hashCode();
        }

        public String toString() {
            long j = this.f29714a;
            C6121jt.C6124c cVar = this.f29715b;
            return "AuthRequest(id=" + j + ", payloadParams=" + cVar + ")";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, mo44877d2 = {"Lht$b;", "Lht;", "", "toString", "", "hashCode", "", "other", "", "equals", "Ljt$a;", "a", "Ljt$a;", "getState", "()Ljt$a;", "state", "<init>", "(Ljt$a;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: ht$b */
    /* compiled from: Auth.kt */
    public static final class C5933b extends C5931ht {

        /* renamed from: a */
        public final C6121jt.C6122a f29716a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5933b(C6121jt.C6122a aVar) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(aVar, "state");
            this.f29716a = aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C5933b) && vx2.m53586b(this.f29716a, ((C5933b) obj).f29716a);
        }

        public int hashCode() {
            return this.f29716a.hashCode();
        }

        public String toString() {
            C6121jt.C6122a aVar = this.f29716a;
            return "ConnectionStateChange(state=" + aVar + ")";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, mo44877d2 = {"Lht$c;", "Lht;", "", "toString", "", "hashCode", "", "other", "", "equals", "Ljt$b;", "a", "Ljt$b;", "()Ljt$b;", "error", "<init>", "(Ljt$b;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: ht$c */
    /* compiled from: Auth.kt */
    public static final class C5934c extends C5931ht {

        /* renamed from: a */
        public final C6121jt.C6123b f29717a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5934c(C6121jt.C6123b bVar) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(bVar, "error");
            this.f29717a = bVar;
        }

        /* renamed from: a */
        public final C6121jt.C6123b mo43386a() {
            return this.f29717a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C5934c) && vx2.m53586b(this.f29717a, ((C5934c) obj).f29717a);
        }

        public int hashCode() {
            return this.f29717a.hashCode();
        }

        public String toString() {
            C6121jt.C6123b bVar = this.f29717a;
            return "Error(error=" + bVar + ")";
        }
    }

    public C5931ht() {
    }

    public /* synthetic */ C5931ht(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
