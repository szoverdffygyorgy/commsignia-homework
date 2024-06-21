import { useMemo } from "react";
import { RouterProvider, createBrowserRouter } from "react-router-dom";
import { ROUTES } from "./routes";

const Router = () => {
  const router = useMemo(() => createBrowserRouter(ROUTES), []);

  return <RouterProvider router={router} />;
};

export default Router;
