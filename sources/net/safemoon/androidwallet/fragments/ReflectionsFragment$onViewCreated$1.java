package net.safemoon.androidwallet.fragments;

import com.google.android.material.textview.MaterialTextView;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.model.notificationHistory.NotificationHistory;
import net.safemoon.androidwallet.model.notificationHistory.NotificationHistoryData;
import net.safemoon.androidwallet.model.notificationHistory.NotificationHistoryResult;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/notificationHistory/NotificationHistory;", "kotlin.jvm.PlatformType", "it", "Lr37;", "invoke", "(Lnet/safemoon/androidwallet/model/notificationHistory/NotificationHistory;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: ReflectionsFragment.kt */
public final class ReflectionsFragment$onViewCreated$1 extends Lambda implements rc2<NotificationHistory, r37> {
    public final /* synthetic */ ReflectionsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReflectionsFragment$onViewCreated$1(ReflectionsFragment reflectionsFragment) {
        super(1);
        this.this$0 = reflectionsFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((NotificationHistory) obj);
        return r37.f33317a;
    }

    public final void invoke(NotificationHistory notificationHistory) {
        NotificationHistoryData data;
        ArrayList<NotificationHistoryResult> result;
        boolean z;
        if (notificationHistory != null && (data = notificationHistory.getData()) != null && (result = data.getResult()) != null) {
            ReflectionsFragment reflectionsFragment = this.this$0;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = result.iterator();
            while (true) {
                z = true;
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (true ^ ((NotificationHistoryResult) next).read) {
                    arrayList.add(next);
                }
            }
            int size = arrayList.size();
            la2 A = reflectionsFragment.f42043x;
            if (A == null) {
                vx2.m53605u("binding");
                A = null;
            }
            MaterialTextView materialTextView = A.f31268i.f29307k;
            if (size <= 0) {
                z = false;
            }
            materialTextView.setVisibility(ol0.m70370l0(z));
            materialTextView.setText(size < 100 ? String.valueOf(size) : "99+");
        }
    }
}
