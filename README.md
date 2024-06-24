# commsignia-homework

Vehicle simulator homework for Commsignia.

## Backend

I installed IntelliJ IDEA and took care of everything building and running related.

The app should run on default config, which is http://localhost:8080.

Note: Instead of `/vehicle/:id` I took the liberty to have `/vehicles/:id` endpoint for the python script.
The reason being this approach satisfies REST API design principles better in my opinion. (This means one less controller as well.)

Minor inconvenience I noticed is that the backend uses 6371km as Earht's average radius, however, the python script has 6373km configured.

## Frontent

The frontend is a React app served by Vite.

To run the application navigate to `/apps/frontend` and run `npm install`.
The app should run on the default config, which is http://localhost:5173.

## Additional info

The backend has CORS configuration to allow requests from http://localhost:5173.
The frontend's http request client is configured with a base url of http://localhost:8080.

If for some reason the applications are running on different ports this is the cause of the problem.

I decided to use github issues to track what should be done. You can check what has been the development process there.
