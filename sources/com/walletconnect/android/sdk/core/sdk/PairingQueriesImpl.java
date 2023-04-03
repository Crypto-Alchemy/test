package com.walletconnect.android.sdk.core.sdk;

import com.squareup.sqldelight.C5463a;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001/B\u0017\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0006\u0010!\u001a\u00020\u001e¢\u0006\u0004\b-\u0010.J\u0001\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\b\b\u0000\u0010\u0004*\u00020\u00032f\u0010\n\u001ab\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00028\u00000\u0005H\u0016J\u0001\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\b\b\u0000\u0010\u0004*\u00020\u00032\u0006\u0010\r\u001a\u00020\u00062f\u0010\n\u001ab\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00028\u00000\u0005H\u0016JB\u0010\u0016\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\bH\u0016J\u0010\u0010\u0017\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\u0006H\u0016J \u0010\u0018\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0006H\u0016J\u0018\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0006H\u0016R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R$\u0010'\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\"8\u0000X\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R$\u0010*\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\"8\u0000X\u0004¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b)\u0010&R$\u0010,\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\"8\u0000X\u0004¢\u0006\f\n\u0004\b\u000e\u0010$\u001a\u0004\b+\u0010&¨\u00060"}, mo44877d2 = {"Lcom/walletconnect/android/sdk/core/sdk/PairingQueriesImpl;", "Lcom/squareup/sqldelight/a;", "Lnl4;", "", "T", "Lkotlin/Function12;", "", "", "", "", "mapper", "Lrz4;", "v", "topic", "h", "expiry", "relay_protocol", "relay_data", "uri", "methods", "is_active", "Lr37;", "w", "E", "D", "Y", "Lci;", "d", "Lci;", "database", "Lm76;", "e", "Lm76;", "driver", "", "f", "Ljava/util/List;", "j0", "()Ljava/util/List;", "getListOfPairing", "g", "k0", "getPairingByTopic", "l0", "hasTopic", "<init>", "(Lci;Lm76;)V", "GetPairingByTopicQuery", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: AndroidCoreDatabaseImpl.kt */
public final class PairingQueriesImpl extends C5463a implements nl4 {

    /* renamed from: d */
    public final C3944ci f27276d;

    /* renamed from: e */
    public final m76 f27277e;

    /* renamed from: f */
    public final List<rz4<?>> f27278f = fe2.m44300a();

    /* renamed from: g */
    public final List<rz4<?>> f27279g = fe2.m44300a();

    /* renamed from: h */
    public final List<rz4<?>> f27280h = fe2.m44300a();

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B#\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\r¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0011"}, mo44877d2 = {"Lcom/walletconnect/android/sdk/core/sdk/PairingQueriesImpl$GetPairingByTopicQuery;", "", "T", "Lrz4;", "Ll76;", "a", "", "toString", "e", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "topic", "Lkotlin/Function1;", "mapper", "<init>", "(Lcom/walletconnect/android/sdk/core/sdk/PairingQueriesImpl;Ljava/lang/String;Lrc2;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* compiled from: AndroidCoreDatabaseImpl.kt */
    public final class GetPairingByTopicQuery<T> extends rz4<T> {

        /* renamed from: e */
        public final String f27281e;

        /* renamed from: f */
        public final /* synthetic */ PairingQueriesImpl f27282f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public GetPairingByTopicQuery(PairingQueriesImpl pairingQueriesImpl, String str, rc2<? super l76, ? extends T> rc2) {
            super(pairingQueriesImpl.mo40590k0(), rc2);
            vx2.m53591g(str, "topic");
            vx2.m53591g(rc2, "mapper");
            this.f27282f = pairingQueriesImpl;
            this.f27281e = str;
        }

        /* renamed from: a */
        public l76 mo40552a() {
            return this.f27282f.f27277e.mo39622r0(1618645068, "SELECT pd.topic, pd.expiry, pd.relay_protocol, pd.relay_data, pd.uri, pd.methods, pd.is_active, mdd_peer.name, mdd_peer.description, mdd_peer.url, mdd_peer.icons, mdd_peer.native\nFROM Pairing pd\n    LEFT JOIN MetaData mdd_peer ON pd.topic = mdd_peer.sequence_topic AND mdd_peer.type = \"PEER\"\nWHERE ? = topic", 1, new PairingQueriesImpl$GetPairingByTopicQuery$execute$1(this));
        }

