package androidx.media3.datasource;

import android.net.Uri;
import androidx.media3.common.PlaybackException;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

public final class UdpDataSource extends C3009oy {

    /* renamed from: e */
    public final int f4582e;

    /* renamed from: f */
    public final byte[] f4583f;

    /* renamed from: g */
    public final DatagramPacket f4584g;

    /* renamed from: h */
    public Uri f4585h;

    /* renamed from: i */
    public DatagramSocket f4586i;

    /* renamed from: j */
    public MulticastSocket f4587j;

    /* renamed from: k */
    public InetAddress f4588k;

    /* renamed from: l */
    public boolean f4589l;

    /* renamed from: m */
    public int f4590m;

    public static final class UdpDataSourceException extends DataSourceException {
        public UdpDataSourceException(Throwable th, int i) {
            super(th, i);
        }
    }

    public UdpDataSource() {
        this(PlaybackException.ERROR_CODE_IO_UNSPECIFIED);
    }

    /* renamed from: b */
    public long mo6964b(d21 d21) throws UdpDataSourceException {
        Uri uri = d21.f10437a;
        this.f4585h = uri;
        String str = (String) C2725kr.m20985e(uri.getHost());
        int port = this.f4585h.getPort();
        mo24281q(d21);
        try {
            this.f4588k = InetAddress.getByName(str);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f4588k, port);
            if (this.f4588k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f4587j = multicastSocket;
                multicastSocket.joinGroup(this.f4588k);
                this.f4586i = this.f4587j;
            } else {
                this.f4586i = new DatagramSocket(inetSocketAddress);
            }
            this.f4586i.setSoTimeout(this.f4582e);
            this.f4589l = true;
            mo24282r(d21);
            return -1;
        } catch (SecurityException e) {
            throw new UdpDataSourceException(e, PlaybackException.ERROR_CODE_IO_NO_PERMISSION);
        } catch (IOException e2) {
            throw new UdpDataSourceException(e2, PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_FAILED);
        }
    }

    public void close() {
        this.f4585h = null;
        MulticastSocket multicastSocket = this.f4587j;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup((InetAddress) C2725kr.m20985e(this.f4588k));
            } catch (IOException unused) {
            }
            this.f4587j = null;
        }
        DatagramSocket datagramSocket = this.f4586i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f4586i = null;
        }
        this.f4588k = null;
        this.f4590m = 0;
        if (this.f4589l) {
            this.f4589l = false;
            mo24280p();
        }
    }

    /* renamed from: m */
    public Uri mo6966m() {
        return this.f4585h;
    }

    public int read(byte[] bArr, int i, int i2) throws UdpDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        if (this.f4590m == 0) {
            try {
                ((DatagramSocket) C2725kr.m20985e(this.f4586i)).receive(this.f4584g);
                int length = this.f4584g.getLength();
                this.f4590m = length;
                mo24279o(length);
            } catch (SocketTimeoutException e) {
                throw new UdpDataSourceException(e, PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT);
            } catch (IOException e2) {
                throw new UdpDataSourceException(e2, PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_FAILED);
            }
        }
        int length2 = this.f4584g.getLength();
        int i3 = this.f4590m;
        int min = Math.min(i3, i2);
        System.arraycopy(this.f4583f, length2 - i3, bArr, i, min);
        this.f4590m -= min;
        return min;
    }

    public UdpDataSource(int i) {
        this(i, 8000);
    }

    public UdpDataSource(int i, int i2) {
        super(true);
        this.f4582e = i2;
        byte[] bArr = new byte[i];
        this.f4583f = bArr;
        this.f4584g = new DatagramPacket(bArr, 0, i);
    }
}
