package androidx.media3.extractor.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceScheduleCommand> CREATOR = new C1062a();

    /* renamed from: a */
    public final List<C1064c> f5659a;

    /* renamed from: androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand$a */
    public class C1062a implements Parcelable.Creator<SpliceScheduleCommand> {
        /* renamed from: a */
        public SpliceScheduleCommand createFromParcel(Parcel parcel) {
            return new SpliceScheduleCommand(parcel, (C1062a) null);
        }

        /* renamed from: b */
        public SpliceScheduleCommand[] newArray(int i) {
            return new SpliceScheduleCommand[i];
        }
    }

    /* renamed from: androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand$b */
    public static final class C1063b {

        /* renamed from: a */
        public final int f5660a;

        /* renamed from: b */
        public final long f5661b;

        public /* synthetic */ C1063b(int i, long j, C1062a aVar) {
            this(i, j);
        }

        /* renamed from: c */
        public static C1063b m7715c(Parcel parcel) {
            return new C1063b(parcel.readInt(), parcel.readLong());
        }

        /* renamed from: d */
        public final void mo8081d(Parcel parcel) {
            parcel.writeInt(this.f5660a);
            parcel.writeLong(this.f5661b);
        }

        public C1063b(int i, long j) {
            this.f5660a = i;
            this.f5661b = j;
        }
    }

    public /* synthetic */ SpliceScheduleCommand(Parcel parcel, C1062a aVar) {
        this(parcel);
    }

    /* renamed from: a */
    public static SpliceScheduleCommand m7710a(gm4 gm4) {
        int D = gm4.mo20662D();
        ArrayList arrayList = new ArrayList(D);
        for (int i = 0; i < D; i++) {
            arrayList.add(C1064c.m7721e(gm4));
        }
        return new SpliceScheduleCommand((List<C1064c>) arrayList);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int size = this.f5659a.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.f5659a.get(i2).mo8082f(parcel);
        }
    }

    public SpliceScheduleCommand(List<C1064c> list) {
        this.f5659a = Collections.unmodifiableList(list);
    }

    public SpliceScheduleCommand(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(C1064c.m7720d(parcel));
        }
        this.f5659a = Collections.unmodifiableList(arrayList);
    }

    /* renamed from: androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand$c */
    public static final class C1064c {

        /* renamed from: a */
        public final long f5662a;

        /* renamed from: b */
        public final boolean f5663b;

        /* renamed from: c */
        public final boolean f5664c;

        /* renamed from: d */
        public final boolean f5665d;

        /* renamed from: e */
        public final long f5666e;

        /* renamed from: f */
        public final List<C1063b> f5667f;

        /* renamed from: g */
        public final boolean f5668g;

        /* renamed from: h */
        public final long f5669h;

        /* renamed from: i */
        public final int f5670i;

        /* renamed from: j */
        public final int f5671j;

        /* renamed from: k */
        public final int f5672k;

        public C1064c(long j, boolean z, boolean z2, boolean z3, List<C1063b> list, long j2, boolean z4, long j3, int i, int i2, int i3) {
            this.f5662a = j;
            this.f5663b = z;
            this.f5664c = z2;
            this.f5665d = z3;
            this.f5667f = Collections.unmodifiableList(list);
            this.f5666e = j2;
            this.f5668g = z4;
            this.f5669h = j3;
            this.f5670i = i;
            this.f5671j = i2;
            this.f5672k = i3;
        }

        /* renamed from: d */
        public static C1064c m7720d(Parcel parcel) {
            return new C1064c(parcel);
        }

        /* renamed from: e */
        public static C1064c m7721e(gm4 gm4) {
            boolean z;
            boolean z2;
            int i;
            int i2;
            int i3;
            long j;
            boolean z3;
            long j2;
            ArrayList arrayList;
            boolean z4;
            boolean z5;
            boolean z6;
            boolean z7;
            long j3;
            long j4;
            boolean z8;
            boolean z9;
            long F = gm4.mo20664F();
            if ((gm4.mo20662D() & 128) != 0) {
                z = true;
            } else {
                z = false;
            }
            ArrayList arrayList2 = new ArrayList();
            if (!z) {
                int D = gm4.mo20662D();
                if ((D & 128) != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if ((D & 64) != 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if ((D & 32) != 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (z6) {
                    j3 = gm4.mo20664F();
                } else {
                    j3 = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
                }
                if (!z6) {
                    int D2 = gm4.mo20662D();
                    ArrayList arrayList3 = new ArrayList(D2);
                    for (int i4 = 0; i4 < D2; i4++) {
                        arrayList3.add(new C1063b(gm4.mo20662D(), gm4.mo20664F(), (C1062a) null));
                    }
                    arrayList2 = arrayList3;
                }
                if (z7) {
                    long D3 = (long) gm4.mo20662D();
                    if ((128 & D3) != 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    j4 = ((((D3 & 1) << 32) | gm4.mo20664F()) * 1000) / 90;
                    z8 = z9;
                } else {
                    z8 = false;
                    j4 = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
                }
                int J = gm4.mo20668J();
                int D4 = gm4.mo20662D();
                z2 = z6;
                i = gm4.mo20662D();
                j = j4;
                arrayList = arrayList2;
                long j5 = j3;
                i3 = J;
                i2 = D4;
                j2 = j5;
                boolean z10 = z5;
                z3 = z8;
                z4 = z10;
            } else {
                arrayList = arrayList2;
                z4 = false;
                j2 = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
                z3 = false;
                j = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
                i3 = 0;
                i2 = 0;
                i = 0;
                z2 = false;
            }
            return new C1064c(F, z, z4, z2, arrayList, j2, z3, j, i3, i2, i);
        }

        /* renamed from: f */
        public final void mo8082f(Parcel parcel) {
            parcel.writeLong(this.f5662a);
            parcel.writeByte(this.f5663b ? (byte) 1 : 0);
            parcel.writeByte(this.f5664c ? (byte) 1 : 0);
            parcel.writeByte(this.f5665d ? (byte) 1 : 0);
            int size = this.f5667f.size();
            parcel.writeInt(size);
            for (int i = 0; i < size; i++) {
                this.f5667f.get(i).mo8081d(parcel);
            }
            parcel.writeLong(this.f5666e);
            parcel.writeByte(this.f5668g ? (byte) 1 : 0);
            parcel.writeLong(this.f5669h);
            parcel.writeInt(this.f5670i);
            parcel.writeInt(this.f5671j);
            parcel.writeInt(this.f5672k);
        }

        public C1064c(Parcel parcel) {
            this.f5662a = parcel.readLong();
            boolean z = false;
            this.f5663b = parcel.readByte() == 1;
            this.f5664c = parcel.readByte() == 1;
            this.f5665d = parcel.readByte() == 1;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i < readInt; i++) {
                arrayList.add(C1063b.m7715c(parcel));
            }
            this.f5667f = Collections.unmodifiableList(arrayList);
            this.f5666e = parcel.readLong();
            this.f5668g = parcel.readByte() == 1 ? true : z;
            this.f5669h = parcel.readLong();
            this.f5670i = parcel.readInt();
            this.f5671j = parcel.readInt();
            this.f5672k = parcel.readInt();
        }
    }
}
