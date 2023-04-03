package zendesk.core;

interface AccessService {
    @ak4("/access/sdk/anonymous")
    k90<AuthenticationResponse> getAuthTokenForAnonymous(@p30 AuthenticationRequestWrapper authenticationRequestWrapper);

    @ak4("/access/sdk/jwt")
    k90<AuthenticationResponse> getAuthTokenForJwt(@p30 AuthenticationRequestWrapper authenticationRequestWrapper);
}
