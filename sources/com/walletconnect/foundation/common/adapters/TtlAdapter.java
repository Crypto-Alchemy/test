package com.walletconnect.foundation.common.adapters;

import com.squareup.moshi.C5391d;
import com.squareup.moshi.JsonReader;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0017J\u001c\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0017¨\u0006\u000e"}, mo44877d2 = {"Lcom/walletconnect/foundation/common/adapters/TtlAdapter;", "Lcom/squareup/moshi/d;", "Lky6;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lq73;", "writer", "value", "Lr37;", "toJson", "<init>", "()V", "Qualifier", "foundation"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: TtlAdapter.kt */
public final class TtlAdapter extends C5391d<ky6> {

    /* renamed from: a */
    public static final TtlAdapter f27349a = new TtlAdapter();

    @r53
    @Metadata(mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, mo44877d2 = {"Lcom/walletconnect/foundation/common/adapters/TtlAdapter$Qualifier;", "", "foundation"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    @Retention(RetentionPolicy.RUNTIME)
    /* compiled from: TtlAdapter.kt */
    public @interface Qualifier {
    }

    @Qualifier
    /* renamed from: fromJson */
    public /* synthetic */ ky6 mo39346b(JsonReader jsonReader) {
        Long l;
        vx2.m53591g(jsonReader, "reader");
        jsonReader.mo39271G(true);
        if (!jsonReader.mo39280f() || jsonReader.mo39290q() != JsonReader.Token.NUMBER) {
            l = null;
        } else {
            l = Long.valueOf(jsonReader.mo39286k());
        }
        if (l != null) {
            return new ky6(l.longValue());
        }
        return null;
    }

    /* renamed from: toJson */
    public /* synthetic */ void mo39347j(q73 q73, @Qualifier ky6 ky6) {
        vx2.m53591g(q73, "writer");
        if (ky6 != null) {
            q73.mo39402y(ky6.mo45309a());
        } else {
            q73.mo39402y(0);
        }
    }
}
