# OauthSpringBoot

Google Sign-In uses OAuth2. Although integrating the authentication is possible without knowing the details of OAuth2,
it seems reasonable to know how it works. 


The web application has a client identifier assigned in the Google Sign-In system. 
It uniquely identifies the application, but it is not a secret. 
If it leaks out, it is not a problem at all. A shared secret is a separate text that is known by the application and by Google.
It is crucial to keep this one hidden.

When a user enters a page that requires signing in, the user is redirected to the Google Sign-In page. 
One of the request parameters is the client ID, so Google knows which application the user signs into.
If the authentication process is successful, and the user agrees on the scope of data to be shared with the application, the application receives an authorization code.
-When you have one, log into Google API Console(https://console.developers.google.com/).

-Choose Credentials on the left menu.

-If you are there for the first time, you should see the Create a project button. Click it.

-Create the project.

-Create credentials for your OAuth client ID by clicking the appropriate button.

-Choose an application type - in my case it is a web application.

-Provide URLs to your application that are authorized to request signing in through Google Sign-In. If you want to test it locally, typing http://localhost:8080 should work. Multiple URLs can be provided.

-In the Client ID section for the web application, you will find a Client ID and Client secret. Copy them and save them in a secure place. You will need them later during the configuration of the web application.

