package com.walletconnect.android.internal.common.model;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0002HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\r\u0010\u0012¨\u0006\u0015"}, mo44877d2 = {"Lcom/walletconnect/android/internal/common/model/SessionProposer;", "", "", "publicKey", "Lcom/walletconnect/android/internal/common/model/AppMetaData;", "metadata", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lcom/walletconnect/android/internal/common/model/AppMetaData;", "()Lcom/walletconnect/android/internal/common/model/AppMetaData;", "<init>", "(Ljava/lang/String;Lcom/walletconnect/android/internal/common/model/AppMetaData;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
@h43(generateAdapter = true)
/* compiled from: SessionProposer.kt */
public final class SessionProposer {

    /* renamed from: a */
    public final String f27137a;

    /* renamed from: b */
    public final AppMetaData f27138b;

    public SessionProposer(@y33(name = "publicKey") String str, @y33(name = "metadata") AppMetaData appMetaData) {
        vx2.m53591g(str, "publicKey");
        vx2.m53591g(appMetaData, "metadata");
        this.f27137a = str;
        this.f27138b = appMetaData;
    }

    /* renamed from: a */
    public final AppMetaData mo40335a() {
        return this.f27138b;
    }

    /* renamed from: b */
    public final String mo40336b() {
        return this.f27137a;
    }

    public final SessionProposer copy(@y33(name = "publicKey") String str, @y33(name = "metadata") AppMetaData appMetaData) {
        vx2.m53591g(str, "publicKey");
        vx2.m53591g(appMetaData, "metadata");
        return new SessionProposer(str, appMetaData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionProposer)) {
            return false;
        }
        SessionProposer sessionProposer = (SessionProposer) obj;
        return vx2.m53586b(this.f27137a, sessionProposer.f27137a) && vx2.m53586b(this.f27138b, sessionProposer.f27138b);
    }

    public int hashCode() {
        return (this.f27137a.hashCode() * 31) + this.f27138b.hashCode();
    }

    public String toString() {
        String str = this.f27137a;
        AppMetaData appMetaData = this.f27138b;
        return "SessionProposer(publicKey=" + str + ", metadata=" + appMetaData + ")";
    }
}
