package com.walletconnect.android.internal.common.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\t\u0010\f¨\u0006\u0011"}, mo44877d2 = {"Lcom/walletconnect/android/internal/common/model/RelayProtocolOptions;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "protocol", "data", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
@h43(generateAdapter = true)
/* compiled from: RelayProtocolOptions.kt */
public final class RelayProtocolOptions {

    /* renamed from: a */
    public final String f27131a;

    /* renamed from: b */
    public final String f27132b;

    public RelayProtocolOptions() {
        this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    public RelayProtocolOptions(String str, String str2) {
        vx2.m53591g(str, "protocol");
        this.f27131a = str;
        this.f27132b = str2;
    }

    /* renamed from: a */
    public final String mo40327a() {
        return this.f27132b;
    }

    /* renamed from: b */
    public final String mo40328b() {
        return this.f27131a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RelayProtocolOptions)) {
            return false;
        }
        RelayProtocolOptions relayProtocolOptions = (RelayProtocolOptions) obj;
        return vx2.m53586b(this.f27131a, relayProtocolOptions.f27131a) && vx2.m53586b(this.f27132b, relayProtocolOptions.f27132b);
    }

    public int hashCode() {
        int hashCode = this.f27131a.hashCode() * 31;
        String str = this.f27132b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.f27131a;
        String str2 = this.f27132b;
        return "RelayProtocolOptions(protocol=" + str + ", data=" + str2 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RelayProtocolOptions(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "irn" : str, (i & 2) != 0 ? null : str2);
    }
}
