package net.safemoon.androidwallet.fragments.walletconnect;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.MyApplicationClass;
import net.safemoon.androidwallet.database.mainRoom.MainRoomDatabase;

@Metadata(mo44876d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo44877d2 = {"<anonymous>", "Lnet/safemoon/androidwallet/database/mainRoom/MainRoomDatabase;", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: WalletConnectDetailFragment.kt */
public final class WalletConnectDetailFragment$mainRoomDatabase$2 extends Lambda implements pc2<MainRoomDatabase> {
    public static final WalletConnectDetailFragment$mainRoomDatabase$2 INSTANCE = new WalletConnectDetailFragment$mainRoomDatabase$2();

    public WalletConnectDetailFragment$mainRoomDatabase$2() {
        super(0);
    }

    public final MainRoomDatabase invoke() {
        MainRoomDatabase.C8256i iVar = MainRoomDatabase.f41647p;
        MyApplicationClass c = MyApplicationClass.m64669c();
        vx2.m53590f(c, "get()");
        return iVar.mo57110b(c);
    }
}
