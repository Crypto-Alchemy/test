package net.safemoon.androidwallet.provider;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.database.room.ApplicationRoomDatabase;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo44877d2 = {"Lir6;", "invoke", "()Lir6;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: TokenInfoExistProvider.kt */
public final class TokenInfoExistProvider$tokenInfoDataSource$2 extends Lambda implements pc2<ir6> {
    public final /* synthetic */ Context $context;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TokenInfoExistProvider$tokenInfoDataSource$2(Context context) {
        super(0);
        this.$context = context;
    }

    public final ir6 invoke() {
        return ApplicationRoomDatabase.C8270m.m65847c(ApplicationRoomDatabase.f41664p, this.$context, (String) null, 2, (Object) null).mo57117Y();
    }
}
