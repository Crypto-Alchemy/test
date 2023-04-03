package net.safemoon.androidwallet.viewmodels;

import android.app.Application;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.database.room.ApplicationRoomDatabase;

@Metadata(mo44876d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo44877d2 = {"<anonymous>", "Lnet/safemoon/androidwallet/database/room/ApplicationRoomDatabase;", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: CollectibleViewModel.kt */
public final class CollectibleViewModel$db$2 extends Lambda implements pc2<ApplicationRoomDatabase> {
    public final /* synthetic */ Application $application;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollectibleViewModel$db$2(Application application) {
        super(0);
        this.$application = application;
    }

    public final ApplicationRoomDatabase invoke() {
        return ApplicationRoomDatabase.C8270m.m65847c(ApplicationRoomDatabase.f41664p, this.$application, (String) null, 2, (Object) null);
    }
}
