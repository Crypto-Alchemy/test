package com.walletconnect.android.echo.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0002HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000e\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0014"}, mo44877d2 = {"Lcom/walletconnect/android/echo/model/EchoBody;", "", "", "clientId", "token", "type", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "c", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
@h43(generateAdapter = true)
/* compiled from: EchoBody.kt */
public final class EchoBody {

    /* renamed from: a */
    public final String f27018a;

    /* renamed from: b */
    public final String f27019b;

    /* renamed from: c */
    public final String f27020c;

    public EchoBody(@y33(name = "client_id") String str, @y33(name = "token") String str2, @y33(name = "type") String str3) {
        vx2.m53591g(str, "clientId");
        vx2.m53591g(str2, "token");
        vx2.m53591g(str3, "type");
        this.f27018a = str;
        this.f27019b = str2;
        this.f27020c = str3;
    }

    /* renamed from: a */
    public final String mo40099a() {
        return this.f27018a;
    }

    /* renamed from: b */
    public final String mo40100b() {
        return this.f27019b;
    }

    /* renamed from: c */
    public final String mo40101c() {
        return this.f27020c;
    }

    public final EchoBody copy(@y33(name = "client_id") String str, @y33(name = "token") String str2, @y33(name = "type") String str3) {
        vx2.m53591g(str, "clientId");
        vx2.m53591g(str2, "token");
        vx2.m53591g(str3, "type");
        return new EchoBody(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EchoBody)) {
            return false;
        }
        EchoBody echoBody = (EchoBody) obj;
        return vx2.m53586b(this.f27018a, echoBody.f27018a) && vx2.m53586b(this.f27019b, echoBody.f27019b) && vx2.m53586b(this.f27020c, echoBody.f27020c);
    }

    public int hashCode() {
        return (((this.f27018a.hashCode() * 31) + this.f27019b.hashCode()) * 31) + this.f27020c.hashCode();
    }

    public String toString() {
        String str = this.f27018a;
        String str2 = this.f27019b;
        String str3 = this.f27020c;
        return "EchoBody(clientId=" + str + ", token=" + str2 + ", type=" + str3 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EchoBody(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? "fcm" : str3);
    }
}
