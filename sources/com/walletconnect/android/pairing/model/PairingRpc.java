package com.walletconnect.android.pairing.model;

import com.trustwallet.walletconnect.WCClientKt;
import com.walletconnect.android.pairing.model.PairingParams;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0001\u0002\u0007\b¨\u0006\t"}, mo44877d2 = {"Lcom/walletconnect/android/pairing/model/PairingRpc;", "Lo63;", "Lcom/walletconnect/android/pairing/model/PairingParams;", "<init>", "()V", "PairingDelete", "PairingPing", "Lcom/walletconnect/android/pairing/model/PairingRpc$PairingDelete;", "Lcom/walletconnect/android/pairing/model/PairingRpc$PairingPing;", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: PairingRpc.kt */
public abstract class PairingRpc implements o63<PairingParams> {

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ1\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\b\b\u0003\u0010\b\u001a\u00020\u0007HÆ\u0001J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u0017R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0015\u0010\u001c¨\u0006\u001f"}, mo44877d2 = {"Lcom/walletconnect/android/pairing/model/PairingRpc$PairingDelete;", "Lcom/walletconnect/android/pairing/model/PairingRpc;", "", "id", "", "jsonrpc", "method", "Lcom/walletconnect/android/pairing/model/PairingParams$DeleteParams;", "params", "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "J", "getId", "()J", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "c", "getMethod", "d", "Lcom/walletconnect/android/pairing/model/PairingParams$DeleteParams;", "()Lcom/walletconnect/android/pairing/model/PairingParams$DeleteParams;", "<init>", "(JLjava/lang/String;Ljava/lang/String;Lcom/walletconnect/android/pairing/model/PairingParams$DeleteParams;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    @h43(generateAdapter = true)
    /* compiled from: PairingRpc.kt */
    public static final class PairingDelete extends PairingRpc {

        /* renamed from: a */
        public final long f27227a;

        /* renamed from: b */
        public final String f27228b;

        /* renamed from: c */
        public final String f27229c;

        /* renamed from: d */
        public final PairingParams.DeleteParams f27230d;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ PairingDelete(long j, String str, String str2, PairingParams.DeleteParams deleteParams, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, (i & 2) != 0 ? WCClientKt.JSONRPC_VERSION : str, (i & 4) != 0 ? "wc_pairingDelete" : str2, deleteParams);
        }

        /* renamed from: a */
        public String mo40512a() {
            return this.f27228b;
        }

        /* renamed from: b */
        public PairingParams.DeleteParams getParams() {
            return this.f27230d;
        }

