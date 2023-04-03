package p000;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.safemoon.androidwallet.R;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\"\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0002\u0010\u0004\"\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\u0004\"\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0003\u001a\u0004\b\u0006\u0010\u0004¨\u0006\n"}, mo44877d2 = {"", "Lm70;", "a", "Ljava/util/List;", "()Ljava/util/List;", "listOfDeleteAlerts", "b", "c", "listOfUnsave", "listOfForSave", "development-V3.40(117)_netMainRelease"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: yw0 */
/* compiled from: CryptoPriceAlertFragment.kt */
public final class yw0 {

    /* renamed from: a */
    public static final List<m70> f46279a;

    /* renamed from: b */
    public static final List<m70> f46280b;

    /* renamed from: c */
    public static final List<m70> f46281c;

    static {
        ArrayList arrayList = new ArrayList();
        Integer valueOf = Integer.valueOf(R.string.common_asking_title);
        arrayList.add(new m70(valueOf, (String) null, -3, false, 2, (DefaultConstructorMarker) null));
        arrayList.add(new m70(Integer.valueOf(R.string.ca_alert_delete), (String) null, 100, true, 2, (DefaultConstructorMarker) null));
        arrayList.add(new m70(Integer.valueOf(R.string.ca_alert_delete_all), (String) null, 101, true, 2, (DefaultConstructorMarker) null));
        Integer valueOf2 = Integer.valueOf(R.string.cancel);
        arrayList.add(new m70(valueOf2, (String) null, -1, true, 2, (DefaultConstructorMarker) null));
        f46279a = CollectionsKt___CollectionsKt.m47311K0(arrayList);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new m70(Integer.valueOf(R.string.ca_alert_unsaved_changes_title), (String) null, -3, false, 2, (DefaultConstructorMarker) null));
        arrayList2.add(new m70(Integer.valueOf(R.string.ca_alert_unsaved_changes_continue_editing), (String) null, 102, true, 2, (DefaultConstructorMarker) null));
        arrayList2.add(new m70(Integer.valueOf(R.string.ca_alert_unsaved_changes_continue_proceed), (String) null, 103, true, 2, (DefaultConstructorMarker) null));
        f46280b = CollectionsKt___CollectionsKt.m47311K0(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(new m70(valueOf, (String) null, -3, false, 2, (DefaultConstructorMarker) null));
        arrayList3.add(new m70(Integer.valueOf(R.string.ca_alert_save_settings), (String) null, 104, true, 2, (DefaultConstructorMarker) null));
        arrayList3.add(new m70(Integer.valueOf(R.string.ca_alert_save_continue_editing), (String) null, 105, true, 2, (DefaultConstructorMarker) null));
        arrayList3.add(new m70(valueOf2, (String) null, -1, true, 2, (DefaultConstructorMarker) null));
        f46281c = CollectionsKt___CollectionsKt.m47311K0(arrayList3);
    }

    /* renamed from: a */
    public static final List<m70> m74664a() {
        return f46279a;
    }

    /* renamed from: b */
    public static final List<m70> m74665b() {
        return f46281c;
    }

    /* renamed from: c */
    public static final List<m70> m74666c() {
        return f46280b;
    }
}
