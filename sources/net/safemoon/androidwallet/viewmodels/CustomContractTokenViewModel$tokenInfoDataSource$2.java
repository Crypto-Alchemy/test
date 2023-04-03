package net.safemoon.androidwallet.viewmodels;

import android.app.Application;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.database.room.ApplicationRoomDatabase;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo44877d2 = {"Lir6;", "invoke", "()Lir6;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: CustomContractTokenViewModel.kt */
public final class CustomContractTokenViewModel$tokenInfoDataSource$2 extends Lambda implements pc2<ir6> {
    public final /* synthetic */ CustomContractTokenViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomContractTokenViewModel$tokenInfoDataSource$2(CustomContractTokenViewModel customContractTokenViewModel) {
        super(0);
        this.this$0 = customContractTokenViewModel;
    }

    public final ir6 invoke() {
        ApplicationRoomDatabase.C8270m mVar = ApplicationRoomDatabase.f41664p;
        Application b = this.this$0.mo27549b();
        vx2.m53590f(b, "getApplication()");
        return ApplicationRoomDatabase.C8270m.m65847c(mVar, b, (String) null, 2, (Object) null).mo57117Y();
    }
}
