package net.safemoon.androidwallet.viewmodels;

import android.app.Application;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.database.room.ApplicationRoomDatabase;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo44877d2 = {"Lz57;", "invoke", "()Lz57;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: CollectibleViewModel.kt */
public final class CollectibleViewModel$userTokenListDao$2 extends Lambda implements pc2<z57> {
    public final /* synthetic */ Application $application;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollectibleViewModel$userTokenListDao$2(Application application) {
        super(0);
        this.$application = application;
    }

    public final z57 invoke() {
        return ApplicationRoomDatabase.C8270m.m65847c(ApplicationRoomDatabase.f41664p, this.$application, (String) null, 2, (Object) null).mo57118Z();
    }
}
