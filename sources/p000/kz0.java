package p000;

import kotlin.Metadata;
import org.koin.core.scope.Scope;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\n\u0010\u0005\u001a\u00020\u0003*\u00020\u0000¨\u0006\u0006"}, mo44877d2 = {"Lorg/koin/core/scope/Scope;", "", "dbName", "Lr37;", "a", "b", "sdk_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: kz0 */
/* compiled from: DBUtils.kt */
public final class kz0 {
    /* renamed from: a */
    public static final void m47574a(Scope scope, String str) {
        vx2.m53591g(scope, "<this>");
        vx2.m53591g(str, "dbName");
        nx3.m70099b(scope).deleteDatabase(str);
    }

    /* renamed from: b */
    public static final void m47575b(Scope scope) {
        vx2.m53591g(scope, "<this>");
        String[] databaseList = nx3.m70099b(scope).databaseList();
        vx2.m53590f(databaseList, "androidContext().databaseList()");
        for (String str : databaseList) {
            if (jz0.f30666a.mo44630a().contains(str)) {
                vx2.m53590f(str, "dbName");
                m47574a(scope, str);
            }
        }
    }
}
