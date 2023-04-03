package com.squareup.sqldelight.android;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, mo44877d2 = {"Lkj;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 5, 1})
/* compiled from: AndroidSqliteDriver.kt */
public final class AndroidSqliteDriver$executeQuery$1 extends Lambda implements pc2<C6155kj> {
    public final /* synthetic */ int $parameters;
    public final /* synthetic */ String $sql;
    public final /* synthetic */ AndroidSqliteDriver this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidSqliteDriver$executeQuery$1(String str, AndroidSqliteDriver androidSqliteDriver, int i) {
        super(0);
        this.$sql = str;
        this.this$0 = androidSqliteDriver;
        this.$parameters = i;
    }

    public final C6155kj invoke() {
        return new AndroidQuery(this.$sql, this.this$0.mo39620e(), this.$parameters);
    }
}
