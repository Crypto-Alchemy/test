package net.safemoon.androidwallet.model.navMap;

import androidx.navigation.NavController;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.safemoon.androidwallet.R;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J,\u0010\n\u001a\u00020\t*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007H\u0002J<\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00062\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007H\u0002J\u0006\u0010\u000e\u001a\u00020\u0002J\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u0006*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/navMap/NavTreeDirection;", "", "Lnet/safemoon/androidwallet/model/navMap/NavMap;", "Landroidx/navigation/NavController;", "navController", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "result", "Lr37;", "filterBackStack", "destinationId", "path", "getPath", "getMap", "baseId", "getLastDestination", "(Landroidx/navigation/NavController;I)Ljava/lang/Integer;", "navMap", "Lnet/safemoon/androidwallet/model/navMap/NavMap;", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: NavTreeDirection.kt */
public final class NavTreeDirection {
    public static final NavTreeDirection INSTANCE = new NavTreeDirection();
    private static final NavMap navMap;

    static {
        NavMap navMap2 = new NavMap(0, (ArrayList) null, 2, (DefaultConstructorMarker) null);
        navMap = navMap2;
        ArrayList<NavMap> data = navMap2.getData();
        NavMap navMap3 = new NavMap(R.id.navigation_collectibles, (ArrayList) null, 2, (DefaultConstructorMarker) null);
        ArrayList<NavMap> data2 = navMap3.getData();
        NavMap navMap4 = new NavMap(R.id.collectionFragment, (ArrayList) null, 2, (DefaultConstructorMarker) null);
        ArrayList<NavMap> data3 = navMap4.getData();
        NavMap navMap5 = new NavMap(R.id.nftDetailFragment, (ArrayList) null, 2, (DefaultConstructorMarker) null);
        ArrayList<NavMap> data4 = navMap5.getData();
        NavMap navMap6 = new NavMap(R.id.nftSendToFragment, (ArrayList) null, 2, (DefaultConstructorMarker) null);
        navMap6.getData().add(new NavMap(R.id.nftTransfer, (ArrayList) null, 2, (DefaultConstructorMarker) null));
        ArrayList<NavMap> data5 = navMap6.getData();
        NavMap navMap7 = new NavMap(R.id.manageContactsFragment, (ArrayList) null, 2, (DefaultConstructorMarker) null);
        ArrayList<NavMap> data6 = navMap7.getData();
        NavMap navMap8 = new NavMap(R.id.addContactFragment, (ArrayList) null, 2, (DefaultConstructorMarker) null);
        navMap8.getData().add(new NavMap(R.id.selectChainForContact, (ArrayList) null, 2, (DefaultConstructorMarker) null));
        data6.add(navMap8);
        navMap7.getData().add(new NavMap(R.id.editContactFragment, (ArrayList) null, 2, (DefaultConstructorMarker) null));
        navMap7.getData().add(new NavMap(R.id.selectChainForContact, (ArrayList) null, 2, (DefaultConstructorMarker) null));
        data5.add(navMap7);
        data4.add(navMap6);
        data3.add(navMap5);
        data2.add(navMap4);
        data.add(navMap3);
        ArrayList<NavMap> data7 = navMap2.getData();
        NavMap navMap9 = new NavMap(R.id.navigation_settings, (ArrayList) null, 2, (DefaultConstructorMarker) null);
        navMap9.getData().add(new NavMap(R.id.switchWalletFragment, (ArrayList) null, 2, (DefaultConstructorMarker) null));
        ArrayList<NavMap> data8 = navMap9.getData();
        NavMap navMap10 = new NavMap(R.id.securityFragment, (ArrayList) null, 2, (DefaultConstructorMarker) null);
        navMap10.getData().add(new NavMap(R.id.changePasswordFragment, (ArrayList) null, 2, (DefaultConstructorMarker) null));
        data8.add(navMap10);
        navMap9.getData().add(new NavMap(R.id.notificationFragment, (ArrayList) null, 2, (DefaultConstructorMarker) null));
        ArrayList<NavMap> data9 = navMap9.getData();
        NavMap navMap11 = new NavMap(R.id.walletConnectFragment, (ArrayList) null, 2, (DefaultConstructorMarker) null);
        navMap11.getData().add(new NavMap(R.id.walletConnectDetailFragment, (ArrayList) null, 2, (DefaultConstructorMarker) null));
        data9.add(navMap11);
        ArrayList<NavMap> data10 = navMap9.getData();
        NavMap navMap12 = new NavMap(R.id.manageContactsFragment, (ArrayList) null, 2, (DefaultConstructorMarker) null);
        ArrayList<NavMap> data11 = navMap12.getData();
        NavMap navMap13 = new NavMap(R.id.addContactFragment, (ArrayList) null, 2, (DefaultConstructorMarker) null);
        navMap13.getData().add(new NavMap(R.id.selectChainForContact, (ArrayList) null, 2, (DefaultConstructorMarker) null));
        data11.add(navMap13);
        navMap12.getData().add(new NavMap(R.id.editContactFragment, (ArrayList) null, 2, (DefaultConstructorMarker) null));
        navMap12.getData().add(new NavMap(R.id.selectChainForContact, (ArrayList) null, 2, (DefaultConstructorMarker) null));
        data10.add(navMap12);
        navMap9.getData().add(new NavMap(R.id.fiatListFragment, (ArrayList) null, 2, (DefaultConstructorMarker) null));
        navMap9.getData().add(new NavMap(R.id.dateFormatFragment, (ArrayList) null, 2, (DefaultConstructorMarker) null));
        navMap9.getData().add(new NavMap(R.id.fullScreenWebViewFragment, (ArrayList) null, 2, (DefaultConstructorMarker) null));
        navMap9.getData().add(new NavMap(R.id.termScreenWebViewFragment, (ArrayList) null, 2, (DefaultConstructorMarker) null));
        navMap9.getData().add(new NavMap(R.id.joinCommunityFragment, (ArrayList) null, 2, (DefaultConstructorMarker) null));
        data7.add(navMap9);
    }

