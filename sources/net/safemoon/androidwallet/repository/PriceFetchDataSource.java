package net.safemoon.androidwallet.repository;

import android.app.Application;
import kotlin.C6169a;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0015¢\u0006\u0004\b$\u0010%J3\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\bJ\u001d\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0013\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u000fH@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0019\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R#\u0010\u001f\u001a\n \u001b*\u0004\u0018\u00010\u001a0\u001a8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR#\u0010#\u001a\n \u001b*\u0004\u0018\u00010 0 8BX\u0002¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b!\u0010\"\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, mo44877d2 = {"Lnet/safemoon/androidwallet/repository/PriceFetchDataSource;", "", "", "", "cmcIds", "", "Lnet/safemoon/androidwallet/model/Coin;", "e", "([Ljava/lang/String;Lns0;)Ljava/lang/Object;", "symbols", "f", "tokenAddress", "Lnet/safemoon/androidwallet/model/tokensInfo/CurrencyTokenInfo;", "b", "(Ljava/lang/String;Lns0;)Ljava/lang/Object;", "", "chainId", "symbol", "cmcId", "a", "(ILjava/lang/String;Ljava/lang/Integer;Lns0;)Ljava/lang/Object;", "Landroid/app/Application;", "Landroid/app/Application;", "getApplication", "()Landroid/app/Application;", "application", "Lho3;", "kotlin.jvm.PlatformType", "Lef3;", "d", "()Lho3;", "marketInterface", "Lp70;", "c", "()Lp70;", "cmcInterface", "<init>", "(Landroid/app/Application;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: PriceFetchDataSource.kt */
public final class PriceFetchDataSource {

    /* renamed from: a */
    public final Application f42519a;

    /* renamed from: b */
    public final ef3 f42520b = C6169a.m47232a(PriceFetchDataSource$marketInterface$2.INSTANCE);

    /* renamed from: c */
    public final ef3 f42521c = C6169a.m47232a(PriceFetchDataSource$cmcInterface$2.INSTANCE);

