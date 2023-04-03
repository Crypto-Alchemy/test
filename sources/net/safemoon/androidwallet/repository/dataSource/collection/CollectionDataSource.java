package net.safemoon.androidwallet.repository.dataSource.collection;

import androidx.lifecycle.LiveData;
import java.util.List;
import kotlin.Metadata;
import net.safemoon.androidwallet.model.collectible.RoomCollection;
import net.safemoon.androidwallet.model.collectible.RoomCollectionAndNft;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010!\u001a\u00020\u001f\u0012\u0006\u0010$\u001a\u00020\"¢\u0006\u0004\b%\u0010&J\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J!\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\u0006\u0010\u0003\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\bH@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0012\u001a\u00020\u00112\u001a\u0010\u0010\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00020\u000f0\u0005H@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0014\u001a\u00020\u00112\u001a\u0010\u0010\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00020\u000f0\u0005H@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0013J)\u0010\u0018\u001a\u00020\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00052\u0006\u0010\u0017\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010\u001e\u001a\u00020\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00052\u0006\u0010\u0017\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u0019R\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010 R\u0014\u0010$\u001a\u00020\"8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010#\u0002\u0004\n\u0002\b\u0019¨\u0006'"}, mo44877d2 = {"Lnet/safemoon/androidwallet/repository/dataSource/collection/CollectionDataSource;", "", "", "chain", "Landroidx/lifecycle/LiveData;", "", "Lnet/safemoon/androidwallet/model/collectible/RoomCollectionAndNft;", "e", "Lnet/safemoon/androidwallet/model/collectible/RoomCollection;", "d", "(ILns0;)Ljava/lang/Object;", "collection", "", "f", "(Lnet/safemoon/androidwallet/model/collectible/RoomCollection;Lns0;)Ljava/lang/Object;", "Lkotlin/Pair;", "mapIndexed", "Lr37;", "h", "(Ljava/util/List;Lns0;)Ljava/lang/Object;", "g", "Lnet/safemoon/androidwallet/model/collectible/Collectible;", "listOfCollection", "chainId", "c", "(Ljava/util/List;ILns0;)Ljava/lang/Object;", "Lnet/safemoon/androidwallet/model/collectible/MoralisNFTs;", "b", "(Lnet/safemoon/androidwallet/model/collectible/MoralisNFTs;ILns0;)Ljava/lang/Object;", "Lnet/safemoon/androidwallet/model/rpc2/solana/collections/SolanaNfts;", "a", "Lej0;", "Lej0;", "dao", "Lo64;", "Lo64;", "nftDao", "<init>", "(Lej0;Lo64;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: CollectionDataSource.kt */
public final class CollectionDataSource {

    /* renamed from: a */
    public final ej0 f42540a;

    /* renamed from: b */
    public final o64 f42541b;

    public CollectionDataSource(ej0 ej0, o64 o64) {
        vx2.m53591g(ej0, "dao");
        vx2.m53591g(o64, "nftDao");
        this.f42540a = ej0;
        this.f42541b = o64;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00e8 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo60792a(java.util.List<net.safemoon.androidwallet.model.rpc2.solana.collections.SolanaNfts> r18, int r19, p000.ns0<? super p000.r37> r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r20
            boolean r2 = r1 instanceof net.safemoon.androidwallet.repository.dataSource.collection.CollectionDataSource$clearCacheForSolana$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            net.safemoon.androidwallet.repository.dataSource.collection.CollectionDataSource$clearCacheForSolana$1 r2 = (net.safemoon.androidwallet.repository.dataSource.collection.CollectionDataSource$clearCacheForSolana$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            net.safemoon.androidwallet.repository.dataSource.collection.CollectionDataSource$clearCacheForSolana$1 r2 = new net.safemoon.androidwallet.repository.dataSource.collection.CollectionDataSource$clearCacheForSolana$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = p000.wx2.m54101d()
            int r4 = r2.label
            r5 = 3
            r6 = 2
            r8 = 1
            if (r4 == 0) goto L_0x006a
            if (r4 == r8) goto L_0x0059
            if (r4 == r6) goto L_0x0046
            if (r4 != r5) goto L_0x003e
            java.lang.Object r4 = r2.L$1
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r8 = r2.L$0
            net.safemoon.androidwallet.repository.dataSource.collection.CollectionDataSource r8 = (net.safemoon.androidwallet.repository.dataSource.collection.CollectionDataSource) r8
            p000.hg5.m45199b(r1)
            r10 = r5
            r9 = 0
            goto L_0x0129
        L_0x003e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0046:
            java.lang.Object r4 = r2.L$2
            net.safemoon.androidwallet.model.collectible.RoomCollection r4 = (net.safemoon.androidwallet.model.collectible.RoomCollection) r4
            java.lang.Object r8 = r2.L$1
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r9 = r2.L$0
            net.safemoon.androidwallet.repository.dataSource.collection.CollectionDataSource r9 = (net.safemoon.androidwallet.repository.dataSource.collection.CollectionDataSource) r9
            p000.hg5.m45199b(r1)
            r1 = r8
        L_0x0056:
            r8 = r9
            goto L_0x010b
        L_0x0059:
            java.lang.Object r4 = r2.L$1
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r9 = r2.L$0
            net.safemoon.androidwallet.repository.dataSource.collection.CollectionDataSource r9 = (net.safemoon.androidwallet.repository.dataSource.collection.CollectionDataSource) r9
            p000.hg5.m45199b(r1)
            r16 = r4
            r4 = r1
            r1 = r16
            goto L_0x007f
        L_0x006a:
            p000.hg5.m45199b(r1)
            r2.L$0 = r0
            r1 = r18
            r2.L$1 = r1
            r2.label = r8
            r4 = r19
            java.lang.Object r4 = r0.mo60795d(r4, r2)
            if (r4 != r3) goto L_0x007e
            return r3
        L_0x007e:
            r9 = r0
        L_0x007f:
            java.util.List r4 = (java.util.List) r4
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x008a:
            boolean r11 = r4.hasNext()
            if (r11 == 0) goto L_0x00ea
            java.lang.Object r11 = r4.next()
            r12 = r11
            net.safemoon.androidwallet.model.collectible.RoomCollection r12 = (net.safemoon.androidwallet.model.collectible.RoomCollection) r12
            boolean r13 = r1 instanceof java.util.Collection
            if (r13 == 0) goto L_0x00a3
            boolean r13 = r1.isEmpty()
            if (r13 == 0) goto L_0x00a3
        L_0x00a1:
            r14 = 0
            goto L_0x00e1
        L_0x00a3:
            java.util.Iterator r13 = r1.iterator()
        L_0x00a7:
            boolean r15 = r13.hasNext()
            if (r15 == 0) goto L_0x00a1
            java.lang.Object r15 = r13.next()
            net.safemoon.androidwallet.model.rpc2.solana.collections.SolanaNfts r15 = (net.safemoon.androidwallet.model.rpc2.solana.collections.SolanaNfts) r15
            java.lang.String r15 = r15.getMint()
            java.lang.String r14 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
            if (r15 == 0) goto L_0x00c5
            java.util.Locale r5 = java.util.Locale.ROOT
            java.lang.String r5 = r15.toLowerCase(r5)
            p000.vx2.m53590f(r5, r14)
            goto L_0x00c6
        L_0x00c5:
            r5 = 0
        L_0x00c6:
            java.lang.String r15 = r12.getContractAddress()
            if (r15 == 0) goto L_0x00d6
            java.util.Locale r7 = java.util.Locale.ROOT
            java.lang.String r7 = r15.toLowerCase(r7)
            p000.vx2.m53590f(r7, r14)
            goto L_0x00d7
        L_0x00d6:
            r7 = 0
        L_0x00d7:
            boolean r5 = p000.vx2.m53586b(r5, r7)
            if (r5 == 0) goto L_0x00df
            r14 = r8
            goto L_0x00e1
        L_0x00df:
            r5 = 3
            goto L_0x00a7
        L_0x00e1:
            r5 = r14 ^ 1
            if (r5 == 0) goto L_0x00e8
            r10.add(r11)
        L_0x00e8:
            r5 = 3
            goto L_0x008a
        L_0x00ea:
            java.util.Iterator r1 = r10.iterator()
        L_0x00ee:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x012f
            java.lang.Object r4 = r1.next()
            net.safemoon.androidwallet.model.collectible.RoomCollection r4 = (net.safemoon.androidwallet.model.collectible.RoomCollection) r4
            ej0 r5 = r9.f42540a
            r2.L$0 = r9
            r2.L$1 = r1
            r2.L$2 = r4
            r2.label = r6
            java.lang.Object r5 = r5.mo51486c(r4, r2)
            if (r5 != r3) goto L_0x0056
            return r3
        L_0x010b:
            java.lang.Long r4 = r4.getId()
            if (r4 == 0) goto L_0x012b
            long r4 = r4.longValue()
            o64 r7 = r8.f42541b
            r2.L$0 = r8
            r2.L$1 = r1
            r9 = 0
            r2.L$2 = r9
            r10 = 3
            r2.label = r10
            java.lang.Object r4 = r7.mo62843g(r4, r2)
            if (r4 != r3) goto L_0x0128
            return r3
        L_0x0128:
            r4 = r1
        L_0x0129:
            r1 = r4
            goto L_0x012d
        L_0x012b:
            r9 = 0
            r10 = 3
        L_0x012d:
            r9 = r8
            goto L_0x00ee
        L_0x012f:
            r37 r1 = p000.r37.f33317a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.repository.dataSource.collection.CollectionDataSource.mo60792a(java.util.List, int, ns0):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo60793b(net.safemoon.androidwallet.model.collectible.MoralisNFTs r18, int r19, p000.ns0<? super p000.r37> r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r20
            boolean r2 = r1 instanceof net.safemoon.androidwallet.repository.dataSource.collection.CollectionDataSource$clearCacheFromMoralis$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            net.safemoon.androidwallet.repository.dataSource.collection.CollectionDataSource$clearCacheFromMoralis$1 r2 = (net.safemoon.androidwallet.repository.dataSource.collection.CollectionDataSource$clearCacheFromMoralis$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            net.safemoon.androidwallet.repository.dataSource.collection.CollectionDataSource$clearCacheFromMoralis$1 r2 = new net.safemoon.androidwallet.repository.dataSource.collection.CollectionDataSource$clearCacheFromMoralis$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = p000.wx2.m54101d()
            int r4 = r2.label
            r5 = 3
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L_0x0068
            if (r4 == r7) goto L_0x0057
            if (r4 == r6) goto L_0x0044
            if (r4 != r5) goto L_0x003c
            java.lang.Object r4 = r2.L$1
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r7 = r2.L$0
            net.safemoon.androidwallet.repository.dataSource.collection.CollectionDataSource r7 = (net.safemoon.androidwallet.repository.dataSource.collection.CollectionDataSource) r7
            p000.hg5.m45199b(r1)
            goto L_0x011d
        L_0x003c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0044:
            java.lang.Object r4 = r2.L$2
            net.safemoon.androidwallet.model.collectible.RoomCollection r4 = (net.safemoon.androidwallet.model.collectible.RoomCollection) r4
            java.lang.Object r7 = r2.L$1
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r8 = r2.L$0
            net.safemoon.androidwallet.repository.dataSource.collection.CollectionDataSource r8 = (net.safemoon.androidwallet.repository.dataSource.collection.CollectionDataSource) r8
            p000.hg5.m45199b(r1)
            r1 = r7
        L_0x0054:
            r7 = r8
            goto L_0x0100
        L_0x0057:
            java.lang.Object r4 = r2.L$1
            net.safemoon.androidwallet.model.collectible.MoralisNFTs r4 = (net.safemoon.androidwallet.model.collectible.MoralisNFTs) r4
            java.lang.Object r8 = r2.L$0
            net.safemoon.androidwallet.repository.dataSource.collection.CollectionDataSource r8 = (net.safemoon.androidwallet.repository.dataSource.collection.CollectionDataSource) r8
            p000.hg5.m45199b(r1)
            r16 = r4
            r4 = r1
            r1 = r16
            goto L_0x007d
        L_0x0068:
            p000.hg5.m45199b(r1)
            r2.L$0 = r0
            r1 = r18
            r2.L$1 = r1
            r2.label = r7
            r4 = r19
            java.lang.Object r4 = r0.mo60795d(r4, r2)
            if (r4 != r3) goto L_0x007c
            return r3
        L_0x007c:
            r8 = r0
        L_0x007d:
            java.util.List r4 = (java.util.List) r4
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x0088:
            boolean r10 = r4.hasNext()
            if (r10 == 0) goto L_0x00df
            java.lang.Object r10 = r4.next()
            r11 = r10
            net.safemoon.androidwallet.model.collectible.RoomCollection r11 = (net.safemoon.androidwallet.model.collectible.RoomCollection) r11
            java.util.ArrayList r12 = r1.getResult()
            boolean r13 = r12 instanceof java.util.Collection
            if (r13 == 0) goto L_0x00a5
            boolean r13 = r12.isEmpty()
            if (r13 == 0) goto L_0x00a5
        L_0x00a3:
            r14 = 0
            goto L_0x00d7
        L_0x00a5:
            java.util.Iterator r12 = r12.iterator()
        L_0x00a9:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x00a3
            java.lang.Object r13 = r12.next()
            net.safemoon.androidwallet.model.collectible.MoralisNft r13 = (net.safemoon.androidwallet.model.collectible.MoralisNft) r13
            java.lang.String r15 = r13.getTokenAddress()
            java.lang.String r14 = r11.getContractAddress()
            boolean r14 = p000.vx2.m53586b(r15, r14)
            if (r14 == 0) goto L_0x00d3
            java.lang.String r13 = r13.getContractType()
            java.lang.String r14 = r11.getContract_type()
            boolean r13 = p000.vx2.m53586b(r13, r14)
            if (r13 == 0) goto L_0x00d3
            r13 = r7
            goto L_0x00d4
        L_0x00d3:
            r13 = 0
        L_0x00d4:
            if (r13 == 0) goto L_0x00a9
            r14 = r7
        L_0x00d7:
            r11 = r14 ^ 1
            if (r11 == 0) goto L_0x0088
            r9.add(r10)
            goto L_0x0088
        L_0x00df:
            java.util.Iterator r1 = r9.iterator()
        L_0x00e3:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0120
            java.lang.Object r4 = r1.next()
            net.safemoon.androidwallet.model.collectible.RoomCollection r4 = (net.safemoon.androidwallet.model.collectible.RoomCollection) r4
            ej0 r7 = r8.f42540a
            r2.L$0 = r8
            r2.L$1 = r1
            r2.L$2 = r4
            r2.label = r6
            java.lang.Object r7 = r7.mo51486c(r4, r2)
            if (r7 != r3) goto L_0x0054
            return r3
        L_0x0100:
            java.lang.Long r4 = r4.getId()
            if (r4 == 0) goto L_0x011e
            long r8 = r4.longValue()
            o64 r4 = r7.f42541b
            r2.L$0 = r7
            r2.L$1 = r1
            r10 = 0
            r2.L$2 = r10
            r2.label = r5
            java.lang.Object r4 = r4.mo62843g(r8, r2)
            if (r4 != r3) goto L_0x011c
            return r3
        L_0x011c:
            r4 = r1
        L_0x011d:
            r1 = r4
        L_0x011e:
            r8 = r7
            goto L_0x00e3
        L_0x0120:
            r37 r1 = p000.r37.f33317a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.repository.dataSource.collection.CollectionDataSource.mo60793b(net.safemoon.androidwallet.model.collectible.MoralisNFTs, int, ns0):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x018d A[SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo60794c(java.util.List<net.safemoon.androidwallet.model.collectible.Collectible> r19, int r20, p000.ns0<? super p000.r37> r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r21
            boolean r2 = r1 instanceof net.safemoon.androidwallet.repository.dataSource.collection.CollectionDataSource$clearCacheFromOpenSea$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            net.safemoon.androidwallet.repository.dataSource.collection.CollectionDataSource$clearCacheFromOpenSea$1 r2 = (net.safemoon.androidwallet.repository.dataSource.collection.CollectionDataSource$clearCacheFromOpenSea$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            net.safemoon.androidwallet.repository.dataSource.collection.CollectionDataSource$clearCacheFromOpenSea$1 r2 = new net.safemoon.androidwallet.repository.dataSource.collection.CollectionDataSource$clearCacheFromOpenSea$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = p000.wx2.m54101d()
            int r4 = r2.label
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            if (r4 == 0) goto L_0x006b
            if (r4 == r7) goto L_0x005a
            if (r4 == r6) goto L_0x0047
            if (r4 != r5) goto L_0x003f
            java.lang.Object r4 = r2.L$1
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r7 = r2.L$0
            net.safemoon.androidwallet.repository.dataSource.collection.CollectionDataSource r7 = (net.safemoon.androidwallet.repository.dataSource.collection.CollectionDataSource) r7
            p000.hg5.m45199b(r1)
            r10 = r5
            r9 = r8
            goto L_0x01d2
        L_0x003f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0047:
            java.lang.Object r4 = r2.L$2
            net.safemoon.androidwallet.model.collectible.RoomCollection r4 = (net.safemoon.androidwallet.model.collectible.RoomCollection) r4
            java.lang.Object r7 = r2.L$1
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r9 = r2.L$0
            net.safemoon.androidwallet.repository.dataSource.collection.CollectionDataSource r9 = (net.safemoon.androidwallet.repository.dataSource.collection.CollectionDataSource) r9
            p000.hg5.m45199b(r1)
            r1 = r7
        L_0x0057:
            r7 = r9
            goto L_0x01b4
        L_0x005a:
            java.lang.Object r4 = r2.L$1
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r9 = r2.L$0
            net.safemoon.androidwallet.repository.dataSource.collection.CollectionDataSource r9 = (net.safemoon.androidwallet.repository.dataSource.collection.CollectionDataSource) r9
            p000.hg5.m45199b(r1)
            r17 = r4
            r4 = r1
            r1 = r17
            goto L_0x0080
        L_0x006b:
            p000.hg5.m45199b(r1)
            r2.L$0 = r0
            r1 = r19
            r2.L$1 = r1
            r2.label = r7
            r4 = r20
            java.lang.Object r4 = r0.mo60795d(r4, r2)
            if (r4 != r3) goto L_0x007f
            return r3
        L_0x007f:
            r9 = r0
        L_0x0080:
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x008b:
            boolean r11 = r4.hasNext()
            if (r11 == 0) goto L_0x00a8
            java.lang.Object r11 = r4.next()
            r12 = r11
            net.safemoon.androidwallet.model.collectible.RoomCollection r12 = (net.safemoon.androidwallet.model.collectible.RoomCollection) r12
            java.lang.String r12 = r12.getMarketPlace()
            java.lang.String r13 = "OPEN_SEA"
            boolean r12 = p000.vx2.m53586b(r12, r13)
            if (r12 == 0) goto L_0x008b
            r10.add(r11)
            goto L_0x008b
        L_0x00a8:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x00b1:
            boolean r11 = r1.hasNext()
            if (r11 == 0) goto L_0x0101
            java.lang.Object r11 = r1.next()
            net.safemoon.androidwallet.model.collectible.Collectible r11 = (net.safemoon.androidwallet.model.collectible.Collectible) r11
            net.safemoon.androidwallet.model.collectible.PrimaryAssetContract r12 = new net.safemoon.androidwallet.model.collectible.PrimaryAssetContract
            r12.<init>()
            r12.setAddress(r8)
            r12.setSchema_name(r8)
            java.lang.String r13 = r11.getName()
            r12.setName(r13)
            java.lang.String r13 = r11.getDescription()
            r12.setDescription(r13)
            java.lang.String r13 = r11.getImage_url()
            r12.setImage_url(r13)
            r12.setSymbol(r8)
            java.lang.String r13 = r11.getSlug()
            r12.setInjectSlug(r13)
            java.util.List r12 = p000.bk0.m32598e(r12)
            java.util.List r11 = r11.getPrimary_asset_contracts()
            if (r11 != 0) goto L_0x00f5
            java.util.List r11 = p000.ck0.m33062j()
        L_0x00f5:
            boolean r13 = r11.isEmpty()
            if (r13 == 0) goto L_0x00fc
            goto L_0x00fd
        L_0x00fc:
            r12 = r11
        L_0x00fd:
            p000.hk0.m45275z(r4, r12)
            goto L_0x00b1
        L_0x0101:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r10 = r10.iterator()
        L_0x010a:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0192
            java.lang.Object r11 = r10.next()
            r12 = r11
            net.safemoon.androidwallet.model.collectible.RoomCollection r12 = (net.safemoon.androidwallet.model.collectible.RoomCollection) r12
            boolean r13 = r4.isEmpty()
            if (r13 == 0) goto L_0x0120
        L_0x011d:
            r14 = 0
            goto L_0x0186
        L_0x0120:
            java.util.Iterator r13 = r4.iterator()
        L_0x0124:
            boolean r15 = r13.hasNext()
            if (r15 == 0) goto L_0x011d
            java.lang.Object r15 = r13.next()
            net.safemoon.androidwallet.model.collectible.PrimaryAssetContract r15 = (net.safemoon.androidwallet.model.collectible.PrimaryAssetContract) r15
            java.lang.String r16 = r15.getAddress()
            if (r16 != 0) goto L_0x0143
            java.lang.String r15 = r15.getInjectSlug()
            java.lang.String r14 = r12.getSlug()
            boolean r14 = p000.vx2.m53586b(r15, r14)
            goto L_0x017e
        L_0x0143:
            java.lang.String r14 = r15.getAddress()
            java.lang.String r5 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
            if (r14 == 0) goto L_0x0155
            java.util.Locale r8 = java.util.Locale.ROOT
            java.lang.String r8 = r14.toLowerCase(r8)
            p000.vx2.m53590f(r8, r5)
            goto L_0x0156
        L_0x0155:
            r8 = 0
        L_0x0156:
            java.lang.String r14 = r12.getContractAddress()
            if (r14 == 0) goto L_0x0166
            java.util.Locale r6 = java.util.Locale.ROOT
            java.lang.String r6 = r14.toLowerCase(r6)
            p000.vx2.m53590f(r6, r5)
            goto L_0x0167
        L_0x0166:
            r6 = 0
        L_0x0167:
            boolean r5 = p000.vx2.m53586b(r8, r6)
            if (r5 == 0) goto L_0x017d
            java.lang.String r5 = r15.getSchema_name()
            java.lang.String r6 = r12.getContract_type()
            boolean r5 = p000.vx2.m53586b(r5, r6)
            if (r5 == 0) goto L_0x017d
            r14 = r7
            goto L_0x017e
        L_0x017d:
            r14 = 0
        L_0x017e:
            if (r14 == 0) goto L_0x0182
            r14 = r7
            goto L_0x0186
        L_0x0182:
            r5 = 3
            r6 = 2
            r8 = 0
            goto L_0x0124
        L_0x0186:
            r5 = r14 ^ 1
            if (r5 == 0) goto L_0x018d
            r1.add(r11)
        L_0x018d:
            r5 = 3
            r6 = 2
            r8 = 0
            goto L_0x010a
        L_0x0192:
            java.util.Iterator r1 = r1.iterator()
        L_0x0196:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x01d8
            java.lang.Object r4 = r1.next()
            net.safemoon.androidwallet.model.collectible.RoomCollection r4 = (net.safemoon.androidwallet.model.collectible.RoomCollection) r4
            ej0 r5 = r9.f42540a
            r2.L$0 = r9
            r2.L$1 = r1
            r2.L$2 = r4
            r6 = 2
            r2.label = r6
            java.lang.Object r5 = r5.mo51486c(r4, r2)
            if (r5 != r3) goto L_0x0057
            return r3
        L_0x01b4:
            java.lang.Long r4 = r4.getId()
            if (r4 == 0) goto L_0x01d4
            long r4 = r4.longValue()
            o64 r8 = r7.f42541b
            r2.L$0 = r7
            r2.L$1 = r1
            r9 = 0
            r2.L$2 = r9
            r10 = 3
            r2.label = r10
            java.lang.Object r4 = r8.mo62843g(r4, r2)
            if (r4 != r3) goto L_0x01d1
            return r3
        L_0x01d1:
            r4 = r1
        L_0x01d2:
            r1 = r4
            goto L_0x01d6
        L_0x01d4:
            r9 = 0
            r10 = 3
        L_0x01d6:
            r9 = r7
            goto L_0x0196
        L_0x01d8:
            r37 r1 = p000.r37.f33317a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.repository.dataSource.collection.CollectionDataSource.mo60794c(java.util.List, int, ns0):java.lang.Object");
    }

    /* renamed from: d */
    public final Object mo60795d(int i, ns0<? super List<RoomCollection>> ns0) {
        return this.f42540a.mo51485b(i, ns0);
    }

    /* renamed from: e */
    public final LiveData<List<RoomCollectionAndNft>> mo60796e(int i) {
        return this.f42540a.mo51489f(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0136 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0137 A[PHI: r15 
      PHI: (r15v2 java.lang.Object) = (r15v8 java.lang.Object), (r15v1 java.lang.Object) binds: [B:51:0x0134, B:10:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e7 A[EDGE_INSN: B:55:0x00e7->B:40:0x00e7 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo60797f(net.safemoon.androidwallet.model.collectible.RoomCollection r14, p000.ns0<? super java.lang.Long> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof net.safemoon.androidwallet.repository.dataSource.collection.CollectionDataSource$save$1
            if (r0 == 0) goto L_0x0013
            r0 = r15
            net.safemoon.androidwallet.repository.dataSource.collection.CollectionDataSource$save$1 r0 = (net.safemoon.androidwallet.repository.dataSource.collection.CollectionDataSource$save$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            net.safemoon.androidwallet.repository.dataSource.collection.CollectionDataSource$save$1 r0 = new net.safemoon.androidwallet.repository.dataSource.collection.CollectionDataSource$save$1
            r0.<init>(r13, r15)
        L_0x0018:
            java.lang.Object r15 = r0.result
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0041
            if (r2 == r4) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            p000.hg5.m45199b(r15)
            goto L_0x0137
        L_0x002d:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x0035:
            java.lang.Object r14 = r0.L$1
            net.safemoon.androidwallet.model.collectible.RoomCollection r14 = (net.safemoon.androidwallet.model.collectible.RoomCollection) r14
            java.lang.Object r2 = r0.L$0
            net.safemoon.androidwallet.repository.dataSource.collection.CollectionDataSource r2 = (net.safemoon.androidwallet.repository.dataSource.collection.CollectionDataSource) r2
            p000.hg5.m45199b(r15)
            goto L_0x0058
        L_0x0041:
            p000.hg5.m45199b(r15)
            ej0 r15 = r13.f42540a
            int r2 = r14.getChain()
            r0.L$0 = r13
            r0.L$1 = r14
            r0.label = r4
            java.lang.Object r15 = r15.mo51485b(r2, r0)
            if (r15 != r1) goto L_0x0057
            return r1
        L_0x0057:
            r2 = r13
        L_0x0058:
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r15 = r15.iterator()
        L_0x0063:
            boolean r6 = r15.hasNext()
            r7 = 0
            r8 = 0
            if (r6 == 0) goto L_0x00e7
            java.lang.Object r6 = r15.next()
            r9 = r6
            net.safemoon.androidwallet.model.collectible.RoomCollection r9 = (net.safemoon.androidwallet.model.collectible.RoomCollection) r9
            int r10 = r14.getChain()
            net.safemoon.androidwallet.common.TokenType r11 = net.safemoon.androidwallet.common.TokenType.SOLANA
            int r11 = r11.getChainId()
            java.lang.String r12 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
            if (r10 != r11) goto L_0x00a5
            java.lang.String r7 = r9.getContractAddress()
            if (r7 == 0) goto L_0x0090
            java.util.Locale r9 = java.util.Locale.ROOT
            java.lang.String r7 = r7.toLowerCase(r9)
            p000.vx2.m53590f(r7, r12)
            goto L_0x0091
        L_0x0090:
            r7 = r8
        L_0x0091:
            java.lang.String r9 = r14.getContractAddress()
            if (r9 == 0) goto L_0x00a0
            java.util.Locale r8 = java.util.Locale.ROOT
            java.lang.String r8 = r9.toLowerCase(r8)
            p000.vx2.m53590f(r8, r12)
        L_0x00a0:
            boolean r7 = p000.vx2.m53586b(r7, r8)
            goto L_0x00e0
        L_0x00a5:
            java.lang.String r8 = r9.getSlug()
            java.lang.String r10 = r14.getSlug()
            boolean r8 = p000.vx2.m53586b(r8, r10)
            if (r8 == 0) goto L_0x00e0
            java.lang.String r8 = r9.getContractAddress()
            java.util.Locale r10 = java.util.Locale.ROOT
            java.lang.String r8 = r8.toLowerCase(r10)
            p000.vx2.m53590f(r8, r12)
            java.lang.String r11 = r14.getContractAddress()
            java.lang.String r10 = r11.toLowerCase(r10)
            p000.vx2.m53590f(r10, r12)
            boolean r8 = p000.vx2.m53586b(r8, r10)
            if (r8 == 0) goto L_0x00e0
            java.lang.String r8 = r9.getContract_type()
            java.lang.String r9 = r14.getContract_type()
            boolean r8 = p000.vx2.m53586b(r8, r9)
            if (r8 == 0) goto L_0x00e0
            r7 = r4
        L_0x00e0:
            if (r7 == 0) goto L_0x0063
            r5.add(r6)
            goto L_0x0063
        L_0x00e7:
            boolean r15 = r5.isEmpty()
            if (r15 != 0) goto L_0x0115
            java.lang.Object r15 = kotlin.collections.CollectionsKt___CollectionsKt.m47329Z(r5)
            net.safemoon.androidwallet.model.collectible.RoomCollection r15 = (net.safemoon.androidwallet.model.collectible.RoomCollection) r15
            java.lang.Long r15 = r15.getId()
            r14.setId(r15)
            java.lang.Object r15 = kotlin.collections.CollectionsKt___CollectionsKt.m47329Z(r5)
            net.safemoon.androidwallet.model.collectible.RoomCollection r15 = (net.safemoon.androidwallet.model.collectible.RoomCollection) r15
            int r15 = r15.getOrder()
            r14.setOrder(r15)
            java.lang.Object r15 = kotlin.collections.CollectionsKt___CollectionsKt.m47329Z(r5)
            net.safemoon.androidwallet.model.collectible.RoomCollection r15 = (net.safemoon.androidwallet.model.collectible.RoomCollection) r15
            int r15 = r15.getTypeDeleteNft()
            r14.setTypeDeleteNft(r15)
            goto L_0x0128
        L_0x0115:
            java.lang.String r15 = r14.getImageUrl()
            if (r15 == 0) goto L_0x0123
            int r15 = r15.length()
            if (r15 != 0) goto L_0x0122
            goto L_0x0123
        L_0x0122:
            r4 = r7
        L_0x0123:
            if (r4 == 0) goto L_0x0128
            r14.getImageUrl()
        L_0x0128:
            ej0 r15 = r2.f42540a
            r0.L$0 = r8
            r0.L$1 = r8
            r0.label = r3
            java.lang.Object r15 = r15.mo51488e(r14, r0)
            if (r15 != r1) goto L_0x0137
            return r1
        L_0x0137:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.repository.dataSource.collection.CollectionDataSource.mo60797f(net.safemoon.androidwallet.model.collectible.RoomCollection, ns0):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo60798g(java.util.List<kotlin.Pair<java.lang.Long, java.lang.Integer>> r8, p000.ns0<? super p000.r37> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof net.safemoon.androidwallet.repository.dataSource.collection.CollectionDataSource$updateDeleteCollection$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            net.safemoon.androidwallet.repository.dataSource.collection.CollectionDataSource$updateDeleteCollection$1 r0 = (net.safemoon.androidwallet.repository.dataSource.collection.CollectionDataSource$updateDeleteCollection$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            net.safemoon.androidwallet.repository.dataSource.collection.CollectionDataSource$updateDeleteCollection$1 r0 = new net.safemoon.androidwallet.repository.dataSource.collection.CollectionDataSource$updateDeleteCollection$1
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
            net.safemoon.androidwallet.repository.dataSource.collection.CollectionDataSource r2 = (net.safemoon.androidwallet.repository.dataSource.collection.CollectionDataSource) r2
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
            ej0 r6 = r2.f42540a
            java.lang.Object r9 = r9.getSecond()
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            r0.L$0 = r2
            r0.L$1 = r8
            r0.label = r3
            java.lang.Object r9 = r6.mo51487d(r4, r9, r0)
            if (r9 != r1) goto L_0x0041
            return r1
        L_0x0072:
            r37 r8 = p000.r37.f33317a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.repository.dataSource.collection.CollectionDataSource.mo60798g(java.util.List, ns0):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo60799h(java.util.List<kotlin.Pair<java.lang.Long, java.lang.Integer>> r8, p000.ns0<? super p000.r37> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof net.safemoon.androidwallet.repository.dataSource.collection.CollectionDataSource$updateOrders$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            net.safemoon.androidwallet.repository.dataSource.collection.CollectionDataSource$updateOrders$1 r0 = (net.safemoon.androidwallet.repository.dataSource.collection.CollectionDataSource$updateOrders$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            net.safemoon.androidwallet.repository.dataSource.collection.CollectionDataSource$updateOrders$1 r0 = new net.safemoon.androidwallet.repository.dataSource.collection.CollectionDataSource$updateOrders$1
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
            net.safemoon.androidwallet.repository.dataSource.collection.CollectionDataSource r2 = (net.safemoon.androidwallet.repository.dataSource.collection.CollectionDataSource) r2
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
            ej0 r6 = r2.f42540a
            java.lang.Object r9 = r9.getSecond()
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            r0.L$0 = r2
            r0.L$1 = r8
            r0.label = r3
            java.lang.Object r9 = r6.mo51484a(r4, r9, r0)
            if (r9 != r1) goto L_0x0041
            return r1
        L_0x0072:
            r37 r8 = p000.r37.f33317a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.repository.dataSource.collection.CollectionDataSource.mo60799h(java.util.List, ns0):java.lang.Object");
    }
}
