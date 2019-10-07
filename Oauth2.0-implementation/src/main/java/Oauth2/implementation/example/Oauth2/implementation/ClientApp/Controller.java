package Oauth2.implementation.example.Oauth2.implementation.ClientApp;

import com.ServiceApp.AuthorizationServer;
import com.ServiceApp.ResourceServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    public ResourceServer resourceServer = new ResourceServer();
    public AuthorizationServer authServer = new AuthorizationServer();

    public String userResponse1;
    String AccessToken;

    @GetMapping("/OauthAccess/{userResponse1}/access")
     public String getAccessToken(@PathVariable String userResponse1)
    {
        //userResponse1=userResponse;

        System.out.println(userResponse1);
        AccessToken = authServer.verifyUserAuth(userResponse1);
        return getResource(AccessToken);

    }

    String getResource(String AccessToken)

    {
        return resourceServer.giveResource(AccessToken);


    }

}
