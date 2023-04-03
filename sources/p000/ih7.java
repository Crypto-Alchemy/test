package p000;

import androidx.lifecycle.LiveData;
import java.util.List;
import kotlin.Metadata;
import net.safemoon.androidwallet.model.wallets.Wallet;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H'J\u0019\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H§@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH§@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\u0004H§@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H§@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0011H§@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJK\u0010%\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0011H§@ø\u0001\u0000¢\u0006\u0004\b%\u0010&J#\u0010'\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0004\b'\u0010\u001fJ\u001b\u0010(\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\u0004H§@ø\u0001\u0000¢\u0006\u0004\b(\u0010\u0010\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, mo44877d2 = {"Lih7;", "", "Landroidx/lifecycle/LiveData;", "", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "c", "", "k", "l", "(Lns0;)Ljava/lang/Object;", "", "id", "f", "(JLns0;)Ljava/lang/Object;", "wallet", "g", "(Lnet/safemoon/androidwallet/model/wallets/Wallet;Lns0;)Ljava/lang/Object;", "", "address", "", "b", "(Ljava/lang/String;Lns0;)Ljava/lang/Object;", "newName", "linkedState", "Lr37;", "e", "(JLjava/lang/String;ILns0;)Ljava/lang/Object;", "h", "(JLjava/lang/String;Lns0;)Ljava/lang/Object;", "isLinked", "j", "(JILns0;)Ljava/lang/Object;", "encryptedPrivateKey", "encryptedRecoveryPhrase", "ka", "u5", "order", "i", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lns0;)Ljava/lang/Object;", "a", "d", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: ih7 */
/* compiled from: WalletDao.kt */
public interface ih7 {
    /* renamed from: a */
    Object mo52474a(long j, int i, ns0<? super r37> ns0);

    /* renamed from: b */
    Object mo52475b(String str, ns0<? super Boolean> ns0);

    /* renamed from: c */
    LiveData<List<Wallet>> mo52476c();

    /* renamed from: d */
    Object mo52477d(Wallet wallet2, ns0<? super r37> ns0);

    /* renamed from: e */
    Object mo52478e(long j, String str, int i, ns0<? super r37> ns0);

    /* renamed from: f */
    Object mo52479f(long j, ns0<? super Wallet> ns0);

    /* renamed from: g */
    Object mo52480g(Wallet wallet2, ns0<? super Long> ns0);

    /* renamed from: h */
    Object mo52481h(long j, String str, ns0<? super r37> ns0);

    /* renamed from: i */
    Object mo52482i(long j, String str, String str2, String str3, String str4, int i, String str5, ns0<? super r37> ns0);

    /* renamed from: j */
    Object mo52483j(long j, int i, ns0<? super r37> ns0);

    /* renamed from: k */
    LiveData<Integer> mo52484k();

    /* renamed from: l */
    Object mo52485l(ns0<? super List<Wallet>> ns0);
}
