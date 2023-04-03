package p000;

/* renamed from: hx7 */
public abstract class hx7 extends sv7 implements jx7 {
    public hx7() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionService");
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r5v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: E0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo29799E0(int r4, android.os.Parcel r5) throws android.os.RemoteException {
        /*
            r3 = this;
            r0 = 2
            r1 = 0
            java.lang.String r2 = "com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback"
            if (r4 == r0) goto L_0x002f
            r0 = 3
            if (r4 == r0) goto L_0x000b
            r4 = 0
            return r4
        L_0x000b:
            android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
            android.os.Parcelable r4 = p000.xv7.m54566a(r5, r4)
            android.os.Bundle r4 = (android.os.Bundle) r4
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 != 0) goto L_0x001a
            goto L_0x002b
        L_0x001a:
            android.os.IInterface r5 = r4.queryLocalInterface(r2)
            boolean r0 = r5 instanceof p000.nx7
            if (r0 == 0) goto L_0x0026
            r1 = r5
            nx7 r1 = (p000.nx7) r1
            goto L_0x002b
        L_0x0026:
            lx7 r1 = new lx7
            r1.<init>(r4)
        L_0x002b:
            r3.mo41647a0(r1)
            goto L_0x0052
        L_0x002f:
            android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
            android.os.Parcelable r4 = p000.xv7.m54566a(r5, r4)
            android.os.Bundle r4 = (android.os.Bundle) r4
            android.os.IBinder r5 = r5.readStrongBinder()
            if (r5 != 0) goto L_0x003e
            goto L_0x004f
        L_0x003e:
            android.os.IInterface r0 = r5.queryLocalInterface(r2)
            boolean r1 = r0 instanceof p000.nx7
            if (r1 == 0) goto L_0x004a
            r1 = r0
            nx7 r1 = (p000.nx7) r1
            goto L_0x004f
        L_0x004a:
            lx7 r1 = new lx7
            r1.<init>(r5)
        L_0x004f:
            r3.mo41649r0(r4, r1)
        L_0x0052:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.hx7.mo29799E0(int, android.os.Parcel):boolean");
    }
}
