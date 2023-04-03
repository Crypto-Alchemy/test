package com.walletconnect.foundation.network.model;

import com.trustwallet.walletconnect.WCClientKt;
import com.walletconnect.foundation.network.model.RelayDTO;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0018\u001a\u0004\b\u0015\u0010\u0019¨\u0006\u001c"}, mo44877d2 = {"com/walletconnect/foundation/network/model/RelayDTO$Subscription$Result$JsonRpcError", "Lcom/walletconnect/foundation/network/model/RelayDTO$Subscription;", "", "jsonrpc", "Lcom/walletconnect/foundation/network/model/RelayDTO$Error;", "error", "", "id", "Lcom/walletconnect/foundation/network/model/RelayDTO$Subscription$Result$JsonRpcError;", "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "Lcom/walletconnect/foundation/network/model/RelayDTO$Error;", "()Lcom/walletconnect/foundation/network/model/RelayDTO$Error;", "J", "()J", "<init>", "(Ljava/lang/String;Lcom/walletconnect/foundation/network/model/RelayDTO$Error;J)V", "foundation"}, mo44878k = 1, mo44879mv = {1, 7, 1})
@h43(generateAdapter = true)
/* compiled from: RelayDTO.kt */
public final class RelayDTO$Subscription$Result$JsonRpcError extends RelayDTO.Subscription {

    /* renamed from: a */
    public final String f27431a;

    /* renamed from: b */
    public final RelayDTO.Error f27432b;

    /* renamed from: c */
    public final long f27433c;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RelayDTO$Subscription$Result$JsonRpcError(String str, RelayDTO.Error error, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? WCClientKt.JSONRPC_VERSION : str, error, j);
    }

    /* renamed from: a */
    public final RelayDTO.Error mo40878a() {
        return this.f27432b;
    }

    /* renamed from: b */
    public long mo40879b() {
        return this.f27433c;
    }

    /* renamed from: c */
    public String mo40880c() {
        return this.f27431a;
    }

    public final RelayDTO$Subscription$Result$JsonRpcError copy(@y33(name = "jsonrpc") String str, @y33(name = "error") RelayDTO.Error error, @y33(name = "id") long j) {
        vx2.m53591g(str, "jsonrpc");
        vx2.m53591g(error, "error");
        return new RelayDTO$Subscription$Result$JsonRpcError(str, error, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RelayDTO$Subscription$Result$JsonRpcError)) {
            return false;
        }
        RelayDTO$Subscription$Result$JsonRpcError relayDTO$Subscription$Result$JsonRpcError = (RelayDTO$Subscription$Result$JsonRpcError) obj;
        return vx2.m53586b(mo40880c(), relayDTO$Subscription$Result$JsonRpcError.mo40880c()) && vx2.m53586b(this.f27432b, relayDTO$Subscription$Result$JsonRpcError.f27432b) && mo40879b() == relayDTO$Subscription$Result$JsonRpcError.mo40879b();
    }

    public int hashCode() {
        return (((mo40880c().hashCode() * 31) + this.f27432b.hashCode()) * 31) + au0.m10781a(mo40879b());
    }

    public String toString() {
        String c = mo40880c();
        RelayDTO.Error error = this.f27432b;
        long b = mo40879b();
        return "JsonRpcError(jsonrpc=" + c + ", error=" + error + ", id=" + b + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RelayDTO$Subscription$Result$JsonRpcError(@y33(name = "jsonrpc") String str, @y33(name = "error") RelayDTO.Error error, @y33(name = "id") long j) {
        super((DefaultConstructorMarker) null);
        vx2.m53591g(str, "jsonrpc");
        vx2.m53591g(error, "error");
        this.f27431a = str;
        this.f27432b = error;
        this.f27433c = j;
    }
}
