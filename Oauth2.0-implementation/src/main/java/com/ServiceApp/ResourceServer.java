package com.ServiceApp;

public class ResourceServer {
    private String info = "Private information of the user";
    private AuthorizationServer authServer = new AuthorizationServer();

    public String giveResource(String acctokverify)
    {
        if(acctokverify == authServer.acctokgenerated)
        {
            return info;

        }
        else
            return "Access token not valid or expired";
    }
}
