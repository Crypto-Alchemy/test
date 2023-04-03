package com.walletconnect.android.p012di;

import androidx.sqlite.p006db.SupportSQLiteOpenHelper;
import com.squareup.sqldelight.android.AndroidSqliteDriver;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import net.sqlcipher.database.SQLiteDatabaseHook;
import net.sqlcipher.database.SupportFactory;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.scope.Scope;
import p000.m76;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo44877d2 = {"Ldx3;", "Lr37;", "invoke", "(Ldx3;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* renamed from: com.walletconnect.android.di.CoreStorageModuleKt$sdkBaseStorageModule$1 */
/* compiled from: CoreStorageModule.kt */
public final class CoreStorageModuleKt$sdkBaseStorageModule$1 extends Lambda implements rc2<dx3, r37> {
    public final /* synthetic */ String $databaseName;
    public final /* synthetic */ m76.C6236b $databaseSchema;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoreStorageModuleKt$sdkBaseStorageModule$1(m76.C6236b bVar, String str) {
        super(1);
        this.$databaseSchema = bVar;
        this.$databaseName = str;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((dx3) obj);
        return r37.f33317a;
    }

    public final void invoke(dx3 dx3) {
        vx2.m53591g(dx3, "$this$module");
        final m76.C6236b bVar = this.$databaseSchema;
        final String str = this.$databaseName;
        C55121 r5 = new fd2<Scope, ul4, m76>() {
            public final m76 invoke(Scope scope, ul4 ul4) {
                vx2.m53591g(scope, "$this$single");
                vx2.m53591g(ul4, "it");
                return new AndroidSqliteDriver(bVar, nx3.m70099b(scope), str, new SupportFactory((byte[]) scope.mo64988f(ua5.m52727b(byte[].class), pz4.m71134c(AndroidCoreDITags.DB_PASSPHRASE), (pc2<? extends ul4>) null), (SQLiteDatabaseHook) null, false), (SupportSQLiteOpenHelper.C1390a) null, 0, false, 112, (DefaultConstructorMarker) null);
            }
        };
        SingleInstanceFactory singleInstanceFactory = new SingleInstanceFactory(new BeanDefinition(mn5.f40974e.mo56288a(), ua5.m52727b(m76.class), (oz4) null, r5, Kind.Singleton, ck0.m33062j()));
        dx3.mo51303g(singleInstanceFactory);
        if (dx3.mo51300e()) {
            dx3.mo51304h(singleInstanceFactory);
        }
        new jc3(dx3, singleInstanceFactory);
    }
}
