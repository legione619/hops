# Authentication Methods

To configure Authentication methods click on your name in the top right corner of the navigation bar and choose 
*Cluster Settings* from the dropdown menu.
In the **Cluster Settings** _Authentication_ tab you can configure how users authenticate.

1. **TOTP Two-factor Authentication**: can be _disabled_, _optional_ or _mandatory_. If set to mandatory all users are 
   required to set up two-factor authentication when registering. 

    !!! note
    
        If two-factor is set to _mandatory_ on a cluster with preexisting users all users will need to go through  
        lost device recovery step to enable two-factor. So consider setting it to _optional_ first and allow users to 
        enable it before setting it to mandatory.

2. **OAuth2**: if your organization already have an identity management system compatible with 
   [OpenID Connect (OIDC)](https://openid.net/connect/) you can configure Hopsworks to use your identity provider 
   by enabling **OAuth** as shown in the figure below. After enabling OAuth 
   you can register your identity provider by clicking on **Add Identity Provider** button. See
   [Create client](./oauth2/create-client.md) for details.

<figure>
  <a  href="../../assets/images/admin/auth-config.png">
    <img src="../../assets/images/admin/auth-config.png" alt="Authentication config" />
  </a>
  <figcaption>Setup Authentication Methods</figcaption>
</figure>

In the figure above we see a cluster with Two-factor authentication disabled and Oauth enabled with one registered 
identity provider called Keycloak (Keycloak is an open Source Identity and Access Management system). 