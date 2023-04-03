package com.walletconnect.android.sdk.core.sdk;

import com.squareup.sqldelight.C5463a;
import com.walletconnect.android.internal.common.model.AppMetaDataType;
import java.util.List;
import kotlin.Metadata;
import org.web3j.ens.contracts.generated.PublicResolver;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0002,-B\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010 \u001a\u00020\u001d¢\u0006\u0004\b*\u0010+J\\\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\b\b\u0000\u0010\u0004*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u000722\u0010\u000b\u001a.\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00028\u00000\tH\u0016J\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016JH\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016JH\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR$\u0010&\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0!8\u0000X\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R$\u0010)\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0!8\u0000X\u0004¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010%¨\u0006."}, mo44877d2 = {"Lcom/walletconnect/android/sdk/core/sdk/MetaDataQueriesImpl;", "Lcom/squareup/sqldelight/a;", "Lwu3;", "", "T", "", "sequence_topic", "Lcom/walletconnect/android/internal/common/model/AppMetaDataType;", "type", "Lkotlin/Function5;", "", "mapper", "Lrz4;", "G", "", "e0", "name", "description", "url", "icons", "native", "Lr37;", "n", "p", "b0", "Lci;", "d", "Lci;", "database", "Lm76;", "e", "Lm76;", "driver", "", "f", "Ljava/util/List;", "k0", "()Ljava/util/List;", "getMetadataByTopicAndType", "g", "j0", "getIdByTopicAndType", "<init>", "(Lci;Lm76;)V", "GetIdByTopicAndTypeQuery", "GetMetadataByTopicAndTypeQuery", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: AndroidCoreDatabaseImpl.kt */
public final class MetaDataQueriesImpl extends C5463a implements wu3 {

    /* renamed from: d */
    public final C3944ci f27266d;

    /* renamed from: e */
    public final m76 f27267e;

    /* renamed from: f */
    public final List<rz4<?>> f27268f = fe2.m44300a();