    private NavTreeDirection() {
    }

    private final void filterBackStack(NavMap navMap2, NavController navController, ArrayList<Integer> arrayList) {
        ArrayList<NavMap> data = navMap2.getData();
        ArrayList arrayList2 = new ArrayList();
        for (T next : data) {
            if (f44.m57594a(navController, ((NavMap) next).getId())) {
                arrayList2.add(next);
            }
        }
        navMap2.getData().clear();
        navMap2.getData().addAll(arrayList2);
        if (!navMap2.getData().isEmpty()) {
            NavMap navMap3 = (NavMap) CollectionsKt___CollectionsKt.m47329Z(navMap2.getData());
            arrayList.add(Integer.valueOf(navMap3.getId()));
            INSTANCE.filterBackStack(navMap3, navController, arrayList);
        }
    }

    private final ArrayList<Integer> getPath(NavMap navMap2, int i, ArrayList<Integer> arrayList) {
        for (NavMap navMap3 : navMap2.getData()) {
            arrayList.add(Integer.valueOf(navMap3.getId()));
            if (i == navMap3.getId()) {
                return arrayList;
            }
            NavTreeDirection navTreeDirection = INSTANCE;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(arrayList);
            r37 r37 = r37.f33317a;
            navTreeDirection.getPath(navMap3, i, arrayList2);
        }
        return new ArrayList<>();
    }

    public final Integer getLastDestination(NavController navController, int i) {
        boolean z;
        vx2.m53591g(navController, "<this>");
        Type type = new NavTreeDirection$getLastDestination$itemType$1().getType();
        T t = null;
        if (!f44.m57594a(navController, i)) {
            return null;
        }
        ArrayList<NavMap> data = navMap.getData();
        vx2.m53590f(type, "itemType");
        Iterator<T> it = ol0.m70369l(data, type).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (((NavMap) next).getId() == i) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                t = next;
                break;
            }
        }
        NavMap navMap2 = (NavMap) t;
        ArrayList arrayList = new ArrayList();
        if (navMap2 != null) {
            filterBackStack(navMap2, navController, arrayList);
        }
        return (Integer) CollectionsKt___CollectionsKt.m47342m0(arrayList);
    }

    public final NavMap getMap() {
        return navMap;
    }
}
