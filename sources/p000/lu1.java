package p000;

import com.walletconnect.auth.common.model.PayloadParams;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, mo44877d2 = {"Llu1;", "Lbq1;", "<init>", "()V", "a", "b", "Llu1$a;", "Llu1$b;", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: lu1 */
/* compiled from: Events.kt */
public abstract class lu1 implements bq1 {

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0016"}, mo44877d2 = {"Llu1$a;", "Llu1;", "", "toString", "", "hashCode", "", "other", "", "equals", "", "a", "J", "()J", "id", "Lcom/walletconnect/auth/common/model/PayloadParams;", "b", "Lcom/walletconnect/auth/common/model/PayloadParams;", "()Lcom/walletconnect/auth/common/model/PayloadParams;", "payloadParams", "<init>", "(JLcom/walletconnect/auth/common/model/PayloadParams;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: lu1$a */
    /* compiled from: Events.kt */
    public static final class C6229a extends lu1 {

        /* renamed from: a */
        public final long f31399a;

        /* renamed from: b */
        public final PayloadParams f31400b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6229a(long j, PayloadParams payloadParams) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(payloadParams, "payloadParams");
            this.f31399a = j;
            this.f31400b = payloadParams;
        }

        /* renamed from: a */
        public final long mo45527a() {
            return this.f31399a;
        }

        /* renamed from: b */
        public final PayloadParams mo45528b() {
            return this.f31400b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6229a)) {
                return false;
            }
            C6229a aVar = (C6229a) obj;
            return this.f31399a == aVar.f31399a && vx2.m53586b(this.f31400b, aVar.f31400b);
        }

        public int hashCode() {
            return (au0.m10781a(this.f31399a) * 31) + this.f31400b.hashCode();
        }

        public String toString() {
            long j = this.f31399a;
            PayloadParams payloadParams = this.f31400b;
            return "OnAuthRequest(id=" + j + ", payloadParams=" + payloadParams + ")";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, mo44877d2 = {"Llu1$b;", "Llu1;", "", "toString", "", "hashCode", "", "other", "", "equals", "", "a", "J", "getId", "()J", "id", "Lpt;", "b", "Lpt;", "getResponse", "()Lpt;", "response", "<init>", "(JLpt;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: lu1$b */
    /* compiled from: Events.kt */
    public static final class C6230b extends lu1 {

        /* renamed from: a */
        public final long f31401a;

        /* renamed from: b */
        public final C6372pt f31402b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6230b(long j, C6372pt ptVar) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(ptVar, "response");
            this.f31401a = j;
            this.f31402b = ptVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6230b)) {
                return false;
            }
            C6230b bVar = (C6230b) obj;
            return this.f31401a == bVar.f31401a && vx2.m53586b(this.f31402b, bVar.f31402b);
        }

        public int hashCode() {
            return (au0.m10781a(this.f31401a) * 31) + this.f31402b.hashCode();
        }

        public String toString() {
            long j = this.f31401a;
            C6372pt ptVar = this.f31402b;
            return "OnAuthResponse(id=" + j + ", response=" + ptVar + ")";
        }
    }

    public lu1() {
    }

    public /* synthetic */ lu1(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
