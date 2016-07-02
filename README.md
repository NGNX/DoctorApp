Hello everyone. This is my first android application. During a hackathon event at Hedgehog Lab, I along with my team members have built this app. Later on I added few additional functionalities such as Login and revamped the existing UI by adding couple of drawables.

<b>Introduction</b>

So during the hackathon event we were supposed to build the app which uses some amount of data from external sources, rather than developing an app which has no data requirements (such as a custom-text-editor or custom-fancy-alarm-app). We are also restricted to fetch data from <a href="https://data.gov.in/">here</a>.

After putting a little thought and considering the time constraint we thought of building an app which uses <a href="https://data.gov.in/resources/hospital-directory-geo-code-september-2015/api">this</a> API.

<b>Motto behind building this app</b>

We wanted to build an app which is user-friendly, easy-to-use and at the same time provides useful details. We thought of a situation when the user most needs the app. At that point of time we need to provide some quick-options easily accessible through our app. Hospital app was the best choice we could come up with. Whenever user opens our app, he/she needs to be provided with a list of nearby hospitals and some quick-options such as navigation, phone call etc.

<b>App Description and Implementation details</b>

Initially the app shows a Splash Screen displaying the logo of the app using Handler object. 

Next screen is the LoginActivity Screen where the user is given 2 options: Login via Facebook and Login via Google. I've used the GoogleSignIn API and Facebook Graph API in order to implement these features. Note that there is a small issue with the facbook sign in button.

After logging in successfully, the next screen is the Locaiton Picker Screen where in the user is prompted to pick his/her location. There are 2 options available: GPS, PickLocation. There is a small bug associated with the GPS location so I won't be elaborating on that here. The other option i.e., PickLocation uses Google's PlaceAutoComplete class in order to show a search bar to the user, where in, he/she can type the location and select the relevant one from the dropdown menu. 

Finally, our MainActivity Screen which displays a list of nearby hospitals (or the hospitals near your selected location; if you have selected the PickLocation Option) is shown to the user. It is a custom listView where in each item has 4 options available: Call, Directions, Email, WebsiteLink. Few options (such as email) might not be available by certain hospitals. This is because the API call used to fetch data about the hospitals lacks email Id for certain hospitals.

Email, WebsiteLink and Call actions can be performed by implicit intents to the android system. The directions option is also an implicit intent using which GoogleMaps is displayed with navigation to the desired hospital.

Finally, the user can also change his/her location from MainActivity screen anytime he/she wants by choosing the locationPicker option from the AppBar.

<b>ScreenShots of the App</b>

<b>SplashScreen</b>

<img src="https://github.com/aditya-code-blooded/DoctorApp/blob/master/screenshots/SplashScreen.png" width="250" height="420"/>

<b>LoginScreen(1)</b>

<img src="https://github.com/aditya-code-blooded/DoctorApp/blob/master/screenshots/LoginScreen(1).png" width="250" height="420"/>

<b>LoginScreen(2)</b>

<img src="https://github.com/aditya-code-blooded/DoctorApp/blob/master/screenshots/LoginScreen(2).png" width="250" height="420"/>

<b>LocationScreen(1)</b>

<img src="https://github.com/aditya-code-blooded/DoctorApp/blob/master/screenshots/LocationScreen(1).png" width="250" height="420"/>

<b>LocationScreen(2)</b>

<img src="https://github.com/aditya-code-blooded/DoctorApp/blob/master/screenshots/LocationScreen(2).png" width="250" height="420"/>

<b>MainScreen</b>

<img src="https://github.com/aditya-code-blooded/DoctorApp/blob/master/screenshots/MainScreen.png" width="250" height="420"/>

<b>CallScreen</b>

<img src="https://github.com/aditya-code-blooded/DoctorApp/blob/master/screenshots/CallScreen.png" width="250" height="420"/>

<b>WebsiteScreen</b>

<img src="https://github.com/aditya-code-blooded/DoctorApp/blob/master/screenshots/WebsiteScreen.png" width="250" height="420"/>

<b>DirectionsScreen</b>

<img src="https://github.com/aditya-code-blooded/DoctorApp/blob/master/screenshots/DirectionsScreen.png" width="250" height="420"/>
