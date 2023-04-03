package com.walletconnect.android.internal.common.storage;

import android.database.sqlite.SQLiteException;
import com.walletconnect.android.internal.common.model.AppMetaData;
import com.walletconnect.android.internal.common.model.Redirect;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010!\u001a\u00020\u001f¢\u0006\u0004\b\"\u0010#J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016Jz\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010\u00102\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0010H\u0002R\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010 ¨\u0006$"}, mo44877d2 = {"Lcom/walletconnect/android/internal/common/storage/PairingStorageRepository;", "Lol4;", "Lkl4;", "pairing", "Lr37;", "c", "Les6;", "topic", "a", "", "d", "e", "Lnx1;", "expiry", "b", "f", "", "", "expirySeconds", "relay_protocol", "relay_data", "uri", "methods", "", "is_active", "peerName", "peerDesc", "peerUrl", "peerIcons", "native", "h", "Lnl4;", "Lnl4;", "pairingQueries", "<init>", "(Lnl4;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: PairingStorageRepository.kt */
public final class PairingStorageRepository implements ol4 {

    /* renamed from: a */
    public final nl4 f27188a;

    public PairingStorageRepository(nl4 nl4) {
        vx2.m53591g(nl4, "pairingQueries");
        this.f27188a = nl4;
    }

    /* renamed from: a */
    public void mo40443a(es6 es6) throws SQLiteException {
        vx2.m53591g(es6, "topic");
        this.f27188a.mo40586E(es6.mo42395a());
    }

    /* renamed from: b */
    public void mo40444b(es6 es6, nx1 nx1) throws SQLiteException {
        vx2.m53591g(es6, "topic");
        vx2.m53591g(nx1, "expiry");
        this.f27188a.mo40587Y(nx1.mo46241a(), es6.mo42395a());
    }

    /* renamed from: c */
    public void mo40445c(kl4 kl4) throws SQLiteException {
        vx2.m53591g(kl4, "pairing");
        this.f27188a.mo40593w(kl4.mo44832f().mo42395a(), kl4.mo44826a().mo46241a(), kl4.mo44830e(), kl4.mo44829d(), kl4.mo44833g(), kl4.mo44828c(), kl4.mo44834h());
    }

    /* renamed from: d */
    public List<kl4> mo40446d() throws SQLiteException {
        return this.f27188a.mo40592v(new PairingStorageRepository$getListOfPairings$1(this)).mo47566b();
    }

    /* renamed from: e */
    public void mo40447e(es6 es6) throws SQLiteException {
        vx2.m53591g(es6, "topic");
        this.f27188a.mo40585D(lx1.m47965a(), true, es6.mo42395a());
    }

    /* renamed from: f */
    public kl4 mo40448f(es6 es6) throws SQLiteException {
        vx2.m53591g(es6, "topic");
        return (kl4) this.f27188a.mo40588h(es6.mo42395a(), new PairingStorageRepository$getPairingOrNullByTopic$1(this)).mo47568d();
    }

    /* renamed from: h */
    public final kl4 mo40449h(String str, long j, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, String str8, List<String> list, String str9) {
        AppMetaData appMetaData;
        if (str6 == null || str7 == null || str8 == null || list == null) {
            appMetaData = null;
        } else {
            appMetaData = new AppMetaData(str6, str7, str8, list, new Redirect(str9, (String) null, 2, (DefaultConstructorMarker) null));
        }
        return new kl4(new es6(str), new nx1(j), appMetaData, str2, str3, str4, z, str5);
    }
}
