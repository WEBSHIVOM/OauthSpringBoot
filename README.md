# OauthSpringBoot

Google Sign-In uses OAuth2. Although integrating the authentication is possible without knowing the details of OAuth2,
it seems reasonable to know how it works. The below diagram shows how the authentication process looks in a web application.

The web application has a client identifier assigned in the Google Sign-In system. 
It uniquely identifies the application, but it is not a secret. 
If it leaks out, it is not a problem at all. A shared secret is a separate text that is known by the application and by Google.
It is crucial to keep this one hidden.

When a user enters a page that requires signing in, the user is redirected to the Google Sign-In page. 
One of the request parameters is the client ID, so Google knows which application the user signs into.
If the authentication process is successful, and the user agrees on the scope of data to be shared with the application, the application receives an authorization code. 



