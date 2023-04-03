package p000;

import androidx.lifecycle.LiveData;
import java.util.List;
import kotlin.Metadata;
import net.safemoon.androidwallet.model.reflections.RoomReflectionsData;
import net.safemoon.androidwallet.model.reflections.RoomReflectionsDataAndToken;
import net.safemoon.androidwallet.model.reflections.RoomReflectionsToken;
import net.safemoon.androidwallet.model.reflections.RoomReflectionsTokenAndData;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\bg\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H§@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ#\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH§@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0004H§@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH§@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\u000bH§@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH§@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J#\u0010#\u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\rH§@ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u001c\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020&0%2\u0006\u0010\u000e\u001a\u00020\rH'J\u001c\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0&0%2\u0006\u0010\u000e\u001a\u00020\rH'J\u0019\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00020&H§@ø\u0001\u0000¢\u0006\u0004\b*\u0010+J\u001e\u0010-\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0&\u0018\u00010%2\u0006\u0010\f\u001a\u00020\u000bH'J&\u0010/\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0&\u0018\u00010%2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\u0004H'J\u001d\u00100\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\u000bH§@ø\u0001\u0000¢\u0006\u0004\b0\u00101J\u0018\u00102\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010%2\u0006\u0010\f\u001a\u00020\u000bH'J\u001d\u00103\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u000bH§@ø\u0001\u0000¢\u0006\u0004\b3\u00101J\u001b\u00105\u001a\u00020\u00162\u0006\u00104\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b5\u0010\u0006J\u0013\u00106\u001a\u00020\u0016H§@ø\u0001\u0000¢\u0006\u0004\b6\u0010+J\u001b\u00107\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u000bH§@ø\u0001\u0000¢\u0006\u0004\b7\u00101\u0002\u0004\n\u0002\b\u0019¨\u00068"}, mo44877d2 = {"Llb5;", "", "Lnet/safemoon/androidwallet/model/reflections/RoomReflectionsToken;", "token", "", "e", "(Lnet/safemoon/androidwallet/model/reflections/RoomReflectionsToken;Lns0;)Ljava/lang/Object;", "Lnet/safemoon/androidwallet/model/reflections/RoomReflectionsData;", "data", "o", "(Lnet/safemoon/androidwallet/model/reflections/RoomReflectionsData;Lns0;)Ljava/lang/Object;", "", "symbolWithType", "", "tokenTypeChain", "", "k", "(Ljava/lang/String;ILns0;)Ljava/lang/Object;", "timeStamp", "g", "(Ljava/lang/String;JLns0;)Ljava/lang/Object;", "cmcId", "Lr37;", "s", "(ILjava/lang/String;Lns0;)Ljava/lang/Object;", "", "priceUsd", "m", "(DLjava/lang/String;Lns0;)Ljava/lang/Object;", "latestBalance", "latestTimeStamp", "r", "(JJLjava/lang/String;Lns0;)Ljava/lang/Object;", "id", "enable", "n", "(JILns0;)Ljava/lang/Object;", "Landroidx/lifecycle/LiveData;", "", "d", "Lnet/safemoon/androidwallet/model/reflections/RoomReflectionsTokenAndData;", "a", "j", "(Lns0;)Ljava/lang/Object;", "Lnet/safemoon/androidwallet/model/reflections/RoomReflectionsDataAndToken;", "h", "startTime", "b", "c", "(Ljava/lang/String;Lns0;)Ljava/lang/Object;", "i", "q", "roomReflectionToken", "f", "p", "l", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: lb5 */
/* compiled from: ReflectionsDao.kt */
public interface lb5 {
    /* renamed from: a */
    LiveData<List<RoomReflectionsTokenAndData>> mo55856a(int i);

    /* renamed from: b */
    LiveData<List<RoomReflectionsDataAndToken>> mo55857b(String str, long j);

    /* renamed from: c */
    Object mo55858c(String str, ns0<? super RoomReflectionsData> ns0);

    /* renamed from: d */
    LiveData<List<RoomReflectionsToken>> mo55859d(int i);

    /* renamed from: e */
    Object mo55860e(RoomReflectionsToken roomReflectionsToken, ns0<? super Long> ns0);

    /* renamed from: f */
    Object mo55861f(RoomReflectionsToken roomReflectionsToken, ns0<? super r37> ns0);

    /* renamed from: g */
    Object mo55862g(String str, long j, ns0<? super Boolean> ns0);

    /* renamed from: h */
    LiveData<List<RoomReflectionsDataAndToken>> mo55863h(String str);

    /* renamed from: i */
    LiveData<RoomReflectionsTokenAndData> mo55864i(String str);

    /* renamed from: j */
    Object mo55865j(ns0<? super List<RoomReflectionsToken>> ns0);

    /* renamed from: k */
    Object mo55866k(String str, int i, ns0<? super Boolean> ns0);

    /* renamed from: l */
    Object mo55867l(String str, ns0<? super r37> ns0);

    /* renamed from: m */
    Object mo55868m(double d, String str, ns0<? super r37> ns0);

    /* renamed from: n */
    Object mo55869n(long j, int i, ns0<? super r37> ns0);

    /* renamed from: o */
    Object mo55870o(RoomReflectionsData roomReflectionsData, ns0<? super Long> ns0);

    /* renamed from: p */
    Object mo55871p(ns0<? super r37> ns0);

    /* renamed from: q */
    Object mo55872q(String str, ns0<? super RoomReflectionsToken> ns0);

    /* renamed from: r */
    Object mo55873r(long j, long j2, String str, ns0<? super r37> ns0);

    /* renamed from: s */
    Object mo55874s(int i, String str, ns0<? super r37> ns0);
}
