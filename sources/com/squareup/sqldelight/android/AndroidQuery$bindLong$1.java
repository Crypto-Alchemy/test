package com.squareup.sqldelight.android;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, mo44877d2 = {"Lje6;", "it", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 5, 1})
/* compiled from: AndroidSqliteDriver.kt */
public final class AndroidQuery$bindLong$1 extends Lambda implements rc2<je6, r37> {
    public final /* synthetic */ int $index;
    public final /* synthetic */ Long $long;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidQuery$bindLong$1(Long l, int i) {
        super(1);
        this.$long = l;
        this.$index = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((je6) obj);
        return r37.f33317a;
    }

    public final void invoke(je6 je6) {
        vx2.m53591g(je6, "it");
        Long l = this.$long;
        if (l == null) {
            je6.bindNull(this.$index);
        } else {
            je6.bindLong(this.$index, l.longValue());
        }
    }
}
