package com.walletconnect.android.internal.common.model.sync;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0016"}, mo44877d2 = {"Lcom/walletconnect/android/internal/common/model/sync/ClientJsonRpc;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", "J", "()J", "id", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "jsonrpc", "c", "method", "<init>", "(JLjava/lang/String;Ljava/lang/String;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
@h43(generateAdapter = true)
/* compiled from: ClientJsonRpc.kt */
public final class ClientJsonRpc {

    /* renamed from: a */
    public final long f27179a;

    /* renamed from: b */
    public final String f27180b;

    /* renamed from: c */
    public final String f27181c;

    public ClientJsonRpc(long j, String str, String str2) {
        vx2.m53591g(str, "jsonrpc");
        vx2.m53591g(str2, "method");
        this.f27179a = j;
        this.f27180b = str;
        this.f27181c = str2;
    }

    /* renamed from: a */
    public final long mo40413a() {
        return this.f27179a;
    }

    /* renamed from: b */
    public final String mo40414b() {
        return this.f27180b;
    }

    /* renamed from: c */
    public final String mo40415c() {
        return this.f27181c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClientJsonRpc)) {
            return false;
        }
        ClientJsonRpc clientJsonRpc = (ClientJsonRpc) obj;
        return this.f27179a == clientJsonRpc.f27179a && vx2.m53586b(this.f27180b, clientJsonRpc.f27180b) && vx2.m53586b(this.f27181c, clientJsonRpc.f27181c);
    }

    public int hashCode() {
        return (((au0.m10781a(this.f27179a) * 31) + this.f27180b.hashCode()) * 31) + this.f27181c.hashCode();
    }

    public String toString() {
        long j = this.f27179a;
        String str = this.f27180b;
        String str2 = this.f27181c;
        return "ClientJsonRpc(id=" + j + ", jsonrpc=" + str + ", method=" + str2 + ")";
    }
}
