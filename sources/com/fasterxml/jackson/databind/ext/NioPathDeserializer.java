package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.spi.FileSystemProvider;
import java.util.Iterator;
import java.util.ServiceLoader;

public class NioPathDeserializer extends StdScalarDeserializer<Path> {

    /* renamed from: a */
    public static final boolean f9977a;
    private static final long serialVersionUID = 1;

    static {
        File[] listRoots = File.listRoots();
        int length = listRoots.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            String path = listRoots[i].getPath();
            if (path.length() >= 2 && Character.isLetter(path.charAt(0)) && path.charAt(1) == ':') {
                z = true;
                break;
            }
            i++;
        }
        f9977a = z;
    }

    public NioPathDeserializer() {
        super((Class<?>) Path.class);
    }

    public Path deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (!jsonParser.mo13984s0(JsonToken.VALUE_STRING)) {
            return (Path) deserializationContext.handleUnexpectedToken((Class<?>) Path.class, jsonParser);
        }
        String W = jsonParser.mo13947W();
        if (W.indexOf(58) < 0) {
            return Paths.get(W, new String[0]);
        }
        if (f9977a && W.length() >= 2 && Character.isLetter(W.charAt(0)) && W.charAt(1) == ':') {
            return Paths.get(W, new String[0]);
        }
        try {
            URI uri = new URI(W);
            try {
                return Paths.get(uri);
            } catch (FileSystemNotFoundException e) {
                String scheme = uri.getScheme();
                Iterator<S> it = ServiceLoader.load(FileSystemProvider.class).iterator();
                while (it.hasNext()) {
                    FileSystemProvider fileSystemProvider = (FileSystemProvider) it.next();
                    if (fileSystemProvider.getScheme().equalsIgnoreCase(scheme)) {
                        return fileSystemProvider.getPath(uri);
                    }
                }
                return (Path) deserializationContext.handleInstantiationProblem(handledType(), W, e);
            } catch (Throwable th) {
                th.addSuppressed(e);
                return (Path) deserializationContext.handleInstantiationProblem(handledType(), W, th);
            }
        } catch (URISyntaxException e2) {
            return (Path) deserializationContext.handleInstantiationProblem(handledType(), W, e2);
        }
    }
}
