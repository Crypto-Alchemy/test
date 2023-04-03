package com.walletconnect.android.internal.common.storage;

import android.database.sqlite.SQLiteException;
import com.walletconnect.android.internal.common.model.AppMetaData;
import com.walletconnect.android.internal.common.model.AppMetaDataType;
import com.walletconnect.android.internal.common.model.Redirect;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0006H\u0016J\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0006H\u0016J8\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0011H\u0002R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001a¨\u0006\u001e"}, mo44877d2 = {"Lcom/walletconnect/android/internal/common/storage/MetadataStorageRepository;", "Lkv3;", "Les6;", "topic", "Lcom/walletconnect/android/internal/common/model/AppMetaData;", "appMetaData", "Lcom/walletconnect/android/internal/common/model/AppMetaDataType;", "appMetaDataType", "Lr37;", "b", "h", "a", "d", "type", "", "f", "c", "", "peerName", "peerDesc", "peerUrl", "", "peerIcons", "native", "g", "Lwu3;", "Lwu3;", "metaDataQueries", "<init>", "(Lwu3;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: MetadataStorageRepository.kt */
public final class MetadataStorageRepository implements kv3 {

    /* renamed from: a */
    public final wu3 f27187a;

    public MetadataStorageRepository(wu3 wu3) {
        vx2.m53591g(wu3, "metaDataQueries");
        this.f27187a = wu3;
    }

    /* renamed from: a */
    public void mo40435a(es6 es6, AppMetaData appMetaData, AppMetaDataType appMetaDataType) throws SQLiteException {
        vx2.m53591g(es6, "topic");
        vx2.m53591g(appMetaData, "appMetaData");
        vx2.m53591g(appMetaDataType, "appMetaDataType");
        if (!mo40439f(es6, appMetaDataType)) {
            mo40436b(es6, appMetaData, appMetaDataType);
        } else {
            mo40441h(es6, appMetaData, appMetaDataType);
        }
    }

    /* renamed from: b */
    public void mo40436b(es6 es6, AppMetaData appMetaData, AppMetaDataType appMetaDataType) throws SQLiteException {
        String str;
        vx2.m53591g(es6, "topic");
        vx2.m53591g(appMetaData, "appMetaData");
        vx2.m53591g(appMetaDataType, "appMetaDataType");
        wu3 wu3 = this.f27187a;
        String a = es6.mo42395a();
        String c = appMetaData.mo40311c();
        String a2 = appMetaData.mo40309a();
        String e = appMetaData.mo40314e();
        List<String> b = appMetaData.mo40310b();
        Redirect d = appMetaData.mo40313d();
        if (d != null) {
            str = d.mo40322a();
        } else {
            str = null;
        }
        wu3.mo40570n(a, c, a2, e, b, str, appMetaDataType);
    }

    /* renamed from: c */
    public AppMetaData mo40437c(es6 es6, AppMetaDataType appMetaDataType) {
        vx2.m53591g(es6, "topic");
        vx2.m53591g(appMetaDataType, "type");
        return (AppMetaData) this.f27187a.mo40565G(es6.mo42395a(), appMetaDataType, new MetadataStorageRepository$getByTopicAndType$1(this)).mo47567c();
    }

    /* renamed from: d */
    public void mo40438d(es6 es6) {
        vx2.m53591g(es6, "topic");
        this.f27187a.mo40566b0(es6.mo42395a());
    }

    /* renamed from: f */
    public boolean mo40439f(es6 es6, AppMetaDataType appMetaDataType) {
        vx2.m53591g(es6, "topic");
        vx2.m53591g(appMetaDataType, "type");
        if (this.f27187a.mo40567e0(es6.mo42395a(), appMetaDataType).mo47568d() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final AppMetaData mo40440g(String str, String str2, String str3, List<String> list, String str4) {
        return new AppMetaData(str, str2, str3, list, new Redirect(str4, (String) null, 2, (DefaultConstructorMarker) null));
    }

    /* renamed from: h */
    public void mo40441h(es6 es6, AppMetaData appMetaData, AppMetaDataType appMetaDataType) throws SQLiteException {
        String str;
        vx2.m53591g(es6, "topic");
        vx2.m53591g(appMetaData, "appMetaData");
        vx2.m53591g(appMetaDataType, "appMetaDataType");
        wu3 wu3 = this.f27187a;
        String c = appMetaData.mo40311c();
        String a = appMetaData.mo40309a();
        String e = appMetaData.mo40314e();
        List<String> b = appMetaData.mo40310b();
        Redirect d = appMetaData.mo40313d();
        if (d != null) {
            str = d.mo40322a();
        } else {
            str = null;
        }
        wu3.mo40571p(c, a, e, b, str, appMetaDataType, es6.mo42395a());
    }
}
