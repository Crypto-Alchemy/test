package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.InputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.C7610a;
import kotlin.reflect.jvm.internal.impl.protobuf.C7628h;

/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.b */
/* compiled from: AbstractParser */
public abstract class C7613b<MessageType extends C7628h> implements jm4<MessageType> {

    /* renamed from: a */
    public static final C7616d f39940a = C7616d.m62008c();

    /* renamed from: e */
    public final MessageType mo54683e(MessageType messagetype) throws InvalidProtocolBufferException {
        if (messagetype == null || messagetype.isInitialized()) {
            return messagetype;
        }
        throw mo54684f(messagetype).asInvalidProtocolBufferException().setUnfinishedMessage(messagetype);
    }

    /* renamed from: f */
    public final UninitializedMessageException mo54684f(MessageType messagetype) {
        if (messagetype instanceof C7610a) {
            return ((C7610a) messagetype).newUninitializedMessageException();
        }
        return new UninitializedMessageException(messagetype);
    }

    /* renamed from: g */
    public MessageType mo52754d(InputStream inputStream, C7616d dVar) throws InvalidProtocolBufferException {
        return mo54683e(mo54688j(inputStream, dVar));
    }

    /* renamed from: h */
    public MessageType mo52752b(c70 c70, C7616d dVar) throws InvalidProtocolBufferException {
        return mo54683e(mo54689k(c70, dVar));
    }

    /* renamed from: i */
    public MessageType mo52751a(InputStream inputStream, C7616d dVar) throws InvalidProtocolBufferException {
        return mo54683e(mo54690l(inputStream, dVar));
    }

    /* renamed from: j */
    public MessageType mo54688j(InputStream inputStream, C7616d dVar) throws InvalidProtocolBufferException {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            return mo54690l(new C7610a.C7611a.C7612a(inputStream, C7614c.m61961B(read, inputStream)), dVar);
        } catch (IOException e) {
            throw new InvalidProtocolBufferException(e.getMessage());
        }
    }

    /* renamed from: k */
    public MessageType mo54689k(c70 c70, C7616d dVar) throws InvalidProtocolBufferException {
        MessageType messagetype;
        try {
            C7614c B = c70.mo50815B();
            messagetype = (C7628h) mo52753c(B, dVar);
            B.mo54710a(0);
            return messagetype;
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(messagetype);
        } catch (InvalidProtocolBufferException e2) {
            throw e2;
        }
    }

    /* renamed from: l */
    public MessageType mo54690l(InputStream inputStream, C7616d dVar) throws InvalidProtocolBufferException {
        C7614c h = C7614c.m61965h(inputStream);
        MessageType messagetype = (C7628h) mo52753c(h, dVar);
        try {
            h.mo54710a(0);
            return messagetype;
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(messagetype);
        }
    }
}