    /* renamed from: g */
    public final List<rz4<?>> f27269g = fe2.m44300a();

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B+\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, mo44877d2 = {"Lcom/walletconnect/android/sdk/core/sdk/MetaDataQueriesImpl$GetIdByTopicAndTypeQuery;", "", "T", "Lrz4;", "Ll76;", "a", "", "toString", "e", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "sequence_topic", "Lcom/walletconnect/android/internal/common/model/AppMetaDataType;", "f", "Lcom/walletconnect/android/internal/common/model/AppMetaDataType;", "h", "()Lcom/walletconnect/android/internal/common/model/AppMetaDataType;", "type", "Lkotlin/Function1;", "mapper", "<init>", "(Lcom/walletconnect/android/sdk/core/sdk/MetaDataQueriesImpl;Ljava/lang/String;Lcom/walletconnect/android/internal/common/model/AppMetaDataType;Lrc2;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* compiled from: AndroidCoreDatabaseImpl.kt */
    public final class GetIdByTopicAndTypeQuery<T> extends rz4<T> {

        /* renamed from: e */
        public final String f27270e;

        /* renamed from: f */
        public final AppMetaDataType f27271f;

        /* renamed from: g */
        public final /* synthetic */ MetaDataQueriesImpl f27272g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public GetIdByTopicAndTypeQuery(MetaDataQueriesImpl metaDataQueriesImpl, String str, AppMetaDataType appMetaDataType, rc2<? super l76, ? extends T> rc2) {
            super(metaDataQueriesImpl.mo40568j0(), rc2);
            vx2.m53591g(str, "sequence_topic");
            vx2.m53591g(appMetaDataType, "type");
            vx2.m53591g(rc2, "mapper");
            this.f27272g = metaDataQueriesImpl;
            this.f27270e = str;
            this.f27271f = appMetaDataType;
        }

        /* renamed from: a */
        public l76 mo40552a() {
            return this.f27272g.f27267e.mo39622r0(-1611525391, "SELECT id\nFROM MetaData\nWHERE sequence_topic = ? AND type = ?", 2, new MetaDataQueriesImpl$GetIdByTopicAndTypeQuery$execute$1(this, this.f27272g));
        }

        /* renamed from: g */
        public final String mo40572g() {
            return this.f27270e;
        }

        /* renamed from: h */
        public final AppMetaDataType mo40573h() {
            return this.f27271f;
        }

        public String toString() {
            return "MetaData.sq:getIdByTopicAndType";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B+\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, mo44877d2 = {"Lcom/walletconnect/android/sdk/core/sdk/MetaDataQueriesImpl$GetMetadataByTopicAndTypeQuery;", "", "T", "Lrz4;", "Ll76;", "a", "", "toString", "e", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "sequence_topic", "Lcom/walletconnect/android/internal/common/model/AppMetaDataType;", "f", "Lcom/walletconnect/android/internal/common/model/AppMetaDataType;", "h", "()Lcom/walletconnect/android/internal/common/model/AppMetaDataType;", "type", "Lkotlin/Function1;", "mapper", "<init>", "(Lcom/walletconnect/android/sdk/core/sdk/MetaDataQueriesImpl;Ljava/lang/String;Lcom/walletconnect/android/internal/common/model/AppMetaDataType;Lrc2;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* compiled from: AndroidCoreDatabaseImpl.kt */
    public final class GetMetadataByTopicAndTypeQuery<T> extends rz4<T> {

        /* renamed from: e */
        public final String f27273e;

        /* renamed from: f */
        public final AppMetaDataType f27274f;

        /* renamed from: g */
        public final /* synthetic */ MetaDataQueriesImpl f27275g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public GetMetadataByTopicAndTypeQuery(MetaDataQueriesImpl metaDataQueriesImpl, String str, AppMetaDataType appMetaDataType, rc2<? super l76, ? extends T> rc2) {
            super(metaDataQueriesImpl.mo40569k0(), rc2);
            vx2.m53591g(str, "sequence_topic");
            vx2.m53591g(appMetaDataType, "type");
            vx2.m53591g(rc2, "mapper");
            this.f27275g = metaDataQueriesImpl;
            this.f27273e = str;
            this.f27274f = appMetaDataType;
        }

        /* renamed from: a */
        public l76 mo40552a() {
            return this.f27275g.f27267e.mo39622r0(1041792069, "SELECT name, description, url, icons, native\nFROM MetaData\nWHERE sequence_topic = ? AND type = ?", 2, new MetaDataQueriesImpl$GetMetadataByTopicAndTypeQuery$execute$1(this, this.f27275g));
        }

        /* renamed from: g */
        public final String mo40575g() {
            return this.f27273e;
        }

        /* renamed from: h */
        public final AppMetaDataType mo40576h() {
            return this.f27274f;
        }

        public String toString() {
            return "MetaData.sq:getMetadataByTopicAndType";
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MetaDataQueriesImpl(C3944ci ciVar, m76 m76) {
        super(m76);
        vx2.m53591g(ciVar, "database");
        vx2.m53591g(m76, "driver");
        this.f27266d = ciVar;
        this.f27267e = m76;
    }

    /* renamed from: G */
    public <T> rz4<T> mo40565G(String str, AppMetaDataType appMetaDataType, md2<? super String, ? super String, ? super String, ? super List<String>, ? super String, ? extends T> md2) {
        vx2.m53591g(str, "sequence_topic");
        vx2.m53591g(appMetaDataType, "type");
        vx2.m53591g(md2, "mapper");
        return new GetMetadataByTopicAndTypeQuery(this, str, appMetaDataType, new MetaDataQueriesImpl$getMetadataByTopicAndType$1(md2, this));
    }

    /* renamed from: b0 */
    public void mo40566b0(String str) {
        vx2.m53591g(str, "sequence_topic");
        this.f27267e.mo39621m1(1083943218, "DELETE FROM MetaData\nWHERE sequence_topic = ?", 1, new MetaDataQueriesImpl$deleteMetaDataFromTopic$1(str));
        mo39604f0(1083943218, new MetaDataQueriesImpl$deleteMetaDataFromTopic$2(this));
    }

    /* renamed from: e0 */
    public rz4<Long> mo40567e0(String str, AppMetaDataType appMetaDataType) {
        vx2.m53591g(str, "sequence_topic");
        vx2.m53591g(appMetaDataType, "type");
        return new GetIdByTopicAndTypeQuery(this, str, appMetaDataType, MetaDataQueriesImpl$getIdByTopicAndType$1.INSTANCE);
    }

    /* renamed from: j0 */
    public final List<rz4<?>> mo40568j0() {
        return this.f27269g;
    }

    /* renamed from: k0 */
    public final List<rz4<?>> mo40569k0() {
        return this.f27268f;
    }

    /* renamed from: n */
    public void mo40570n(String str, String str2, String str3, String str4, List<String> list, String str5, AppMetaDataType appMetaDataType) {
        vx2.m53591g(str, "sequence_topic");
        String str6 = str2;
        vx2.m53591g(str6, PublicResolver.FUNC_NAME);
        String str7 = str3;
        vx2.m53591g(str7, "description");
        String str8 = str4;
        vx2.m53591g(str8, "url");
        List<String> list2 = list;
        vx2.m53591g(list2, "icons");
        AppMetaDataType appMetaDataType2 = appMetaDataType;
        vx2.m53591g(appMetaDataType2, "type");
        this.f27267e.mo39621m1(-1547067958, "INSERT OR ABORT INTO MetaData(sequence_topic, name, description, url, icons, native, type)\nVALUES (?, ?, ?, ?, ?, ?,?)", 7, new MetaDataQueriesImpl$insertOrAbortMetaData$1(str, str6, str7, str8, this, list2, str5, appMetaDataType2));
        mo39604f0(-1547067958, new MetaDataQueriesImpl$insertOrAbortMetaData$2(this));
    }

    /* renamed from: p */
    public void mo40571p(String str, String str2, String str3, List<String> list, String str4, AppMetaDataType appMetaDataType, String str5) {
        vx2.m53591g(str, PublicResolver.FUNC_NAME);
        String str6 = str2;
        vx2.m53591g(str6, "description");
        String str7 = str3;
        vx2.m53591g(str7, "url");
        List<String> list2 = list;
        vx2.m53591g(list2, "icons");
        AppMetaDataType appMetaDataType2 = appMetaDataType;
        vx2.m53591g(appMetaDataType2, "type");
        String str8 = str5;
        vx2.m53591g(str8, "sequence_topic");
        this.f27267e.mo39621m1(-645192495, "UPDATE MetaData\nSET name = ?, description = ?, url = ?, icons = ?, native = ?, type = ?\nWHERE sequence_topic = ?", 7, new MetaDataQueriesImpl$updateMetaData$1(str, str6, str7, this, list2, str4, appMetaDataType2, str8));
        mo39604f0(-645192495, new MetaDataQueriesImpl$updateMetaData$2(this));
    }
}