        /* renamed from: g */
        public final String mo40594g() {
            return this.f27281e;
        }

        public String toString() {
            return "Pairing.sq:getPairingByTopic";
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PairingQueriesImpl(C3944ci ciVar, m76 m76) {
        super(m76);
        vx2.m53591g(ciVar, "database");
        vx2.m53591g(m76, "driver");
        this.f27276d = ciVar;
        this.f27277e = m76;
    }

    /* renamed from: D */
    public void mo40585D(long j, boolean z, String str) {
        vx2.m53591g(str, "topic");
        this.f27277e.mo39621m1(-551241733, "UPDATE OR ABORT Pairing\nSET expiry = ?, is_active = ?\nWHERE topic = ?", 3, new PairingQueriesImpl$activatePairing$1(j, z, str));
        mo39604f0(-551241733, new PairingQueriesImpl$activatePairing$2(this));
    }

    /* renamed from: E */
    public void mo40586E(String str) {
        vx2.m53591g(str, "topic");
        this.f27277e.mo39621m1(-448824893, "DELETE FROM Pairing\nWHERE ? = topic", 1, new PairingQueriesImpl$deletePairing$1(str));
        mo39604f0(-448824893, new PairingQueriesImpl$deletePairing$2(this));
    }

    /* renamed from: Y */
    public void mo40587Y(long j, String str) {
        vx2.m53591g(str, "topic");
        this.f27277e.mo39621m1(934467325, "UPDATE OR ABORT Pairing\nSET expiry = ?\nWHERE ? = topic", 2, new PairingQueriesImpl$updateOrAbortExpiry$1(j, str));
        mo39604f0(934467325, new PairingQueriesImpl$updateOrAbortExpiry$2(this));
    }

    /* renamed from: h */
    public <T> rz4<T> mo40588h(String str, tc2<? super String, ? super Long, ? super String, ? super String, ? super String, ? super String, ? super Boolean, ? super String, ? super String, ? super String, ? super List<String>, ? super String, ? extends T> tc2) {
        vx2.m53591g(str, "topic");
        vx2.m53591g(tc2, "mapper");
        return new GetPairingByTopicQuery(this, str, new PairingQueriesImpl$getPairingByTopic$1(tc2, this));
    }

    /* renamed from: j0 */
    public final List<rz4<?>> mo40589j0() {
        return this.f27278f;
    }

    /* renamed from: k0 */
    public final List<rz4<?>> mo40590k0() {
        return this.f27279g;
    }

    /* renamed from: l0 */
    public final List<rz4<?>> mo40591l0() {
        return this.f27280h;
    }

    /* renamed from: v */
    public <T> rz4<T> mo40592v(tc2<? super String, ? super Long, ? super String, ? super String, ? super String, ? super String, ? super Boolean, ? super String, ? super String, ? super String, ? super List<String>, ? super String, ? extends T> tc2) {
        vx2.m53591g(tc2, "mapper");
        return k05.m46848a(-1344762537, this.f27278f, this.f27277e, "Pairing.sq", "getListOfPairing", "SELECT pd.topic, pd.expiry, pd.relay_protocol, pd.relay_data, pd.uri, pd.methods, pd.is_active, mdd_peer.name, mdd_peer.description, mdd_peer.url, mdd_peer.icons, mdd_peer.native\nFROM Pairing pd\n    LEFT JOIN MetaData mdd_peer ON pd.topic = mdd_peer.sequence_topic AND mdd_peer.type = \"PEER\"", new PairingQueriesImpl$getListOfPairing$1(tc2, this));
    }

    /* renamed from: w */
    public void mo40593w(String str, long j, String str2, String str3, String str4, String str5, boolean z) {
        vx2.m53591g(str, "topic");
        String str6 = str2;
        vx2.m53591g(str6, "relay_protocol");
        String str7 = str4;
        vx2.m53591g(str7, "uri");
        String str8 = str5;
        vx2.m53591g(str8, "methods");
        this.f27277e.mo39621m1(-1376857042, "INSERT OR ABORT INTO Pairing(topic, expiry, relay_protocol,  relay_data, uri, methods, is_active)\nVALUES (?,?,?,?,?,?, ?)", 7, new PairingQueriesImpl$insertOrAbortPairing$1(str, j, str6, str3, str7, str8, z));
        mo39604f0(-1376857042, new PairingQueriesImpl$insertOrAbortPairing$2(this));
    }
}
