import { Navigate, Outlet, RouteObject } from "react-router-dom";
import VehiclesPage from "../pages/vehicles/vehicles-page";
import VehicleDetailsPage from "../pages/vehicle-details/vehicle-details-page";

export const Route = {
  INDEX: "/",

  VEHICLES: {
    INDEX: "/vehicles",
    BY_ID: "/vehicles/:id",
  },
};

export const ROUTES: RouteObject[] = [
  {
    element: <Outlet />,
    children: [
      {
        path: Route.VEHICLES.INDEX,
        children: [
          { index: true, element: <VehiclesPage /> },
          {
            path: Route.VEHICLES.BY_ID,
            element: <VehicleDetailsPage />,
          },
        ],
      },
    ],
  },
  { path: Route.INDEX, element: <Navigate to={Route.VEHICLES.INDEX} /> },
];
