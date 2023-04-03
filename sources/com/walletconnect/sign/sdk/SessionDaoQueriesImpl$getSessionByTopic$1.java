package com.walletconnect.sign.sdk;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"", "T", "Ll76;", "cursor", "invoke", "(Ll76;)Ljava/lang/Object;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: SignDatabaseImpl.kt */
public final class SessionDaoQueriesImpl$getSessionByTopic$1 extends Lambda implements rc2<l76, T> {
    public final /* synthetic */ rd2<Long, String, Long, String, String, String, String, String, Boolean, T> $mapper;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SessionDaoQueriesImpl$getSessionByTopic$1(rd2<? super Long, ? super String, ? super Long, ? super String, ? super String, ? super String, ? super String, ? super String, ? super Boolean, ? extends T> rd2) {
        super(1);
        this.$mapper = rd2;
    }

    public final T invoke(l76 l76) {
        l76 l762 = l76;
        vx2.m53591g(l762, "cursor");
        rd2<Long, String, Long, String, String, String, String, String, Boolean, T> rd2 = this.$mapper;
        boolean z = false;
        Long l = l762.getLong(0);
        vx2.m53588d(l);
        String string = l762.getString(1);
        vx2.m53588d(string);
        Long l2 = l762.getLong(2);
        vx2.m53588d(l2);
        String string2 = l762.getString(3);
        vx2.m53588d(string2);
        String string3 = l762.getString(4);
        String string4 = l762.getString(5);
        String string5 = l762.getString(6);
        vx2.m53588d(string5);
        String string6 = l762.getString(7);
        Long l3 = l762.getLong(8);
        vx2.m53588d(l3);
        if (l3.longValue() == 1) {
            z = true;
        }
        return rd2.invoke(l, string, l2, string2, string3, string4, string5, string6, Boolean.valueOf(z));
    }
}