    public PriceFetchDataSource(Application application) {
        vx2.m53591g(application, "application");
        this.f42519a = application;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo60734a(int r8, java.lang.String r9, java.lang.Integer r10, p000.ns0<? super net.safemoon.androidwallet.model.Coin> r11) {
        /*
            r7 = this;
            boolean r8 = r11 instanceof net.safemoon.androidwallet.repository.PriceFetchDataSource$fetchPrice$1
            if (r8 == 0) goto L_0x0013
            r8 = r11
            net.safemoon.androidwallet.repository.PriceFetchDataSource$fetchPrice$1 r8 = (net.safemoon.androidwallet.repository.PriceFetchDataSource$fetchPrice$1) r8
            int r0 = r8.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L_0x0013
            int r0 = r0 - r1
            r8.label = r0
            goto L_0x0018
        L_0x0013:
            net.safemoon.androidwallet.repository.PriceFetchDataSource$fetchPrice$1 r8 = new net.safemoon.androidwallet.repository.PriceFetchDataSource$fetchPrice$1
            r8.<init>(r7, r11)
        L_0x0018:
            java.lang.Object r11 = r8.result
            java.lang.Object r0 = p000.wx2.m54101d()
            int r1 = r8.label
            r2 = 0
            r3 = 2
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L_0x0048
            if (r1 == r5) goto L_0x003a
            if (r1 != r3) goto L_0x0032
            java.lang.Object r8 = r8.L$0
            java.lang.String r8 = (java.lang.String) r8
            p000.hg5.m45199b(r11)
            goto L_0x0090
        L_0x0032:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003a:
            int r9 = r8.I$0
            java.lang.Object r10 = r8.L$1
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r1 = r8.L$0
            net.safemoon.androidwallet.repository.PriceFetchDataSource r1 = (net.safemoon.androidwallet.repository.PriceFetchDataSource) r1
            p000.hg5.m45199b(r11)
            goto L_0x006c
        L_0x0048:
            p000.hg5.m45199b(r11)
            if (r10 == 0) goto L_0x0079
            int r10 = r10.intValue()
            java.lang.String[] r11 = new java.lang.String[r5]
            java.lang.String r1 = java.lang.String.valueOf(r10)
            r11[r2] = r1
            r8.L$0 = r7
            r8.L$1 = r9
            r8.I$0 = r10
            r8.label = r5
            java.lang.Object r11 = r7.mo60738e(r11, r8)
            if (r11 != r0) goto L_0x0068
            return r0
        L_0x0068:
            r1 = r7
            r6 = r10
            r10 = r9
            r9 = r6
        L_0x006c:
            java.util.Map r11 = (java.util.Map) r11
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.Object r9 = r11.getOrDefault(r9, r4)
            net.safemoon.androidwallet.model.Coin r9 = (net.safemoon.androidwallet.model.Coin) r9
            goto L_0x007c
        L_0x0079:
            r1 = r7
            r10 = r9
            r9 = r4
        L_0x007c:
            if (r9 != 0) goto L_0x0099
            java.lang.String[] r9 = new java.lang.String[r5]
            r9[r2] = r10
            r8.L$0 = r10
            r8.L$1 = r4
            r8.label = r3
            java.lang.Object r11 = r1.mo60739f(r9, r8)
            if (r11 != r0) goto L_0x008f
            return r0
        L_0x008f:
            r8 = r10
        L_0x0090:
            java.util.Map r11 = (java.util.Map) r11
            java.lang.Object r8 = r11.getOrDefault(r8, r4)
            r9 = r8
            net.safemoon.androidwallet.model.Coin r9 = (net.safemoon.androidwallet.model.Coin) r9
        L_0x0099:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.repository.PriceFetchDataSource.mo60734a(int, java.lang.String, java.lang.Integer, ns0):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005f A[Catch:{ Exception -> 0x0066 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo60735b(java.lang.String r6, p000.ns0<? super net.safemoon.androidwallet.model.tokensInfo.CurrencyTokenInfo> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof net.safemoon.androidwallet.repository.PriceFetchDataSource$fetchPriceFromDexScreener$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            net.safemoon.androidwallet.repository.PriceFetchDataSource$fetchPriceFromDexScreener$1 r0 = (net.safemoon.androidwallet.repository.PriceFetchDataSource$fetchPriceFromDexScreener$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            net.safemoon.androidwallet.repository.PriceFetchDataSource$fetchPriceFromDexScreener$1 r0 = new net.safemoon.androidwallet.repository.PriceFetchDataSource$fetchPriceFromDexScreener$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 != r4) goto L_0x002a
            p000.hg5.m45199b(r7)     // Catch:{ Exception -> 0x0066 }
            goto L_0x004f
        L_0x002a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0032:
            p000.hg5.m45199b(r7)
            ho3 r7 = p000.C9384u3.m72571l()     // Catch:{ Exception -> 0x0066 }
            net.safemoon.androidwallet.model.tokensInfo.Request r2 = new net.safemoon.androidwallet.model.tokensInfo.Request     // Catch:{ Exception -> 0x0066 }
            java.util.List r6 = p000.bk0.m32598e(r6)     // Catch:{ Exception -> 0x0066 }
            r2.<init>(r6)     // Catch:{ Exception -> 0x0066 }
            k90 r6 = r7.mo52276e(r2)     // Catch:{ Exception -> 0x0066 }
            r0.label = r4     // Catch:{ Exception -> 0x0066 }
            java.lang.Object r7 = retrofit2.KotlinExtensions.m71521c(r6, r0)     // Catch:{ Exception -> 0x0066 }
            if (r7 != r1) goto L_0x004f
            return r1
        L_0x004f:
            bg5 r7 = (p000.bg5) r7     // Catch:{ Exception -> 0x0066 }
            java.lang.Object r6 = r7.mo50578a()     // Catch:{ Exception -> 0x0066 }
            net.safemoon.androidwallet.model.tokensInfo.CurrencyTokensInfoResult r6 = (net.safemoon.androidwallet.model.tokensInfo.CurrencyTokensInfoResult) r6     // Catch:{ Exception -> 0x0066 }
            if (r6 == 0) goto L_0x0066
            java.util.List r6 = r6.getData()     // Catch:{ Exception -> 0x0066 }
            if (r6 == 0) goto L_0x0066
            java.lang.Object r6 = kotlin.collections.CollectionsKt___CollectionsKt.m47331b0(r6)     // Catch:{ Exception -> 0x0066 }
            net.safemoon.androidwallet.model.tokensInfo.CurrencyTokenInfo r6 = (net.safemoon.androidwallet.model.tokensInfo.CurrencyTokenInfo) r6     // Catch:{ Exception -> 0x0066 }
            r3 = r6
        L_0x0066:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.repository.PriceFetchDataSource.mo60735b(java.lang.String, ns0):java.lang.Object");
    }

    /* renamed from: c */
    public final p70 mo60736c() {
        return (p70) this.f42521c.getValue();
    }

    /* renamed from: d */
    public final ho3 mo60737d() {
        return (ho3) this.f42520b.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b2 A[LOOP:0: B:36:0x00ac->B:38:0x00b2, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e2 A[LOOP:1: B:40:0x00dc->B:42:0x00e2, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f9 A[SYNTHETIC, Splitter:B:45:0x00f9] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo60738e(java.lang.String[] r21, p000.ns0<? super java.util.Map<java.lang.String, ? extends net.safemoon.androidwallet.model.Coin>> r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r22
            boolean r2 = r1 instanceof net.safemoon.androidwallet.repository.PriceFetchDataSource$getPriceByCMCID$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            net.safemoon.androidwallet.repository.PriceFetchDataSource$getPriceByCMCID$1 r2 = (net.safemoon.androidwallet.repository.PriceFetchDataSource$getPriceByCMCID$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            net.safemoon.androidwallet.repository.PriceFetchDataSource$getPriceByCMCID$1 r2 = new net.safemoon.androidwallet.repository.PriceFetchDataSource$getPriceByCMCID$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = p000.wx2.m54101d()
            int r4 = r2.label
            java.lang.String r5 = "it"
            java.lang.String r6 = "{}"
            r7 = 2
            r8 = 1
            if (r4 == 0) goto L_0x0051
            if (r4 == r8) goto L_0x0045
            if (r4 != r7) goto L_0x003d
            java.lang.Object r3 = r2.L$1
            org.json.JSONObject r3 = (org.json.JSONObject) r3
            java.lang.Object r2 = r2.L$0
            java.lang.String[] r2 = (java.lang.String[]) r2
            p000.hg5.m45199b(r1)     // Catch:{ Exception -> 0x013b }
            goto L_0x0123
        L_0x003d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0045:
            java.lang.Object r4 = r2.L$1
            java.lang.String[] r4 = (java.lang.String[]) r4
            java.lang.Object r9 = r2.L$0
            net.safemoon.androidwallet.repository.PriceFetchDataSource r9 = (net.safemoon.androidwallet.repository.PriceFetchDataSource) r9
            p000.hg5.m45199b(r1)     // Catch:{ Exception -> 0x0093 }
            goto L_0x0080
        L_0x0051:
            p000.hg5.m45199b(r1)
            java.util.List r10 = kotlin.collections.ArraysKt___ArraysKt.m47251E(r21)
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 62
            r18 = 0
            java.lang.String r11 = ","
            java.lang.String r1 = kotlin.collections.CollectionsKt___CollectionsKt.m47338i0(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            ho3 r4 = r20.mo60737d()     // Catch:{ Exception -> 0x0090 }
            k90 r1 = r4.mo52273b(r1)     // Catch:{ Exception -> 0x0090 }
            r2.L$0 = r0     // Catch:{ Exception -> 0x0090 }
            r4 = r21
            r2.L$1 = r4     // Catch:{ Exception -> 0x0092 }
            r2.label = r8     // Catch:{ Exception -> 0x0092 }
            java.lang.Object r1 = retrofit2.KotlinExtensions.m71521c(r1, r2)     // Catch:{ Exception -> 0x0092 }
            if (r1 != r3) goto L_0x007f
            return r3
        L_0x007f:
            r9 = r0
        L_0x0080:
            bg5 r1 = (p000.bg5) r1     // Catch:{ Exception -> 0x0093 }
            java.lang.Object r1 = r1.mo50578a()     // Catch:{ Exception -> 0x0093 }
            p000.vx2.m53588d(r1)     // Catch:{ Exception -> 0x0093 }
            com.google.gson.JsonObject r1 = (com.google.gson.JsonObject) r1     // Catch:{ Exception -> 0x0093 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0093 }
            goto L_0x0094
        L_0x0090:
            r4 = r21
        L_0x0092:
            r9 = r0
        L_0x0093:
            r1 = r6
        L_0x0094:
            java.lang.String r10 = "try {\n            market…           \"{}\"\n        }"
            p000.vx2.m53590f(r1, r10)
            org.json.JSONObject r10 = new org.json.JSONObject
            r10.<init>()
            org.json.JSONObject r11 = new org.json.JSONObject
            r11.<init>(r1)
            java.util.Iterator r1 = r11.keys()
            java.lang.String r12 = "marketToken.keys()"
            p000.vx2.m53590f(r1, r12)
        L_0x00ac:
            boolean r12 = r1.hasNext()
            if (r12 == 0) goto L_0x00c6
            java.lang.Object r12 = r1.next()
            java.lang.String r12 = (java.lang.String) r12
            org.json.JSONObject r12 = r11.getJSONObject(r12)
            java.lang.String r13 = "id"
            java.lang.String r13 = r12.getString(r13)
            r10.put(r13, r12)
            goto L_0x00ac
        L_0x00c6:
            java.util.List r1 = kotlin.collections.ArraysKt___ArraysKt.m47251E(r4)
            java.util.List r11 = kotlin.collections.CollectionsKt___CollectionsKt.m47313M0(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r12 = r10.keys()
            java.lang.String r13 = "allTokens.keys()"
            p000.vx2.m53590f(r12, r13)
        L_0x00dc:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x00ef
            java.lang.Object r13 = r12.next()
            java.lang.String r13 = (java.lang.String) r13
            p000.vx2.m53590f(r13, r5)
            r1.add(r13)
            goto L_0x00dc
        L_0x00ef:
            r11.removeAll(r1)
            boolean r1 = r11.isEmpty()
            r1 = r1 ^ r8
            if (r1 == 0) goto L_0x0164
            p70 r1 = r9.mo60736c()     // Catch:{ Exception -> 0x0139 }
            java.lang.String r12 = ","
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 62
            r19 = 0
            java.lang.String r8 = kotlin.collections.CollectionsKt___CollectionsKt.m47338i0(r11, r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x0139 }
            java.lang.String r9 = "USD"
            k90 r1 = r1.mo65249a(r8, r9)     // Catch:{ Exception -> 0x0139 }
            r2.L$0 = r4     // Catch:{ Exception -> 0x0139 }
            r2.L$1 = r10     // Catch:{ Exception -> 0x0139 }
            r2.label = r7     // Catch:{ Exception -> 0x0139 }
            java.lang.Object r1 = retrofit2.KotlinExtensions.m71521c(r1, r2)     // Catch:{ Exception -> 0x0139 }
            if (r1 != r3) goto L_0x0121
            return r3
        L_0x0121:
            r2 = r4
            r3 = r10
        L_0x0123:
            bg5 r1 = (p000.bg5) r1     // Catch:{ Exception -> 0x013b }
            java.lang.Object r1 = r1.mo50578a()     // Catch:{ Exception -> 0x013b }
            p000.vx2.m53588d(r1)     // Catch:{ Exception -> 0x013b }
            com.google.gson.JsonObject r1 = (com.google.gson.JsonObject) r1     // Catch:{ Exception -> 0x013b }
            java.lang.String r4 = "data"
            com.google.gson.JsonObject r1 = r1.getAsJsonObject(r4)     // Catch:{ Exception -> 0x013b }
            java.lang.String r6 = r1.toString()     // Catch:{ Exception -> 0x013b }
            goto L_0x013b
        L_0x0139:
            r2 = r4
            r3 = r10
        L_0x013b:
            r4 = r2
            r10 = r3
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>(r6)
            java.util.Iterator r2 = r1.keys()
            java.lang.String r3 = "jsonStringOfCMC.keys()"
            p000.vx2.m53590f(r2, r3)
        L_0x014b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0164
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L_0x014b
            p000.vx2.m53590f(r3, r5)
            org.json.JSONObject r6 = r1.getJSONObject(r3)
            r10.put(r3, r6)
            goto L_0x014b
        L_0x0164:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.List r2 = kotlin.collections.ArraysKt___ArraysKt.m47251E(r4)
            java.util.Iterator r2 = r2.iterator()
        L_0x0171:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x019b
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r4 = r10.has(r3)
            if (r4 == 0) goto L_0x0171
            com.google.gson.Gson r4 = new com.google.gson.Gson
            r4.<init>()
            java.lang.String r5 = r10.getString(r3)
            java.lang.Class<net.safemoon.androidwallet.model.Coin> r6 = net.safemoon.androidwallet.model.Coin.class
            java.lang.Object r4 = r4.fromJson((java.lang.String) r5, r6)
            java.lang.String r5 = "Gson().fromJson(allToken…ng(it), Coin::class.java)"
            p000.vx2.m53590f(r4, r5)
            r1.put(r3, r4)
            goto L_0x0171
        L_0x019b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.repository.PriceFetchDataSource.mo60738e(java.lang.String[], ns0):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ba A[LOOP:0: B:36:0x00b4->B:38:0x00ba, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d1 A[SYNTHETIC, Splitter:B:41:0x00d1] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo60739f(java.lang.String[] r21, p000.ns0<? super java.util.Map<java.lang.String, ? extends net.safemoon.androidwallet.model.Coin>> r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r22
            boolean r2 = r1 instanceof net.safemoon.androidwallet.repository.PriceFetchDataSource$getPriceBySymbol$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            net.safemoon.androidwallet.repository.PriceFetchDataSource$getPriceBySymbol$1 r2 = (net.safemoon.androidwallet.repository.PriceFetchDataSource$getPriceBySymbol$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            net.safemoon.androidwallet.repository.PriceFetchDataSource$getPriceBySymbol$1 r2 = new net.safemoon.androidwallet.repository.PriceFetchDataSource$getPriceBySymbol$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = p000.wx2.m54101d()
            int r4 = r2.label
            java.lang.String r5 = "it"
            java.lang.String r6 = "{}"
            r7 = 2
            r8 = 1
            if (r4 == 0) goto L_0x0051
            if (r4 == r8) goto L_0x0045
            if (r4 != r7) goto L_0x003d
            java.lang.Object r3 = r2.L$1
            org.json.JSONObject r3 = (org.json.JSONObject) r3
            java.lang.Object r2 = r2.L$0
            java.lang.String[] r2 = (java.lang.String[]) r2
            p000.hg5.m45199b(r1)     // Catch:{ Exception -> 0x0113 }
            goto L_0x00fb
        L_0x003d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0045:
            java.lang.Object r4 = r2.L$1
            java.lang.String[] r4 = (java.lang.String[]) r4
            java.lang.Object r9 = r2.L$0
            net.safemoon.androidwallet.repository.PriceFetchDataSource r9 = (net.safemoon.androidwallet.repository.PriceFetchDataSource) r9
            p000.hg5.m45199b(r1)     // Catch:{ Exception -> 0x0093 }
            goto L_0x0080
        L_0x0051:
            p000.hg5.m45199b(r1)
            java.util.List r10 = kotlin.collections.ArraysKt___ArraysKt.m47251E(r21)
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 62
            r18 = 0
            java.lang.String r11 = ","
            java.lang.String r1 = kotlin.collections.CollectionsKt___CollectionsKt.m47338i0(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            ho3 r4 = r20.mo60737d()     // Catch:{ Exception -> 0x0090 }
            k90 r1 = r4.mo52274c(r1)     // Catch:{ Exception -> 0x0090 }
            r2.L$0 = r0     // Catch:{ Exception -> 0x0090 }
            r4 = r21
            r2.L$1 = r4     // Catch:{ Exception -> 0x0092 }
            r2.label = r8     // Catch:{ Exception -> 0x0092 }
            java.lang.Object r1 = retrofit2.KotlinExtensions.m71521c(r1, r2)     // Catch:{ Exception -> 0x0092 }
            if (r1 != r3) goto L_0x007f
            return r3
        L_0x007f:
            r9 = r0
        L_0x0080:
            bg5 r1 = (p000.bg5) r1     // Catch:{ Exception -> 0x0093 }
            java.lang.Object r1 = r1.mo50578a()     // Catch:{ Exception -> 0x0093 }
            p000.vx2.m53588d(r1)     // Catch:{ Exception -> 0x0093 }
            com.google.gson.JsonObject r1 = (com.google.gson.JsonObject) r1     // Catch:{ Exception -> 0x0093 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0093 }
            goto L_0x0094
        L_0x0090:
            r4 = r21
        L_0x0092:
            r9 = r0
        L_0x0093:
            r1 = r6
        L_0x0094:
            java.lang.String r10 = "try {\n            market…           \"{}\"\n        }"
            p000.vx2.m53590f(r1, r10)
            org.json.JSONObject r10 = new org.json.JSONObject
            r10.<init>(r1)
            java.util.List r1 = kotlin.collections.ArraysKt___ArraysKt.m47251E(r4)
            java.util.List r11 = kotlin.collections.CollectionsKt___CollectionsKt.m47313M0(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r12 = r10.keys()
            java.lang.String r13 = "allTokens.keys()"
            p000.vx2.m53590f(r12, r13)
        L_0x00b4:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x00c7
            java.lang.Object r13 = r12.next()
            java.lang.String r13 = (java.lang.String) r13
            p000.vx2.m53590f(r13, r5)
            r1.add(r13)
            goto L_0x00b4
        L_0x00c7:
            r11.removeAll(r1)
            boolean r1 = r11.isEmpty()
            r1 = r1 ^ r8
            if (r1 == 0) goto L_0x013c
            p70 r1 = r9.mo60736c()     // Catch:{ Exception -> 0x0111 }
            java.lang.String r12 = ","
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 62
            r19 = 0
            java.lang.String r8 = kotlin.collections.CollectionsKt___CollectionsKt.m47338i0(r11, r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x0111 }
            java.lang.String r9 = "USD"
            k90 r1 = r1.mo65250b(r8, r9)     // Catch:{ Exception -> 0x0111 }
            r2.L$0 = r4     // Catch:{ Exception -> 0x0111 }
            r2.L$1 = r10     // Catch:{ Exception -> 0x0111 }
            r2.label = r7     // Catch:{ Exception -> 0x0111 }
            java.lang.Object r1 = retrofit2.KotlinExtensions.m71521c(r1, r2)     // Catch:{ Exception -> 0x0111 }
            if (r1 != r3) goto L_0x00f9
            return r3
        L_0x00f9:
            r2 = r4
            r3 = r10
        L_0x00fb:
            bg5 r1 = (p000.bg5) r1     // Catch:{ Exception -> 0x0113 }
            java.lang.Object r1 = r1.mo50578a()     // Catch:{ Exception -> 0x0113 }
            p000.vx2.m53588d(r1)     // Catch:{ Exception -> 0x0113 }
            com.google.gson.JsonObject r1 = (com.google.gson.JsonObject) r1     // Catch:{ Exception -> 0x0113 }
            java.lang.String r4 = "data"
            com.google.gson.JsonObject r1 = r1.getAsJsonObject(r4)     // Catch:{ Exception -> 0x0113 }
            java.lang.String r6 = r1.toString()     // Catch:{ Exception -> 0x0113 }
            goto L_0x0113
        L_0x0111:
            r2 = r4
            r3 = r10
        L_0x0113:
            r4 = r2
            r10 = r3
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>(r6)
            java.util.Iterator r2 = r1.keys()
            java.lang.String r3 = "jsonStringOfCMC.keys()"
            p000.vx2.m53590f(r2, r3)
        L_0x0123:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x013c
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L_0x0123
            p000.vx2.m53590f(r3, r5)
            org.json.JSONObject r6 = r1.getJSONObject(r3)
            r10.put(r3, r6)
            goto L_0x0123
        L_0x013c:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.List r2 = kotlin.collections.ArraysKt___ArraysKt.m47251E(r4)
            java.util.Iterator r2 = r2.iterator()
        L_0x0149:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0173
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r4 = r10.has(r3)
            if (r4 == 0) goto L_0x0149
            com.google.gson.Gson r4 = new com.google.gson.Gson
            r4.<init>()
            java.lang.String r5 = r10.getString(r3)
            java.lang.Class<net.safemoon.androidwallet.model.Coin> r6 = net.safemoon.androidwallet.model.Coin.class
            java.lang.Object r4 = r4.fromJson((java.lang.String) r5, r6)
            java.lang.String r5 = "Gson().fromJson(allToken…ng(it), Coin::class.java)"
            p000.vx2.m53590f(r4, r5)
            r1.put(r3, r4)
            goto L_0x0149
        L_0x0173:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.repository.PriceFetchDataSource.mo60739f(java.lang.String[], ns0):java.lang.Object");
    }
}
