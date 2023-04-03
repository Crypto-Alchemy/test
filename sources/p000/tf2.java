package p000;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import net.safemoon.androidwallet.model.contact.abstraction.IContact;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0018\u0010\b\u001a\u0004\u0018\u00010\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0006\u0010\t¨\u0006\r"}, mo44877d2 = {"Ltf2;", "Lao2;", "", "Lnet/safemoon/androidwallet/model/contact/abstraction/IContact;", "origin", "Ldr0;", "a", "contactList", "b", "Ljava/util/List;", "sortedContactList", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: tf2 */
/* compiled from: GetConcatCarouselDataUseCase.kt */
public final class tf2 implements ao2 {

    /* renamed from: a */
    public List<? extends IContact> f44728a;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo44877d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    /* renamed from: tf2$a */
    /* compiled from: Comparisons.kt */
    public static final class C9355a<T> implements Comparator {
        public final int compare(T t, T t2) {
            return xl0.m54426a(((IContact) t).getName(), ((IContact) t2).getName());
        }
    }

    /* renamed from: a */
    public dr0 mo50272a(List<? extends IContact> list) {
        boolean z;
        vx2.m53591g(list, "origin");
        if (list.isEmpty()) {
            return new dr0(0, list);
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (T next : list) {
            IContact iContact = (IContact) next;
            if (hashSet.add(iContact.getLinkId() + "-" + iContact.getAddress())) {
                arrayList.add(next);
            }
        }
        List<? extends IContact> D0 = CollectionsKt___CollectionsKt.m47304D0(arrayList, new C9355a());
        this.f44728a = D0;
        List<? extends IContact> list2 = null;
        if (D0 == null) {
            vx2.m53605u("sortedContactList");
            D0 = null;
        }
        IContact b = mo66036b(D0);
        if (b == null) {
            return new dr0(0, list);
        }
        List<? extends IContact> list3 = this.f44728a;
        if (list3 == null) {
            vx2.m53605u("sortedContactList");
        } else {
            list2 = list3;
        }
        ArrayList arrayList2 = new ArrayList();
        for (T next2 : list2) {
            if (((IContact) next2).getId() != b.getId()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList2.add(next2);
            }
        }
        LinkedList linkedList = new LinkedList(arrayList2);
        int size = linkedList.size() / 2;
        linkedList.add(size, b);
        return new dr0(size, linkedList);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
        if (r5 < r7) goto L_0x0042;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final net.safemoon.androidwallet.model.contact.abstraction.IContact mo66036b(java.util.List<? extends net.safemoon.androidwallet.model.contact.abstraction.IContact> r10) {
        /*
            r9 = this;
            int r0 = r10.size()
            r1 = 1
            if (r0 > r1) goto L_0x000f
            r0 = 0
            java.lang.Object r10 = r10.get(r0)
            net.safemoon.androidwallet.model.contact.abstraction.IContact r10 = (net.safemoon.androidwallet.model.contact.abstraction.IContact) r10
            return r10
        L_0x000f:
            java.util.Iterator r10 = r10.iterator()
            r0 = 0
            r1 = r0
        L_0x0015:
            boolean r2 = r10.hasNext()
            r3 = 0
            if (r2 == 0) goto L_0x0062
            java.lang.Object r2 = r10.next()
            net.safemoon.androidwallet.model.contact.abstraction.IContact r2 = (net.safemoon.androidwallet.model.contact.abstraction.IContact) r2
            if (r0 != 0) goto L_0x0026
            goto L_0x0042
        L_0x0026:
            java.lang.Long r5 = r0.getContactCreate()
            if (r5 == 0) goto L_0x0031
            long r5 = r5.longValue()
            goto L_0x0032
        L_0x0031:
            r5 = r3
        L_0x0032:
            java.lang.Long r7 = r2.getContactCreate()
            if (r7 == 0) goto L_0x003d
            long r7 = r7.longValue()
            goto L_0x003e
        L_0x003d:
            r7 = r3
        L_0x003e:
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 >= 0) goto L_0x0043
        L_0x0042:
            r0 = r2
        L_0x0043:
            if (r1 != 0) goto L_0x0046
            goto L_0x0060
        L_0x0046:
            java.lang.Long r5 = r1.getLastSent()
            if (r5 == 0) goto L_0x0051
            long r5 = r5.longValue()
            goto L_0x0052
        L_0x0051:
            r5 = r3
        L_0x0052:
            java.lang.Long r7 = r2.getLastSent()
            if (r7 == 0) goto L_0x005c
            long r3 = r7.longValue()
        L_0x005c:
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x0015
        L_0x0060:
            r1 = r2
            goto L_0x0015
        L_0x0062:
            boolean r10 = p000.vx2.m53586b(r0, r1)
            if (r10 == 0) goto L_0x0069
            goto L_0x0089
        L_0x0069:
            if (r0 == 0) goto L_0x0076
            java.lang.Long r10 = r0.getContactCreate()
            if (r10 == 0) goto L_0x0076
            long r5 = r10.longValue()
            goto L_0x0077
        L_0x0076:
            r5 = r3
        L_0x0077:
            if (r1 == 0) goto L_0x0083
            java.lang.Long r10 = r1.getLastSent()
            if (r10 == 0) goto L_0x0083
            long r3 = r10.longValue()
        L_0x0083:
            int r10 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r10 <= 0) goto L_0x0088
            goto L_0x0089
        L_0x0088:
            r0 = r1
        L_0x0089:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.tf2.mo66036b(java.util.List):net.safemoon.androidwallet.model.contact.abstraction.IContact");
    }
}
