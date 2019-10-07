package com.ServiceApp;


public class AuthorizationServer {


     String acctokgenerated = "AccessToken for auth";

    public String verifyUserAuth(String userRes) {
        if (userRes!="yes") {
            System.out.println("authorized by user");
            return acctokgenerated;
        }
        else
            System.out.println("access denied by user");
            return "no access token";
    }


}
