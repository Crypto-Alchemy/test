package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import com.bumptech.glide.load.data.C1735a;
import java.io.IOException;

public final class ParcelFileDescriptorRewinder implements C1735a<ParcelFileDescriptor> {

    /* renamed from: a */
    public final InternalRewinder f8727a;

    public static final class InternalRewinder {

        /* renamed from: a */
        public final ParcelFileDescriptor f8728a;

        public InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
            this.f8728a = parcelFileDescriptor;
        }

        public ParcelFileDescriptor rewind() throws IOException {
            try {
                Os.lseek(this.f8728a.getFileDescriptor(), 0, OsConstants.SEEK_SET);
                return this.f8728a;
            } catch (ErrnoException e) {
                throw new IOException(e);
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$a */
    public static final class C1734a implements C1735a.C1736a<ParcelFileDescriptor> {
        /* renamed from: a */
        public Class<ParcelFileDescriptor> mo12401a() {
            return ParcelFileDescriptor.class;
        }

        /* renamed from: c */
        public C1735a<ParcelFileDescriptor> mo12402b(ParcelFileDescriptor parcelFileDescriptor) {
            return new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }
    }

    public ParcelFileDescriptorRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.f8727a = new InternalRewinder(parcelFileDescriptor);
    }

    /* renamed from: c */
    public static boolean m12284c() {
        return true;
    }

    /* renamed from: b */
    public void mo12398b() {
    }

    /* renamed from: d */
    public ParcelFileDescriptor mo12397a() throws IOException {
        return this.f8727a.rewind();
    }
}
