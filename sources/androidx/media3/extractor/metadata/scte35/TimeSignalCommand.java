package androidx.media3.extractor.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;

public final class TimeSignalCommand extends SpliceCommand {
    public static final Parcelable.Creator<TimeSignalCommand> CREATOR = new C1065a();

    /* renamed from: a */
    public final long f5673a;

    /* renamed from: d */
    public final long f5674d;

    /* renamed from: androidx.media3.extractor.metadata.scte35.TimeSignalCommand$a */
    public class C1065a implements Parcelable.Creator<TimeSignalCommand> {
        /* renamed from: a */
        public TimeSignalCommand createFromParcel(Parcel parcel) {
            return new TimeSignalCommand(parcel.readLong(), parcel.readLong(), (C1065a) null);
        }

        /* renamed from: b */
        public TimeSignalCommand[] newArray(int i) {
            return new TimeSignalCommand[i];
        }
    }

    public /* synthetic */ TimeSignalCommand(long j, long j2, C1065a aVar) {
        this(j, j2);
    }

    /* renamed from: a */
    public static TimeSignalCommand m7723a(gm4 gm4, long j, sq6 sq6) {
        long b = m7724b(gm4, j);
        return new TimeSignalCommand(b, sq6.mo25933b(b));
    }

    /* renamed from: b */
    public static long m7724b(gm4 gm4, long j) {
        long D = (long) gm4.mo20662D();
        if ((128 & D) != 0) {
            return 8589934591L & ((((D & 1) << 32) | gm4.mo20664F()) + j);
        }
        return CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f5673a);
        parcel.writeLong(this.f5674d);
    }

    public TimeSignalCommand(long j, long j2) {
        this.f5673a = j;
        this.f5674d = j2;
    }
}
