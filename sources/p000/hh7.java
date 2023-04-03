package p000;

import com.walletconnect.android.internal.common.model.RelayProtocolOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B,\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0004\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\b\u0010\n\u001a\u00020\u0002H\u0002R\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\r\u0010\u000eR \u0010\u0015\u001a\u00020\u00108\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0019\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0017\u001a\u0004\b\u0011\u0010\u0018R\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0012\u001a\u0004\b\u001a\u0010\u0014\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, mo44877d2 = {"Lhh7;", "", "", "e", "toString", "", "hashCode", "other", "", "equals", "a", "Les6;", "Les6;", "d", "()Les6;", "topic", "Lyj6;", "b", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "symKey", "Lcom/walletconnect/android/internal/common/model/RelayProtocolOptions;", "Lcom/walletconnect/android/internal/common/model/RelayProtocolOptions;", "()Lcom/walletconnect/android/internal/common/model/RelayProtocolOptions;", "relay", "getVersion", "version", "<init>", "(Les6;Ljava/lang/String;Lcom/walletconnect/android/internal/common/model/RelayProtocolOptions;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: hh7 */
/* compiled from: WalletConnectUri.kt */
public final class hh7 {

    /* renamed from: a */
    public final es6 f29640a;

    /* renamed from: b */
    public final String f29641b;

    /* renamed from: c */
    public final RelayProtocolOptions f29642c;

    /* renamed from: d */
    public final String f29643d;

    public hh7(es6 es6, String str, RelayProtocolOptions relayProtocolOptions, String str2) {
        this.f29640a = es6;
        this.f29641b = str;
        this.f29642c = relayProtocolOptions;
        this.f29643d = str2;
    }

    public /* synthetic */ hh7(es6 es6, String str, RelayProtocolOptions relayProtocolOptions, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(es6, str, relayProtocolOptions, str2);
    }

    /* renamed from: a */
    public final String mo43296a() {
        String str = "relay-protocol=" + this.f29642c.mo40328b();
        if (this.f29642c.mo40327a() == null) {
            return str;
        }
        return str + "&relay-data=" + this.f29642c.mo40327a();
    }

    /* renamed from: b */
    public final RelayProtocolOptions mo43297b() {
        return this.f29642c;
    }

    /* renamed from: c */
    public final String mo43298c() {
        return this.f29641b;
    }

    /* renamed from: d */
    public final es6 mo43299d() {
        return this.f29640a;
    }

    /* renamed from: e */
    public final String mo43300e() {
        String a = this.f29640a.mo42395a();
        String str = this.f29643d;
        String a2 = mo43296a();
        String str2 = this.f29641b;
        return "wc:" + a + "@" + str + "?" + a2 + "&symKey=" + str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hh7)) {
            return false;
        }
        hh7 hh7 = (hh7) obj;
        return vx2.m53586b(this.f29640a, hh7.f29640a) && yj6.m54791e(this.f29641b, hh7.f29641b) && vx2.m53586b(this.f29642c, hh7.f29642c) && vx2.m53586b(this.f29643d, hh7.f29643d);
    }

    public int hashCode() {
        return (((((this.f29640a.hashCode() * 31) + yj6.m54792f(this.f29641b)) * 31) + this.f29642c.hashCode()) * 31) + this.f29643d.hashCode();
    }

    public String toString() {
        es6 es6 = this.f29640a;
        String g = yj6.m54793g(this.f29641b);
        RelayProtocolOptions relayProtocolOptions = this.f29642c;
        String str = this.f29643d;
        return "WalletConnectUri(topic=" + es6 + ", symKey=" + g + ", relay=" + relayProtocolOptions + ", version=" + str + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hh7(es6 es6, String str, RelayProtocolOptions relayProtocolOptions, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(es6, str, relayProtocolOptions, (i & 8) != 0 ? "2" : str2, (DefaultConstructorMarker) null);
    }
}
