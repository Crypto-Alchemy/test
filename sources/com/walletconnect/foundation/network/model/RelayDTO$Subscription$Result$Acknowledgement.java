package com.walletconnect.foundation.network.model;

import com.trustwallet.walletconnect.WCClientKt;
import com.walletconnect.foundation.network.model.RelayDTO;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u001b"}, mo44877d2 = {"com/walletconnect/foundation/network/model/RelayDTO$Subscription$Result$Acknowledgement", "Lcom/walletconnect/foundation/network/model/RelayDTO$Subscription;", "", "id", "", "jsonrpc", "", "result", "Lcom/walletconnect/foundation/network/model/RelayDTO$Subscription$Result$Acknowledgement;", "copy", "toString", "", "hashCode", "", "other", "equals", "a", "J", "()J", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "c", "Z", "()Z", "<init>", "(JLjava/lang/String;Z)V", "foundation"}, mo44878k = 1, mo44879mv = {1, 7, 1})
@h43(generateAdapter = true)
/* compiled from: RelayDTO.kt */
public final class RelayDTO$Subscription$Result$Acknowledgement extends RelayDTO.Subscription {

    /* renamed from: a */
    public final long f27428a;

    /* renamed from: b */
    public final String f27429b;

    /* renamed from: c */
    public final boolean f27430c;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RelayDTO$Subscription$Result$Acknowledgement(long j, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? WCClientKt.JSONRPC_VERSION : str, z);
    }

    /* renamed from: a */
    public long mo40871a() {
        return this.f27428a;
    }

    /* renamed from: b */
    public String mo40872b() {
        return this.f27429b;
    }

    /* renamed from: c */
    public final boolean mo40873c() {
        return this.f27430c;
    }

    public final RelayDTO$Subscription$Result$Acknowledgement copy(@y33(name = "id") long j, @y33(name = "jsonrpc") String str, @y33(name = "result") boolean z) {
        vx2.m53591g(str, "jsonrpc");
        return new RelayDTO$Subscription$Result$Acknowledgement(j, str, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RelayDTO$Subscription$Result$Acknowledgement)) {
            return false;
        }
        RelayDTO$Subscription$Result$Acknowledgement relayDTO$Subscription$Result$Acknowledgement = (RelayDTO$Subscription$Result$Acknowledgement) obj;
        return mo40871a() == relayDTO$Subscription$Result$Acknowledgement.mo40871a() && vx2.m53586b(mo40872b(), relayDTO$Subscription$Result$Acknowledgement.mo40872b()) && this.f27430c == relayDTO$Subscription$Result$Acknowledgement.f27430c;
    }

    public int hashCode() {
        int a = ((au0.m10781a(mo40871a()) * 31) + mo40872b().hashCode()) * 31;
        boolean z = this.f27430c;
        if (z) {
            z = true;
        }
        return a + (z ? 1 : 0);
    }

    public String toString() {
        long a = mo40871a();
        String b = mo40872b();
        boolean z = this.f27430c;
        return "Acknowledgement(id=" + a + ", jsonrpc=" + b + ", result=" + z + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RelayDTO$Subscription$Result$Acknowledgement(@y33(name = "id") long j, @y33(name = "jsonrpc") String str, @y33(name = "result") boolean z) {
        super((DefaultConstructorMarker) null);
        vx2.m53591g(str, "jsonrpc");
        this.f27428a = j;
        this.f27429b = str;
        this.f27430c = z;
    }
}
