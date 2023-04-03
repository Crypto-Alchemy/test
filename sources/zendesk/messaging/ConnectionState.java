package zendesk.messaging;

public enum ConnectionState {
    CONNECTING,
    CONNECTED,
    RECONNECTING,
    FAILED,
    DISCONNECTED,
    UNREACHABLE
}
