import { Navigate, Outlet, RouteObject } from "react-router-dom";
import VehiclesPage from "../pages/vehicles/vehicles-page";

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
    children: [{ path: Route.VEHICLES.INDEX, element: <VehiclesPage /> }],
  },
  { path: Route.INDEX, element: <Navigate to={Route.VEHICLES.INDEX} /> },
];
