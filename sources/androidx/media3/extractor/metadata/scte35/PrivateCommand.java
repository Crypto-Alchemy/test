package androidx.media3.extractor.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;

public final class PrivateCommand extends SpliceCommand {
    public static final Parcelable.Creator<PrivateCommand> CREATOR = new C1058a();

    /* renamed from: a */
    public final long f5640a;

    /* renamed from: d */
    public final long f5641d;

    /* renamed from: e */
    public final byte[] f5642e;

    /* renamed from: androidx.media3.extractor.metadata.scte35.PrivateCommand$a */
    public class C1058a implements Parcelable.Creator<PrivateCommand> {
        /* renamed from: a */
        public PrivateCommand createFromParcel(Parcel parcel) {
            return new PrivateCommand(parcel, (C1058a) null);
        }

        /* renamed from: b */
        public PrivateCommand[] newArray(int i) {
            return new PrivateCommand[i];
        }
    }

    public /* synthetic */ PrivateCommand(Parcel parcel, C1058a aVar) {
        this(parcel);
    }

    /* renamed from: a */
    public static PrivateCommand m7697a(gm4 gm4, int i, long j) {
        long F = gm4.mo20664F();
        int i2 = i - 4;
        byte[] bArr = new byte[i2];
        gm4.mo20685j(bArr, 0, i2);
        return new PrivateCommand(F, bArr, j);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f5640a);
        parcel.writeLong(this.f5641d);
        parcel.writeByteArray(this.f5642e);
    }

    public PrivateCommand(long j, byte[] bArr, long j2) {
        this.f5640a = j2;
        this.f5641d = j;
        this.f5642e = bArr;
    }

    public PrivateCommand(Parcel parcel) {
        this.f5640a = parcel.readLong();
        this.f5641d = parcel.readLong();
        this.f5642e = (byte[]) w67.m29360j(parcel.createByteArray());
    }
}
