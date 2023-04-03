package net.safemoon.androidwallet.repository.dataSource.collection;

import androidx.lifecycle.LiveData;
import java.util.List;
import kotlin.Metadata;
import net.safemoon.androidwallet.model.collectible.RoomNFT;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010,\u001a\u00020*¢\u0006\u0004\b-\u0010.J\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u000b\u001a\u00020\nH@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0006H@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0006H@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0010J#\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u0006H@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0010J\u001b\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\tJ/\u0010\u001d\u001a\u00020\u001c2\u001a\u0010\u001b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\n0\u001a0\u0005H@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u000e\u001a\u00020\u0006H@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u0010J#\u0010\"\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0003\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J#\u0010%\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020$2\u0006\u0010\u000b\u001a\u00020\nH@ø\u0001\u0000¢\u0006\u0004\b%\u0010&J)\u0010(\u001a\u00020\u001c2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020'0\u00052\u0006\u0010\u000b\u001a\u00020\nH@ø\u0001\u0000¢\u0006\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020*8\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010+\u0002\u0004\n\u0002\b\u0019¨\u0006/"}, mo44877d2 = {"Lnet/safemoon/androidwallet/repository/dataSource/collection/NftDataSource;", "", "", "collectionId", "Landroidx/lifecycle/LiveData;", "", "Lnet/safemoon/androidwallet/model/collectible/RoomNFT;", "j", "e", "(JLns0;)Ljava/lang/Object;", "", "chainId", "f", "(ILns0;)Ljava/lang/Object;", "nft", "k", "(Lnet/safemoon/androidwallet/model/collectible/RoomNFT;Lns0;)Ljava/lang/Object;", "l", "", "token_id", "h", "(Ljava/lang/String;JLns0;)Ljava/lang/Object;", "", "i", "id", "g", "Lkotlin/Pair;", "mapIndexed", "Lr37;", "m", "(Ljava/util/List;Lns0;)Ljava/lang/Object;", "d", "Lnet/safemoon/androidwallet/model/collectible/Assets;", "listOfNft", "c", "(Lnet/safemoon/androidwallet/model/collectible/Assets;JLns0;)Ljava/lang/Object;", "Lnet/safemoon/androidwallet/model/collectible/MoralisNFTs;", "b", "(Lnet/safemoon/androidwallet/model/collectible/MoralisNFTs;ILns0;)Ljava/lang/Object;", "Lnet/safemoon/androidwallet/model/rpc2/solana/collections/SolanaNfts;", "a", "(Ljava/util/List;ILns0;)Ljava/lang/Object;", "Lo64;", "Lo64;", "dao", "<init>", "(Lo64;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: NftDataSource.kt */
public final class NftDataSource {

    /* renamed from: a */
    public final o64 f42542a;

