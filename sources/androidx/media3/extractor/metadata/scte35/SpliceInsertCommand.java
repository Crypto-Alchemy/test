package androidx.media3.extractor.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class SpliceInsertCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceInsertCommand> CREATOR = new C1059a();

    /* renamed from: A */
    public final long f5643A;

    /* renamed from: B */
    public final int f5644B;

    /* renamed from: C */
    public final int f5645C;

    /* renamed from: H */
    public final int f5646H;

    /* renamed from: a */
    public final long f5647a;

    /* renamed from: d */
    public final boolean f5648d;

    /* renamed from: e */
    public final boolean f5649e;

    /* renamed from: g */
    public final boolean f5650g;

    /* renamed from: k */
    public final boolean f5651k;

    /* renamed from: r */
    public final long f5652r;

    /* renamed from: s */
    public final long f5653s;

    /* renamed from: x */
    public final List<C1060b> f5654x;

    /* renamed from: y */
    public final boolean f5655y;

    /* renamed from: androidx.media3.extractor.metadata.scte35.SpliceInsertCommand$a */
    public class C1059a implements Parcelable.Creator<SpliceInsertCommand> {
        /* renamed from: a */
        public SpliceInsertCommand createFromParcel(Parcel parcel) {
            return new SpliceInsertCommand(parcel, (C1059a) null);
        }

        /* renamed from: b */
        public SpliceInsertCommand[] newArray(int i) {
            return new SpliceInsertCommand[i];
        }
    }

    /* renamed from: androidx.media3.extractor.metadata.scte35.SpliceInsertCommand$b */
    public static final class C1060b {

        /* renamed from: a */
        public final int f5656a;

        /* renamed from: b */
        public final long f5657b;

        /* renamed from: c */
        public final long f5658c;

        public /* synthetic */ C1060b(int i, long j, long j2, C1059a aVar) {
            this(i, j, j2);
        }

        /* renamed from: a */
        public static C1060b m7706a(Parcel parcel) {
            return new C1060b(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        /* renamed from: b */
        public void mo8070b(Parcel parcel) {
            parcel.writeInt(this.f5656a);
            parcel.writeLong(this.f5657b);
            parcel.writeLong(this.f5658c);
        }

        public C1060b(int i, long j, long j2) {
            this.f5656a = i;
            this.f5657b = j;
            this.f5658c = j2;
        }
    }

    public /* synthetic */ SpliceInsertCommand(Parcel parcel, C1059a aVar) {
        this(parcel);
    }

    /* renamed from: a */
    public static SpliceInsertCommand m7703a(gm4 gm4, long j, sq6 sq6) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        long j2;
        boolean z3;
        List list;
        long j3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        long j4;
        long j5;
        boolean z10;
        boolean z11;
        long j6;
        sq6 sq62 = sq6;
        long F = gm4.mo20664F();
        if ((gm4.mo20662D() & 128) != 0) {
            z = true;
        } else {
            z = false;
        }
        List emptyList = Collections.emptyList();
        if (!z) {
            int D = gm4.mo20662D();
            if ((D & 128) != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            if ((D & 64) != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            if ((D & 32) != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if ((D & 16) != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (!z7 || z9) {
                j4 = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
            } else {
                j4 = TimeSignalCommand.m7724b(gm4, j);
            }
            if (!z7) {
                int D2 = gm4.mo20662D();
                ArrayList arrayList = new ArrayList(D2);
                for (int i4 = 0; i4 < D2; i4++) {
                    int D3 = gm4.mo20662D();
                    if (!z9) {
                        j6 = TimeSignalCommand.m7724b(gm4, j);
                    } else {
                        j6 = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
                    }
                    arrayList.add(new C1060b(D3, j6, sq62.mo25933b(j6), (C1059a) null));
                }
                emptyList = arrayList;
            }
            if (z8) {
                long D4 = (long) gm4.mo20662D();
                if ((128 & D4) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                j5 = ((((D4 & 1) << 32) | gm4.mo20664F()) * 1000) / 90;
                z10 = z11;
            } else {
                z10 = false;
                j5 = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
            }
            int J = gm4.mo20668J();
            i3 = J;
            z2 = z7;
            i2 = gm4.mo20662D();
            i = gm4.mo20662D();
            list = emptyList;
            long j7 = j4;
            z3 = z10;
            j2 = j5;
            z4 = z9;
            z5 = z6;
            j3 = j7;
        } else {
            list = emptyList;
            z5 = false;
            z4 = false;
            j3 = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
            z3 = false;
            j2 = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
            i3 = 0;
            i2 = 0;
            i = 0;
            z2 = false;
        }
        return new SpliceInsertCommand(F, z, z5, z2, z4, j3, sq62.mo25933b(j3), list, z3, j2, i3, i2, i);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f5647a);
        parcel.writeByte(this.f5648d ? (byte) 1 : 0);
        parcel.writeByte(this.f5649e ? (byte) 1 : 0);
        parcel.writeByte(this.f5650g ? (byte) 1 : 0);
        parcel.writeByte(this.f5651k ? (byte) 1 : 0);
        parcel.writeLong(this.f5652r);
        parcel.writeLong(this.f5653s);
        int size = this.f5654x.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.f5654x.get(i2).mo8070b(parcel);
        }
        parcel.writeByte(this.f5655y ? (byte) 1 : 0);
        parcel.writeLong(this.f5643A);
        parcel.writeInt(this.f5644B);
        parcel.writeInt(this.f5645C);
        parcel.writeInt(this.f5646H);
    }

    public SpliceInsertCommand(long j, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, List<C1060b> list, boolean z5, long j4, int i, int i2, int i3) {
        this.f5647a = j;
        this.f5648d = z;
        this.f5649e = z2;
        this.f5650g = z3;
        this.f5651k = z4;
        this.f5652r = j2;
        this.f5653s = j3;
        this.f5654x = Collections.unmodifiableList(list);
        this.f5655y = z5;
        this.f5643A = j4;
        this.f5644B = i;
        this.f5645C = i2;
        this.f5646H = i3;
    }

    public SpliceInsertCommand(Parcel parcel) {
        this.f5647a = parcel.readLong();
        boolean z = false;
        this.f5648d = parcel.readByte() == 1;
        this.f5649e = parcel.readByte() == 1;
        this.f5650g = parcel.readByte() == 1;
        this.f5651k = parcel.readByte() == 1;
        this.f5652r = parcel.readLong();
        this.f5653s = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(C1060b.m7706a(parcel));
        }
        this.f5654x = Collections.unmodifiableList(arrayList);
        this.f5655y = parcel.readByte() == 1 ? true : z;
        this.f5643A = parcel.readLong();
        this.f5644B = parcel.readInt();
        this.f5645C = parcel.readInt();
        this.f5646H = parcel.readInt();
    }
}