        public final PairingDelete copy(@y33(name = "id") long j, @y33(name = "jsonrpc") String str, @y33(name = "method") String str2, @y33(name = "params") PairingParams.DeleteParams deleteParams) {
            vx2.m53591g(str, "jsonrpc");
            vx2.m53591g(str2, "method");
            vx2.m53591g(deleteParams, "params");
            return new PairingDelete(j, str, str2, deleteParams);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PairingDelete)) {
                return false;
            }
            PairingDelete pairingDelete = (PairingDelete) obj;
            return getId() == pairingDelete.getId() && vx2.m53586b(mo40512a(), pairingDelete.mo40512a()) && vx2.m53586b(getMethod(), pairingDelete.getMethod()) && vx2.m53586b(getParams(), pairingDelete.getParams());
        }

        public long getId() {
            return this.f27227a;
        }

        public String getMethod() {
            return this.f27229c;
        }

        public int hashCode() {
            return (((((au0.m10781a(getId()) * 31) + mo40512a().hashCode()) * 31) + getMethod().hashCode()) * 31) + getParams().hashCode();
        }

        public String toString() {
            long id = getId();
            String a = mo40512a();
            String method = getMethod();
            PairingParams.DeleteParams b = getParams();
            return "PairingDelete(id=" + id + ", jsonrpc=" + a + ", method=" + method + ", params=" + b + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public PairingDelete(@y33(name = "id") long j, @y33(name = "jsonrpc") String str, @y33(name = "method") String str2, @y33(name = "params") PairingParams.DeleteParams deleteParams) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(str, "jsonrpc");
            vx2.m53591g(str2, "method");
            vx2.m53591g(deleteParams, "params");
            this.f27227a = j;
            this.f27228b = str;
            this.f27229c = str2;
            this.f27230d = deleteParams;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ1\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\b\b\u0003\u0010\b\u001a\u00020\u0007HÆ\u0001J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u0017R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0015\u0010\u001c¨\u0006\u001f"}, mo44877d2 = {"Lcom/walletconnect/android/pairing/model/PairingRpc$PairingPing;", "Lcom/walletconnect/android/pairing/model/PairingRpc;", "", "id", "", "jsonrpc", "method", "Lcom/walletconnect/android/pairing/model/PairingParams$a;", "params", "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "J", "getId", "()J", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "c", "getMethod", "d", "Lcom/walletconnect/android/pairing/model/PairingParams$a;", "()Lcom/walletconnect/android/pairing/model/PairingParams$a;", "<init>", "(JLjava/lang/String;Ljava/lang/String;Lcom/walletconnect/android/pairing/model/PairingParams$a;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    @h43(generateAdapter = true)
    /* compiled from: PairingRpc.kt */
    public static final class PairingPing extends PairingRpc {

        /* renamed from: a */
        public final long f27231a;

        /* renamed from: b */
        public final String f27232b;

        /* renamed from: c */
        public final String f27233c;

        /* renamed from: d */
        public final PairingParams.C5576a f27234d;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ PairingPing(long j, String str, String str2, PairingParams.C5576a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, (i & 2) != 0 ? WCClientKt.JSONRPC_VERSION : str, (i & 4) != 0 ? "wc_pairingPing" : str2, aVar);
        }

        /* renamed from: a */
        public String mo40521a() {
            return this.f27232b;
        }

        /* renamed from: b */
        public PairingParams.C5576a getParams() {
            return this.f27234d;
        }

        public final PairingPing copy(@y33(name = "id") long j, @y33(name = "jsonrpc") String str, @y33(name = "method") String str2, @y33(name = "params") PairingParams.C5576a aVar) {
            vx2.m53591g(str, "jsonrpc");
            vx2.m53591g(str2, "method");
            vx2.m53591g(aVar, "params");
            return new PairingPing(j, str, str2, aVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PairingPing)) {
                return false;
            }
            PairingPing pairingPing = (PairingPing) obj;
            return getId() == pairingPing.getId() && vx2.m53586b(mo40521a(), pairingPing.mo40521a()) && vx2.m53586b(getMethod(), pairingPing.getMethod()) && vx2.m53586b(getParams(), pairingPing.getParams());
        }

        public long getId() {
            return this.f27231a;
        }

        public String getMethod() {
            return this.f27233c;
        }

        public int hashCode() {
            return (((((au0.m10781a(getId()) * 31) + mo40521a().hashCode()) * 31) + getMethod().hashCode()) * 31) + getParams().hashCode();
        }

        public String toString() {
            long id = getId();
            String a = mo40521a();
            String method = getMethod();
            PairingParams.C5576a b = getParams();
            return "PairingPing(id=" + id + ", jsonrpc=" + a + ", method=" + method + ", params=" + b + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public PairingPing(@y33(name = "id") long j, @y33(name = "jsonrpc") String str, @y33(name = "method") String str2, @y33(name = "params") PairingParams.C5576a aVar) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(str, "jsonrpc");
            vx2.m53591g(str2, "method");
            vx2.m53591g(aVar, "params");
            this.f27231a = j;
            this.f27232b = str;
            this.f27233c = str2;
            this.f27234d = aVar;
        }
    }

    private PairingRpc() {
    }

    public /* synthetic */ PairingRpc(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