    public NftDataSource(o64 o64) {
        vx2.m53591g(o64, "dao");
        this.f42542a = o64;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0072 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo60800a(java.util.List<net.safemoon.androidwallet.model.rpc2.solana.collections.SolanaNfts> r19, int r20, p000.ns0<? super p000.r37> r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r21
            boolean r2 = r1 instanceof net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource$clearCacheForSolana$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource$clearCacheForSolana$1 r2 = (net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource$clearCacheForSolana$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource$clearCacheForSolana$1 r2 = new net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource$clearCacheForSolana$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = p000.wx2.m54101d()
            int r4 = r2.label
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L_0x0052
            if (r4 == r6) goto L_0x0041
            if (r4 != r5) goto L_0x0039
            java.lang.Object r4 = r2.L$1
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r6 = r2.L$0
            net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource r6 = (net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource) r6
            p000.hg5.m45199b(r1)
            goto L_0x00d8
        L_0x0039:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0041:
            java.lang.Object r4 = r2.L$1
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r7 = r2.L$0
            net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource r7 = (net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource) r7
            p000.hg5.m45199b(r1)
            r17 = r4
            r4 = r1
            r1 = r17
            goto L_0x0067
        L_0x0052:
            p000.hg5.m45199b(r1)
            r2.L$0 = r0
            r1 = r19
            r2.L$1 = r1
            r2.label = r6
            r4 = r20
            java.lang.Object r4 = r0.mo60805f(r4, r2)
            if (r4 != r3) goto L_0x0066
            return r3
        L_0x0066:
            r7 = r0
        L_0x0067:
            java.util.List r4 = (java.util.List) r4
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x0072:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L_0x00d2
            java.lang.Object r9 = r4.next()
            r10 = r9
            net.safemoon.androidwallet.model.collectible.RoomNFT r10 = (net.safemoon.androidwallet.model.collectible.RoomNFT) r10
            boolean r11 = r1 instanceof java.util.Collection
            if (r11 == 0) goto L_0x008b
            boolean r11 = r1.isEmpty()
            if (r11 == 0) goto L_0x008b
        L_0x0089:
            r12 = 0
            goto L_0x00ca
        L_0x008b:
            java.util.Iterator r11 = r1.iterator()
        L_0x008f:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L_0x0089
            java.lang.Object r13 = r11.next()
            net.safemoon.androidwallet.model.rpc2.solana.collections.SolanaNfts r13 = (net.safemoon.androidwallet.model.rpc2.solana.collections.SolanaNfts) r13
            java.lang.String r14 = r10.getToken_id()
            java.lang.String r15 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
            r16 = 0
            if (r14 == 0) goto L_0x00af
            java.util.Locale r12 = java.util.Locale.ROOT
            java.lang.String r12 = r14.toLowerCase(r12)
            p000.vx2.m53590f(r12, r15)
            goto L_0x00b1
        L_0x00af:
            r12 = r16
        L_0x00b1:
            java.lang.String r13 = r13.getMint()
            if (r13 == 0) goto L_0x00c1
            java.util.Locale r14 = java.util.Locale.ROOT
            java.lang.String r13 = r13.toLowerCase(r14)
            p000.vx2.m53590f(r13, r15)
            goto L_0x00c3
        L_0x00c1:
            r13 = r16
        L_0x00c3:
            boolean r12 = p000.vx2.m53586b(r12, r13)
            if (r12 == 0) goto L_0x008f
            r12 = r6
        L_0x00ca:
            r10 = r12 ^ 1
            if (r10 == 0) goto L_0x0072
            r8.add(r9)
            goto L_0x0072
        L_0x00d2:
            java.util.Iterator r1 = r8.iterator()
            r4 = r1
            r6 = r7
        L_0x00d8:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x00fc
            java.lang.Object r1 = r4.next()
            net.safemoon.androidwallet.model.collectible.RoomNFT r1 = (net.safemoon.androidwallet.model.collectible.RoomNFT) r1
            java.lang.Long r7 = r1.getId()
            if (r7 == 0) goto L_0x00d8
            r7.longValue()
            o64 r7 = r6.f42542a
            r2.L$0 = r6
            r2.L$1 = r4
            r2.label = r5
            java.lang.Object r1 = r7.mo62844h(r1, r2)
            if (r1 != r3) goto L_0x00d8
            return r3
        L_0x00fc:
            r37 r1 = p000.r37.f33317a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource.mo60800a(java.util.List, int, ns0):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0072 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo60801b(net.safemoon.androidwallet.model.collectible.MoralisNFTs r19, int r20, p000.ns0<? super p000.r37> r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r21
            boolean r2 = r1 instanceof net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource$clearCacheFromMoralis$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource$clearCacheFromMoralis$1 r2 = (net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource$clearCacheFromMoralis$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource$clearCacheFromMoralis$1 r2 = new net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource$clearCacheFromMoralis$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = p000.wx2.m54101d()
            int r4 = r2.label
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L_0x0052
            if (r4 == r6) goto L_0x0041
            if (r4 != r5) goto L_0x0039
            java.lang.Object r4 = r2.L$1
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r6 = r2.L$0
            net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource r6 = (net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource) r6
            p000.hg5.m45199b(r1)
            goto L_0x00dc
        L_0x0039:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0041:
            java.lang.Object r4 = r2.L$1
            net.safemoon.androidwallet.model.collectible.MoralisNFTs r4 = (net.safemoon.androidwallet.model.collectible.MoralisNFTs) r4
            java.lang.Object r7 = r2.L$0
            net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource r7 = (net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource) r7
            p000.hg5.m45199b(r1)
            r17 = r4
            r4 = r1
            r1 = r17
            goto L_0x0067
        L_0x0052:
            p000.hg5.m45199b(r1)
            r2.L$0 = r0
            r1 = r19
            r2.L$1 = r1
            r2.label = r6
            r4 = r20
            java.lang.Object r4 = r0.mo60805f(r4, r2)
            if (r4 != r3) goto L_0x0066
            return r3
        L_0x0066:
            r7 = r0
        L_0x0067:
            java.util.List r4 = (java.util.List) r4
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x0072:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L_0x00d6
            java.lang.Object r9 = r4.next()
            r10 = r9
            net.safemoon.androidwallet.model.collectible.RoomNFT r10 = (net.safemoon.androidwallet.model.collectible.RoomNFT) r10
            java.util.ArrayList r11 = r1.getResult()
            boolean r12 = r11 instanceof java.util.Collection
            if (r12 == 0) goto L_0x008f
            boolean r12 = r11.isEmpty()
            if (r12 == 0) goto L_0x008f
        L_0x008d:
            r13 = 0
            goto L_0x00ce
        L_0x008f:
            java.util.Iterator r11 = r11.iterator()
        L_0x0093:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x008d
            java.lang.Object r12 = r11.next()
            net.safemoon.androidwallet.model.collectible.MoralisNft r12 = (net.safemoon.androidwallet.model.collectible.MoralisNft) r12
            java.lang.String r14 = r10.getToken_id()
            java.lang.String r15 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
            r16 = 0
            if (r14 == 0) goto L_0x00b3
            java.util.Locale r13 = java.util.Locale.ROOT
            java.lang.String r13 = r14.toLowerCase(r13)
            p000.vx2.m53590f(r13, r15)
            goto L_0x00b5
        L_0x00b3:
            r13 = r16
        L_0x00b5:
            java.lang.String r12 = r12.getTokenId()
            if (r12 == 0) goto L_0x00c5
            java.util.Locale r14 = java.util.Locale.ROOT
            java.lang.String r12 = r12.toLowerCase(r14)
            p000.vx2.m53590f(r12, r15)
            goto L_0x00c7
        L_0x00c5:
            r12 = r16
        L_0x00c7:
            boolean r12 = p000.vx2.m53586b(r13, r12)
            if (r12 == 0) goto L_0x0093
            r13 = r6
        L_0x00ce:
            r10 = r13 ^ 1
            if (r10 == 0) goto L_0x0072
            r8.add(r9)
            goto L_0x0072
        L_0x00d6:
            java.util.Iterator r1 = r8.iterator()
            r4 = r1
            r6 = r7
        L_0x00dc:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0100
            java.lang.Object r1 = r4.next()
            net.safemoon.androidwallet.model.collectible.RoomNFT r1 = (net.safemoon.androidwallet.model.collectible.RoomNFT) r1
            java.lang.Long r7 = r1.getId()
            if (r7 == 0) goto L_0x00dc
            r7.longValue()
            o64 r7 = r6.f42542a
            r2.L$0 = r6
            r2.L$1 = r4
            r2.label = r5
            java.lang.Object r1 = r7.mo62844h(r1, r2)
            if (r1 != r3) goto L_0x00dc
            return r3
        L_0x0100:
            r37 r1 = p000.r37.f33317a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource.mo60801b(net.safemoon.androidwallet.model.collectible.MoralisNFTs, int, ns0):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo60802c(net.safemoon.androidwallet.model.collectible.Assets r19, long r20, p000.ns0<? super p000.r37> r22) {
        /*
            r18 = this;
            r0 = r18
            r1 = r22
            boolean r2 = r1 instanceof net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource$clearCacheFromOpenSea$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource$clearCacheFromOpenSea$1 r2 = (net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource$clearCacheFromOpenSea$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource$clearCacheFromOpenSea$1 r2 = new net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource$clearCacheFromOpenSea$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = p000.wx2.m54101d()
            int r4 = r2.label
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L_0x0052
            if (r4 == r6) goto L_0x0041
            if (r4 != r5) goto L_0x0039
            java.lang.Object r4 = r2.L$1
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r6 = r2.L$0
            net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource r6 = (net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource) r6
            p000.hg5.m45199b(r1)
            goto L_0x00e2
        L_0x0039:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0041:
            java.lang.Object r4 = r2.L$1
            net.safemoon.androidwallet.model.collectible.Assets r4 = (net.safemoon.androidwallet.model.collectible.Assets) r4
            java.lang.Object r7 = r2.L$0
            net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource r7 = (net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource) r7
            p000.hg5.m45199b(r1)
            r17 = r4
            r4 = r1
            r1 = r17
            goto L_0x0067
        L_0x0052:
            p000.hg5.m45199b(r1)
            r2.L$0 = r0
            r1 = r19
            r2.L$1 = r1
            r2.label = r6
            r7 = r20
            java.lang.Object r4 = r0.mo60804e(r7, r2)
            if (r4 != r3) goto L_0x0066
            return r3
        L_0x0066:
            r7 = r0
        L_0x0067:
            java.util.List r4 = (java.util.List) r4
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x0072:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L_0x00dc
            java.lang.Object r9 = r4.next()
            r10 = r9
            net.safemoon.androidwallet.model.collectible.RoomNFT r10 = (net.safemoon.androidwallet.model.collectible.RoomNFT) r10
            java.util.List r11 = r1.getAssets()
            r12 = 0
            if (r11 == 0) goto L_0x00d5
            boolean r13 = r11.isEmpty()
            if (r13 == 0) goto L_0x008e
        L_0x008c:
            r6 = r12
            goto L_0x00d2
        L_0x008e:
            java.util.Iterator r11 = r11.iterator()
        L_0x0092:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L_0x008c
            java.lang.Object r13 = r11.next()
            net.safemoon.androidwallet.model.collectible.Asset r13 = (net.safemoon.androidwallet.model.collectible.Asset) r13
            java.lang.String r14 = r10.getToken_id()
            java.lang.String r15 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
            r16 = 0
            if (r14 == 0) goto L_0x00b2
            java.util.Locale r6 = java.util.Locale.ROOT
            java.lang.String r6 = r14.toLowerCase(r6)
            p000.vx2.m53590f(r6, r15)
            goto L_0x00b4
        L_0x00b2:
            r6 = r16
        L_0x00b4:
            if (r13 == 0) goto L_0x00c6
            java.lang.String r13 = r13.getToken_id()
            if (r13 == 0) goto L_0x00c6
            java.util.Locale r14 = java.util.Locale.ROOT
            java.lang.String r13 = r13.toLowerCase(r14)
            p000.vx2.m53590f(r13, r15)
            goto L_0x00c8
        L_0x00c6:
            r13 = r16
        L_0x00c8:
            boolean r6 = p000.vx2.m53586b(r6, r13)
            if (r6 == 0) goto L_0x00d0
            r6 = 1
            goto L_0x00d2
        L_0x00d0:
            r6 = 1
            goto L_0x0092
        L_0x00d2:
            if (r6 != 0) goto L_0x00d5
            r12 = 1
        L_0x00d5:
            if (r12 == 0) goto L_0x00da
            r8.add(r9)
        L_0x00da:
            r6 = 1
            goto L_0x0072
        L_0x00dc:
            java.util.Iterator r1 = r8.iterator()
            r4 = r1
            r6 = r7
        L_0x00e2:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x00fb
            java.lang.Object r1 = r4.next()
            net.safemoon.androidwallet.model.collectible.RoomNFT r1 = (net.safemoon.androidwallet.model.collectible.RoomNFT) r1
            r2.L$0 = r6
            r2.L$1 = r4
            r2.label = r5
            java.lang.Object r1 = r6.mo60803d(r1, r2)
            if (r1 != r3) goto L_0x00e2
            return r3
        L_0x00fb:
            r37 r1 = p000.r37.f33317a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource.mo60802c(net.safemoon.androidwallet.model.collectible.Assets, long, ns0):java.lang.Object");
    }

    /* renamed from: d */
    public final Object mo60803d(RoomNFT roomNFT, ns0<? super r37> ns0) {
        Object h = this.f42542a.mo62844h(roomNFT, ns0);
        if (h == wx2.m54101d()) {
            return h;
        }
        return r37.f33317a;
    }

    /* renamed from: e */
    public final Object mo60804e(long j, ns0<? super List<RoomNFT>> ns0) {
        return this.f42542a.mo62842f(j, ns0);
    }

    /* renamed from: f */
    public final Object mo60805f(int i, ns0<? super List<RoomNFT>> ns0) {
        return this.f42542a.mo62846j(i, ns0);
    }

    /* renamed from: g */
    public final Object mo60806g(long j, ns0<? super RoomNFT> ns0) {
        return this.f42542a.mo62839c(j, ns0);
    }

    /* renamed from: h */
    public final Object mo60807h(String str, long j, ns0<? super RoomNFT> ns0) {
        return this.f42542a.mo62845i(str, j, ns0);
    }

    /* renamed from: i */
    public final Object mo60808i(RoomNFT roomNFT, ns0<? super Boolean> ns0) {
        o64 o64 = this.f42542a;
        String token_id = roomNFT.getToken_id();
        if (token_id == null) {
            token_id = "";
        }
        return o64.mo62841e(token_id, roomNFT.getCollectionId(), ns0);
    }

    /* renamed from: j */
    public final LiveData<List<RoomNFT>> mo60809j(long j) {
        return this.f42542a.mo62840d(j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00af A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b0 A[PHI: r10 
      PHI: (r10v2 java.lang.Object) = (r10v4 java.lang.Object), (r10v1 java.lang.Object) binds: [B:31:0x00ad, B:11:0x002b] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo60810k(net.safemoon.androidwallet.model.collectible.RoomNFT r9, p000.ns0<? super java.lang.Long> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource$save$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource$save$1 r0 = (net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource$save$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource$save$1 r0 = new net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource$save$1
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0054
            if (r2 == r5) goto L_0x0048
            if (r2 == r4) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            p000.hg5.m45199b(r10)
            goto L_0x00b0
        L_0x0030:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0038:
            java.lang.Object r9 = r0.L$2
            net.safemoon.androidwallet.model.collectible.RoomNFT r9 = (net.safemoon.androidwallet.model.collectible.RoomNFT) r9
            java.lang.Object r2 = r0.L$1
            net.safemoon.androidwallet.model.collectible.RoomNFT r2 = (net.safemoon.androidwallet.model.collectible.RoomNFT) r2
            java.lang.Object r4 = r0.L$0
            net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource r4 = (net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource) r4
            p000.hg5.m45199b(r10)
            goto L_0x008c
        L_0x0048:
            java.lang.Object r9 = r0.L$1
            net.safemoon.androidwallet.model.collectible.RoomNFT r9 = (net.safemoon.androidwallet.model.collectible.RoomNFT) r9
            java.lang.Object r2 = r0.L$0
            net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource r2 = (net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource) r2
            p000.hg5.m45199b(r10)
            goto L_0x0065
        L_0x0054:
            p000.hg5.m45199b(r10)
            r0.L$0 = r8
            r0.L$1 = r9
            r0.label = r5
            java.lang.Object r10 = r8.mo60808i(r9, r0)
            if (r10 != r1) goto L_0x0064
            return r1
        L_0x0064:
            r2 = r8
        L_0x0065:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x009e
            o64 r10 = r2.f42542a
            java.lang.String r5 = r9.getToken_id()
            if (r5 != 0) goto L_0x0077
            java.lang.String r5 = ""
        L_0x0077:
            long r6 = r9.getCollectionId()
            r0.L$0 = r2
            r0.L$1 = r9
            r0.L$2 = r9
            r0.label = r4
            java.lang.Object r10 = r10.mo62845i(r5, r6, r0)
            if (r10 != r1) goto L_0x008a
            return r1
        L_0x008a:
            r4 = r2
            r2 = r9
        L_0x008c:
            net.safemoon.androidwallet.model.collectible.RoomNFT r10 = (net.safemoon.androidwallet.model.collectible.RoomNFT) r10
            java.lang.Long r5 = r10.getId()
            r9.setId(r5)
            int r10 = r10.getOrder()
            r9.setOrder(r10)
            r9 = r2
            r2 = r4
        L_0x009e:
            o64 r10 = r2.f42542a
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.L$2 = r2
            r0.label = r3
            java.lang.Object r10 = r10.mo62838b(r9, r0)
            if (r10 != r1) goto L_0x00b0
            return r1
        L_0x00b0:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource.mo60810k(net.safemoon.androidwallet.model.collectible.RoomNFT, ns0):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b2, code lost:
        if (r7 == null) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00cd, code lost:
        if (r7 == null) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e8, code lost:
        if (r7 == null) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0102, code lost:
        if (r6 == null) goto L_0x0104;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0136 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0137 A[PHI: r13 
      PHI: (r13v2 java.lang.Object) = (r13v6 java.lang.Object), (r13v1 java.lang.Object) binds: [B:72:0x0134, B:11:0x002b] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo60811l(net.safemoon.androidwallet.model.collectible.RoomNFT r12, p000.ns0<? super java.lang.Long> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource$updateNft$1
            if (r0 == 0) goto L_0x0013
            r0 = r13
            net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource$updateNft$1 r0 = (net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource$updateNft$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource$updateNft$1 r0 = new net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource$updateNft$1
            r0.<init>(r11, r13)
        L_0x0018:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0058
            if (r2 == r5) goto L_0x004c
            if (r2 == r4) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            p000.hg5.m45199b(r13)
            goto L_0x0137
        L_0x0030:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0038:
            java.lang.Object r12 = r0.L$3
            o64 r12 = (p000.o64) r12
            java.lang.Object r2 = r0.L$2
            net.safemoon.androidwallet.model.collectible.RoomNFT r2 = (net.safemoon.androidwallet.model.collectible.RoomNFT) r2
            java.lang.Object r4 = r0.L$1
            net.safemoon.androidwallet.model.collectible.RoomNFT r4 = (net.safemoon.androidwallet.model.collectible.RoomNFT) r4
            java.lang.Object r6 = r0.L$0
            net.safemoon.androidwallet.model.collectible.RoomNFT r6 = (net.safemoon.androidwallet.model.collectible.RoomNFT) r6
            p000.hg5.m45199b(r13)
            goto L_0x0095
        L_0x004c:
            java.lang.Object r12 = r0.L$1
            net.safemoon.androidwallet.model.collectible.RoomNFT r12 = (net.safemoon.androidwallet.model.collectible.RoomNFT) r12
            java.lang.Object r2 = r0.L$0
            net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource r2 = (net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource) r2
            p000.hg5.m45199b(r13)
            goto L_0x0069
        L_0x0058:
            p000.hg5.m45199b(r13)
            r0.L$0 = r11
            r0.L$1 = r12
            r0.label = r5
            java.lang.Object r13 = r11.mo60808i(r12, r0)
            if (r13 != r1) goto L_0x0068
            return r1
        L_0x0068:
            r2 = r11
        L_0x0069:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L_0x0138
            o64 r13 = r2.f42542a
            java.lang.String r2 = r12.getToken_id()
            if (r2 != 0) goto L_0x007b
            java.lang.String r2 = ""
        L_0x007b:
            long r6 = r12.getCollectionId()
            r0.L$0 = r12
            r0.L$1 = r12
            r0.L$2 = r12
            r0.L$3 = r13
            r0.label = r4
            java.lang.Object r2 = r13.mo62845i(r2, r6, r0)
            if (r2 != r1) goto L_0x0090
            return r1
        L_0x0090:
            r4 = r12
            r6 = r4
            r12 = r13
            r13 = r2
            r2 = r6
        L_0x0095:
            net.safemoon.androidwallet.model.collectible.RoomNFT r13 = (net.safemoon.androidwallet.model.collectible.RoomNFT) r13
            java.lang.Long r7 = r13.getId()
            r2.setId(r7)
            java.lang.String r7 = r6.getName()
            r8 = 0
            r9 = 0
            if (r7 == 0) goto L_0x00b4
            int r10 = r7.length()
            if (r10 != 0) goto L_0x00ae
            r10 = r5
            goto L_0x00af
        L_0x00ae:
            r10 = r8
        L_0x00af:
            if (r10 == 0) goto L_0x00b2
            r7 = r9
        L_0x00b2:
            if (r7 != 0) goto L_0x00b8
        L_0x00b4:
            java.lang.String r7 = r13.getName()
        L_0x00b8:
            r2.setName(r7)
            java.lang.String r7 = r6.getDescription()
            if (r7 == 0) goto L_0x00cf
            int r10 = r7.length()
            if (r10 != 0) goto L_0x00c9
            r10 = r5
            goto L_0x00ca
        L_0x00c9:
            r10 = r8
        L_0x00ca:
            if (r10 == 0) goto L_0x00cd
            r7 = r9
        L_0x00cd:
            if (r7 != 0) goto L_0x00d3
        L_0x00cf:
            java.lang.String r7 = r13.getDescription()
        L_0x00d3:
            r2.setDescription(r7)
            java.lang.String r7 = r6.getAnimation_url()
            if (r7 == 0) goto L_0x00ea
            int r10 = r7.length()
            if (r10 != 0) goto L_0x00e4
            r10 = r5
            goto L_0x00e5
        L_0x00e4:
            r10 = r8
        L_0x00e5:
            if (r10 == 0) goto L_0x00e8
            r7 = r9
        L_0x00e8:
            if (r7 != 0) goto L_0x00ee
        L_0x00ea:
            java.lang.String r7 = r13.getAnimation_url()
        L_0x00ee:
            r2.setAnimation_url(r7)
            java.lang.String r6 = r6.getImage_preview_url()
            if (r6 == 0) goto L_0x0104
            int r7 = r6.length()
            if (r7 != 0) goto L_0x00fe
            goto L_0x00ff
        L_0x00fe:
            r5 = r8
        L_0x00ff:
            if (r5 == 0) goto L_0x0102
            r6 = r9
        L_0x0102:
            if (r6 != 0) goto L_0x0108
        L_0x0104:
            java.lang.String r6 = r13.getImage_preview_url()
        L_0x0108:
            r2.setImage_preview_url(r6)
            long r5 = java.lang.System.currentTimeMillis()
            r2.setUpdatedTime(r5)
            java.lang.String r5 = r13.getAttributes()
            if (r5 == 0) goto L_0x011f
            java.lang.String r5 = r13.getAttributes()
            r2.setAttributes(r5)
        L_0x011f:
            int r13 = r13.getOrder()
            r2.setOrder(r13)
            r0.L$0 = r9
            r0.L$1 = r9
            r0.L$2 = r9
            r0.L$3 = r9
            r0.label = r3
            java.lang.Object r13 = r12.mo62838b(r4, r0)
            if (r13 != r1) goto L_0x0137
            return r1
        L_0x0137:
            return r13
        L_0x0138:
            r12 = 0
            java.lang.Long r12 = p000.a40.m31674e(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource.mo60811l(net.safemoon.androidwallet.model.collectible.RoomNFT, ns0):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo60812m(java.util.List<kotlin.Pair<java.lang.Long, java.lang.Integer>> r8, p000.ns0<? super p000.r37> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource$updateOrders$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource$updateOrders$1 r0 = (net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource$updateOrders$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource$updateOrders$1 r0 = new net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource$updateOrders$1
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r8 = r0.L$1
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r2 = r0.L$0
            net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource r2 = (net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource) r2
            p000.hg5.m45199b(r9)
            goto L_0x0041
        L_0x0031:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0039:
            p000.hg5.m45199b(r9)
            java.util.Iterator r8 = r8.iterator()
            r2 = r7
        L_0x0041:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0072
            java.lang.Object r9 = r8.next()
            kotlin.Pair r9 = (kotlin.Pair) r9
            java.lang.Object r4 = r9.getFirst()
            java.lang.Long r4 = (java.lang.Long) r4
            if (r4 == 0) goto L_0x0041
            long r4 = r4.longValue()
            o64 r6 = r2.f42542a
            java.lang.Object r9 = r9.getSecond()
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            r0.L$0 = r2
            r0.L$1 = r8
            r0.label = r3
            java.lang.Object r9 = r6.mo62837a(r4, r9, r0)
            if (r9 != r1) goto L_0x0041
            return r1
        L_0x0072:
            r37 r8 = p000.r37.f33317a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource.mo60812m(java.util.List, ns0):java.lang.Object");
    }
}
