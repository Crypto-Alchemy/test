package com.walletconnect.android.sdk.core.sdk;

import com.walletconnect.android.internal.common.model.AppMetaDataType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo44877d2 = {"Lo76;", "Lr37;", "invoke", "(Lo76;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: AndroidCoreDatabaseImpl.kt */
public final class MetaDataQueriesImpl$insertOrAbortMetaData$1 extends Lambda implements rc2<o76, r37> {
    public final /* synthetic */ String $description;
    public final /* synthetic */ List<String> $icons;
    public final /* synthetic */ String $name;
    public final /* synthetic */ String $native;
    public final /* synthetic */ String $sequence_topic;
    public final /* synthetic */ AppMetaDataType $type;
    public final /* synthetic */ String $url;
    public final /* synthetic */ MetaDataQueriesImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MetaDataQueriesImpl$insertOrAbortMetaData$1(String str, String str2, String str3, String str4, MetaDataQueriesImpl metaDataQueriesImpl, List<String> list, String str5, AppMetaDataType appMetaDataType) {
        super(1);
        this.$sequence_topic = str;
        this.$name = str2;
        this.$description = str3;
        this.$url = str4;
        this.this$0 = metaDataQueriesImpl;
        this.$icons = list;
        this.$native = str5;
        this.$type = appMetaDataType;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((o76) obj);
        return r37.f33317a;
    }

    public final void invoke(o76 o76) {
        vx2.m53591g(o76, "$this$execute");
        o76.bindString(1, this.$sequence_topic);
        o76.bindString(2, this.$name);
        o76.bindString(3, this.$description);
        o76.bindString(4, this.$url);
        o76.bindString(5, this.this$0.f27266d.mo30015i0().mo48824a().mo40236a(this.$icons));
        o76.bindString(6, this.$native);
        o76.bindString(7, this.this$0.f27266d.mo30015i0().mo48825b().mo40236a(this.$type));
    }
}
